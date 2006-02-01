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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.common.ByteBuffer;
import org.apache.mina.protocol.ProtocolDecoderOutput;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;
import org.apache.mina.protocol.codec.MessageDecoder;
import org.apache.mina.protocol.codec.MessageDecoderResult;

import quickfix.mina.CriticalSessionProtocolException;

public class FIXMessageDecoder implements MessageDecoder {
    private Log log = LogFactory.getLog(getClass());

    private static final byte[] HEADER_PATTERN = "8=FIX.?.?\0019=".getBytes();
    private static final byte[] CHECKSUM_PATTERN = "10=???\001".getBytes();
    private static final byte[] LOGON_PATTERN = "\00135=A\001".getBytes();

    // Parsing states
    private static final int SEEKING_HEADER = 1;
    private static final int PARSING_LENGTH = 2;
    private static final int READING_BODY = 3;
    private static final int PARSING_CHECKSUM = 4;

    private int state;
    private int bodyLength;
    private int position;
    private int headerOffset;

    private void resetState() {
        state = SEEKING_HEADER;
        bodyLength = 0;
        position = 0;
    }

    public FIXMessageDecoder() {
        resetState();
    }

    public MessageDecoderResult decodable(ProtocolSession session, ByteBuffer in) {
        headerOffset = indexOf(in, in.position(), HEADER_PATTERN);
        return headerOffset != -1 ? MessageDecoderResult.OK : MessageDecoderResult.NEED_DATA;
    }

    public MessageDecoderResult decode(ProtocolSession session, ByteBuffer in,
            ProtocolDecoderOutput out) throws ProtocolViolationException {
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
            throws ProtocolViolationException {
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
                    if (messageString.indexOf("8=FIX", 1) >= 0) {
                        System.out.println("FOO");
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
            if (t instanceof ProtocolViolationException) {
                throw (ProtocolViolationException) t;
            } else {
                throw new ProtocolViolationException(t);
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

    private String getMessageString(ByteBuffer buffer) {
        byte[] data = new byte[position - buffer.position()];
        buffer.get(data);
        return new String(data);
    }

    private void handleError(ByteBuffer buffer, int recoveryPosition, String text,
            boolean disconnect) throws ProtocolViolationException {
        buffer.position(recoveryPosition);
        position = recoveryPosition;
        state = SEEKING_HEADER;
        bodyLength = 0;
        if (disconnect) {
            throw new CriticalSessionProtocolException(text);
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

}
