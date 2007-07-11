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

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
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
    private static final String FIELD_DELIMITER = "\001";

    private Logger log = LoggerFactory.getLogger(getClass());

    private final byte[] HEADER_PATTERN;
    private final byte[] CHECKSUM_PATTERN;
    private final byte[] LOGON_PATTERN;

    // Parsing states
    private static final int SEEKING_HEADER = 1;
    private static final int PARSING_LENGTH = 2;
    private static final int READING_BODY = 3;
    private static final int PARSING_CHECKSUM = 4;

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
        this(CharsetSupport.getCharset(), FIELD_DELIMITER);
    }

    public FIXMessageDecoder(String charset) throws UnsupportedEncodingException {
        this(charset, FIELD_DELIMITER);
    }

    public FIXMessageDecoder(String charset, String delimiter) throws UnsupportedEncodingException {
        charsetEncoding = CharsetSupport.validate(charset);
        HEADER_PATTERN = getBytes("8=FIX.?.?" + delimiter + "9=");
        CHECKSUM_PATTERN = getBytes("10=???" + delimiter);
        LOGON_PATTERN = getBytes("\00135=A" + delimiter);
        resetState();
    }

    public MessageDecoderResult decodable(IoSession session, ByteBuffer in) {
        int headerOffset = indexOf(in, in.position(), HEADER_PATTERN);
        return headerOffset != -1 ? MessageDecoderResult.OK : MessageDecoderResult.NEED_DATA;
    }

    public MessageDecoderResult decode(IoSession session, ByteBuffer in, ProtocolDecoderOutput out)
            throws ProtocolCodecException {
        int messageCount = 0;
        while (parseMessage(in, out)) {
            messageCount++;
        }
        if (messageCount > 0) {
            // Mina will compact the buffer because we can't detect a header
            if (in.remaining() < HEADER_PATTERN.length) {
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
     * This method cannot move the buffer position until a message is found or an error
     * has occurred. Otherwise, MINA will compact the buffer and we lose data. 
     */
    private boolean parseMessage(ByteBuffer in, ProtocolDecoderOutput out)
            throws ProtocolCodecException {
        try {
            boolean messageFound = false;
            while (in.hasRemaining() && !messageFound) {
                if (state == SEEKING_HEADER) {

                    int headerOffset = indexOf(in, position, HEADER_PATTERN);
                    if (headerOffset == -1) {
                        break;
                    }
                    in.position(headerOffset);

                    if (log.isDebugEnabled()) {
                        log.debug("detected header: " + getBufferDebugInfo(in));
                    }

                    position = headerOffset + HEADER_PATTERN.length;
                    state = PARSING_LENGTH;
                }

                if (state == PARSING_LENGTH) {
                    byte ch = 0;
                    while (hasRemaining(in)) {
                        ch = get(in);
                        if (!Character.isDigit((char) ch)) {
                            break;
                        }
                        bodyLength = bodyLength * 10 + (ch - '0');
                    }
                    if (ch == '\001') {
                        state = READING_BODY;
                        if (log.isDebugEnabled()) {
                            log
                                    .debug("body length = " + bodyLength + ": "
                                            + getBufferDebugInfo(in));
                        }
                    } else {
                        if (hasRemaining(in)) {
                            handleError(in, in.position() + 1, "Error in message length format",
                                    false);
                            continue;
                        } else {
                            break;
                        }
                    }

                }

                if (state == READING_BODY) {
                    if (remaining(in) < bodyLength) {
                        break;
                    }
                    position += bodyLength;
                    state = PARSING_CHECKSUM;
                    if (log.isDebugEnabled()) {
                        log.debug("message body found: " + getBufferDebugInfo(in));
                    }
                }

                if (state == PARSING_CHECKSUM) {
                    if (startsWith(in, position, CHECKSUM_PATTERN)) {
                        if (log.isDebugEnabled()) {
                            log.debug("found checksum: " + getBufferDebugInfo(in));
                        }
                        position += CHECKSUM_PATTERN.length;
                    } else {
                        if (position + CHECKSUM_PATTERN.length < in.limit()) {
                            // FEATURE allow configurable recovery position
                            //int recoveryPosition = in.position() + 1;
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
                        log
                                .debug("parsed message: " + getBufferDebugInfo(in) + " "
                                        + messageString);
                    }
                    out.write(messageString);
                    state = SEEKING_HEADER;
                    bodyLength = 0;
                    messageFound = true;
                }
            }
            return messageFound;
        } catch (Throwable t) {
            state = SEEKING_HEADER;
            position = 0;
            bodyLength = 0;
            if (t instanceof ProtocolCodecException) {
                throw (ProtocolCodecException) t;
            } else {
                throw new ProtocolCodecException(t);
            }
        }
    }

    private int remaining(ByteBuffer in) {
        return in.limit() - position;
    }

    private String getBufferDebugInfo(ByteBuffer in) {
        return "pos=" + in.position() + ",lim=" + in.limit() + ",rem=" + in.remaining()
                + ",offset=" + position + ",state=" + state;
    }

    private byte get(ByteBuffer in) {
        return in.get(position++);
    }

    private boolean hasRemaining(ByteBuffer in) {
        return position < in.limit();
    }

    private String getMessageString(ByteBuffer buffer) throws UnsupportedEncodingException {
        byte[] data = new byte[position - buffer.position()];
        buffer.get(data);
        return new String(data, charsetEncoding);
    }

    private void handleError(ByteBuffer buffer, int recoveryPosition, String text,
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

    private boolean isLogon(ByteBuffer buffer) {
        return indexOf(buffer, buffer.position(), LOGON_PATTERN) != -1;
    }

    private static int indexOf(ByteBuffer buffer, int position, byte[] data) {
        for (int offset = position, limit = buffer.limit() - data.length + 1; offset < limit; offset++) {
            if (buffer.get(offset) == data[0] && startsWith(buffer, offset, data)) {
                return offset;
            }
        }
        return -1;
    }

    private static boolean startsWith(ByteBuffer buffer, int bufferOffset, byte[] data) {
        if (bufferOffset + data.length > buffer.limit()) {
            return false;
        }
        for (int dataOffset = 0, bufferLimit = buffer.limit() - data.length + 1; dataOffset < data.length
                && bufferOffset < bufferLimit; dataOffset++, bufferOffset++) {
            if (buffer.get(bufferOffset) != data[dataOffset] && data[dataOffset] != '?') {
                return false;
            }
        }
        return true;
    }

    public void finishDecode(IoSession arg0, ProtocolDecoderOutput arg1) throws Exception {
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
     * messages is large, do not use this method or your application may run
     * out of memory. Use the streaming version of the method instead.
     * 
     * @param file
     * @return a list of extracted messages
     * @throws IOException
     * @throws ProtocolCodecException
     * @see #extractMessages(File, quickfix.mina.message.FIXMessageDecoder.MessageListener)
     */
    public List<String> extractMessages(File file) throws IOException, ProtocolCodecException {
        final List<String> messages = new ArrayList<String>();
        extractMessages(file, new MessageListener() {

            public void onMessage(String message) {
                messages.add(message);
            }

        });
        return messages;
    }

    /**
     * Utility to extract messages from a file. This method will return each
     * message found to a provided listener. The message file will also be
     * memory mapped rather than fully loaded into physical memory. Therefore, 
     * a large message file can be processed without using excessive memory.
     * 
     * @param file
     * @param listener
     * @throws IOException
     * @throws ProtocolCodecException
     */
    public void extractMessages(File file, final MessageListener listener) throws IOException,
            ProtocolCodecException {
        // Set up a read-only memory-mapped file
        FileChannel readOnlyChannel = new RandomAccessFile(file, "r").getChannel();
        MappedByteBuffer memoryMappedBuffer = readOnlyChannel.map(FileChannel.MapMode.READ_ONLY, 0,
                (int) readOnlyChannel.size());

        decode(null, ByteBuffer.wrap(memoryMappedBuffer), new ProtocolDecoderOutput() {

            public void write(Object message) {
                listener.onMessage((String) message);
            }

            public void flush() {
                // ignored
            }

        });
    }

    private static byte[] getBytes(String s) {
        try {
            return s.getBytes(CharsetSupport.getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
