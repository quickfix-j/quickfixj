/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina.message;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.demux.MessageDecoder;
import org.apache.mina.filter.codec.demux.MessageDecoderResult;
import org.quickfixj.CharsetSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.mina.CriticalProtocolCodecException;

/**
 * Detects and decodes FIX message strings in an incoming data stream. The
 * message string is then passed to MINA IO handlers for further processing.
 */
public class FIXMessageDecoder implements MessageDecoder {

    private static final char SOH = '\001';

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final PatternMatcher HEADER_PATTERN;
    private final PatternMatcher CHECKSUM_PATTERN;
    private final PatternMatcher LOGON_PATTERN;

    // Parsing states
    private static final int SEEKING_HEADER = 1;
    private static final int PARSING_LENGTH = 2;
    private static final int READING_BODY = 3;
    private static final int PARSING_CHECKSUM = 4;

    // If QFJ receives more garbage data than this between messages, then
    // the connection is considered corrupt.
    private static final int MAX_UNDECODED_DATA_LENGTH = 4096;

    private int state;
    private int bodyLength;
    private int position;
    private final String charsetEncoding;

    private void resetState() {
        state = SEEKING_HEADER;
        bodyLength = 0;
        position = 0;
    }

    public FIXMessageDecoder() throws UnsupportedEncodingException {
        this(CharsetSupport.getCharset());
    }

    public FIXMessageDecoder(String charset) throws UnsupportedEncodingException {
        this(charset, String.valueOf(SOH));
    }

    public FIXMessageDecoder(String charset, String delimiter) throws UnsupportedEncodingException {
        charsetEncoding = CharsetSupport.validate(charset);
        HEADER_PATTERN = new PatternMatcher("8=FIXt.?.?" + delimiter + "9=");
        CHECKSUM_PATTERN = new PatternMatcher("10=???" + delimiter);
        LOGON_PATTERN = new PatternMatcher(delimiter + "35=A" + delimiter);
        resetState();
    }

    @Override
    public MessageDecoderResult decodable(IoSession session, IoBuffer in) {
        boolean hasHeader = HEADER_PATTERN.find(in, in.position()) != -1L;
        return hasHeader ? MessageDecoderResult.OK :
            (in.remaining() > MAX_UNDECODED_DATA_LENGTH ? MessageDecoderResult.NOT_OK : MessageDecoderResult.NEED_DATA);
    }

    @Override
    public MessageDecoderResult decode(IoSession session, IoBuffer in, ProtocolDecoderOutput out)
            throws ProtocolCodecException {
        int messageCount = 0;
        while (parseMessage(in, out)) {
            messageCount++;
        }
        if (messageCount > 0) {
            // Mina will compact the buffer because we can't detect a header
            if (state == SEEKING_HEADER) {
                position = 0;
            }
            return MessageDecoderResult.OK;
        } else {
            // Mina will compact the buffer
            position -= in.position();
            return MessageDecoderResult.NEED_DATA;
        }
    }

    /**
     * This method cannot move the buffer position until a message is found or an
     * error has occurred. Otherwise, MINA will compact the buffer and we lose
     * data.
     */
    private boolean parseMessage(IoBuffer in, ProtocolDecoderOutput out)
            throws ProtocolCodecException {
        try {
            boolean messageFound = false;
            while (in.hasRemaining() && !messageFound) {
                if (state == SEEKING_HEADER) {

                    long headerPos = HEADER_PATTERN.find(in, position);
                    if (headerPos == -1L) {
                        break;
                    }
                    int headerOffset = (int)headerPos;
                    int headerLength = (int)(headerPos >>> 32);
                    in.position(headerOffset);

                    if (log.isDebugEnabled()) {
                        log.debug("detected header: " + getBufferDebugInfo(in));
                    }

                    position = headerOffset + headerLength;
                    state = PARSING_LENGTH;
                }

                if (state == PARSING_LENGTH) {
                    byte ch = 0;
                    while (position < in.limit()) { // while data remains
                        ch = in.get(position++);
                        if (ch < '0' || ch > '9') { // if not digit
                            break;
                        }
                        bodyLength = bodyLength * 10 + (ch - '0');
                    }
                    if (ch == SOH) {
                        state = READING_BODY;
                        if (log.isDebugEnabled()) {
                            log.debug("body length = " + bodyLength + ": " + getBufferDebugInfo(in));
                        }
                    } else {
                        if (position < in.limit()) { // if data remains
                            String messageString = getMessageStringForError(in);
                            handleError(in, in.position() + 1, "Length format error in message (last character:" + ch + "): " + messageString,
                                    false);
                            continue;
                        } else {
                            break;
                        }
                    }
                }

                if (state == READING_BODY) {
                    if (in.limit() - position < bodyLength) { // if remaining data is less than body
                        break;
                    }
                    position += bodyLength;
                    state = PARSING_CHECKSUM;
                    if (log.isDebugEnabled()) {
                        log.debug("message body found: " + getBufferDebugInfo(in));
                    }
                }

                if (state == PARSING_CHECKSUM) {
                    if (CHECKSUM_PATTERN.match(in, position) > 0) {
                        // we are trying to parse the checksum but should
                        // check if the CHECKSUM_PATTERN is preceded by SOH
                        // or if the pattern just occurs inside of another field
                        if (in.get(position - 1) != SOH) {
                            handleError(in, position,
                                    "checksum field not preceded by SOH, bad length?", isLogon(in));
                            continue;
                        }
                        if (log.isDebugEnabled()) {
                            log.debug("found checksum: " + getBufferDebugInfo(in));
                        }
                        position += CHECKSUM_PATTERN.getMinLength();
                    } else {
                        if (position + CHECKSUM_PATTERN.getMinLength() <= in.limit()) {
                            // FEATURE allow configurable recovery position
                            // int recoveryPosition = in.position() + 1;
                            // Following recovery position is compatible with QuickFIX C++
                            // but drops messages unnecessarily in corruption scenarios.
                            int recoveryPosition = position + 1;
                            handleError(in, recoveryPosition,
                                    "did not find checksum field, bad length?", isLogon(in));
                            continue;
                        } else {
                            break;
                        }
                    }
                    String messageString = getMessageString(in);
                    if (log.isDebugEnabled()) {
                        log.debug("parsed message: " + getBufferDebugInfo(in) + " " + messageString);
                    }
                    out.write(messageString); // eventually invokes AbstractIoHandler.messageReceived
                    state = SEEKING_HEADER;
                    bodyLength = 0;
                    messageFound = true;
                }
            }
            return messageFound;
        } catch (Throwable t) {
            resetState();
            if (t instanceof ProtocolCodecException) {
                throw (ProtocolCodecException) t;
            } else {
                throw new ProtocolCodecException(t);
            }
        }
    }

    private String getBufferDebugInfo(IoBuffer in) {
        return "pos=" + in.position() + ",lim=" + in.limit() + ",rem=" + in.remaining()
                + ",offset=" + position + ",state=" + state;
    }

    private String getMessageString(IoBuffer buffer) throws UnsupportedEncodingException {
        byte[] data = new byte[position - buffer.position()];
        buffer.get(data);
        return new String(data, charsetEncoding);
    }

    private String getMessageStringForError(IoBuffer buffer) throws UnsupportedEncodingException {
        int initialPosition = buffer.position();
        byte[] data = new byte[buffer.limit() - initialPosition];
        buffer.get(data);
        buffer.position(position - initialPosition);
        return new String(data, charsetEncoding);
    }

    private void handleError(IoBuffer buffer, int recoveryPosition, String text,
            boolean disconnect) throws ProtocolCodecException {
        buffer.position(recoveryPosition);
        position = recoveryPosition;
        state = SEEKING_HEADER;
        bodyLength = 0;
        if (disconnect) {
            throw new CriticalProtocolCodecException(text);
        } else {
            log.error(text);
        }
    }

    private boolean isLogon(IoBuffer buffer) {
        return LOGON_PATTERN.find(buffer, buffer.position()) != -1L;
    }

    @Override
    public void finishDecode(IoSession session, ProtocolDecoderOutput out) throws Exception {
        // empty
    }

    /**
     * Used to process streamed messages from a file
     */
    public interface MessageListener {
        void onMessage(String message);
    }

    /**
     * Utility method to extract messages from files. This method loads all
     * extracted messages into memory so if the expected number of extracted
     * messages is large, do not use this method or your application may run out
     * of memory. Use the streaming version of the method instead.
     *
     * @param file
     * @return a list of extracted messages
     * @throws IOException
     * @throws ProtocolCodecException
     * @see #extractMessages(File,
     *      quickfix.mina.message.FIXMessageDecoder.MessageListener)
     */
    public List<String> extractMessages(File file) throws IOException, ProtocolCodecException {
        final List<String> messages = new ArrayList<String>();
        extractMessages(file, new MessageListener() {
            @Override
            public void onMessage(String message) {
                messages.add(message);
            }
        });
        return messages;
    }

    /**
     * Utility to extract messages from a file. This method will return each
     * message found to a provided listener. The message file will also be memory
     * mapped rather than fully loaded into physical memory. Therefore, a large
     * message file can be processed without using excessive memory.
     *
     * @param file
     * @param listener
     * @throws IOException
     * @throws ProtocolCodecException
     */
    public void extractMessages(File file, final MessageListener listener) throws IOException,
            ProtocolCodecException {
        // Set up a read-only memory-mapped file
        RandomAccessFile fileIn = new RandomAccessFile(file, "r");
        try {
            FileChannel readOnlyChannel = fileIn.getChannel();
            MappedByteBuffer memoryMappedBuffer = readOnlyChannel.map(FileChannel.MapMode.READ_ONLY, 0,
                    (int) readOnlyChannel.size());
            decode(null, IoBuffer.wrap(memoryMappedBuffer), new ProtocolDecoderOutput() {
                @Override
                public void write(Object message) {
                    listener.onMessage((String) message);
                }
                @Override
                public void flush(IoFilter.NextFilter nextFilter, IoSession ioSession) {
                    // ignored
                }
            });
        } finally {
            fileIn.close();
        }
    }

}
