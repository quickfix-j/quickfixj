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
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.InvalidMessage;
import quickfix.Log;
import quickfix.LogUtil;
import quickfix.Message;
import quickfix.MessageUtils;
import static quickfix.MessageUtils.parse;
import quickfix.Session;
import quickfix.SessionID;

/**
 * Abstract class used for acceptor and initiator IO handlers.
 */
public abstract class AbstractIoHandler extends IoHandlerAdapter {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private final NetworkingOptions networkingOptions;
    private final EventHandlingStrategy eventHandlingStrategy;

    public AbstractIoHandler(NetworkingOptions options, EventHandlingStrategy eventHandlingStrategy) {
        networkingOptions = options;
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    @Override
    public void exceptionCaught(IoSession ioSession, Throwable cause) throws Exception {
        boolean disconnectNeeded = false;
        Session quickFixSession = findQFSession(ioSession);
        Throwable realCause = cause;
        if (cause instanceof ProtocolDecoderException && cause.getCause() != null) {
            realCause = cause.getCause();
        } else {
            Throwable chain = cause;
            while (chain != null && chain.getCause() != null) {
                chain = chain.getCause();
                if (chain instanceof IOException) {
                    realCause = chain;
                    break;
                }
            }
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
            try {
                if (quickFixSession != null) {
                    quickFixSession.disconnect(reason, true);
                } else {
                    log.error(reason, cause);
                    ioSession.closeNow();
                }
            } finally {
                ioSession.setAttribute(SessionConnector.QFJ_RESET_IO_CONNECTOR, Boolean.TRUE);
            }
        } else {
            if (quickFixSession != null) {
                LogUtil.logThrowable(quickFixSession.getLog(), reason, cause);
            } else {
                log.error(reason, cause);
            }
        }
    }

    @Override
    public void sessionClosed(IoSession ioSession) {
        try {
            Session quickFixSession = findQFSession(ioSession);
            if (quickFixSession != null) {
                eventHandlingStrategy.onMessage(quickFixSession, EventHandlingStrategy.END_OF_STREAM);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ioSession.removeAttribute(SessionConnector.QF_SESSION);
            ioSession.closeNow();
        }
    }

    @Override
    public void messageReceived(IoSession ioSession, Object message) throws Exception {
        String messageString = (String) message;
        SessionID remoteSessionID = MessageUtils.getReverseSessionID(messageString);
        Session quickFixSession = findQFSession(ioSession, remoteSessionID);
        if (quickFixSession != null) {
            final boolean rejectGarbledMessage = quickFixSession.isRejectGarbledMessage();
            final Log sessionLog = quickFixSession.getLog();
            sessionLog.onIncoming(messageString);
            try {
                Message fixMessage = parse(quickFixSession, messageString);
                processMessage(ioSession, fixMessage);
            } catch (InvalidMessage e) {
                if (rejectGarbledMessage) {
                    final Message fixMessage = e.getFixMessage();
                    if ( fixMessage != null ) {
                        sessionLog.onErrorEvent("Processing garbled message: " + e.getMessage());
                        processMessage(ioSession, fixMessage);
                        return;
                    }
                }
                if (MessageUtils.isLogon(messageString)) {
                    sessionLog.onErrorEvent("Invalid LOGON message, disconnecting: " + e.getMessage());
                    ioSession.closeNow();
                } else {
                    sessionLog.onErrorEvent("Invalid message: " + e.getMessage());
                }
            }
        } else {
            log.error("Disconnecting; received message for unknown session: {}", messageString);
            ioSession.closeNow();
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
