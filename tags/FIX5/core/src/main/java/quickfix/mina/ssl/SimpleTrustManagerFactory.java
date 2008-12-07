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

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.X509TrustManager;

public class SimpleTrustManagerFactory extends TrustManagerFactorySpi
{

    static final X509TrustManager X509 = new X509TrustManager()
    {
        public void checkClientTrusted( X509Certificate[] x509Certificates,
                                       String s ) throws CertificateException
        {
        }

        public void checkServerTrusted( X509Certificate[] x509Certificates,
                                       String s ) throws CertificateException
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            return new X509Certificate[ 0 ];
        }
    };

    static final TrustManager[] X509_MANAGERS = new TrustManager[] { X509 };

    public SimpleTrustManagerFactory()
    {
    }

    protected TrustManager[] engineGetTrustManagers()
    {
        return X509_MANAGERS;
    }

    protected void engineInit( KeyStore keystore ) throws KeyStoreException
    {
        // noop
    }

    protected void engineInit(
                              ManagerFactoryParameters managerFactoryParameters )
            throws InvalidAlgorithmParameterException
    {
        // noop
    }
}
