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
import java.net.SocketAddress;

import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.InvalidMessage;
import quickfix.LogUtil;
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

    @Override
    public void exceptionCaught(IoSession ioSession, Throwable cause) throws Exception {
        boolean disconnectNeeded = false;
        final Session quickFixSession = findQFSession(ioSession);
        if (cause instanceof ProtocolDecoderException && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause instanceof IOException) {
            final SocketAddress remoteAddress = ioSession.getRemoteAddress();
            final String message = cause.getMessage();
            log.error("socket exception (" + remoteAddress + "): " + message);
            disconnectNeeded = true;
        } else if (cause instanceof CriticalProtocolCodecException) {
            log.error("critical protocol codec error: " + cause.getMessage());
            disconnectNeeded = true;
        } else if (cause instanceof ProtocolCodecException) {
            final String text = "protocol handler exception: " + cause.getMessage();
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
                quickFixSession.disconnect("", true);
            } else {
                ioSession.close();
            }
        }
    }

    @Override
    public void sessionCreated(IoSession ioSession) throws Exception {
        super.sessionCreated(ioSession);
        networkingOptions.apply(ioSession);
    }

    @Override
    public void sessionClosed(IoSession ioSession) throws Exception {
        final Session quickFixSession = findQFSession(ioSession);
        if (quickFixSession != null) {
            ioSession.removeAttribute(SessionConnector.QF_SESSION);
            if (quickFixSession.hasResponder()) {
                quickFixSession.disconnect("IO Session closed", false);
            }
        }
    }

    @Override
    public void messageReceived(IoSession ioSession, Object message) throws Exception {
        final String messageString = (String) message;
        final SessionID remoteSessionID = MessageUtils.getReverseSessionID(messageString);
        final Session quickFixSession = findQFSession(ioSession, remoteSessionID);
        if (quickFixSession != null) {
            quickFixSession.getLog().onIncoming(messageString);
            try {
                final Message fixMessage = parse(quickFixSession, messageString);
                processMessage(ioSession, fixMessage);
            } catch (final InvalidMessage e) {
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
