/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix.netty;

import java.nio.ByteBuffer;

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.MessageParseException;
import net.gleamynode.netty2.MessageRecognizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import quickfix.DataDictionary;
import quickfix.DefaultMessageFactory;
import quickfix.InvalidMessage;
import quickfix.Session;

/**
 * When reading, this class identifies a FIX message and extracts it. When
 * writing, it puts the message into a buffer that the Netty NIO threads will
 * write to the output stream.
 */
public class FIXMessageData implements Message {
    private Session session;
    private Log log = LogFactory.getLog(getClass());

    /**
     * This recognizer is used as by Netty as a factory for the
     * FIXMessageAdapter
     * 
     * @see net.gleamynode.netty2.MessageRecognizer
     */
    public final static MessageRecognizer RECOGNIZER = new MessageRecognizer() {
        /*
         * (non-Javadoc)
         * 
         * @see net.gleamynode.netty2.MessageRecognizer#recognize(java.nio.ByteBuffer)
         */
        public Message recognize(ByteBuffer buffer) throws MessageParseException {
            // TODO PERFORMANCE Use an object pool for FIXMessageData?
            return indexOf(buffer, 0, headerBytes) != -1 ? new FIXMessageData() : null;
        }
    };

    /**
     * Message factory for parsing FIX message data. It's threadsafe so it can
     * be reused by multiple FIXMessageData objects.
     */
    private static DefaultMessageFactory messageFactory = new DefaultMessageFactory();

    // Parsing states
    private static final int SEEKING_HEADER = 1;
    private static final int PARSING_LENGTH = 2;
    private static final int READING_BODY = 3;
    private static final int PARSING_CHECKSUM = 4;

    // Start/end message patterns
    private static final byte[] headerBytes = "8=FIX.?.?\0019=".getBytes();
    private static final byte[] checksumBytes = "10=???\001".getBytes();

    private int state = SEEKING_HEADER;
    private int bodyLength = 0;
    private int messageStartPosition;
    private int bodyStartPosition;
    private int position;
    private String message;

    public FIXMessageData() {
        // empty
    }

    public FIXMessageData(String message) {
        this.message = message;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.gleamynode.netty2.Message#read(java.nio.ByteBuffer)
     */
    public boolean read(ByteBuffer buffer) throws MessageParseException {
        for (;;) {
            try {
                if (state == SEEKING_HEADER) {
                    if (buffer.remaining() < headerBytes.length) {
                        break;
                    }

                    // TODO PERFORMANCE this can be optimized in recognizer
                    messageStartPosition = indexOf(buffer, buffer.position(), headerBytes);
                    if (messageStartPosition == -1) {
                        throw new MessageParseException("inconsistent header recognization"
                                + " between message recognizer and parser");
                    }

                    log.debug("found header");

                    position = messageStartPosition + headerBytes.length;
                    state = PARSING_LENGTH;
                }
                if (state == PARSING_LENGTH) {
                    bodyLength = 0;
                    byte ch = buffer.get(position++);
                    while (Character.isDigit((char) ch)) {
                        bodyLength = bodyLength * 10 + (ch - '0');
                        if (buffer.hasRemaining()) {
                            ch = buffer.get(position++);
                        } else {
                            break;
                        }
                    }
                    if (ch != '\001') {
                        handleError(buffer, "Error in message length", false);
                        break;
                    }
                    bodyStartPosition = position;
                    state = READING_BODY;
                    log.debug("reading body, length = " + bodyLength);
                }
                if (state == READING_BODY) {
                    if ((buffer.limit() - position) < bodyLength) {
                        break;
                    }
                    position += bodyLength;
                    state = PARSING_CHECKSUM;
                }
                if (state == PARSING_CHECKSUM) {
                    if (startsWith(buffer, position, checksumBytes)) {
                        log.debug("parsing checksum");
                        position += checksumBytes.length;
                    } else {
                        handleError(buffer, "did not find checksum field, bad length?", isLogon(
                                buffer, messageStartPosition));
                        if (buffer.remaining() > 0) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    byte[] data = new byte[position - messageStartPosition];
                    buffer.position(messageStartPosition);
                    buffer.get(data);
                    message = new String(data);
                    if (log.isTraceEnabled()) {
                        log.trace("extracted message: " + message + ", remaining="
                                + buffer.remaining());
                    }
                    return true;
                }
            } catch (Throwable t) {
                state = SEEKING_HEADER;
                throw new MessageParseException(t);
            }
        }
        return false;
    }

    private void handleError(ByteBuffer buffer, String text, boolean disconnect)
            throws MessageParseException {
        // TODO FEATURE allow configurable recovery position
        //int newOffset = messageStartPosition + 1;
        // Following recovery position is compatible with QuickFIX C++
        // but drops messages unnecessarily in corruption scenarios.
        int newOffset = bodyStartPosition + bodyLength;
        int nextHeader = indexOf(buffer, newOffset, headerBytes);
        if (nextHeader != -1) {
            buffer.position(nextHeader);
        } else {
            buffer.position(buffer.limit());
        }
        position = 0;
        state = SEEKING_HEADER;
        if (session != null) {
            session.getLog().onEvent(text);
        } else {
            log.error(text);
        }
        if (disconnect) {
            throw new MessageParseException(text + " (during logon)");
        }
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
        for (int dataOffset = 0, bufferLimit = buffer.limit() - data.length + 1; dataOffset < data.length
                && bufferOffset < bufferLimit; dataOffset++, bufferOffset++) {
            if (buffer.get(bufferOffset) != data[dataOffset] && data[dataOffset] != '?') {
                return false;
            }
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.gleamynode.netty2.Message#write(java.nio.ByteBuffer)
     */
    public boolean write(ByteBuffer buffer) {
        buffer.put(message.getBytes());
        return true;
    }

    public quickfix.Message parse(DataDictionary dataDictionary) throws InvalidMessage {
        String beginString = message.substring(2, 9);
        String messageType = getMessageType();
        quickfix.Message message = messageFactory.create(beginString, messageType);
        message.fromString(this.message, dataDictionary, true);
        return message;
    }

    private String getMessageType() throws InvalidMessage {
        int messageTypeStart = message.indexOf("35=") + 3;
        int messageTypeEnd = messageTypeStart + 1;
        while (message.charAt(messageTypeEnd) != '\001') {
            messageTypeEnd++;
            if (messageTypeEnd >= message.length()) {
                throw new InvalidMessage("couldn't extract message type");
            }
        }
        return message.substring(messageTypeStart, messageTypeEnd);
    }

    private boolean isLogon(ByteBuffer buffer, int position) {
        // TODO CLEANUP logon bytes should be constant
        return indexOf(buffer, position, "\00135=A\001".getBytes()) != -1;
    }

    public boolean isLogon() {
        return message.indexOf("\00135=A\001") != -1;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String toString() {
        return message;
    }
}