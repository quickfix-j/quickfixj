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
 * Jakarta Commons Logging factory. By default, Commons Logging supports JDK logging
 * and Log4J. It can be extended for other logging frameworks through implementing
 * a service provider API.
 * 
 * See: <a href="http://jakarta.apache.org/commons/logging/">Jakarta Commons Logging</a> documentation. 
 */
public class SLF4JLogFactory implements LogFactory {
    /**
     * Log category for events.
     */
    public final static String SETTING_EVENT_CATEGORY = "SLF4JLogEventCategory";
    /**
     * Log category for incoming messages.
     */
    public final static String SETTING_INMSG_CATEGORY = "SLF4JLogIncomingMessageCategory";
    /**
     * Log category for outgoing messages.
     */
    public final static String SETTING_OUTMSG_CATEGORY = "SLF4JLogOutgoingMessageCategory";
    private final SessionSettings settings;

    public SLF4JLogFactory(SessionSettings settings) {
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
        return new SLF4JLog(sessionID, eventCategory, incomingMsgCategory, outgoingMsgCategory);
    }
}
