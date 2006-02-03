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

package quickfix.mina;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.protocol.ProtocolHandlerAdapter;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;

import quickfix.DataDictionary;
import quickfix.InvalidMessage;
import quickfix.LogUtil;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.message.MessageUtils;

public abstract class AbstractProtocolHandler extends ProtocolHandlerAdapter {
    protected Log log = LogFactory.getLog(getClass());
    private final NetworkingOptions networkingOptions;
    
    public AbstractProtocolHandler(NetworkingOptions options) {
        networkingOptions = options;
    }

    public void exceptionCaught(ProtocolSession protocolSession, Throwable cause) throws Exception {
        boolean disconnectNeeded = false;
        Session quickFixSession = findQFSession(protocolSession);
        if (cause instanceof IOException) {
            SocketAddress remoteAddress = protocolSession.getRemoteAddress();
            String message = cause.getMessage();
            log.error("socket exception (" + remoteAddress + "): " + message);
            disconnectNeeded = true;
        } else if (cause instanceof CriticalSessionProtocolException) {
            disconnectNeeded = true;
        } else if (cause instanceof ProtocolViolationException) {
            String text = "protocol handler exception: " + cause.getMessage();
            if (quickFixSession != null) {
                quickFixSession.getLog().onEvent(text);
            } else {
                log.error(text);
            }
        } else {
            if (quickFixSession != null) {
                LogUtil.logThrowable(quickFixSession.getLog(), cause.getMessage(), cause);
            } else {
                log.error("protocol handler exception", cause);
            }
        }
        if (disconnectNeeded) {
            if (quickFixSession != null) {
                quickFixSession.disconnect();
            } else {
                protocolSession.close();
            }
        }
    }

    
    public void sessionCreated(ProtocolSession session) throws Exception {
        super.sessionCreated(session);
        networkingOptions.apply(session);
    }


    public void sessionClosed(ProtocolSession protocolSession) throws Exception {
        Session quickFixSession = findQFSession(protocolSession);
        if (quickFixSession != null) {
            protocolSession.removeAttribute(SessionConnector.QF_SESSION);
            if (quickFixSession.getResponder() != null) {
                quickFixSession.disconnect();
            }
        }
    }

    public void messageReceived(ProtocolSession protocolSession, Object message) throws Exception {
        String messageString = (String) message;
        SessionID remoteSessionID = MessageUtils.getReverseSessionID(messageString);
        Session quickFixSession = findQFSession(protocolSession, remoteSessionID);
        if (quickFixSession != null) {
            quickFixSession.getLog().onIncoming(messageString);
            MessageFactory messageFactory = quickFixSession.getMessageFactory();
            DataDictionary dataDictionary = quickFixSession.getDataDictionary();
            Message fixMessage;
            try {
                fixMessage = MessageUtils.parse(messageFactory, dataDictionary, messageString);
                processMessage(protocolSession, fixMessage);
            } catch (InvalidMessage e) {
                log.error("Invalid message: "+e.getMessage());
            }
        } else {
            log.error("Disconnecting; received message for unknown session: " + messageString);
            protocolSession.close();
        }
    }

    private Session findQFSession(ProtocolSession protocolSession, SessionID sessionID) {
        Session quickfixSession = findQFSession(protocolSession);
        if (quickfixSession == null) {
            quickfixSession = Session.lookupSession(sessionID);
        }
        return quickfixSession;
    }

    private Session findQFSession(ProtocolSession protocolSession) {
        return (Session) protocolSession.getAttribute(SessionConnector.QF_SESSION);
    }

    protected abstract void processMessage(ProtocolSession protocolSession, Message message)
            throws Exception;

}
