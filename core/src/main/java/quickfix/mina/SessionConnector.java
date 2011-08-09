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

package quickfix.mina;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.ConfigError;
import quickfix.Connector;
import quickfix.FieldConvertError;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.field.converter.IntConverter;

/**
 * An abstract base class for acceptors and initiators. Provides support for common functionality and also serves as an
 * abstraction where the code doesn't need to make the acceptor/initator distinction.
 */
public abstract class SessionConnector implements Connector {
    public static final String SESSIONS_PROPERTY = "sessions";
    public final static String QF_SESSION = "QF_SESSION";
    
    protected final Logger log = LoggerFactory.getLogger(getClass());

    protected PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    private Map<SessionID, Session> sessions = Collections.emptyMap();
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;
    private final static ScheduledExecutorService scheduledExecutorService = Executors
            .newSingleThreadScheduledExecutor(new QFTimerThreadFactory());
    private ScheduledFuture<?> sessionTimerFuture;
    private IoFilterChainBuilder ioFilterChainBuilder;
    
    public SessionConnector(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
        this.settings = settings;
        this.sessionFactory = sessionFactory;
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
    protected void setSessions(Map<SessionID, Session> sessions) {
        this.sessions = sessions;
        propertyChangeSupport.firePropertyChange(SESSIONS_PROPERTY, null, sessions);
    }

    /**
     * Get the list of session managed by this connector.
     * @return list of quickfix.Session objects
     * 
     * @see quickfix.Session
     */
    public List<Session> getManagedSessions() {
        return new ArrayList<Session>(sessions.values());
    }

    /**
     * This is for subclasses to directly access the session map.
     * 
     * @return a map of sessions keys by session ID
     */
    protected Map<SessionID, Session> getSessionMap() {
        return Collections.unmodifiableMap(sessions);
    }

    /**
     * Return the list of session identifiers of sessions managed
     * by this connector. Should be called getSessionIDs but the
     * current name is retained for QF/JNI compatibility.
     * 
     * @return list of session identifiers
     */
    public ArrayList<SessionID> getSessions() {
        return new ArrayList<SessionID>(sessions.keySet());
    }

    public void addDynamicSession(Session inSession) {
        sessions.put(inSession.getSessionID(), inSession);
        log.debug("adding session for "+inSession.getSessionID());
        propertyChangeSupport.firePropertyChange(SESSIONS_PROPERTY, null, sessions);
    }

    public void removeDynamicSession(SessionID inSessionID) {
        sessions.remove(inSessionID);
        log.debug("removing session for "+inSessionID);
        propertyChangeSupport.firePropertyChange(SESSIONS_PROPERTY, null, sessions);
    }

    public SessionSettings getSettings() {
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

    /**
     * Check if we have at least one session and that all the sessions are logged on
     * @return false if no session or at least one session is not logged on
     */
    public boolean isLoggedOn() {
    	//if no session, not logged on
        if (sessions.isEmpty()) return false;
        Iterator<quickfix.Session> sessionItr = sessions.values().iterator();
        while (sessionItr.hasNext()) {
            Session session = sessionItr.next();
            //at least one session not logged on
            if (!session.isLoggedOn()) return false;
        }
        //all the sessions are logged on
        return true;
    }

    private Set<quickfix.Session> getLoggedOnSessions() {
        Set<quickfix.Session> loggedOnSessions = new HashSet<quickfix.Session>(sessions.size());
        Iterator<quickfix.Session> sessionItr = sessions.values().iterator();
        while (sessionItr.hasNext()) {
            Session session = sessionItr.next();
            if (session.isLoggedOn()) {
                loggedOnSessions.add(session);
            }
        }
        return loggedOnSessions;
    }

    protected void logoutAllSessions(boolean forceDisconnect) {
        log.info("Logging out all sessions");
        if (sessions == null) {
            log.error("Attempt to logout all sessions before intialization is complete.");
            return;
        }
        Iterator<quickfix.Session> sessionItr = sessions.values().iterator();
        while (sessionItr.hasNext()) {
            quickfix.Session session = sessionItr.next();
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
                        session.disconnect("Forcibly disconnecting session", false);
                    }
                } catch (Throwable e) {
                    logError(session.getSessionID(), null, "Error during disconnect", e);
                }
            }
        }
        
        if (!forceDisconnect) {
            waitForLogout();
        }
    }

    protected void waitForLogout() {
        long start = System.currentTimeMillis();
        Set<Session> loggedOnSessions;
        while (!(loggedOnSessions = getLoggedOnSessions()).isEmpty()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e);
            }
            final long elapsed = System.currentTimeMillis() - start;
            Iterator<Session> sessionItr = loggedOnSessions.iterator();
            while (sessionItr.hasNext()) {
                Session session = sessionItr.next();
                if (elapsed >= session.getLogoutTimeout() * 1000L) {
                    try {
                        session.disconnect("Logout timeout, force disconnect", false);
                    } catch (IOException e) {
                        log.error(e.getMessage(), e);
                    }
                    sessionItr.remove();
                }
            }
            // Be sure we don't look forever
            if (elapsed > 60000L) {
                log.warn("Stopping session logout wait after 1 minute");
                break;
            }
        }
    }

    protected void logError(SessionID sessionID, IoSession protocolSession, String message, Throwable t) {
        log.error(message + getLogSuffix(sessionID, protocolSession), t);
    }

    private String getLogSuffix(SessionID sessionID, IoSession protocolSession) {
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
        sessionTimerFuture = scheduledExecutorService.scheduleAtFixedRate(new SessionTimerTask(), 0, 1000L,
                TimeUnit.MILLISECONDS);
        log.info("SessionTimer started");
    }

    protected void stopSessionTimer() {
        if (sessionTimerFuture != null) {
            if (sessionTimerFuture.cancel(false)) log.info("SessionTimer canceled");
        }
    }

    protected ScheduledExecutorService getScheduledExecutorService() {
        return scheduledExecutorService;
    }

    private class SessionTimerTask implements Runnable {
        public void run() {
            try {
                Iterator<quickfix.Session> sessionItr = sessions.values().iterator();
                while (sessionItr.hasNext()) {
                    quickfix.Session session = sessionItr.next();
                    try {
                        session.next();
                    } catch (IOException e) {
                        logError(session.getSessionID(), null, "Error in session timer processing", e);
                    }
                }
            } catch (Throwable e) {
                log.error("Error during timer processing", e);
            }
        }
    }

    private static class QFTimerThreadFactory implements ThreadFactory {

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "QFJ Timer");
            thread.setDaemon(true);
            return thread;
        }

    }
    
    /**
     * Allows a custom IOFilterChainBuilder to be added to the session connector. This will allow modification of the
     * MINA filter chain. Modifying the filter chain can be useful for logging, encryption/SSL and other purposes. The
     * FIX codec filter name can be used to for inserting custom filters before or after the FIX message codec.
     * 
     * @param ioFilterChainBuilder
     * @see IoFilterChainBuilder
     */
    public void setIoFilterChainBuilder(IoFilterChainBuilder ioFilterChainBuilder) {
        this.ioFilterChainBuilder = ioFilterChainBuilder;
    }
    
    protected IoFilterChainBuilder getIoFilterChainBuilder() {
        return ioFilterChainBuilder;
    }
}
