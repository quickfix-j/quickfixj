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
import java.util.Hashtable;
import java.util.Map;

/**
 * Factory for creating sessions. Used by the communications code (acceptors,
 * initiators) for creating sessions.
 */
public class DefaultSessionFactory implements SessionFactory {
    private static Map dictionaryCache = new Hashtable(); // synchronized
    private Application application;
    private MessageStoreFactory messageStoreFactory;
    private LogFactory logFactory;
    private MessageFactory messageFactory;

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
                                 LogFactory logFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.logFactory = logFactory;
        this.messageFactory = new DefaultMessageFactory();
    }

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
                                 LogFactory logFactory, MessageFactory messageFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
    }

    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        try {
            String connectionType = null;

            if (settings.isSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE)) {
                connectionType = settings.getString(sessionID,
                        SessionFactory.SETTING_CONNECTION_TYPE);
            }

            if (connectionType == null) {
                throw new ConfigError("Missing ConnectionType");
            }

            if (!connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)
                    && !connectionType.equals(SessionFactory.INITIATOR_CONNECTION_TYPE)) {
                throw new ConfigError("Invalid ConnectionType");
            }

            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)
                    && settings.isSetting(sessionID, SessionSettings.SESSION_QUALIFIER)) {
                throw new ConfigError("SessionQualifier cannot be used with acceptor.");
            }

            boolean useDataDictionary = true;
            if (settings.isSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY)) {
                useDataDictionary = settings
                        .getBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
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
                        throw new ConfigError(e);
                    }
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER)) {
                    dataDictionary.setCheckFieldsOutOfOrder(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER));
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES)) {
                    dataDictionary.setCheckFieldsHaveValues(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES));
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_USER_DEFINED_FIELDS)) {
                    dataDictionary.setCheckUserDefinedFields(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_USER_DEFINED_FIELDS));
                }
            }

            int heartbeatInterval = 0;
            if (connectionType.equals(SessionFactory.INITIATOR_CONNECTION_TYPE)) {
                heartbeatInterval = (int) settings.getLong(sessionID, Session.SETTING_HEARTBTINT);
                if (heartbeatInterval <= 0) {
                    throw new ConfigError("Heartbeat must be greater than zero");
                }
            }

            Session session = new Session(application, messageStoreFactory, sessionID,
                    dataDictionary, new SessionSchedule(settings, sessionID),
                    logFactory, messageFactory, heartbeatInterval);

            if (settings.isSetting(sessionID, Session.SETTING_CHECK_LATENCY)) {
                session.setCheckLatency(settings.getBool(sessionID, Session.SETTING_CHECK_LATENCY));
            }

            if (settings.isSetting(sessionID, Session.SETTING_MAX_LATENCY)) {
                session.setMaxLatency((int) settings
                        .getLong(sessionID, Session.SETTING_MAX_LATENCY));
            }

            if (settings.isSetting(sessionID, Session.SETTING_RESET_ON_LOGOUT)) {
                session.setResetOnLogout(settings.getBool(sessionID,
                        Session.SETTING_RESET_ON_LOGOUT));
            }

            if (settings.isSetting(sessionID, Session.SETTING_RESET_ON_DISCONNECT)) {
                session.setResetOnDisconnect(settings.getBool(sessionID,
                        Session.SETTING_RESET_ON_DISCONNECT));
            }

            if (settings.isSetting(sessionID, Session.SETTING_MILLISECONDS_IN_TIMESTAMP)) {
                session.setMillisecondsInTimestamp(settings.getBool(sessionID,
                        Session.SETTING_MILLISECONDS_IN_TIMESTAMP));
            }

            if (settings.isSetting(sessionID, Session.SETTING_RESET_WHEN_INITIATING_LOGON)) {
                session.setResetWhenInitiatingLogon(settings.getBool(sessionID,
                        Session.SETTING_RESET_WHEN_INITIATING_LOGON));
            }

            return session;
        } catch (ConfigError e) {
            throw e;
        } catch (FieldConvertError e) {
            throw new ConfigError(e.getMessage());
        }
    }
}
