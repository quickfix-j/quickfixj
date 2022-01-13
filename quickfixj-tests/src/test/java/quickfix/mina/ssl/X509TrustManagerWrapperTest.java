package quickfix.mina.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class X509TrustManagerWrapperTest {

    private X509TrustManagerWrapper underTest;
    private X509TrustManager trustManager;

    @Before
    public void setUp() throws Exception {
        trustManager = mock(X509TrustManager.class);
        underTest = new X509TrustManagerWrapper(trustManager);
    }

    @Test
    public void shouldWrapX509TrustManagers() {
        TrustManager[] managers = new TrustManager[]{mock(TrustManager.class),
            mock(X509TrustManager.class)};

        TrustManager[] wrapped = X509TrustManagerWrapper.wrap(managers);

        Assert.assertSame(managers[0], wrapped[0]);
        Assert.assertNotSame(managers[1], wrapped[1]);
        Assert.assertFalse(wrapped[0] instanceof X509TrustManagerWrapper);
        Assert.assertTrue(wrapped[1] instanceof X509TrustManagerWrapper);
    }

    @Test(expected = CertificateException.class)
    public void shouldRethrowCertificateExceptionOnCheckClientTrusted() throws Exception {
        // underlying trust manager should throw runtime exception
        doThrow(new RuntimeException()).when(trustManager)
                .checkClientTrusted(Mockito.<X509Certificate[]>any(), Mockito.<String>any());

        underTest.checkClientTrusted(null, null);
    }

    @Test(expected = CertificateException.class)
    public void shouldRethrowCertificateExceptionOnCheckServerTrusted() throws Exception {
        // underlying trust manager should throw runtime exception
        doThrow(new RuntimeException()).when(trustManager)
                .checkServerTrusted(Mockito.<X509Certificate[]>any(), Mockito.<String>any());

        underTest.checkServerTrusted(null, null);
    }
}
