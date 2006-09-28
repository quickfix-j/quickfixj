package quickfix.mina.ssl;

import java.security.GeneralSecurityException;

import javax.net.ssl.SSLContext;

public class InitiatorSSLContextFactory {

    /**
     * Protocol to use.
     */
    private static final String PROTOCOL = "TLS";

    private static SSLContext clientInstance = null;

    /**
     * Get SSLContext singleton.
     *
     * @return SSLContext
     * @throws java.security.GeneralSecurityException
     *
     */
    public static synchronized SSLContext getInstance() throws GeneralSecurityException {
        if (clientInstance == null) {
            SSLContext context = SSLContext.getInstance(PROTOCOL);
            context.init(null, SimpleTrustManagerFactory.X509_MANAGERS, null);
            clientInstance = context;
        }
        return clientInstance;
    }
}
