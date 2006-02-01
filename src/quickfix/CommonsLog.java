package quickfix;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLog implements quickfix.Log {
    public static final String DEFAULT_EVENT_CATEGORY = "quickfixj.event";
    public static final String DEFAULT_INCOMING_MSG_CATEGORY = "quickfixj.msg.incoming";
    public static final String DEFAULT_OUTGOING_MSG_CATEGORY = "quickfixj.msg.outgoing";

    private final SessionID sessionID;
    private final Log eventLog;
    private final Log incomingMsgLog;
    private final Log outgoingMsgLog;

    public CommonsLog(SessionID sessionID, String eventCategory, String incomingMsgCategory,
            String outgoingMsgCategory) {
        this.sessionID = sessionID;
        eventLog = LogFactory
                .getLog(eventCategory != null ? eventCategory : DEFAULT_EVENT_CATEGORY);
        incomingMsgLog = LogFactory.getLog(incomingMsgCategory != null ? incomingMsgCategory
                : DEFAULT_INCOMING_MSG_CATEGORY);
        outgoingMsgLog = LogFactory.getLog(outgoingMsgCategory != null ? outgoingMsgCategory
                : DEFAULT_OUTGOING_MSG_CATEGORY);
    }

    public void onEvent(String text) {
        log(eventLog, text);
    }

    public void onIncoming(String message) {
        log(incomingMsgLog, message);
    }

    public void onOutgoing(String message) {
        log(outgoingMsgLog, message);
    }

    private void log(Log log, String text) {
        log.info(sessionID+": "+text);
    }

    public void clear() {
        onEvent("Log clear operation is not supported: " + getClass().getName());
    }

}
