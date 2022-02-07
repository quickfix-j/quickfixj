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

import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ConfigError;
import quickfix.Connector;
import quickfix.ExecutorFactory;
import quickfix.FieldConvertError;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.field.converter.IntConverter;

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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.future.CloseFuture;
import org.apache.mina.core.service.IoService;

/**
 * An abstract base class for acceptors and initiators. Provides support for common functionality and also serves as an
 * abstraction where the code doesn't need to make the acceptor/initiator distinction.
 */
public abstract class SessionConnector implements Connector {
    protected static final int DEFAULT_QUEUE_CAPACITY = 10000;
    public static final String SESSIONS_PROPERTY = "sessions";
    public static final String QF_SESSION = "QF_SESSION";
    public static final String QFJ_RESET_IO_CONNECTOR = "QFJ_RESET_IO_CONNECTOR";

    protected final Logger log = LoggerFactory.getLogger(getClass());

    protected final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private final Map<SessionID, Session> sessions = new ConcurrentHashMap<>();
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR = Executors
            .newSingleThreadScheduledExecutor(new QFTimerThreadFactory());
    private ScheduledFuture<?> sessionTimerFuture;
    private IoFilterChainBuilder ioFilterChainBuilder;

    protected Executor longLivedExecutor;
    protected Executor shortLivedExecutor;

    public SessionConnector(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
        this.settings = settings;
        this.sessionFactory = sessionFactory;
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    /**
     * <p>
     * Supplies the Executors to be used for all message processing and timer activities. This will override the default
     * behavior which uses internally created Threads. This enables scenarios such as a ResourceAdapter to supply the
     * WorkManager (when adapted to the Executor API) so that all Application call-backs occur on container managed
     * threads.
     * </p>
     * <p>
     * If using external Executors, this method should be called immediately after the constructor. Once set, the
     * Executors cannot be changed.
     * </p>
     * 
     * @param executorFactory See {@link ExecutorFactory} for detailed requirements.
     */
    public void setExecutorFactory(ExecutorFactory executorFactory) {
        if (longLivedExecutor != null || shortLivedExecutor != null) {
            throw new IllegalStateException("Optional ExecutorFactory has already been set.  It cannot be changed once set.");
        }
        longLivedExecutor = executorFactory.getLongLivedExecutor();
        shortLivedExecutor = executorFactory.getShortLivedExecutor();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    protected void setSessions(Map<SessionID, Session> sessions) {
        clearConnectorSessions();
        this.sessions.putAll(sessions);
        propertyChangeSupport.firePropertyChange(SESSIONS_PROPERTY, null, sessions);
    }

    /**
     * Will remove all Sessions from the SessionConnector's Session map.
     * Please make sure that these Sessions were unregistered before via
     * Session.unregisterSessions().
     */
    protected void clearConnectorSessions() {
        this.sessions.clear();
    }

    /**
     * Get the list of session managed by this connector.
     *
     * @return list of quickfix.Session objects
     * @see quickfix.Session
     */
    public List<Session> getManagedSessions() {
        return new ArrayList<>(sessions.values());
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
        return new ArrayList<>(sessions.keySet());
    }

    public void addDynamicSession(Session inSession) {
        sessions.put(inSession.getSessionID(), inSession);
        log.debug("adding session for {}", inSession.getSessionID());
        propertyChangeSupport.firePropertyChange(SESSIONS_PROPERTY, null, sessions);
    }

    public void removeDynamicSession(SessionID inSessionID) {
        sessions.remove(inSessionID);
        log.debug("removing session for {}", inSessionID);
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
     *
     * @return false if no session or at least one session is not logged on
     */
    public boolean isLoggedOn() {
        // if no session, not logged on
        if (sessions.isEmpty())
            return false;
        for (Session session : sessions.values()) {
            // at least one session not logged on
            if (!session.isLoggedOn())
                return false;
        }
        // all the sessions are logged on
        return true;
    }

    /**
     * Check if we have at least one session and that at least one session is logged on.
     *
     * @return false if no sessions exist or all sessions are logged off, true otherwise
     */
    //visible for testing only
    boolean anyLoggedOn() {
        // if no session, not logged on
        if (sessions.isEmpty())
            return false;
        for (Session session : sessions.values()) {
            // at least one session logged on
            if (session.isLoggedOn())
                return true;
        }
        // no sessions are logged on
        return false;
    }

    private Set<quickfix.Session> getLoggedOnSessions() {
        Set<quickfix.Session> loggedOnSessions = new HashSet<>(sessions.size());
        for (Session session : sessions.values()) {
            if (session.isLoggedOn()) {
                loggedOnSessions.add(session);
            }
        }
        return loggedOnSessions;
    }

    protected void logoutAllSessions(boolean forceDisconnect) {
        log.info("Logging out all sessions");
        for (Session session : sessions.values()) {
            try {
                session.logout();
            } catch (Throwable e) {
                logError(session.getSessionID(), null, "Error during logout", e);
            }
        }

        if (anyLoggedOn()) {
            if (forceDisconnect) {
                for (Session session : sessions.values()) {
                    try {
                        if (session.isLoggedOn()) {
                            session.disconnect("Forcibly disconnecting session", false);
                        }
                    } catch (Throwable e) {
                        logError(session.getSessionID(), null, "Error during disconnect", e);
                    }
                }
            } else {
                waitForLogout();
            }
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
                Thread.currentThread().interrupt();
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
        Runnable timerTask = new SessionTimerTask();
        if (shortLivedExecutor != null) {
            timerTask = new DelegatingTask(timerTask, shortLivedExecutor);
        }
        sessionTimerFuture = SCHEDULED_EXECUTOR.scheduleAtFixedRate(timerTask, 0, 1000L,
                TimeUnit.MILLISECONDS);
        log.info("SessionTimer started");
    }

    protected void stopSessionTimer() {
        if (sessionTimerFuture != null) {
            if (sessionTimerFuture.cancel(true))
                log.info("SessionTimer canceled");
        }
    }

    // visible for testing
    boolean checkSessionTimerRunning() {
        if ( sessionTimerFuture != null ) {
            return !sessionTimerFuture.isDone();
        }
        return false;
    }

    protected ScheduledExecutorService getScheduledExecutorService() {
        return SCHEDULED_EXECUTOR;
    }

    private class SessionTimerTask implements Runnable {
        @Override
        public void run() {
            try {
                for (Session session : sessions.values()) {
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

    /**
     * Delegates QFJ Timer Task to an Executor and blocks the QFJ Timer Thread until
     * the Task execution completes.
     */
    static final class DelegatingTask implements Runnable {

        private final BlockingSupportTask delegate;
        private final Executor executor;

        DelegatingTask(Runnable delegate, Executor executor) {
            this.delegate = new BlockingSupportTask(delegate);
            this.executor = executor;
        }

        @Override
        public void run() {
            executor.execute(delegate);
            try {
                delegate.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        static final class BlockingSupportTask implements Runnable {

            private final CountDownLatch latch = new CountDownLatch(1);
            private final Runnable delegate;

            BlockingSupportTask(Runnable delegate) {
                this.delegate = delegate;
            }

            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                String threadName = currentThread.getName();
                try {
                    currentThread.setName("QFJ Timer (" + threadName + ")");
                    delegate.run();
                } finally {
                    latch.countDown();
                    currentThread.setName(threadName);
                }
            }

            void await() throws InterruptedException {
                latch.await();
            }
        }
    }

    private static class QFTimerThreadFactory implements ThreadFactory {

        @Override
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
    
    /**
     * Closes all managed sessions of an Initiator/Acceptor.
     *
     * @param ioService Acceptor or Initiator implementation
     * @param awaitTermination whether to wait for underlying ExecutorService to terminate
     * @param logger used for logging WARNING when IoSession could not be closed
     */
    public static void closeManagedSessionsAndDispose(IoService ioService, boolean awaitTermination, Logger logger) {
        Map<Long, IoSession> managedSessions = ioService.getManagedSessions();
        for (IoSession ioSession : managedSessions.values()) {
            if (!ioSession.isClosing()) {
                CloseFuture closeFuture = ioSession.closeNow();
                boolean completed = false;
                try {
                    completed = closeFuture.await(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                } finally {
                    if (!completed) {
                        logger.warn("Could not close IoSession {}", ioSession);
                    }
                }
            }
        }
        if (!ioService.isDisposing()) {
            ioService.dispose(awaitTermination);
        }
    }

    protected boolean isContinueInitOnError() {
        boolean continueInitOnError = false;
        if (settings.isSetting(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR)) {
            try {
                continueInitOnError = settings.getBool(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR);
            } catch (ConfigError | FieldConvertError ex) {
                // ignore and return default
            }
        }
        return continueInitOnError;
    }

}
