package quickfix.mina.ssl;

import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import java.security.*;
import java.security.cert.CertificateException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;

/**
 * SSL context factory that deals with Keystores.
 * Caches the created SSL contexts for future reuse.
 */

public class SSLContextFactory {
    private static final String PROTOCOL = "TLS";
    private static final String KEY_MANAGER_FACTORY_ALGORITHM;
    final private static Map<String, SSLContext> contextCache = new HashMap<String, SSLContext>();

    static {
        String algorithm = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (algorithm == null) {
            algorithm = "SunX509";
        }

        KEY_MANAGER_FACTORY_ALGORITHM = algorithm;
    }

    /** Creates an {@link SSLContext} with a specified keystore and password for that keystore */
    public static synchronized SSLContext getInstance(String keyStoreName, char[] keyStorePassword)
            throws GeneralSecurityException {
        synchronized (contextCache) {
            SSLContext context = contextCache.get(keyStoreName);
            if (context == null) {
                try {
                    context = createSSLContext(keyStoreName, keyStorePassword);
                    contextCache.put(keyStoreName, context);
                } catch (Exception ioe) {
                    throw new GeneralSecurityException("Can't create SSLContext:" + ioe);
                }
            }
            return context;
        }
    }

    private static SSLContext createSSLContext(String keyStoreName, char[] keyStorePassword)
            throws GeneralSecurityException, IOException {
        KeyManagerFactory kmf = initializeKeyManager(keyStoreName, keyStorePassword);

        SSLContext sslContext = SSLContext.getInstance(PROTOCOL);
        sslContext.init(kmf.getKeyManagers(), SimpleTrustManagerFactory.X509_MANAGERS, null);

        return sslContext;
    }

    private static KeyManagerFactory initializeKeyManager(String keyStoreName,
            char[] keyStorePassword) throws KeyStoreException, IOException,
            NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException {
        KeyStore ks = initializeKeyStore(keyStoreName, keyStorePassword);
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KEY_MANAGER_FACTORY_ALGORITHM);
        kmf.init(ks, keyStorePassword);
        return kmf;
    }

    private static KeyStore initializeKeyStore(String keyStoreName, char[] keyStorePassword)
            throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        InputStream in = null;
        try {
            in = SSLContextFactory.class.getResourceAsStream(keyStoreName);
            if (in == null) {
                in = SSLContextFactory.class.getClassLoader().getResourceAsStream(
                        keyStoreName);
            }
            keyStore.load(in, keyStorePassword);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignored) {
                }
            }
        }
        return keyStore;
    }
}
