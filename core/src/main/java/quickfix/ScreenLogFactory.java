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
 * Creates a logger that logs messages to to System.out. TThe logged message
 * categories (incoming, outgoing, events) can be controlled using
 * SessionSettings.
 * 
 * @see quickfix.SessionSettings
 */
public class ScreenLogFactory implements LogFactory {
    private SessionSettings settings;
    private boolean incoming;
    private boolean outgoing;
    private boolean events;
    private boolean heartBeats;
    private boolean includeMillis;

    /**
     * Enables incoming message logging.
     * 
     * Valid values: "Y" or "N"<br/>
     * Default Value: "N"
     */
    public static final String SETTING_LOG_INCOMING = "ScreenLogShowIncoming";

    /**
     * Enables outgoing message logging.
     * 
     * Valid values: "Y" or "N"<br/>
     * Default Value: "N"
     */
    public static final String SETTING_LOG_OUTGOING = "ScreenLogShowOutgoing";

    /**
     * Enables session event logging.
     * 
     * Valid values: "Y" or "N"<br/>
     * Default Value: "N"
     */
    public static final String SETTING_LOG_EVENTS = "ScreenLogShowEvents";

    /**
     * Flag for controlling output of heartbeat messages.
     * 
     * Valid values: "Y" or "N"<br/>
     * Default Value: "Y"
     */
    public static final String SETTING_LOG_HEARTBEATS = "ScreenLogShowHeartBeats";

    /**
     * Specify whether to include milliseconds in log output time stamps. Off, by
     * default.
     */
    public static final String SETTING_INCLUDE_MILLIS_IN_TIMESTAMP = "ScreenIncludeMilliseconds";

    /**
     * Create factory using configuration in session settings.
     * 
     * @param settings
     *            the session settings
     */
    public ScreenLogFactory(SessionSettings settings) {
        this(true, true, true);
        this.settings = settings;
    }

    /**
     * 
     * Create factory with explicit control of message categories.
     * 
     * @param incoming
     *            if true, log incoming messages
     * @param outgoing
     *            if true, log outgoing messages
     * @param events
     *            if true, log events
     */
    public ScreenLogFactory(boolean incoming, boolean outgoing, boolean events) {
        this(incoming, outgoing, events, true);
    }

    /**
     * Default constructor that logs incoming, outgoing, and events without heartbeats.
     *
     */
    public ScreenLogFactory() {
        this(true, true, true, false);
    }

    /**
     * 
     * Create factory with explicit control of message categories.
     * 
     * @param incoming
     *            if true, log incoming messages
     * @param outgoing
     *            if true, log outgoing messages
     * @param events
     *            if true, log events
     * @param logHeartBeats
     *            if true, log heart beat messages (the default)
     */
    public ScreenLogFactory(boolean incoming, boolean outgoing, boolean events,
            boolean logHeartBeats) {
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.events = events;
        this.heartBeats = logHeartBeats;
    }

    public Log create(SessionID sessionID) {
        try {
            incoming = getBooleanSetting(sessionID, ScreenLogFactory.SETTING_LOG_INCOMING, incoming);
            outgoing = getBooleanSetting(sessionID, ScreenLogFactory.SETTING_LOG_OUTGOING, outgoing);
            events = getBooleanSetting(sessionID, ScreenLogFactory.SETTING_LOG_EVENTS, events);
            heartBeats = getBooleanSetting(sessionID, ScreenLogFactory.SETTING_LOG_HEARTBEATS,
                    heartBeats);
            includeMillis = getBooleanSetting(sessionID,
                    ScreenLogFactory.SETTING_INCLUDE_MILLIS_IN_TIMESTAMP, false);
            return new ScreenLog(incoming, outgoing, events, heartBeats, includeMillis, sessionID, System.out);
        } catch (FieldConvertError e) {
            throw new RuntimeError(e);
        } catch (ConfigError e) {
            throw new RuntimeError(e);
        }
    }

    private boolean getBooleanSetting(SessionID sessionID, String key, boolean incoming)
            throws ConfigError, FieldConvertError {
        if (settings != null && settings.isSetting(sessionID, key)) {
            incoming = settings.getBool(sessionID, key);
        }
        return incoming;
    }

    public Log create() {
        throw new UnsupportedOperationException();
    }

}