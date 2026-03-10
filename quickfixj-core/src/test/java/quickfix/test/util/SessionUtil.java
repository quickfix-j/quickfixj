package quickfix.test.util;

import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.SessionConnector;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Utility class for managing and asserting FIX session states in tests.
 */
public final class SessionUtil {

    private static final long DEFAULT_TIMEOUT_SECONDS = 5L;

    private SessionUtil() {
    }

    /**
     * Finds a FIX session by its session identifier.
     *
     * @param connector the session connector that manages sessions
     * @param sessionID the target session identifier
     * @return the matching {@link Session}, or {@code null} if no managed session matches
     */
    public static Session findSession(SessionConnector connector, SessionID sessionID) {
        List<Session> managedSessions = connector.getManagedSessions();

        for (Session session : managedSessions) {
            if (session.getSessionID().equals(sessionID)) {
                return session;
            }
        }

        return null;
    }

    /**
     * Checks if a session is currently logged on.
     *
     * @param connector the session connector
     * @param sessionID the session identifier
     * @return true if the session is logged on, false otherwise
     */
    public static boolean isLoggedOn(SessionConnector connector, SessionID sessionID) {
        Session session = findSession(connector, sessionID);

        if (session == null) {
            return false;
        }

        return session.isLoggedOn();
    }

    /**
     * Asserts that a session is logged on within the default timeout period.
     *
     * @param connector the session connector
     * @param sessionID the session identifier
     * @throws AssertionError if the session is not logged on within the timeout
     */
    public static void assertLoggedOn(SessionConnector connector, SessionID sessionID) {
        assertLoggedOn(connector, sessionID, DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * Asserts that a session is logged on within the specified timeout period.
     *
     * @param connector the session connector
     * @param sessionID the session identifier
     * @param timeout   the timeout duration
     * @param unit      the timeout unit
     * @throws AssertionError   if the session is not logged on within the timeout
     * @throws RuntimeException if interrupted while waiting
     */
    public static void assertLoggedOn(SessionConnector connector, SessionID sessionID, long timeout, TimeUnit unit) {
        long deadlineNs = System.nanoTime() + unit.toNanos(timeout);

        while (System.nanoTime() < deadlineNs) {
            if (isLoggedOn(connector, sessionID)) {
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted", e);
            }
        }

        throw new AssertionError("Session " + sessionID + " is not logged on");
    }

    /**
     * Asserts that a session is not logged on within the default timeout period.
     *
     * @param connector the session connector
     * @param sessionID the session identifier
     * @throws AssertionError if the session is logged on within the timeout
     */
    public static void assertNotLoggedOn(SessionConnector connector, SessionID sessionID) {
        assertNotLoggedOn(connector, sessionID, DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * Asserts that a session is not logged on within the specified timeout period.
     *
     * @param connector the session connector
     * @param sessionID the session identifier
     * @param timeout   the timeout duration
     * @param unit      the timeout unit
     * @throws AssertionError   if the session is logged on within the timeout
     * @throws RuntimeException if interrupted while waiting
     */
    public static void assertNotLoggedOn(SessionConnector connector, SessionID sessionID, long timeout, TimeUnit unit) {
        long deadlineNs = System.nanoTime() + unit.toNanos(timeout);

        while (System.nanoTime() < deadlineNs) {
            if (isLoggedOn(connector, sessionID)) {
                throw new AssertionError("Session " + sessionID + " is logged on");
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted", e);
            }
        }
    }
}
