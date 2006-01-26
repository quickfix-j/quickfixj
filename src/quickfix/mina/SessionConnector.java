package quickfix.mina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.mina.protocol.ProtocolSession;

import quickfix.ConfigError;
import quickfix.FieldConvertError;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.field.converter.IntConverter;
import edu.emory.mathcs.backport.java.util.concurrent.Executors;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledFuture;
import edu.emory.mathcs.backport.java.util.concurrent.ThreadFactory;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public abstract class SessionConnector {
    public final static String QF_SESSION = "QF_SESSION";
    protected final Log log = org.apache.commons.logging.LogFactory.getLog(getClass());

    private Map sessions;
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;
    private final ScheduledExecutorService scheduledExecutorService = Executors
            .newSingleThreadScheduledExecutor(new QFTimerThreadFactory());
    private ScheduledFuture sessionTimerFuture;

    public SessionConnector(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        this.settings = settings;
        this.sessionFactory = sessionFactory;
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    protected void setSessions(Map sessions) {
        this.sessions = sessions;
    }

    /**
     * Get the list of session managed by this connector.
     * @return list of quickfix.Session objects
     * 
     * @see quickfix.Session
     */
    public List getManagedSessions() {
        return new ArrayList(sessions.values());
    }

    /**
     * Return the list of session identifiers of sessions managed
     * by this connector. Should be called getSessionIDs but the
     * current name is retained for QF/JNI compatibility.
     * 
     * @return list of session identifiers
     */
    public ArrayList getSessions() {
        if (sessions != null) {
            return new ArrayList(sessions.keySet());
        } else {
            // Sessions will be null before start is called
            ArrayList sessionIds = new ArrayList();
            Iterator sessionIdItr = settings.sectionIterator();
            while (sessionIdItr.hasNext()) {
                sessionIds.add(sessionIdItr.next());
            }
            return sessionIds;
        }
    }

    protected SessionSettings getSettings() {
        return settings;
    }

    protected Session createSession(SessionID sessionID) throws ConfigError {
        return sessionFactory.create(sessionID, settings);
    }

    protected int getIntSetting(String key) throws ConfigError {
        try {
            return IntConverter.convert(settings.getString(key));
        } catch (FieldConvertError e) {
            throw (ConfigError) new ConfigError(e.getMessage()).fillInStackTrace();
        }
    }

    public boolean isLoggedOn() {
        Iterator sessionItr = sessions.values().iterator();
        while (sessionItr.hasNext()) {
            quickfix.Session s = (quickfix.Session) sessionItr.next();
            if (s.isLoggedOn()) {
                return true;
            }
        }
        return false;
    }

    protected void logoutAllSessions(boolean forceDisconnect) {
        log.info("Logging out all sessions");
        if (sessions == null) {
            log.error("Attempt to logout all sessions before intialization is complete.");
            return;
        }
        Iterator sessionItr = sessions.values().iterator();
        while (sessionItr.hasNext()) {
            quickfix.Session session = (quickfix.Session) sessionItr.next();
            try {
                session.logout();
            } catch (Throwable e) {
                logError(session.getSessionID(), null, "Error during logout", e);
            }
        }

        if (forceDisconnect && isLoggedOn()) {
            sessionItr = sessions.values().iterator();
            while (sessionItr.hasNext()) {
                quickfix.Session session = (quickfix.Session) sessionItr.next();
                try {
                    if (session.isLoggedOn()) {
                        session.getLog().onEvent("Forcibly disconnecting session");
                        session.disconnect();
                    }
                } catch (Throwable e) {
                    logError(session.getSessionID(), null, "Error during disconnect", e);
                }
            }
        }
    }

    protected void waitForLogout() {
        if (isLoggedOn()) {
            log.info("Waiting for session logout");
            for (int second = 1; second <= 10 && isLoggedOn(); ++second) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    log.error(e);
                }
            }
        }
    }

    //    protected void logDebug(SessionID sessionID, ProtocolSession protocolSession, String message) {
    //        log.debug(message + getLogSuffix(sessionID, protocolSession));
    //    }

    protected void logError(SessionID sessionID, ProtocolSession protocolSession, String message,
            Throwable t) {
        log.error(message + getLogSuffix(sessionID, protocolSession), t);
    }

    private String getLogSuffix(SessionID sessionID, ProtocolSession protocolSession) {
        String suffix = ":";
        if (sessionID != null) {
            suffix += "sessionID=" + sessionID.toString() + ";";
        }
        if (protocolSession != null) {
            suffix += "address=" + protocolSession.getRemoteAddress();
        }
        return suffix;
    }

    protected void startSessionTimer() {
        sessionTimerFuture = scheduledExecutorService.scheduleAtFixedRate(new SessionTimerTask(),
                0, 1000L, TimeUnit.MILLISECONDS);
    }

    protected void stopSessionTimer() {
        if (sessionTimerFuture != null) {
            sessionTimerFuture.cancel(false);
        }
    }

    protected ScheduledExecutorService getScheduledExecutorService() {
        return scheduledExecutorService;
    }

    private class SessionTimerTask implements Runnable {
        public void run() {
            try {
                List sessions = getManagedSessions();
                for (int i = 0, sessionsSize = sessions.size(); i < sessionsSize; i++) {
                    quickfix.Session session = (quickfix.Session) sessions.get(i);
                    try {
                        // TODO REVIEW Need to sync logon and reconnect (this seems to work)
                        if (session.getResponder() != null) {
                            session.next();
                        }
                    } catch (IOException e) {
                        logError(session.getSessionID(), null, "Error in session timer processing",
                                e);
                    }
                }
            } catch (Throwable e) {
                log.error("Error during timer processing", e);
            }
        }
    }

    private class QFTimerThreadFactory implements ThreadFactory {

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "QF/J Timer");
        }

    }
}
