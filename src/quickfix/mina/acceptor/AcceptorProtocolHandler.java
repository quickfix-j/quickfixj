package quickfix.mina.acceptor;

import java.util.Map;

import org.apache.mina.protocol.ProtocolSession;

import quickfix.Log;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.mina.AbstractProtocolHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolSessionResponder;
import quickfix.mina.SessionConnector;
import quickfix.mina.message.MessageUtils;

class AcceptorProtocolHandler extends AbstractProtocolHandler {
    private final Map acceptorSessions;

    private final EventHandlingStrategy eventHandlingStrategy;

    public AcceptorProtocolHandler(Map acceptorSessions, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandingStrategy) {
        super(networkingOptions);
        this.acceptorSessions = acceptorSessions;
        this.eventHandlingStrategy = eventHandingStrategy;
    }

    public void sessionCreated(ProtocolSession session) throws Exception {
        super.sessionCreated(session);
        log.info("MINA session created: " + session.getRemoteAddress());
    }

    protected void processMessage(ProtocolSession protocolSession, Message message)
            throws Exception {
        SessionID sessionID = MessageUtils.getRemoteSessionID(message);
        Session qfSession = (Session) protocolSession.getAttribute(SessionConnector.QF_SESSION);
        if (qfSession == null) {
            if (message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                qfSession = (Session) acceptorSessions.get(sessionID);
                Log sessionLog = qfSession.getLog();
                if (qfSession != null) {
                    if (qfSession.getResponder() != null) {
                        // Session is already bound to another connection
                        sessionLog
                                .onEvent("Multiple logons/connections for this session are not allowed");
                        protocolSession.close();
                        return;
                    }
                    sessionLog.onEvent("Accepting session " + qfSession.getSessionID() + " from "
                            + protocolSession.getRemoteAddress());
                    int heartbeatInterval = message.getInt(HeartBtInt.FIELD);
                    qfSession.getState().setHeartBeatInterval(heartbeatInterval);
                    sessionLog.onEvent("Acceptor heartbeat set to " + heartbeatInterval
                            + " seconds");
                    protocolSession.setAttribute(SessionConnector.QF_SESSION, qfSession);
                    qfSession.setResponder(new ProtocolSessionResponder(protocolSession));
                } else {
                    log.error("Unknown session ID during logon: " + sessionID);
                }
            }
        }
        eventHandlingStrategy.onMessage(qfSession, message);
    }
}
