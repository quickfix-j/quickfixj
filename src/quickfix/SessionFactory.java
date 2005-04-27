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

/**
 * @author sbate
 */
public class SessionFactory {
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
            if (settings.isSetting(sessionID, SessionSettings.CONNECTION_TYPE)) {
                connectionType = settings.getString(sessionID, SessionSettings.CONNECTION_TYPE);
            } else {
                connectionType = "initiator";
            }
            
            if (!connectionType.equals("acceptor") && !connectionType.equals("initiator")) {
                throw new ConfigError("Invalid ConnectionType");
            }

            if (connectionType.equals("acceptor")
                    && settings.isSetting(sessionID, SessionSettings.SESSION_QUALIFIER)) {
                throw new ConfigError("SessionQualifier cannot be used with acceptor.");
            }

            boolean useDataDictionary = true;
            if (settings.isSetting(sessionID, SessionSettings.USE_DATA_DICTIONARY)) {
                useDataDictionary = settings
                        .getBool(sessionID, SessionSettings.USE_DATA_DICTIONARY);
            }

            DataDictionary dataDictionary = null;
            if (useDataDictionary) {
                String path = settings.getString(sessionID, SessionSettings.DATA_DICTIONARY);
                dataDictionary = (DataDictionary) dictionaryCache.get(path);
                if (dataDictionary == null) {
                    try {
                        dataDictionary = new DataDictionary(new FileInputStream(path));
                        dictionaryCache.put(path, dataDictionary);
                    } catch (FileNotFoundException e) {
                        throw new ConfigError(e.getMessage());
                    }
                }

                if (settings.isSetting(sessionID, SessionSettings.VALIDATE_FIELDS_OUT_OF_ORDER)) {
                    dataDictionary.setCheckFieldsOutofOrder(settings.getBool(sessionID,
                            SessionSettings.VALIDATE_FIELDS_OUT_OF_ORDER));
                }
                if (settings.isSetting(sessionID, SessionSettings.VALIDATE_FIELDS_HAVE_VALUES)) {
                    dataDictionary.setCheckFieldsOutofOrder(settings.getBool(sessionID,
                            SessionSettings.VALIDATE_FIELDS_HAVE_VALUES));
                }
            }

            Date startTime = FieldValueConverter.UtcTimeOnlyConverter.convert(settings.getString(
                    sessionID, SessionSettings.START_TIME));
            Date endTime = FieldValueConverter.UtcTimeOnlyConverter.convert(settings.getString(
                    sessionID, SessionSettings.END_TIME));

            int startDay = getDay(settings, sessionID, SessionSettings.START_DAY, -1);
            int endDay = getDay(settings, sessionID, SessionSettings.END_DAY, -1);

            if (startDay >= 0 && endDay < 0) {
                throw new ConfigError("StartDay used without EndDay");
            }
            if (endDay >= 0 && startDay < 0) {
                throw new ConfigError("EndDay used with StartDay");
            }

            int heartbeatInterval = 0;
            if (connectionType.equals("initiator")) {
                heartbeatInterval = (int) settings.getLong(sessionID, SessionSettings.HEARTBTINT);
                if ( heartbeatInterval <= 0 ) { 
                    throw new ConfigError( "Heartbeat must be greater than zero" );
                }
            }

            Session session = new Session(application, messageStoryFactory, sessionID,
                    dataDictionary, new SessionSchedule(startTime, endTime, startDay, endDay),
                    logFactory, new DefaultMessageFactory(), heartbeatInterval);

            if (settings.isSetting(sessionID, SessionSettings.CHECK_LATENCY)) {
                session.setCheckLatency(settings.getBool(sessionID, SessionSettings.CHECK_LATENCY));
            }
            if (settings.isSetting(sessionID, SessionSettings.MAX_LATENCY)) {
                session.setMaxLatency((int) settings
                        .getLong(sessionID, SessionSettings.MAX_LATENCY));
            }
            if (settings.isSetting(sessionID, SessionSettings.RESET_ON_LOGOUT)) {
                session.setResetOnLogout(settings.getBool(sessionID,
                        SessionSettings.RESET_ON_LOGOUT));
            }
            if (settings.isSetting(sessionID, SessionSettings.RESET_ON_DISCONNECT)) {
                session.setResetOnDisconnect(settings.getBool(sessionID,
                        SessionSettings.RESET_ON_DISCONNECT));
            }
            if (settings.isSetting(sessionID, SessionSettings.MILLISECONDS_IN_TIMESTAMP)) {
                session.setMillisecondsInTimestamp(settings.getBool(sessionID,
                        SessionSettings.MILLISECONDS_IN_TIMESTAMP));
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