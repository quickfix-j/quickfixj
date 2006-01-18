package quickfix;

/**
 * Jakarta Commons Logging factory. By default, Commons Logging supports JDK logging
 * and Log4J. It can be extended for other logging frameworks through implementing
 * a service provider API.
 * 
 * See: <a href="http://jakarta.apache.org/commons/logging/">Jakarta Commons Logging</a> documentation. 
 */
public class CommonsLogFactory implements LogFactory {
    /**
     * Log category for events.
     */
    public final static String SETTING_EVENT_CATEGORY = "CommonsLogEventCategory";
    /**
     * Log category for incoming messages.
     */
    public final static String SETTING_INMSG_CATEGORY = "CommonsLogIncomingMessageCategory";
    /**
     * Log category for outgoing messages.
     */
    public final static String SETTING_OUTMSG_CATEGORY = "CommonsLogOutgoingMessageCategory";
    private final SessionSettings settings;

    public CommonsLogFactory(SessionSettings settings) {
        this.settings = settings;
    }

    public Log create(SessionID sessionID) {
        String eventCategory = null;
        String incomingMsgCategory = null;
        String outgoingMsgCategory = null;
        try {
            if (settings.isSetting(sessionID, SETTING_EVENT_CATEGORY)) {
                eventCategory = settings.getString(sessionID, SETTING_EVENT_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_INMSG_CATEGORY)) {
                incomingMsgCategory = settings.getString(sessionID, SETTING_INMSG_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_OUTMSG_CATEGORY)) {
                outgoingMsgCategory = settings.getString(sessionID, SETTING_OUTMSG_CATEGORY);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new CommonsLog(sessionID, eventCategory, incomingMsgCategory, outgoingMsgCategory);
    }
}
