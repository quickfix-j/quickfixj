package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import org.junit.Before;
import org.junit.Test;
import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import java.net.InetAddress;
import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests that {@link AcceptorSslFilter} resolves the SSL engine peer host
 * according to the configured {@link HostResolutionStrategy}.
 */
public class AcceptorSslFilterTest {

    private static final String LITERAL_IP = "1.2.3.4";
    private static final byte[] IP_BYTES = {1, 2, 3, 4};
    private static final String HOST_NAME = "example.quickfixj.org";
    private static final int PORT = 5001;

    private SSLContext sslContext;
    private IoSession session;

    @Before
    public void setUp() throws Exception {
        sslContext = buildSslContext();
        session = mock(IoSession.class);
        when(session.isServer()).thenReturn(true);
    }

    @Test
    public void shouldUseHostStringWhenReverseDnsDisabled() throws Exception {
        AcceptorSslFilter filter = new AcceptorSslFilter(sslContext,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);

        InetSocketAddress address = new InetSocketAddress(InetAddress.getByAddress(IP_BYTES), PORT);

        SSLEngine engine = filter.createEngine(session, address);

        assertEquals(LITERAL_IP, engine.getPeerHost());
        assertFalse(engine.getUseClientMode());
    }

    @Test
    public void shouldUseHostNameWhenReverseDnsEnabled() throws Exception {
        AcceptorSslFilter filter = new AcceptorSslFilter(sslContext,
                HostResolutionStrategy.WITH_REVERSE_DNS);

        InetSocketAddress address = new InetSocketAddress(
                InetAddress.getByAddress(HOST_NAME, IP_BYTES), PORT);

        SSLEngine engine = filter.createEngine(session, address);

        assertEquals(HOST_NAME, engine.getPeerHost());
        assertFalse(engine.getUseClientMode());
    }

    @Test
    public void shouldCreateServerEngineWhenAddressIsNull() {
        AcceptorSslFilter filter = new AcceptorSslFilter(sslContext,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);

        SSLEngine engine = filter.createEngine(session, null);

        assertNotNull(engine);
        assertFalse(engine.getUseClientMode());
    }

    @Test
    public void shouldApplyOptionalEngineSettings() {
        AcceptorSslFilter filter = new AcceptorSslFilter(sslContext,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);
        String cipherSuite = sslContext.getDefaultSSLParameters().getCipherSuites()[0];
        String protocol = sslContext.getDefaultSSLParameters().getProtocols()[0];
        filter.setWantClientAuth(true);
        filter.setEnabledCipherSuites(cipherSuite);
        filter.setEnabledProtocols(protocol);
        filter.setEndpointIdentificationAlgorithm("HTTPS");

        SSLEngine engine = filter.createEngine(session, null);

        assertTrue(engine.getWantClientAuth());
        assertEquals(cipherSuite, engine.getEnabledCipherSuites()[0]);
        assertEquals(protocol, engine.getEnabledProtocols()[0]);
        assertEquals("HTTPS", engine.getSSLParameters().getEndpointIdentificationAlgorithm());
    }

    @Test
    public void shouldCreateClientEngineForClientSession() {
        when(session.isServer()).thenReturn(false);
        AcceptorSslFilter filter = new AcceptorSslFilter(sslContext,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);

        SSLEngine engine = filter.createEngine(session, null);

        assertTrue(engine.getUseClientMode());
    }

    private static SSLContext buildSslContext() throws Exception {
        SSLConfig sslConfig = new SSLConfig();
        sslConfig.setKeyStoreName(SSLSupport.QUICKFIXJ_KEY_STORE);
        sslConfig.setKeyStorePassword(SSLSupport.QUICKFIXJ_KEY_STORE_PWD.toCharArray());
        sslConfig.setKeyStoreType("JKS");
        sslConfig.setKeyManagerFactoryAlgorithm("SunX509");
        sslConfig.setTrustStoreType("JKS");
        sslConfig.setTrustManagerFactoryAlgorithm("PKIX");
        return SSLContextFactory.getInstance(sslConfig);
    }
}
