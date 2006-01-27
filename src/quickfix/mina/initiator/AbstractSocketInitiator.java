package quickfix.mina.initiator;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.mina.protocol.ProtocolProvider;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.FieldConvertError;
import quickfix.Initiator;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;

public abstract class AbstractSocketInitiator extends SessionConnector implements Initiator {
    protected Log log = org.apache.commons.logging.LogFactory.getLog(getClass());

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        this(settings, new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory));
    }

    protected AbstractSocketInitiator(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        super(settings, sessionFactory);
    }

    protected void initiateSessions(EventHandlingStrategy eventHandlingStrategy) throws ConfigError {
        try {
            SessionSettings settings = getSettings();
            boolean continueInitOnError = false;
            if (settings.isSetting(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR)) {
                continueInitOnError = settings
                        .getBool(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR);
            }

            Map initiatorSessions = new HashMap();
            List protocolSessionInitiators = new ArrayList();
            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                SessionID sessionID = (SessionID) i.next();
                if (isInitiatorSession(sessionID)) {
                    try {
                        int reconnectingInterval = getReconnectIntervalInSeconds(sessionID);
                        SocketAddress[] socketAddresses = getSocketAddresses(sessionID);
                        Session quickfixSession = createSession(sessionID);
                        initiatorSessions.put(sessionID, quickfixSession);
                        NetworkingOptions networkingOptions = new NetworkingOptions(settings
                                .getSessionProperties(sessionID));
                        ProtocolProvider protocolProvider = new InitiatorProtocolProvider(
                                quickfixSession, networkingOptions, eventHandlingStrategy);
                        protocolSessionInitiators.add(new ProtocolSessionInitiator(quickfixSession,
                                protocolProvider, socketAddresses, reconnectingInterval,
                                getScheduledExecutorService()));
                    } catch (Throwable e) {
                        if (continueInitOnError) {
                            log.error("error during session initialization, continuing...", e);
                        } else {
                            throw new RuntimeError("error during session initialization", e);
                        }
                    }
                }
            }
            setSessions(initiatorSessions);

            if (protocolSessionInitiators.size() > 0) {
                for (int i = 0; i < protocolSessionInitiators.size(); i++) {
                    ((ProtocolSessionInitiator) protocolSessionInitiators.get(i)).connect();
                }
                startSessionTimer();
            } else {
                throw new ConfigError("no initiators in settings");
            }
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    private int getReconnectIntervalInSeconds(SessionID sessionID) throws ConfigError {
        int reconnectInterval = 30;
        SessionSettings settings = getSettings();
        if (settings.isSetting(sessionID, Initiator.SETTING_RECONNECT_INTERVAL)) {
            try {
                reconnectInterval = (int) settings.getLong(sessionID,
                        Initiator.SETTING_RECONNECT_INTERVAL);
            } catch (FieldConvertError e) {
                throw new ConfigError(e);
            }
        }
        return reconnectInterval;
    }

    private SocketAddress[] getSocketAddresses(SessionID sessionID) throws ConfigError {
        SessionSettings settings = getSettings();
        ArrayList addresses = new ArrayList();
        for (int index = 0;; index++) {
            try {
                String hostKey = Initiator.SETTING_SOCKET_CONNECT_HOST
                        + (index == 0 ? "" : Integer.toString(index));
                String portKey = Initiator.SETTING_SOCKET_CONNECT_PORT
                        + (index == 0 ? "" : Integer.toString(index));
                if (settings.isSetting(sessionID, hostKey)
                        && settings.isSetting(sessionID, portKey)) {
                    String host = settings.getString(sessionID, hostKey);
                    int port = (int) settings.getLong(sessionID, portKey);
                    addresses.add(new InetSocketAddress(host, port));
                } else {
                    break;
                }
            } catch (FieldConvertError e) {
                throw (ConfigError) new ConfigError(e.getMessage()).initCause(e);
            }
        }

        return (SocketAddress[]) addresses.toArray(new SocketAddress[addresses.size()]);
    }

    private boolean isInitiatorSession(Object sectionKey) throws ConfigError, FieldConvertError {
        SessionSettings settings = getSettings();
        return !settings.isSetting((SessionID) sectionKey, SessionFactory.SETTING_CONNECTION_TYPE)
                || settings.getString((SessionID) sectionKey,
                        SessionFactory.SETTING_CONNECTION_TYPE).equals("initiator");
    }

    public boolean isLoggedOn(SessionID sessionID) {
        Session session = Session.lookupSession(sessionID);
        return session != null && session.isLoggedOn();
    }
}
