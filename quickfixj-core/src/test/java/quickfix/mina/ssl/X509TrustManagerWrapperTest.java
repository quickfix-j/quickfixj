package quickfix.mina.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class X509TrustManagerWrapperTest {

    private X509TrustManagerWrapper underTest;
    private X509TrustManager trustManager;

    @Before
    public void setUp() throws Exception {
        trustManager = Mockito.mock(X509TrustManager.class);
        underTest = new X509TrustManagerWrapper(trustManager);
    }

    @Test
    public void shouldWrapX509TrustManagers() {
        TrustManager[] managers = new TrustManager[] { Mockito.mock(TrustManager.class),
                Mockito.mock(X509TrustManager.class) };

        TrustManager[] wrapped = X509TrustManagerWrapper.wrap(managers);

        Assert.assertSame(managers[0], wrapped[0]);
        Assert.assertNotSame(managers[1], wrapped[1]);
        Assert.assertFalse(wrapped[0] instanceof X509TrustManagerWrapper);
        Assert.assertTrue(wrapped[1] instanceof X509TrustManagerWrapper);
    }

    @Test(expected = CertificateException.class)
    public void shouldRethrowCertificateExceptionOnCheckClientTrusted() throws Exception {
        // underlying trust manager should throw runtime exception
        Mockito.doThrow(new RuntimeException()).when(trustManager)
                .checkClientTrusted(Mockito.any(X509Certificate[].class), Mockito.anyString());

        underTest.checkClientTrusted(null, null);
    }

    @Test(expected = CertificateException.class)
    public void shouldRethrowCertificateExceptionOnCheckServerTrusted() throws Exception {
        // underlying trust manager should throw runtime exception
        Mockito.doThrow(new RuntimeException()).when(trustManager)
                .checkServerTrusted(Mockito.any(X509Certificate[].class), Mockito.anyString());

        underTest.checkServerTrusted(null, null);
    }
}
