package quickfix.mina.ssl;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import quickfix.FixVersions;
import quickfix.SessionID;
import quickfix.SessionSettings;

public class SSLSupportTest {

    @Test
	public void shouldLoadDefaultSslConfig() {
		SessionSettings sessionSettings = new SessionSettings();
		SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "FROM", "TO");

		SSLConfig sslConfig = SSLSupport.getSslConfig(sessionSettings, sessionID);

		Assert.assertNull(sslConfig.getEnabledCipherSuites());
		Assert.assertNull(sslConfig.getEnabledProtocols());
		Assert.assertEquals("SunX509", sslConfig.getKeyManagerFactoryAlgorithm());
		Assert.assertEquals(SSLSupport.QUICKFIXJ_CERT, sslConfig.getKeyStoreName());
		Assert.assertTrue(Arrays.equals(SSLSupport.QUICKFIXJ_PW.toCharArray(), sslConfig.getKeyStorePassword()));
		Assert.assertEquals("JKS", sslConfig.getKeyStoreType());
		Assert.assertEquals("PKIX", sslConfig.getTrustManagerFactoryAlgorithm());
		Assert.assertNull(sslConfig.getTrustStoreName());
		Assert.assertNull(sslConfig.getTrustStorePassword());
		Assert.assertEquals("JKS", sslConfig.getTrustStoreType());
	}
}
