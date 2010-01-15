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

import static quickfix.MessageUtils.parse;

import java.io.IOException;

import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.InvalidMessage;
import quickfix.Message;
import quickfix.MessageUtils;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.field.MsgType;

/**
 * Abstract class used for acceptor and initiator IO handlers.
 */
public abstract class AbstractIoHandler extends IoHandlerAdapter {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private final NetworkingOptions networkingOptions;

    public AbstractIoHandler(NetworkingOptions options) {
        networkingOptions = options;
    }

    public void exceptionCaught(IoSession ioSession, Throwable cause) throws Exception {
        boolean disconnectNeeded = false;
        Session quickFixSession = findQFSession(ioSession);
        Throwable realCause = cause;
        if (cause instanceof ProtocolDecoderException && cause.getCause() != null) {
            realCause = cause.getCause();
        }
        String reason;
        if (realCause instanceof IOException) {
            if (quickFixSession != null && quickFixSession.isEnabled()) {
                reason = "Socket exception (" + ioSession.getRemoteAddress() + "): " + cause;
            } else {
                reason = "Socket (" + ioSession.getRemoteAddress() + "): " + cause;
            }
            disconnectNeeded = true;
        } else if (realCause instanceof CriticalProtocolCodecException) {
            reason = "Critical protocol codec error: " + cause;
            disconnectNeeded = true;
        } else if (realCause instanceof ProtocolCodecException) {
            reason = "Protocol handler exception: " + cause;
        } else {
            reason = cause.toString();
        }
        if (disconnectNeeded) {
            if (quickFixSession != null) {
                quickFixSession.disconnect(reason, true);
            } else {
                log.error(reason, cause);
                ioSession.close();
            }
        } else {
            log.error(reason, cause);
        }
    }

    public void sessionCreated(IoSession ioSession) throws Exception {
        super.sessionCreated(ioSession);
        networkingOptions.apply(ioSession);
    }

    public void sessionClosed(IoSession ioSession) throws Exception {
        Session quickFixSession = findQFSession(ioSession);
        if (quickFixSession != null) {
            ioSession.removeAttribute(SessionConnector.QF_SESSION);
            if (quickFixSession.hasResponder()) {
                quickFixSession.disconnect("IO Session closed", false);
            }
        }
    }

    public void messageReceived(IoSession ioSession, Object message) throws Exception {
        String messageString = (String) message;
        SessionID remoteSessionID = MessageUtils.getReverseSessionID(messageString);
        Session quickFixSession = findQFSession(ioSession, remoteSessionID);
        if (quickFixSession != null) {
            quickFixSession.getLog().onIncoming(messageString);
            try {
                Message fixMessage = parse(quickFixSession, messageString);
                processMessage(ioSession, fixMessage);
            } catch (InvalidMessage e) {
                if (MsgType.LOGON.equals(MessageUtils.getMessageType(messageString))) {
                    log.error("Invalid LOGON message, disconnecting: " + e.getMessage());
                    ioSession.close();
                } else {
                    log.error("Invalid message: " + e.getMessage());
                }
            }
        } else {
            log.error("Disconnecting; received message for unknown session: " + messageString);
            ioSession.close();
        }
    }

    protected Session findQFSession(IoSession ioSession, SessionID sessionID) {
        Session quickfixSession = findQFSession(ioSession);
        if (quickfixSession == null) {
            quickfixSession = Session.lookupSession(sessionID);
        }
        return quickfixSession;
    }

    private Session findQFSession(IoSession ioSession) {
        return (Session) ioSession.getAttribute(SessionConnector.QF_SESSION);
    }

    protected NetworkingOptions getNetworkingOptions() {
        return networkingOptions;
    }

    protected abstract void processMessage(IoSession ioSession, Message message) throws Exception;

}
