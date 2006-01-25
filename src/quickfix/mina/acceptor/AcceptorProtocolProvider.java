package quickfix.mina.acceptor;

import java.util.Map;

import org.apache.mina.protocol.ProtocolHandler;

import quickfix.mina.AbstractProtocolProvider;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;

class AcceptorProtocolProvider extends AbstractProtocolProvider {
    private final AcceptorProtocolHandler protocolHandler;
    
    public AcceptorProtocolProvider(Map acceptorSessions, NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy) {
        protocolHandler = new AcceptorProtocolHandler(acceptorSessions, networkingOptions, eventHandlingStrategy);
    }
    public ProtocolHandler getHandler() {
        return protocolHandler;
    }

}
