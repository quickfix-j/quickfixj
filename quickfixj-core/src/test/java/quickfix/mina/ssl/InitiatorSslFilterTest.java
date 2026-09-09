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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests that {@link InitiatorSslFilter} resolves the SSL engine peer host
 * according to the configured {@link HostResolutionStrategy}.
 */
public class InitiatorSslFilterTest {

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
        when(session.isServer()).thenReturn(false);
    }

    @Test
    public void shouldUseHostStringWhenReverseDnsDisabled() throws Exception {
        InitiatorSslFilter filter = new InitiatorSslFilter(sslContext, null,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);

        // Address built from raw bytes has no stored host name, so getHostString()
        // returns the literal IP without performing a reverse DNS lookup.
        InetSocketAddress address = new InetSocketAddress(InetAddress.getByAddress(IP_BYTES), PORT);

        SSLEngine engine = filter.createEngine(session, address);

        assertEquals(LITERAL_IP, engine.getPeerHost());
        assertTrue(engine.getUseClientMode());
    }

    @Test
    public void shouldUseHostNameWhenReverseDnsEnabled() throws Exception {
        InitiatorSslFilter filter = new InitiatorSslFilter(sslContext, null,
                HostResolutionStrategy.WITH_REVERSE_DNS);

        // Address built with an explicit host name resolves to that name via
        // getHostName() without performing a DNS lookup.
        InetSocketAddress address = new InetSocketAddress(
                InetAddress.getByAddress(HOST_NAME, IP_BYTES), PORT);

        SSLEngine engine = filter.createEngine(session, address);

        assertEquals(HOST_NAME, engine.getPeerHost());
        assertTrue(engine.getUseClientMode());
    }

    @Test
    public void shouldCreateClientEngineWhenAddressIsNull() {
        InitiatorSslFilter filter = new InitiatorSslFilter(sslContext, null,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS);

        SSLEngine engine = filter.createEngine(session, null);

        assertNotNull(engine);
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
