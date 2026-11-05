package quickfix.mina.initiator;

import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.junit.Test;
import quickfix.Log;
import quickfix.Session;
import quickfix.SessionSettings;
import quickfix.SessionStateListener;
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
import static org.mockito.Mockito.verify;
import org.mockito.ArgumentCaptor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertTrue;

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

    @Test
    public void shouldTryNextSocketAddressWhenDisconnectedBeforeLogon() throws Exception {
        try (ServerSocket firstServer = new ServerSocket(0);
             ServerSocket secondServer = new ServerSocket(0)) {

            CountDownLatch firstConnection = new CountDownLatch(1);
            CountDownLatch secondConnection = new CountDownLatch(1);

            Thread firstServerThread = new Thread(() -> {
                try (Socket socket = firstServer.accept()) {
                    firstConnection.countDown();
                } catch (Exception ignored) {
                }
            });

            Thread secondServerThread = new Thread(() -> {
                try (Socket socket = secondServer.accept()) {
                    secondConnection.countDown();
                } catch (Exception ignored) {
                }
            });

            firstServerThread.start();
            secondServerThread.start();

            SocketAddress firstAddress = new InetSocketAddress("127.0.0.1", firstServer.getLocalPort());
            SocketAddress secondAddress = new InetSocketAddress("127.0.0.1", secondServer.getLocalPort());

            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
            IoSessionInitiator initiator = createInitiator(new SocketAddress[]{firstAddress, secondAddress}, executor);

            try {
                initiator.start();

                assertTrue(firstConnection.await(5, TimeUnit.SECONDS));
                assertTrue(secondConnection.await(5, TimeUnit.SECONDS));
            } finally {
                initiator.stop();
                executor.shutdownNow();
            }
        }
    }

    @Test
    public void shouldResetSocketAddressAfterSuccessfulLogon() throws Exception {
        try (ServerSocket firstServer = new ServerSocket(0);
             ServerSocket secondServer = new ServerSocket(0)) {

            CountDownLatch firstConnection = new CountDownLatch(1);
            CountDownLatch closeFirstConnection = new CountDownLatch(1);
            CountDownLatch firstReconnect = new CountDownLatch(1);
            CountDownLatch secondConnection = new CountDownLatch(1);

            Thread firstServerThread = new Thread(() -> {
                try {
                    try (Socket socket = firstServer.accept()) {
                        firstConnection.countDown();
                        closeFirstConnection.await(5, TimeUnit.SECONDS);
                    }

                    try (Socket socket = firstServer.accept()) {
                        firstReconnect.countDown();
                    }
                } catch (Exception ignored) {
                }
            });

            Thread secondServerThread = new Thread(() -> {
                try (Socket socket = secondServer.accept()) {
                    secondConnection.countDown();
                } catch (Exception ignored) {
                }
            });

            firstServerThread.start();
            secondServerThread.start();

            Session session = mock(Session.class);
            when(session.getLog()).thenReturn(mock(Log.class));
            when(session.isEnabled()).thenReturn(true);
            when(session.isSessionTime()).thenReturn(true);

            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

            IoSessionInitiator initiator = createInitiator(
                    session,
                    new SocketAddress[]{
                            new InetSocketAddress("127.0.0.1", firstServer.getLocalPort()),
                            new InetSocketAddress("127.0.0.1", secondServer.getLocalPort())
                    },
                    executor
            );

            try {
                initiator.start();

                assertTrue(firstConnection.await(5, TimeUnit.SECONDS));

                ArgumentCaptor<SessionStateListener> captor = ArgumentCaptor.forClass(SessionStateListener.class);
                verify(session).addStateListener(captor.capture());
                captor.getValue().onLogon(session.getSessionID());
                closeFirstConnection.countDown();

                assertTrue(firstReconnect.await(5, TimeUnit.SECONDS));
                assertEquals(1, secondConnection.getCount());
            } finally {
                initiator.stop();
                executor.shutdownNow();
            }
        }
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

    private IoSessionInitiator createInitiator(
            SocketAddress[] socketAddresses,
            ScheduledExecutorService executor)
            throws Exception {

        Session session = mock(Session.class);
        when(session.getLog()).thenReturn(mock(Log.class));
        when(session.isEnabled()).thenReturn(true);
        when(session.isSessionTime()).thenReturn(true);

        return new IoSessionInitiator(
                session,
                socketAddresses,
                null,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS,
                1,
                new int[] { 1 },
                executor,
                new SessionSettings(),
                new NetworkingOptions(new Properties()),
                mock(EventHandlingStrategy.class),
                null,
                false,
                null,
                null,
                null,
                null,
                0,
                null,
                null,
                null,
                null
        );
    }

    private IoSessionInitiator createInitiator(
            Session session,
            SocketAddress[] socketAddresses,
            ScheduledExecutorService executor)
            throws Exception {

        return new IoSessionInitiator(
                session,
                socketAddresses,
                null,
                HostResolutionStrategy.WITHOUT_REVERSE_DNS,
                1,
                new int[]{1},
                executor,
                new SessionSettings(),
                new NetworkingOptions(new Properties()),
                mock(EventHandlingStrategy.class),
                null,
                false,
                null,
                null,
                null,
                null,
                0,
                null,
                null,
                null,
                null
        );
    }
}
