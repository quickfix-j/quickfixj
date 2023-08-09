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
import java.util.Objects;

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
	private String endpointIdentificationAlgorithm;

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

	public boolean isNeedClientAuth() {
		return needClientAuth;
	}

	public String getEndpointIdentificationAlgorithm() {
		return endpointIdentificationAlgorithm;
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

	public void setEndpointIdentificationAlgorithm(String endpointIdentificationAlgorithm) {
		this.endpointIdentificationAlgorithm = endpointIdentificationAlgorithm;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SSLConfig sslConfig = (SSLConfig) o;
		return needClientAuth == sslConfig.needClientAuth &&
				Objects.equals(keyStoreName, sslConfig.keyStoreName) &&
				Arrays.equals(keyStorePassword, sslConfig.keyStorePassword) &&
				Objects.equals(keyManagerFactoryAlgorithm, sslConfig.keyManagerFactoryAlgorithm) &&
				Objects.equals(keyStoreType, sslConfig.keyStoreType) &&
				Objects.equals(trustStoreName, sslConfig.trustStoreName) &&
				Arrays.equals(trustStorePassword, sslConfig.trustStorePassword) &&
				Objects.equals(trustManagerFactoryAlgorithm, sslConfig.trustManagerFactoryAlgorithm) &&
				Objects.equals(trustStoreType, sslConfig.trustStoreType) &&
				Arrays.equals(enabledProtocols, sslConfig.enabledProtocols) &&
				Arrays.equals(enabledCipherSuites, sslConfig.enabledCipherSuites) &&
				Objects.equals(endpointIdentificationAlgorithm, sslConfig.endpointIdentificationAlgorithm);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(keyStoreName, keyManagerFactoryAlgorithm, keyStoreType, trustStoreName, trustManagerFactoryAlgorithm, trustStoreType, needClientAuth, endpointIdentificationAlgorithm);
		result = 31 * result + Arrays.hashCode(keyStorePassword);
		result = 31 * result + Arrays.hashCode(trustStorePassword);
		result = 31 * result + Arrays.hashCode(enabledProtocols);
		result = 31 * result + Arrays.hashCode(enabledCipherSuites);
		return result;
	}
}
