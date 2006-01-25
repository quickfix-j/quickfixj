package quickfix.mina.initiator;

import org.apache.mina.protocol.ProtocolHandler;

import quickfix.Session;
import quickfix.mina.AbstractProtocolProvider;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;

class InitiatorProtocolProvider extends AbstractProtocolProvider {

    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;
    private final NetworkingOptions networkingOptions;

    public InitiatorProtocolProvider(Session quickfixSession, NetworkingOptions networkingOptions,
            EventHandlingStrategy strategy) {
        this.quickfixSession = quickfixSession;
        this.networkingOptions = networkingOptions;
        eventHandlingStrategy = strategy;
    }

    public ProtocolHandler getHandler() {
        return new InitiatorProtocolHandler(quickfixSession, networkingOptions, eventHandlingStrategy);
    }

}
