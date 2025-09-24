package quickfix.mina.ssl;

import org.junit.Test;
import quickfix.FixVersions;
import quickfix.SessionID;
import quickfix.SessionSettings;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SSLSupportTest {

    @Test
	public void shouldLoadDefaultSslConfig() {
		SessionSettings sessionSettings = new SessionSettings();
		SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "FROM", "TO");

		SSLConfig sslConfig = SSLSupport.getSslConfig(sessionSettings, sessionID);

		assertNull(sslConfig.getEnabledCipherSuites());
		assertNull(sslConfig.getEnabledProtocols());
		assertEquals("SunX509", sslConfig.getKeyManagerFactoryAlgorithm());
		assertEquals(SSLSupport.QUICKFIXJ_KEY_STORE, sslConfig.getKeyStoreName());
        assertTrue(Arrays.equals(SSLSupport.QUICKFIXJ_KEY_STORE_PWD.toCharArray(), sslConfig.getKeyStorePassword()));
		assertEquals("JKS", sslConfig.getKeyStoreType());
		assertEquals("PKIX", sslConfig.getTrustManagerFactoryAlgorithm());
		assertNull(sslConfig.getTrustStoreName());
		assertNull(sslConfig.getTrustStorePassword());
		assertEquals("JKS", sslConfig.getTrustStoreType());
        assertNull(sslConfig.getEndpointIdentificationAlgorithm());
        assertFalse(sslConfig.isUseSNI());
        assertNull(sslConfig.getSniHostName());
	}
}
