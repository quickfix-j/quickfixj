package quickfix;

public interface SessionFactory {

    /**
     * Specifies the connection type for a session. Valid values are "initiator"
     * and "acceptor".
     */
    public static final String SETTING_CONNECTION_TYPE = "ConnectionType";
    
    /**
     * Instructs the connection-related code to continue if there is an error
     * creating or initializing a session. In other words, one bad session won't
     * stop the initialization of other sessions.
     */
    public static final String SETTING_CONTINUE_INIT_ON_ERROR = "ContinueInitializationOnError";
    
    public static final String ACCEPTOR_CONNECTION_TYPE = "acceptor";
    public static final String INITIATOR_CONNECTION_TYPE = "initiator";

    Session create(SessionID sessionID, SessionSettings settings) throws ConfigError;
    
}
