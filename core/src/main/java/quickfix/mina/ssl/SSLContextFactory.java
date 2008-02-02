package quickfix.mina.ssl;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.FileUtil;

/**
 * SSL context factory that deals with Keystores.
 * Caches the created SSL contexts for future reuse.
 */

public class SSLContextFactory {
    private static final Logger log = LoggerFactory.getLogger(SSLContextFactory.class);
    private static final String PROTOCOL = "TLS";
    private static final String KEY_MANAGER_FACTORY_ALGORITHM;
    private static final Map<String, SSLContext> contextCache = new HashMap<String, SSLContext>();

    static {
        KEY_MANAGER_FACTORY_ALGORITHM = getSecurityProperty("ssl.KeyManagerFactory.algorithm", "SunX509");
    }

    private static String getSecurityProperty(String key, String defaultValue) {
        String value = Security.getProperty(key);
        return value == null ? defaultValue : value;
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
            in = FileUtil.open(SSLContextFactory.class, keyStoreName);
            if (in == null) {
                log.warn(keyStoreName + ": keystore not found, using empty keystore");
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
