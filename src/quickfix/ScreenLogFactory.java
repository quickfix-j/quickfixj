/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

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
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.events = events;
    }

    public Log create(SessionID sessionID) {
        try {
            boolean incoming = this.incoming;
            if (settings != null
                    && settings.isSetting(sessionID, SessionSettings.SCREEN_LOG_INCOMING)) {
                incoming = settings.getBool(sessionID, SessionSettings.SCREEN_LOG_INCOMING);
            }
            boolean outgoing = this.outgoing;
            if (settings != null
                    && settings.isSetting(sessionID, SessionSettings.SCREEN_LOG_OUTGOING)) {
                outgoing = settings.getBool(sessionID, SessionSettings.SCREEN_LOG_OUTGOING);
            }
            boolean events = this.events;
            if (settings != null
                    && settings.isSetting(sessionID, SessionSettings.SCREEN_LOG_EVENTS)) {
                events = settings.getBool(sessionID, SessionSettings.SCREEN_LOG_EVENTS);
            }

            return new ScreenLog(incoming, outgoing, events, sessionID, System.out);
        } catch (FieldConvertError e) {
            throw new RuntimeError(e);
        } catch (ConfigError e) {
            throw new RuntimeError(e);
        }
    }
}