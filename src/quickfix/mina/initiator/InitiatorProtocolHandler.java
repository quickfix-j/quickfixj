package quickfix.mina.initiator;

import org.apache.mina.protocol.ProtocolSession;

import quickfix.Message;
import quickfix.Session;
import quickfix.mina.AbstractProtocolHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolSessionResponder;
import quickfix.mina.SessionConnector;

class InitiatorProtocolHandler extends AbstractProtocolHandler {
    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;
    
    public InitiatorProtocolHandler(Session quickfixSession, NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy) {
        super(networkingOptions);
        this.quickfixSession = quickfixSession;
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    public void sessionCreated(ProtocolSession session) throws Exception {
        super.sessionCreated(session);
        session.setAttribute(SessionConnector.QF_SESSION, quickfixSession);
        quickfixSession.setResponder(new ProtocolSessionResponder(session));
        log.info("MINA session created: " + session.getLocalAddress());
    }

    protected void processMessage(ProtocolSession protocolSession, Message message) throws Exception {
        eventHandlingStrategy.onMessage(quickfixSession, message);
    }

}
