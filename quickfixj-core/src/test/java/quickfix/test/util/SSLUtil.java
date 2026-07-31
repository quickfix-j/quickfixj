package quickfix.test.util;

import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;
import org.apache.mina.filter.ssl.SslHandler;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.SessionConnector;
import quickfix.mina.ssl.SSLSupport;

import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * A utility class for working with SSL/TLS sessions and retrieving SSL-related information from a {@link Session}. This
 * class provides methods to find the underlying {@link SSLSession}, retrieve peer certificates, and get the peer
 * principal etc.
 */
public final class SSLUtil {

    private static final String IO_SESSION_FIELD_NAME = "ioSession";
    private static final String SSL_ENGINE_FIELD_NAME = "mEngine";
    private static final AttributeKey SSL_HANDLER_ATTRIBUTE_KEY = new AttributeKey(SslHandler.class, "handler");
    private static final Field IO_SESSION_FIELD;
    private static final Field SSL_ENGINE_FIELD;
    private static final int SNI_HOST_NAME_TYPE = 0;
    private static final long DEFAULT_TIMEOUT_SECONDS = 5L;

    static {
        try {
            IO_SESSION_FIELD = IoSessionResponder.class.getDeclaredField(IO_SESSION_FIELD_NAME);
            IO_SESSION_FIELD.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Unable to get field: " + IO_SESSION_FIELD_NAME, e);
        }

        try {
            SSL_ENGINE_FIELD = SslHandler.class.getDeclaredField(SSL_ENGINE_FIELD_NAME);
            SSL_ENGINE_FIELD.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Unable to get field: " + SSL_ENGINE_FIELD_NAME, e);
        }
    }

    private SSLUtil() {
    }

    /**
     * Retrieves the {@link SSLSession} associated with the given {@link Session}.
     *
     * @param session the session from which to retrieve the {@link SSLSession}.
     * @return the {@link SSLSession} if found, or {@code null} if no SSL session is available.
     */
    public static SSLSession findSSLSession(Session session) {
        IoSession ioSession = findIoSession(session);

        if (ioSession == null) {
            return null;
        }

        IoFilterChain filterChain = ioSession.getFilterChain();
        SslFilter sslFilter = (SslFilter) filterChain.get(SSLSupport.FILTER_NAME);

        if (sslFilter == null) {
            return null;
        }

        return (SSLSession) ioSession.getAttribute(SslFilter.SSL_SECURED);
    }

    /**
     * Retrieves the {@link IoSession} associated with the given {@link Session}.
     *
     * @param session the session from which to retrieve the {@link IoSession}.
     * @return the {@link IoSession} if found, or {@code null} if no underlying session is available.
     */
    public static IoSession findIoSession(Session session) {
        IoSessionResponder ioSessionResponder = (IoSessionResponder) session.getResponder();

        if (ioSessionResponder == null) {
            return null;
        }

        try {
            return (IoSession) IO_SESSION_FIELD.get(ioSessionResponder);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get IO session field", e);
        }
    }

    /**
     * Retrieves the {@link SslHandler} associated with the given {@link Session}. This method first finds the
     * corresponding {@link IoSession} for the provided session, then retrieves the {@link SslFilter} from the session's
     * filter chain. If the filter is found, it returns the {@link SslHandler} stored as an attribute in the
     * {@link IoSession}.
     *
     * @param session The session for which to retrieve the {@link SslHandler}.
     * @return The {@link SslHandler} associated with the session, or {@code null} if either the {@link IoSession} or
     * the {@link SslFilter} is not found.
     */
    public static SslHandler getSSLHandler(Session session) {
        IoSession ioSession = findIoSession(session);

        if (ioSession == null) {
            return null;
        }

        IoFilterChain filterChain = ioSession.getFilterChain();
        SslFilter sslFilter = (SslFilter) filterChain.get(SSLSupport.FILTER_NAME);

        if (sslFilter == null) {
            return null;
        }

        return (SslHandler) ioSession.getAttribute(SSL_HANDLER_ATTRIBUTE_KEY);
    }

    /**
     * Retrieves the {@link SSLEngine} associated with the given {@link Session}. This method first retrieves the
     * {@link SslHandler} using {@link #getSSLHandler(Session)}, and then attempts to access the {@link SSLEngine}
     * stored within the {@link SslHandler} using reflection.
     *
     * @param session The session for which to retrieve the {@link SSLEngine}.
     * @return The {@link SSLEngine} associated with the session, or {@code null} if the {@link SslHandler} is not
     * found.
     */
    public static SSLEngine getSSLEngine(Session session) {
        SslHandler sslHandler = getSSLHandler(session);

        if (sslHandler == null) {
            return null;
        }

        try {
            return (SSLEngine) SSL_ENGINE_FIELD.get(sslHandler);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get SSL engine field", e);
        }
    }

    /**
     * Retrieves the peer certificates from the given {@link SSLSession}.
     *
     * @param sslSession the SSL session from which to retrieve the peer certificates.
     * @return an array of {@link Certificate} objects representing the peer certificates, or {@code null} if the peer
     * is unverified.
     */
    public static Certificate[] getPeerCertificates(SSLSession sslSession) {
        try {
            return sslSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            return null;
        }
    }

    /**
     * Retrieves the peer principal from the given {@link SSLSession}.
     *
     * @param sslSession the SSL session from which to retrieve the peer principal.
     * @return the {@link Principal} representing the peer, or {@code null} if the peer is unverified.
     */
    public static Principal getPeerPrincipal(SSLSession sslSession) {
        try {
            return sslSession.getPeerPrincipal();
        } catch (SSLPeerUnverifiedException e) {
            return null;
        }
    }

    /**
     * Retrieves the first SNI Server Name that is SNI Host Name (type=0) provided in ClientHello.
     *
     * @param sslSession the SSL session from which to retrieve SNI Host Name
     * @return the SNI Host Name SSL extensions value, or {@code null} if extension neither compatible nor available
     */
    public static String getSniHostName(SSLSession sslSession) {
        if (!(sslSession instanceof ExtendedSSLSession)) {
            return null;
        }

        ExtendedSSLSession extendedSSLSession = (ExtendedSSLSession) sslSession;
        List<SNIServerName> requestedServerNames = extendedSSLSession.getRequestedServerNames();

        for (SNIServerName serverName : requestedServerNames) {
            if (serverName.getType() == SNI_HOST_NAME_TYPE) {
                String asciiServerName = new String(serverName.getEncoded(), StandardCharsets.US_ASCII);
                return IDN.toUnicode(asciiServerName, IDN.USE_STD3_ASCII_RULES);
            }
        }

        return null;
    }

    /**
     * Checks if the session associated with the given {@code sessionID} is authenticated with a certificate matching
     * the specified serial number.
     *
     * @param connector               the {@link SessionConnector} used to retrieve the session information
     * @param sessionID               the session ID to check for authentication status
     * @param certificateSerialNumber the expected serial number of the peer certificate
     * @return {@code true} if the session is authenticated with a certificate matching the specified serial number,
     * {@code false} otherwise
     */
    public static boolean isAuthenticated(SessionConnector connector, SessionID sessionID, BigInteger certificateSerialNumber) {
        Session session = SessionUtil.findSession(connector, sessionID);
        SSLSession sslSession = SSLUtil.findSSLSession(session);

        if (sslSession == null) {
            return false;
        }

        Certificate[] peerCertificates = SSLUtil.getPeerCertificates(sslSession);

        if (peerCertificates == null || peerCertificates.length == 0) {
            return false;
        }

        for (Certificate peerCertificate : peerCertificates) {
            if (!(peerCertificate instanceof X509Certificate)) {
                continue;
            }

            if (((X509Certificate) peerCertificate).getSerialNumber().compareTo(certificateSerialNumber) == 0) {
                return true;
            }
        }

        return false;
    }

    /**
     * Asserts that the session associated with the given {@code sessionID} is authenticated with a certificate matching
     * the specified serial number.
     *
     * @param connector    the {@link SessionConnector} used to retrieve the session information
     * @param sessionID    the session ID to check for authentication status
     * @param serialNumber the expected serial number of the peer certificate
     * @throws AssertionError if the certificate with the specified serial number is not authenticated within the
     *                        default timeout period
     */
    public static void assertAuthenticated(SessionConnector connector, SessionID sessionID, BigInteger serialNumber) {
        assertAuthenticated(connector, sessionID, serialNumber, DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * Asserts that the session associated with the given {@code sessionID} is authenticated with a certificate matching
     * the specified serial number. This method polls the session until either the certificate is authenticated or the
     * specified timeout is reached.
     *
     * @param connector    the {@link SessionConnector} used to retrieve the session information
     * @param sessionID    the session ID to check for authentication status
     * @param serialNumber the expected serial number of the peer certificate
     * @param timeout      the maximum time to wait for authentication
     * @param unit         the time unit of the {@code timeout} parameter
     * @throws AssertionError if the certificate with the specified serial number is not authenticated within the
     *                        specified timeout period
     */
    public static void assertAuthenticated(
            SessionConnector connector, SessionID sessionID, BigInteger serialNumber,
            long timeout, TimeUnit unit) {
        long deadlineNs = System.nanoTime() + unit.toNanos(timeout);

        while (System.nanoTime() < deadlineNs) {
            if (isAuthenticated(connector, sessionID, serialNumber)) {
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread was interrupted", e);
            }
        }

        throw new AssertionError("Certificate with serial number " + serialNumber + " was not authenticated");
    }

    /**
     * Asserts that the session associated with the given {@code sessionID} is not authenticated. The behavior of this
     * method depends on the {@code authOn} parameter:
     *
     * <ul>
     *   <li>If {@code authOn} is {@code true}, the method checks if the SSL session associated
     *       with the given session ID is still alive. If the SSL session persists beyond the
     *       specified timeout period, an {@link AssertionError} is thrown.</li>
     *   <li>If {@code authOn} is {@code false}, the method checks if there are any peer certificates
     *       associated with the SSL session. If peer certificates are found, an {@link AssertionError}
     *       is thrown, indicating that the session was authenticated.</li>
     * </ul>
     *
     * @param connector the {@link SessionConnector} used to retrieve the session information
     * @param sessionID the session ID to check for authentication status
     * @param authOn    a flag indicating whether authentication is currently enabled
     * @throws AssertionError if the session is still authenticated after the timeout period (when {@code authOn} is
     *                        {@code true}) or if peer certificates are found (when {@code authOn} is {@code false})
     */
    public static void assertNotAuthenticated(SessionConnector connector, SessionID sessionID, boolean authOn) {
        assertNotAuthenticated(connector, sessionID, authOn, DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * Asserts that the session associated with the given {@code sessionID} is not authenticated. The behavior of this
     * method depends on the {@code authOn} parameter:
     *
     * <ul>
     *   <li>If {@code authOn} is {@code true}, the method checks if the SSL session associated
     *       with the given session ID is still alive. If the SSL session persists beyond the
     *       specified timeout period, an {@link AssertionError} is thrown.</li>
     *   <li>If {@code authOn} is {@code false}, the method checks if there are any peer certificates
     *       associated with the SSL session. If peer certificates are found, an {@link AssertionError}
     *       is thrown, indicating that the session was authenticated.</li>
     * </ul>
     *
     * @param connector the {@link SessionConnector} used to retrieve the session information
     * @param sessionID the session ID to check for authentication status
     * @param authOn    a flag indicating whether authentication is currently enabled
     * @param timeout   the maximum time to wait for the session to become unauthenticated
     * @param unit      the time unit of the {@code timeout} parameter
     * @throws AssertionError if the session is still authenticated after the timeout period (when {@code authOn} is
     *                        {@code true}) or if peer certificates are found (when {@code authOn} is {@code false})
     */
    public static void assertNotAuthenticated(
            SessionConnector connector, SessionID sessionID, boolean authOn,
            long timeout, TimeUnit unit) {
        Session session = SessionUtil.findSession(connector, sessionID);
        SSLSession sslSession = findSSLSession(session);

        if (sslSession == null) {
            return;
        }

        if (authOn) {
            long deadlineNs = System.nanoTime() + unit.toNanos(timeout);

            // when authentication is on, the SSL session maybe still be alive (invalid) for some time
            while (System.nanoTime() < deadlineNs) {
                if (findSSLSession(session) == null) {
                    return;
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Thread was interrupted", e);
                }
            }

            throw new AssertionError("SSL session still exists for session: " + sessionID);
        } else {
            // when authentication is off, there must be no peer certificates
            Certificate[] peerCertificates = getPeerCertificates(sslSession);

            if (peerCertificates != null && peerCertificates.length > 0) {
                throw new AssertionError("Certificate was authenticated");
            }
        }
    }
}
