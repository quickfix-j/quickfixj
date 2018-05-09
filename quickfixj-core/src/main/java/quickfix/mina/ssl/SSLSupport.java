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

import quickfix.ConfigError;
import quickfix.SessionID;
import quickfix.SessionSettings;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import java.io.IOException;

public class SSLSupport {
    public static final String FILTER_NAME = "SslFilter";
    public static final String SETTING_USE_SSL = "SocketUseSSL";
    public static final String SETTING_KEY_STORE_PWD = "SocketKeyStorePassword";
    public static final String SETTING_KEY_STORE_NAME = "SocketKeyStore";
    public static final String SETTING_KEY_MANAGER_FACTORY_ALGORITHM = "KeyManagerFactoryAlgorithm";
    public static final String SETTING_KEY_STORE_TYPE = "KeyStoreType";
    public static final String SETTING_TRUST_STORE_PWD = "SocketTrustStorePassword";
    public static final String SETTING_TRUST_STORE_NAME = "SocketTrustStore";
    public static final String SETTING_TRUST_MANAGER_FACTORY_ALGORITHM = "TrustManagerFactoryAlgorithm";
    public static final String SETTING_TRUST_STORE_TYPE = "TrustStoreType";
    public static final String SETTING_NEED_CLIENT_AUTH = "NeedClientAuth";
    public static final String SETTING_ENABLED_PROTOCOLS = "EnabledProtocols";
    public static final String SETTING_CIPHER_SUITES = "CipherSuites";
    static final String DEFAULT_STORE_TYPE = "JKS";
    static final String DEFAULT_KEY_STORE_MANAGER_ALGORITHM = "SunX509";
    static final String DEFAULT_TRUST_STORE_MANAGER_ALGORITHM = "PKIX";
    static final String QUICKFIXJ_KEY_STORE = "quickfixj.keystore";
    static final String QUICKFIXJ_KEY_STORE_PWD = "quickfixjpw";

    public static String[] getDefaultCipherSuites(SSLContext sslContext) {
        return sslContext.getSocketFactory().getDefaultCipherSuites();
    }

    public static String[] getEnabledCipherSuites(SessionSettings sessionSettings, SessionID sessionID) {
        String enabledCipherSuites = getString(sessionSettings, sessionID, SETTING_CIPHER_SUITES, null);
        if (enabledCipherSuites != null) {
            return enabledCipherSuites.split(",");
        }
        return null;
    }

    public static String[] getEnabledProtocols(SessionSettings sessionSettings, SessionID sessionID) {
        String enabledProtocols = getString(sessionSettings, sessionID, SETTING_ENABLED_PROTOCOLS, null);
        if (enabledProtocols != null) {
            return enabledProtocols.split(",");
        }
        return null;
    }

    public static String getKeyManagerFactoryAlgorithm(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_KEY_MANAGER_FACTORY_ALGORITHM,
                DEFAULT_KEY_STORE_MANAGER_ALGORITHM);
    }

    public static String getKeyStoreName(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_KEY_STORE_NAME, QUICKFIXJ_KEY_STORE);
    }

    public static char[] getKeyStorePassword(SessionSettings sessionSettings, SessionID sessionID) {
        String keyStorePassword = getString(sessionSettings, sessionID, SETTING_KEY_STORE_PWD, QUICKFIXJ_KEY_STORE_PWD);
        return keyStorePassword != null ? keyStorePassword.toCharArray() : null;
    }

    public static String getKeyStoreType(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_KEY_STORE_TYPE, DEFAULT_STORE_TYPE);
    }

    public static String[] getSupportedProtocols(SSLContext sslContext) {
        try {
            return ((SSLSocket) sslContext.getSocketFactory().createSocket()).getSupportedProtocols();
        } catch (IOException ignored) {
        }

        return null;
    }

    /**
     * Retrieve all related SSL configuration for a specific {@link SessionID}.
     */
    public static SSLConfig getSslConfig(SessionSettings sessionSettings, SessionID sessionID) {
        SSLConfig sslConfig = new SSLConfig();
        sslConfig.setKeyStoreName(getKeyStoreName(sessionSettings, sessionID));
        sslConfig.setKeyStorePassword(getKeyStorePassword(sessionSettings, sessionID));
        sslConfig.setKeyManagerFactoryAlgorithm(getKeyManagerFactoryAlgorithm(sessionSettings, sessionID));
        sslConfig.setKeyStoreType(getKeyStoreType(sessionSettings, sessionID));
        sslConfig.setTrustStoreName(getTrustStoreName(sessionSettings, sessionID));
        sslConfig.setTrustStorePassword(getTrustStorePassword(sessionSettings, sessionID));
        sslConfig.setTrustManagerFactoryAlgorithm(getTrustManagerFactoryAlgorithm(sessionSettings, sessionID));
        sslConfig.setTrustStoreType(getTrustStoreType(sessionSettings, sessionID));
        sslConfig.setEnabledCipherSuites(getEnabledCipherSuites(sessionSettings, sessionID));
        sslConfig.setEnabledProtocols(getEnabledProtocols(sessionSettings, sessionID));
        sslConfig.setNeedClientAuth(isNeedClientAuth(sessionSettings, sessionID));

        return sslConfig;
    }

    private static String getString(SessionSettings sessionSettings, SessionID sessionID, String key,
            String defaultValue) {
        String propertyValue = defaultValue;
        if (sessionSettings.isSetting(sessionID, key)) {
            try {
                propertyValue = sessionSettings.getString(sessionID, key);
            } catch (ConfigError ignored) {
            }
        }
        return propertyValue;
    }

    public static String getTrustManagerFactoryAlgorithm(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_TRUST_MANAGER_FACTORY_ALGORITHM,
                DEFAULT_TRUST_STORE_MANAGER_ALGORITHM);
    }

    public static String getTrustStoreName(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_TRUST_STORE_NAME, null);
    }

    public static char[] getTrustStorePassword(SessionSettings sessionSettings, SessionID sessionID) {
        String trustStorePassword = getString(sessionSettings, sessionID, SETTING_TRUST_STORE_PWD, null);
        return trustStorePassword != null ? trustStorePassword.toCharArray() : null;
    }

    public static String getTrustStoreType(SessionSettings sessionSettings, SessionID sessionID) {
        return getString(sessionSettings, sessionID, SETTING_TRUST_STORE_TYPE, DEFAULT_STORE_TYPE);
    }

    public static boolean isNeedClientAuth(SessionSettings sessionSettings, SessionID sessionID) {
        return "Y".equals(getString(sessionSettings, sessionID, SETTING_NEED_CLIENT_AUTH, "N"));
    }
}
