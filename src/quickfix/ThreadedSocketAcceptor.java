package quickfix;

import quickfix.mina.ThreadPerSessionEventHandlingStrategy;
import quickfix.mina.acceptor.AbstractSocketAcceptor;

public class ThreadedSocketAcceptor extends AbstractSocketAcceptor {
    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
    }

    public ThreadedSocketAcceptor(SessionFactory sessionFactory, SessionSettings settings) throws ConfigError {
        super(settings, sessionFactory);
    }

    public void start() throws ConfigError, RuntimeError {
        startAcceptingConnections(new ThreadPerSessionEventHandlingStrategy());
    }
    
    public void stop() {
        stop(false);
    }

    public void stop(boolean forceDisconnect) {
        stopAcceptingConnections();
        logoutAllSessions(forceDisconnect);
        stopSessionTimer();
        if (!forceDisconnect) {
            waitForLogout();
        }
    }

    public void block() throws ConfigError, RuntimeError {
        throw new UnsupportedOperationException("Blocking not supported: "+getClass());
    }

    public boolean poll() throws ConfigError, RuntimeError {
        throw new UnsupportedOperationException("Blocking not supported: "+getClass());
    }

}
