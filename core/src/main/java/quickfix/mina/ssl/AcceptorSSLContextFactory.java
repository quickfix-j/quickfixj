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
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

public class AcceptorSSLContextFactory {
    private static final String PROTOCOL = "TLS";

    private static final String KEY_MANAGER_FACTORY_ALGORITHM;

    static {
        String algorithm = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (algorithm == null) {
            algorithm = "SunX509";
        }

        KEY_MANAGER_FACTORY_ALGORITHM = algorithm;
    }

    private static Map contextCache = new HashMap();

    public static synchronized SSLContext getInstance(String keyStoreName, char[] keyStorePassword)
            throws GeneralSecurityException {
        synchronized (contextCache) {
            SSLContext context = (SSLContext) contextCache.get(keyStoreName);
            if (context == null) {
                try {
                    context = createSSLContext(keyStoreName, keyStorePassword);
                    contextCache.put(keyStoreName, context);
                } catch (Exception ioe) {
                    throw new GeneralSecurityException("Can't create Server SSLContext:" + ioe);
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
            in = AcceptorSSLContextFactory.class.getResourceAsStream(keyStoreName);
            if (in == null) {
                in = AcceptorSSLContextFactory.class.getClassLoader().getResourceAsStream(
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
