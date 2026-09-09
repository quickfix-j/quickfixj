package quickfix.mina.initiator;

import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.junit.Test;
import quickfix.Log;
import quickfix.Session;
import quickfix.SessionSettings;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.HostResolutionStrategy;
import quickfix.mina.NetworkingOptions;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IoSessionInitiatorTest {

    @Test
    public void shouldNotConfigureProxyWhenTypeIsMissing() throws Exception {
        assertProxyIsNotConfigured(new InetSocketAddress("127.0.0.1", 5001), null, 8080);
    }

    @Test
    public void shouldNotConfigureProxyWhenPortIsInvalid() throws Exception {
        assertProxyIsNotConfigured(new InetSocketAddress("127.0.0.1", 5001), "invalid", -1);
    }

    @Test
    public void shouldNotConfigureProxyForVmPipeTransport() throws Exception {
        assertProxyIsNotConfigured(new VmPipeAddress(5001), "invalid", 8080);
    }

    private void assertProxyIsNotConfigured(SocketAddress socketAddress, String proxyType, int proxyPort)
            throws Exception {
        IoSessionInitiator initiator = createInitiator(socketAddress, proxyType, proxyPort);
        try {
            assertEquals(socketAddress, initiator.getSocketAddresses()[0]);
        } finally {
            initiator.stop();
        }
    }

    private IoSessionInitiator createInitiator(SocketAddress socketAddress, String proxyType, int proxyPort)
            throws Exception {
        Session session = mock(Session.class);
        when(session.getLog()).thenReturn(mock(Log.class));

        return new IoSessionInitiator(session, new SocketAddress[] { socketAddress }, null,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS, 1, new int[] { 1 },
                mock(ScheduledExecutorService.class), new SessionSettings(),
                new NetworkingOptions(new Properties()), mock(EventHandlingStrategy.class), null,
                false, null, proxyType, "5", "127.0.0.1", proxyPort,
                null, null, null, null);
    }
}
