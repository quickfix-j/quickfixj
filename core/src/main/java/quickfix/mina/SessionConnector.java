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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

/**
 * An abstract base class for acceptors and initiators. Provides support
 * for common functionality and also serves as an abstraction where
 * the code doesn't need to make the acceptor/initator distinction.
 */
public abstract class SessionConnector {
    public final static String QF_SESSION = "QF_SESSION";
    protected final Logger log = LoggerFactory.getLogger(getClass());

    private Map sessions;
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;
    private final static ScheduledExecutorService scheduledExecutorService = Executors
            .newSingleThreadScheduledExecutor(new QFTimerThreadFactory());
    private ScheduledFuture sessionTimerFuture;
    private IoFilterChainBuilder ioFilterChainBuilder;
    
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
     * This is for subclasses to directly access the session map.
     * 
     * @return a map of sessions keys by session ID
     */
    protected Map getSessionMap() {
        return sessions;
    }

    /**
     * Return the list of session identifiers of sessions managed
     * by this connector. Should be called getSessionIDs but the
     * current name is retained for QF/JNI compatibility.
     * 
     * @return list of session identifiers
     */
    public ArrayList getSessions() {
        return new ArrayList(sessions.keySet());
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
        
        if (!forceDisconnect) {
            waitForLogout();
        }
    }

    protected void waitForLogout() {
        if (isLoggedOn()) {
            log.info("Waiting for session logout");
            for (int second = 1; second <= 10 && isLoggedOn(); ++second) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }

    protected void logError(SessionID sessionID, IoSession protocolSession, String message,
            Throwable t) {
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
                Iterator sessionItr = sessions.values().iterator();
                while (sessionItr.hasNext()) {
                    quickfix.Session session = (quickfix.Session) sessionItr.next();
                    try {
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

    private static class QFTimerThreadFactory implements ThreadFactory {

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "QFJ Timer");
            thread.setDaemon(true);
            return thread;
        }

    }
    
    /**
     * Allows a custom IOFilterChainBuilder to be added to the session connector. This
     * will allow modification of the MINA filter chain. Modifying the filter chain can
     * be useful for logging, encryption/SSL and other purposes. The FIX codec filter name
     * can be used to for inserting custom filters before or after the FIX message codec.
     * 
     * @param ioFilterChainBuilder
     * @see IoFilterChainBuilder
     * @see AbstractIoHandler#FIX_CODEC_FILTER_NAME
     */
    public void setIoFilterChainBuilder(IoFilterChainBuilder ioFilterChainBuilder) {
        this.ioFilterChainBuilder = ioFilterChainBuilder;
    }
    
    protected IoFilterChainBuilder getIoFilterChainBuilder() {
        return ioFilterChainBuilder;
    }
}
