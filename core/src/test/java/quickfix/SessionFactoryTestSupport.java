package quickfix;

public class SessionFactoryTestSupport implements SessionFactory {
    private static SessionFactoryTestSupport instance = new SessionFactoryTestSupport();

    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        if (sessionID == null) {
            sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        }
        return createSession(sessionID, new UnitTestApplication(), false);
    }

    public static Session createSession(SessionID sessionID, Application application, boolean isInitiator) {
        return new Session(application, new MemoryStoreFactory(), sessionID, null, null,
                new ScreenLogFactory(true, true, true), new DefaultMessageFactory(), isInitiator ? 30 : 0);
    }

    public static Session createSession() throws ConfigError {
        return instance.create(null, null);
    }
}
