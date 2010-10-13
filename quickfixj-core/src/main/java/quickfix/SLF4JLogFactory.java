/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

/**
 * Simple Logging Facade for Java (SLF4J) log factory (<a href="http://slfj4.org">slfj.org</a>).
 */
public class SLF4JLogFactory implements LocationAwareLogFactory {
    /**
     * Log category for events.
     */
    public final static String SETTING_EVENT_CATEGORY = "SLF4JLogEventCategory";
    /**
     * Log category for error events.
     */
    public final static String SETTING_ERROR_EVENT_CATEGORY = "SLF4JLogErrorEventCategory";

    /**
     * Log category for incoming messages.
     */
    public final static String SETTING_INMSG_CATEGORY = "SLF4JLogIncomingMessageCategory";

    /**
     * Log category for outgoing messages.
     */
    public final static String SETTING_OUTMSG_CATEGORY = "SLF4JLogOutgoingMessageCategory";

    /**
     * Flag for prepending session ID to log output
     */
    public final static String SETTING_PREPEND_SESSION_ID = "SLF4JLogPrependSessionID";
    
    /**
     * Controls logging of heartbeats (Y or N)
     */
    public final static String SETTING_LOG_HEARTBEATS = "SLF4JLogHeartbeats";
    
    private final SessionSettings settings;

    public SLF4JLogFactory(SessionSettings settings) {
        this.settings = settings;
    }

    public Log create(SessionID sessionID) {
        // it's actually code in AbstractLog that makes the final code to Log4J and not SLF4JLog itself
        // so send the AbstractLog here
        return create(sessionID, AbstractLog.class.getName());
    }
    
    /**
     * This supports use of this log in a CompositeLogFactory.
     */
    public Log create(SessionID sessionID, String callerFQCN) {
        String eventCategory = null;
        String errorEventCategory = null;
        String incomingMsgCategory = null;
        String outgoingMsgCategory = null;
        boolean prependSessionID = true;
        boolean logHeartbeats = true;
        try {
            if (settings.isSetting(sessionID, SETTING_EVENT_CATEGORY)) {
                eventCategory = settings.getString(sessionID, SETTING_EVENT_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_ERROR_EVENT_CATEGORY)) {
                errorEventCategory = settings.getString(sessionID, SETTING_ERROR_EVENT_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_INMSG_CATEGORY)) {
                incomingMsgCategory = settings.getString(sessionID, SETTING_INMSG_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_OUTMSG_CATEGORY)) {
                outgoingMsgCategory = settings.getString(sessionID, SETTING_OUTMSG_CATEGORY);
            }
            if (settings.isSetting(sessionID, SETTING_PREPEND_SESSION_ID)) {
                prependSessionID = settings.getBool(sessionID, SETTING_PREPEND_SESSION_ID);
            }
            if ( settings.isSetting(sessionID, SETTING_LOG_HEARTBEATS)) {
                logHeartbeats = settings.getBool(sessionID, SETTING_LOG_HEARTBEATS);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new SLF4JLog(sessionID, eventCategory, errorEventCategory, incomingMsgCategory, outgoingMsgCategory,
                prependSessionID, logHeartbeats, callerFQCN);
    }
    
    public Log create() {
        throw new UnsupportedOperationException();
    }

}
