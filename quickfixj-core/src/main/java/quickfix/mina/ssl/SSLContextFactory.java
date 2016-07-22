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

package quickfix.mina.ssl;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.mina.filter.ssl.BogusTrustManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.FileUtil;

/**
 * SSL context factory that deals with various SSL configuration.
 * Caches the created SSL contexts for future reuse.
 */
public class SSLContextFactory {
    private static final Logger log = LoggerFactory.getLogger(SSLContextFactory.class);
    private static final String PROTOCOL = "TLS";
    private static final Map<SSLConfig, SSLContext> contextCache = new HashMap<SSLConfig, SSLContext>();

    /**
     * Creates an {@link SSLContext} with a specified {@link SSLConfig}
     */
    public static SSLContext getInstance(SSLConfig sslConfig)
            throws GeneralSecurityException {
        synchronized (contextCache) {
            SSLContext context = contextCache.get(sslConfig);
            if (context == null) {
                try {
                    context = createSSLContext(sslConfig);
                    contextCache.put(sslConfig, context);
                } catch (Exception ioe) {
                    throw new GeneralSecurityException("Can't create SSLContext", ioe);
                }
            }
            return context;
        }
    }

    private static SSLContext createSSLContext(SSLConfig sslConfig) throws GeneralSecurityException, IOException {
        KeyManagerFactory kmf = initializeKeyManager(sslConfig);
        TrustManagerFactory tmf = null;

        if (sslConfig.getTrustStoreName() != null && sslConfig.getTrustStoreType() != null
                && sslConfig.getTrustManagerFactoryAlgorithm() != null) {
            tmf = initializeTrustManager(sslConfig);
        }

        if (tmf == null) {
            tmf = new BogusTrustManagerFactory();
        }

        TrustManager[] trustManagers = tmf.getTrustManagers();

        if (trustManagers != null) {
            trustManagers = X509TrustManagerWrapper.wrap(trustManagers);
        }

        SSLContext sslContext = SSLContext.getInstance(PROTOCOL);
        sslContext.init(kmf.getKeyManagers(), trustManagers, null);

        return sslContext;
    }

    private static KeyManagerFactory initializeKeyManager(SSLConfig sslConfig) throws KeyStoreException, IOException,
            NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException {
        KeyStore ks = initializeKeyStore(sslConfig.getKeyStoreName(), sslConfig.getKeyStorePassword(),
                sslConfig.getKeyStoreType());
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(sslConfig.getKeyManagerFactoryAlgorithm());
        kmf.init(ks, sslConfig.getKeyStorePassword());
        return kmf;
    }

    private static KeyStore initializeKeyStore(String keyStoreName, char[] keyStorePassword, String keyStoreType)
            throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
        InputStream in = null;
        try {
            in = FileUtil.open(SSLContextFactory.class, keyStoreName);
            if (in == null) {
                log.warn(keyStoreName + ": keystore not found, using empty keystore");
            }
            keyStore.load(in, keyStorePassword);
        } finally {
            closeInputStream(in);
        }
        return keyStore;
    }

    private static TrustManagerFactory initializeTrustManager(SSLConfig sslConfig)
            throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        KeyStore ts = initializeTrustStore(sslConfig.getTrustStoreName(), sslConfig.getTrustStorePassword(),
                sslConfig.getTrustStoreType());
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(sslConfig.getTrustManagerFactoryAlgorithm());
        tmf.init(ts);
        return tmf;
    }

    private static KeyStore initializeTrustStore(String trustStoreName, char[] trustStorePassword,
            String trustStoreType)
                    throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance(trustStoreType);
        InputStream in = null;
        try {
            in = FileUtil.open(SSLContextFactory.class, trustStoreName);
            // for backwards compatibility we shoudln't use empty truststore
            if (in == null) {
                return null;
            }
            keyStore.load(in, trustStorePassword);
        } finally {
            closeInputStream(in);
        }
        return keyStore;
    }

    private static void closeInputStream(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }
}
