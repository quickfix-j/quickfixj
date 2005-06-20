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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import quickfix.field.converter.UtcTimeOnlyConverter;

/**
 * Factory for creating sessions. Used by the communications code (acceptors,
 * initiators) for creating sessions.
 */
public class SessionFactory {
    /**
     * Specifies the connection type for a session. Valid values are "initiator"
     * and "acceptor".
     */
    public static final String SETTING_CONNECTION_TYPE = "ConnectionType";

    private static final String ACCEPTOR_CONNECTION_TYPE = "acceptor";
    private static final String INITIATOR_CONNECTION_TYPE = "initiator";
    private static Map dictionaryCache = new Hashtable(); // synchronized
    private Application application;
    private MessageStoreFactory messageStoryFactory;
    private LogFactory logFactory;

    public SessionFactory(Application application, MessageStoreFactory messageStoreFactory,
            LogFactory logFactory) {
        this.application = application;
        this.messageStoryFactory = messageStoreFactory;
        this.logFactory = logFactory;
    }

    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        try {
            String connectionType;
            if (settings.isSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE)) {
                connectionType = settings.getString(sessionID,
                        SessionFactory.SETTING_CONNECTION_TYPE);
            } else {
                connectionType = INITIATOR_CONNECTION_TYPE;
            }

            if (!connectionType.equals(ACCEPTOR_CONNECTION_TYPE)
                    && !connectionType.equals(INITIATOR_CONNECTION_TYPE)) {
                throw new ConfigError("Invalid ConnectionType");
            }

            if (connectionType.equals(ACCEPTOR_CONNECTION_TYPE)
                    && settings.isSetting(sessionID, SessionSettings.SESSION_QUALIFIER)) {
                throw new ConfigError("SessionQualifier cannot be used with acceptor.");
            }

            boolean useDataDictionary = true;
            if (settings.isSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY)) {
                useDataDictionary = settings.getBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
            }

            DataDictionary dataDictionary = null;
            if (useDataDictionary) {
                String path = settings.getString(sessionID, Session.SETTING_DATA_DICTIONARY);
                dataDictionary = (DataDictionary) dictionaryCache.get(path);
                if (dataDictionary == null) {
                    try {
                        dataDictionary = new DataDictionary(new FileInputStream(path));
                        dictionaryCache.put(path, dataDictionary);
                    } catch (FileNotFoundException e) {
                        throw new ConfigError(e.getMessage());
                    }
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER)) {
                    dataDictionary.setCheckFieldsOutofOrder(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER));
                }
                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES)) {
                    dataDictionary.setCheckFieldsHaveValues(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES));
                }
            }

            // TODO FEATURE C++ Validate user defined field tag range between 5000 and 9999 inclusive.
            
            Date startTime = UtcTimeOnlyConverter.convert(settings.getString(sessionID,
                    Session.SETTING_START_TIME));
            Date endTime = UtcTimeOnlyConverter.convert(settings.getString(sessionID,
                    Session.SETTING_END_TIME));

            int startDay = getDay(settings, sessionID, Session.SETTING_START_DAY, -1);
            int endDay = getDay(settings, sessionID, Session.SETTING_END_DAY, -1);

            if (startDay >= 0 && endDay < 0) {
                throw new ConfigError("StartDay used without EndDay");
            }
            if (endDay >= 0 && startDay < 0) {
                throw new ConfigError("EndDay used with StartDay");
            }

            int heartbeatInterval = 0;
            if (connectionType.equals(INITIATOR_CONNECTION_TYPE)) {
                heartbeatInterval = (int) settings.getLong(sessionID, Session.SETTING_HEARTBTINT);
                if (heartbeatInterval <= 0) {
                    throw new ConfigError("Heartbeat must be greater than zero");
                }
            }

            Session session = new Session(application, messageStoryFactory, sessionID,
                    dataDictionary, new SessionSchedule(startTime, endTime, startDay, endDay),
                    logFactory, new DefaultMessageFactory(), heartbeatInterval);

            if (settings.isSetting(sessionID, Session.SETTING_CHECK_LATENCY)) {
                session.setCheckLatency(settings.getBool(sessionID, Session.SETTING_CHECK_LATENCY));
            }
            if (settings.isSetting(sessionID, Session.SETTING_MAX_LATENCY)) {
                session.setMaxLatency((int) settings.getLong(sessionID, Session.SETTING_MAX_LATENCY));
            }
            if (settings.isSetting(sessionID, Session.SETTING_RESET_ON_LOGOUT)) {
                session.setResetOnLogout(settings.getBool(sessionID, Session.SETTING_RESET_ON_LOGOUT));
            }
            if (settings.isSetting(sessionID, Session.SETTING_RESET_ON_DISCONNECT)) {
                session.setResetOnDisconnect(settings.getBool(sessionID,
                        Session.SETTING_RESET_ON_DISCONNECT));
            }
            if (settings.isSetting(sessionID, Session.SETTING_MILLISECONDS_IN_TIMESTAMP)) {
                session.setMillisecondsInTimestamp(settings.getBool(sessionID,
                        Session.SETTING_MILLISECONDS_IN_TIMESTAMP));
            }

            return session;
        } catch (ConfigError e) {
            throw e;
        } catch (FieldConvertError e) {
            throw new ConfigError(e.getMessage());
        }
    }

    private int getDay(SessionSettings settings, SessionID sessionID, String key, int defaultValue)
            throws ConfigError, FieldConvertError {
        if (!settings.isSetting(sessionID, key)) {
            return defaultValue;
        }
        String value = settings.getString(sessionID, key);
        if (value.length() >= 2) {
            String abbr = value.substring(0, 2);
            if (abbr.equals("su"))
                return 1;
            if (abbr.equals("mo"))
                return 2;
            if (abbr.equals("tu"))
                return 3;
            if (abbr.equals("we"))
                return 4;
            if (abbr.equals("th"))
                return 5;
            if (abbr.equals("fr"))
                return 6;
            if (abbr.equals("sa"))
                return 7;
        }
        throw new ConfigError("invalid format for day (use su,mo,tu,we,th,fr,sa): '" + value + "'");
    }
}