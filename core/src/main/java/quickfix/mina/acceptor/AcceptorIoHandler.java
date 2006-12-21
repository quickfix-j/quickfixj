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

package quickfix.mina.acceptor;

import java.util.Map;

import org.apache.mina.common.IoSession;

import quickfix.Log;
import quickfix.Message;
import quickfix.MessageUtils;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.mina.AbstractIoHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;

class AcceptorIoHandler extends AbstractIoHandler {
    private final Map acceptorSessions;

    private final EventHandlingStrategy eventHandlingStrategy;

    public AcceptorIoHandler(Map acceptorSessions, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandingStrategy) {
        super(networkingOptions);
        this.acceptorSessions = acceptorSessions;
        this.eventHandlingStrategy = eventHandingStrategy;
    }

    public void sessionCreated(IoSession session) throws Exception {
        super.sessionCreated(session);
        log.info("MINA session created: " + session.getRemoteAddress());
    }

    protected void processMessage(IoSession protocolSession, Message message)
            throws Exception {
        SessionID sessionID = MessageUtils.getReverseSessionID(message);
        Session qfSession = (Session) protocolSession.getAttribute(SessionConnector.QF_SESSION);
        if (qfSession == null) {
            if (message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                qfSession = (Session) acceptorSessions.get(sessionID);
                if (qfSession != null) {
                    Log sessionLog = qfSession.getLog();
                    if (qfSession.hasResponder()) {
                        // Session is already bound to another connection
                        sessionLog
                                .onEvent("Multiple logons/connections for this session are not allowed");
                        protocolSession.close();
                        return;
                    }
                    sessionLog.onEvent("Accepting session " + qfSession.getSessionID() + " from "
                            + protocolSession.getRemoteAddress());
                    int heartbeatInterval = message.getInt(HeartBtInt.FIELD);
                    qfSession.setHeartBeatInterval(heartbeatInterval);
                    sessionLog.onEvent("Acceptor heartbeat set to " + heartbeatInterval
                            + " seconds");
                    protocolSession.setAttribute(SessionConnector.QF_SESSION, qfSession);
                    qfSession.setResponder(new IoSessionResponder(protocolSession));
                } else {
                    log.error("Unknown session ID during logon: " + sessionID);
                    return;
                }
            } else {
                log.warn("Ignoring non-logon message before session establishment: "+message);
                return;
            }
        }
        eventHandlingStrategy.onMessage(qfSession, message);
    }
}
