package quickfix.test.util;

import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;
import quickfix.Session;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.ssl.SSLSupport;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import java.lang.reflect.Field;
import java.security.Principal;
import java.security.cert.Certificate;

/**
 * A utility class for working with SSL/TLS sessions and retrieving SSL-related information
 * from a {@link Session}. This class provides methods to find the underlying {@link SSLSession},
 * retrieve peer certificates, and get the peer principal.
 */
public final class SSLUtil {

    private static final String IO_SESSION_FIELD_NAME = "ioSession";
    private static final Field IO_SESSION_FIELD;

    static {
        try {
            IO_SESSION_FIELD = IoSessionResponder.class.getDeclaredField(IO_SESSION_FIELD_NAME);
            IO_SESSION_FIELD.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Unable to get ioSession field", e);
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
    public static SSLSession findSSLSession(Session session)  {
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
            throw new RuntimeException("Failed to get IO session field",e);
        }
    }

    /**
     * Retrieves the peer certificates from the given {@link SSLSession}.
     *
     * @param sslSession the SSL session from which to retrieve the peer certificates.
     * @return an array of {@link Certificate} objects representing the peer certificates,
     *         or {@code null} if the peer is unverified.
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
