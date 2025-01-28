package quickfix.test.util;

import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;
import org.apache.mina.filter.ssl.SslHandler;
import quickfix.Session;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.ssl.SSLSupport;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import java.lang.reflect.Field;
import java.security.Principal;
import java.security.cert.Certificate;

/**
 * A utility class for working with SSL/TLS sessions and retrieving SSL-related information from a {@link Session}. This class provides methods to find the underlying {@link SSLSession}, retrieve peer
 * certificates, and get the peer principal.
 */
public final class SSLUtil {

    private static final String IO_SESSION_FIELD_NAME = "ioSession";
    private static final String SSL_ENGINE_FIELD_NAME = "mEngine";
    private static final AttributeKey SSL_HANDLER_ATTRIBUTE_KEY = new AttributeKey(SslHandler.class, "handler");
    private static final Field IO_SESSION_FIELD;
    private static final Field SSL_ENGINE_FIELD;

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
     * Retrieves the {@link SslHandler} associated with the given {@link Session}.
     * This method first finds the corresponding {@link IoSession} for the provided session,
     * then retrieves the {@link SslFilter} from the session's filter chain.
     * If the filter is found, it returns the {@link SslHandler} stored as an attribute in the {@link IoSession}.
     *
     * @param session The session for which to retrieve the {@link SslHandler}.
     * @return The {@link SslHandler} associated with the session, or {@code null} if either
     *         the {@link IoSession} or the {@link SslFilter} is not found.
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
     * Retrieves the {@link SSLEngine} associated with the given {@link Session}.
     * This method first retrieves the {@link SslHandler} using {@link #getSSLHandler(Session)},
     * and then attempts to access the {@link SSLEngine} stored within the {@link SslHandler}
     * using reflection.
     *
     * @param session The session for which to retrieve the {@link SSLEngine}.
     * @return The {@link SSLEngine} associated with the session, or {@code null} if the
     *         {@link SslHandler} is not found.
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
     * @return an array of {@link Certificate} objects representing the peer certificates, or {@code null} if the peer is unverified.
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
}
