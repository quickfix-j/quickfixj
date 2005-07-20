package quickfix;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLog implements quickfix.Log {
    public static final String DEFAULT_EVENT_CATEGORY = "quickfixj.event";
    public static final String DEFAULT_INCOMING_MSG_CATEGORY = "quickfixj.msg.incoming";
    public static final String DEFAULT_OUTGOING_MSG_CATEGORY = "quickfixj.msg.outgoing";

    private final Log eventLog;
    private final Log incomingMsgLog;
    private final Log outgoingMsgLog;

    public CommonsLog(String eventCategory, String incomingMsgCategory,
            String outgoingMsgCategory) {
        eventLog = LogFactory
                .getLog(eventCategory != null ? eventCategory : DEFAULT_EVENT_CATEGORY);
        incomingMsgLog = LogFactory.getLog(incomingMsgCategory != null ? incomingMsgCategory
                : DEFAULT_INCOMING_MSG_CATEGORY);
        outgoingMsgLog = LogFactory.getLog(outgoingMsgCategory != null ? outgoingMsgCategory
                : DEFAULT_OUTGOING_MSG_CATEGORY);
    }

    public void onEvent(String text) {
        eventLog.info(text);
    }

    public void onIncoming(String message) {
        incomingMsgLog.info(message);
    }

    public void onOutgoing(String message) {
        outgoingMsgLog.info(message);
    }

}
