/****************************************************************************
 ** Copyright (c) 2001-2004 quickfixengine.org  All rights reserved.
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

/**
 * When reading, this class identifies a FIX message and extracts it. When
 * writing, it puts the message into a buffer that the Netty NIO threads will
 * write to the output stream.
 * 
 * @author sbate
 *  
 */
public class FIXMessageData implements Message {
    private Log log = LogFactory.getLog(getClass());

    /**
     * This recognizer is used as by Netty as a factory for the
     * FIXMessageAdapter
     * 
     * @see net.gleamynode.netty2.MessageRecognizer
     */
    public static final MessageRecognizer RECOGNIZER = new MessageRecognizer() {
        /*
         * (non-Javadoc)
         * 
         * @see net.gleamynode.netty2.MessageRecognizer#recognize(java.nio.ByteBuffer)
         */
        public Message recognize(ByteBuffer buffer) throws MessageParseException {
            // TODO Use an object pool for FIXMessageData
            return new FIXMessageData();
        }
    };
    
    /**
     * Message factory for parsing FIX message data. It's threadsafe so it
     * can be reused by multiple FIXMessageData objects.
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
        try {
            if (state == SEEKING_HEADER) {
                if (buffer.remaining() < headerBytes.length) {
                    return false;
                }

                boolean foundHeader = false;
                int i = 0;
                while (i < buffer.remaining() - headerBytes.length) {
                    if (startsWith(buffer, i, headerBytes)) {
                        foundHeader = true;
                        break;
                    }
                    i++;
                }
                
                if (!foundHeader) {
                    return false;
                }

                buffer.position(i).mark();
                log.debug("found header, set mark");
                
                buffer.position(i + headerBytes.length); // skip header
                state = PARSING_LENGTH;
            }
            if (state == PARSING_LENGTH) {
                bodyLength = 0;
                byte ch = buffer.get();
                while (Character.isDigit((char) ch)) {
                    bodyLength = bodyLength * 10 + (ch - '0');
                    if (buffer.hasRemaining()) {
                        ch = buffer.get();
                    } else {
                        return false;
                    }
                }
                if (ch != '\001') {
                    throw new MessageParseException("Error in message length");
                }
                state = READING_BODY;
                log.debug("message body length: "+bodyLength);
            }
            if (state == READING_BODY) {
                if (buffer.remaining() < bodyLength) {
                    return false;
                }
                buffer.position(buffer.position() + bodyLength);
                state = PARSING_CHECKSUM;
            }
            if (state == PARSING_CHECKSUM) {
                if (startsWith(buffer, 0, checksumBytes)) {
                    log.debug("parsing checksum");
                    buffer.position(buffer.position() + checksumBytes.length);
                } else {
                    log.error("did not find checksum field, bad length?");
                }
                int messageEndPosition = buffer.position();
                buffer.reset();
                byte[] data = new byte[messageEndPosition - buffer.position()];
                buffer.get(data);
                message = new String(data);
                if (log.isTraceEnabled()) {
                    log.trace("extracted message: " + message + ", remaining=" + buffer.remaining());
                }
                return true;
            }
        } catch (MessageParseException e) {
            throw e;
        } catch (Throwable t) {
            state = SEEKING_HEADER;
            throw new MessageParseException(t);
        }
        return false;
    }

    private boolean startsWith(ByteBuffer buffer, int offset, byte[] data) {
        offset += buffer.position();
        for (int j = 0; j < data.length && j < buffer.limit(); j++) {
            if (buffer.get(offset + j) != data[j] && data[j] != '?') {
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
        int messageTypeOffset = message.indexOf("35=") + 3;
        // TODO Must handle multicharacter message types
        String messageType = message.substring(messageTypeOffset, messageTypeOffset + 1);
        quickfix.Message message = messageFactory.create(beginString, messageType);
        message.fromString(this.message, dataDictionary, true);
        return message;
    }

    public boolean isLogon() {
        return message.indexOf("\00135=A\001") != -1;
    }
    
    public String toString() {
        return message;
    }
}