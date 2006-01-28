package quickfix;

import quickfix.mina.ThreadPerSessionEventHandlingStrategy;
import quickfix.mina.initiator.AbstractSocketInitiator;

public class ThreadedSocketInitiator extends AbstractSocketInitiator {
    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    public ThreadedSocketInitiator(SessionFactory sessionFactory, SessionSettings settings)
            throws ConfigError {
        super(settings, sessionFactory);
    }

    public void start() throws ConfigError, RuntimeError {
        initiateSessions(new ThreadPerSessionEventHandlingStrategy());
    }

    public void stop() {
        stop(false);
    }

    public void stop(boolean forceDisconnect) {
        logoutAllSessions(forceDisconnect);
        stopSessionTimer();
        if (!forceDisconnect) {
            waitForLogout();
        }
    }

    public void block() throws ConfigError, RuntimeError {
        throw new UnsupportedOperationException("Blocking not supported: " + getClass());
    }

    public boolean poll() throws ConfigError, RuntimeError {
        throw new UnsupportedOperationException("Blocking not supported: " + getClass());
    }

}
