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

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * {@link X509TrustManager} interface wrapper to re-throw
 * {@link RuntimeException} as {@link CertificateException} when using empty
 * truststore.
 */
public class X509TrustManagerWrapper implements X509TrustManager {

    public static TrustManager[] wrap(TrustManager[] trustManagers) {
        TrustManager[] wrappers = new TrustManager[trustManagers.length];

        for (int i = 0; i < trustManagers.length; i++) {
            TrustManager trustManager = trustManagers[i];

            if (trustManager instanceof X509TrustManager) {
                wrappers[i] = new X509TrustManagerWrapper((X509TrustManager) trustManager);
            } else {
                wrappers[i] = trustManager;
            }
        }

        return wrappers;
    }

    private X509TrustManager trustManager;

    public X509TrustManagerWrapper(final X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        try {
            trustManager.checkClientTrusted(chain, authType);
        } catch (RuntimeException e) {
            throw new CertificateException("Unexpected error", e);
        }
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        try {
            trustManager.checkServerTrusted(chain, authType);
        } catch (RuntimeException e) {
            throw new CertificateException("Unexpected error", e);
        }
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return trustManager.getAcceptedIssuers();
    }
}
