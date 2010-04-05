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

package quickfix;

import static quickfix.FixVersions.*;
import quickfix.field.MsgType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The default factory for creating FIX message instances. Create subclasses
 * of this factory for generating custom messages using nonstandard message
 * types.
 */
public class DefaultMessageFactory implements MessageFactory {
    private final Map<String,MessageFactory> messageFactories
        = new ConcurrentHashMap<String,MessageFactory>();

    public DefaultMessageFactory() {
        // To loosen the coupling between this factory and generated code, the
        // message factories are discovered at run time using reflection.
        discoverFactory(BEGINSTRING_FIX40, "quickfix.fix40.MessageFactory");
        discoverFactory(BEGINSTRING_FIX41, "quickfix.fix41.MessageFactory");
        discoverFactory(BEGINSTRING_FIX42, "quickfix.fix42.MessageFactory");
        discoverFactory(BEGINSTRING_FIX43, "quickfix.fix43.MessageFactory");
        discoverFactory(BEGINSTRING_FIX44, "quickfix.fix44.MessageFactory");
        discoverFactory(BEGINSTRING_FIXT11, "quickfix.fixt11.MessageFactory");
        discoverFactory(FIX50, "quickfix.fix50.MessageFactory");
    }

    private void discoverFactory(String beginString, String factoryClassName) {
        try {
            messageFactories.put(beginString, (MessageFactory) Class.forName(
                    factoryClassName).newInstance());
        } catch (InstantiationException e) {
            // ignored
        } catch (IllegalAccessException e) {
            // ignored
        } catch (ClassNotFoundException e) {
            // ignored
        }
    }
    
    public Message create(String beginString, String msgType) {
        MessageFactory messageFactory = messageFactories.get(beginString);
        if (beginString.equals(BEGINSTRING_FIXT11)) {
            // The default message factory assumes that only FIX 5.0 will be
            // used with FIXT 1.1 sessions. A more flexible approach will require
            // an extension to the QF JNI API. Until then, you will need a custom
            // message factory if you want to use application messages prior to
            // FIX 5.0 with a FIXT 1.1 session.
            //
            // If you need to determine admin message category based on a data
            // dictionary, then use a custom message factory and don't use the
            // static method used below.
            if (!MessageUtils.isAdminMessage(msgType)) {
                messageFactory = messageFactories.get(FIX50);
            }
        }
        
        if (messageFactory != null) {
            return messageFactory.create(beginString, msgType);
        }

        Message message = new Message();
        message.getHeader().setString(MsgType.FIELD, msgType);
        
        return message;
    }

    public Group create(String beginString, String msgType, int correspondingFieldID) {
        MessageFactory messageFactory = messageFactories.get(beginString);
        if (messageFactory != null) {
            return messageFactory.create(beginString, msgType, correspondingFieldID);
        }
        throw new IllegalArgumentException("Unsupported FIX version: "+beginString);
    }
}
