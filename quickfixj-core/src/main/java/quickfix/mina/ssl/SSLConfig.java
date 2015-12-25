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

import java.util.Arrays;

/**
 * Groups together SSL related configuration.
 */
public class SSLConfig {
	private String keyStoreName;
	private char[] keyStorePassword;
	private String keyManagerFactoryAlgorithm;
	private String keyStoreType;
	private String trustStoreName;
	private char[] trustStorePassword;
	private String trustManagerFactoryAlgorithm;
	private String trustStoreType;
	private String[] enabledProtocols;
	private String[] enabledCipherSuites;
	private boolean needClientAuth;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SSLConfig other = (SSLConfig) obj;
		if (!Arrays.equals(enabledCipherSuites, other.enabledCipherSuites))
			return false;
		if (!Arrays.equals(enabledProtocols, other.enabledProtocols))
			return false;
		if (keyManagerFactoryAlgorithm == null) {
			if (other.keyManagerFactoryAlgorithm != null)
				return false;
		} else if (!keyManagerFactoryAlgorithm.equals(other.keyManagerFactoryAlgorithm))
			return false;
		if (keyStoreName == null) {
			if (other.keyStoreName != null)
				return false;
		} else if (!keyStoreName.equals(other.keyStoreName))
			return false;
		if (!Arrays.equals(keyStorePassword, other.keyStorePassword))
			return false;
		if (keyStoreType == null) {
			if (other.keyStoreType != null)
				return false;
		} else if (!keyStoreType.equals(other.keyStoreType))
			return false;
		if (needClientAuth != other.needClientAuth)
			return false;
		if (trustManagerFactoryAlgorithm == null) {
			if (other.trustManagerFactoryAlgorithm != null)
				return false;
		} else if (!trustManagerFactoryAlgorithm.equals(other.trustManagerFactoryAlgorithm))
			return false;
		if (trustStoreName == null) {
			if (other.trustStoreName != null)
				return false;
		} else if (!trustStoreName.equals(other.trustStoreName))
			return false;
		if (!Arrays.equals(trustStorePassword, other.trustStorePassword))
			return false;
		if (trustStoreType == null) {
			if (other.trustStoreType != null)
				return false;
		} else if (!trustStoreType.equals(other.trustStoreType))
			return false;
		return true;
	}

	public String[] getEnabledCipherSuites() {
		return enabledCipherSuites;
	}

	public String[] getEnabledProtocols() {
		return enabledProtocols;
	}

	public String getKeyManagerFactoryAlgorithm() {
		return keyManagerFactoryAlgorithm;
	}

	public String getKeyStoreName() {
		return keyStoreName;
	}

	public char[] getKeyStorePassword() {
		return keyStorePassword;
	}

	public String getKeyStoreType() {
		return keyStoreType;
	}

	public String getTrustManagerFactoryAlgorithm() {
		return trustManagerFactoryAlgorithm;
	}

	public String getTrustStoreName() {
		return trustStoreName;
	}

	public char[] getTrustStorePassword() {
		return trustStorePassword;
	}

	public String getTrustStoreType() {
		return trustStoreType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(enabledCipherSuites);
		result = prime * result + Arrays.hashCode(enabledProtocols);
		result = prime * result + ((keyManagerFactoryAlgorithm == null) ? 0 : keyManagerFactoryAlgorithm.hashCode());
		result = prime * result + ((keyStoreName == null) ? 0 : keyStoreName.hashCode());
		result = prime * result + Arrays.hashCode(keyStorePassword);
		result = prime * result + ((keyStoreType == null) ? 0 : keyStoreType.hashCode());
		result = prime * result + (needClientAuth ? 1231 : 1237);
		result = prime * result
				+ ((trustManagerFactoryAlgorithm == null) ? 0 : trustManagerFactoryAlgorithm.hashCode());
		result = prime * result + ((trustStoreName == null) ? 0 : trustStoreName.hashCode());
		result = prime * result + Arrays.hashCode(trustStorePassword);
		result = prime * result + ((trustStoreType == null) ? 0 : trustStoreType.hashCode());
		return result;
	}

	public boolean isNeedClientAuth() {
		return needClientAuth;
	}

	public void setEnabledCipherSuites(String[] enabledCipherSuites) {
		this.enabledCipherSuites = enabledCipherSuites;
	}

	public void setEnabledProtocols(String[] enabledProtocols) {
		this.enabledProtocols = enabledProtocols;
	}

	public void setKeyManagerFactoryAlgorithm(String keyManagerFactoryAlgorithm) {
		this.keyManagerFactoryAlgorithm = keyManagerFactoryAlgorithm;
	}

	public void setKeyStoreName(String keyStoreName) {
		this.keyStoreName = keyStoreName;
	}

	public void setKeyStorePassword(char[] keyStorePassword) {
		this.keyStorePassword = keyStorePassword;
	}

	public void setKeyStoreType(String keyStoreType) {
		this.keyStoreType = keyStoreType;
	}

	public void setNeedClientAuth(boolean needClientAuth) {
		this.needClientAuth = needClientAuth;
	}

	public void setTrustManagerFactoryAlgorithm(String trustManagerFactoryAlgorithm) {
		this.trustManagerFactoryAlgorithm = trustManagerFactoryAlgorithm;
	}

	public void setTrustStoreName(String trustStoreName) {
		this.trustStoreName = trustStoreName;
	}

	public void setTrustStorePassword(char[] trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}

	public void setTrustStoreType(String trustStoreType) {
		this.trustStoreType = trustStoreType;
	}
}
