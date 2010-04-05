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

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.filter.codec.demux.MessageEncoder;
import org.quickfixj.CharsetSupport;

import quickfix.Message;

/**
 * Encodes a Message object or message string as a byte array to be
 * transmitted on MINA connection.
 */
public class FIXMessageEncoder implements MessageEncoder {

    private static final Set<Class<?>> TYPES;
    private final String charsetEncoding;
    
    static {
        Set<Class<?>> types = new HashSet<Class<?>>();
        types.add(Message.class);
        types.add(String.class);
        TYPES = Collections.unmodifiableSet(types);
    }

    public FIXMessageEncoder() {
        charsetEncoding = CharsetSupport.getCharset();
    }
    
    public Set<Class<?>> getMessageTypes() {
        return TYPES;
    }

    public void encode(IoSession session, Object message, ProtocolEncoderOutput out)
            throws ProtocolCodecException {
        String fixMessageString;
        if (message instanceof String) {
            fixMessageString = (String) message;
        } else {
            try {
                fixMessageString = ((Message) message).toString();
            } catch (ClassCastException e) {
                throw new ProtocolCodecException("Invalid FIX message object type: "
                        + message.getClass(), e);
            }
        }

        ByteBuffer buffer = ByteBuffer.allocate(fixMessageString.length());
        try {
            buffer.put(fixMessageString.getBytes(charsetEncoding));
        } catch (UnsupportedEncodingException e) {
            throw new ProtocolCodecException(e);
        }
        buffer.flip();
        out.write(buffer);
    }
}
