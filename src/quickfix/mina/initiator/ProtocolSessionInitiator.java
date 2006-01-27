package quickfix.mina.initiator;

import java.net.SocketAddress;

import org.apache.mina.io.socket.SocketConnector;
import org.apache.mina.protocol.ProtocolConnector;
import org.apache.mina.protocol.ProtocolProvider;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.io.IoProtocolConnector;

import quickfix.Session;
import quickfix.SystemTime;
import edu.emory.mathcs.backport.java.util.concurrent.Future;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

class ProtocolSessionInitiator {

    private final ScheduledExecutorService executor;
    private final ProtocolProvider protocolProvider;
    private final long reconnectIntervalInMillis;
    private final SocketAddress[] socketAddresses;

    private final ProtocolConnector protocolConnector;
    private ProtocolSession protocolSession;
    private long lastReconnectAttemptTime = 0;
    private int nextSocketAddressIndex = 0;
    private Future reconnectFuture;
    private Session quickfixSession;

    public ProtocolSessionInitiator(Session qfSession, ProtocolProvider protocolProvider,
            SocketAddress[] socketAddresses, long reconnectIntervalInSeconds,
            ScheduledExecutorService executor) {

        if (socketAddresses.length == 0) {
            throw new IllegalArgumentException("socketAddresses must not be empty");
        }
        this.quickfixSession = qfSession;
        this.executor = executor;
        this.protocolProvider = protocolProvider;
        this.socketAddresses = socketAddresses;
        this.reconnectIntervalInMillis = reconnectIntervalInSeconds * 1000L;
        this.protocolConnector = new IoProtocolConnector(new SocketConnector());
        reconnectFuture = executor.scheduleWithFixedDelay(new ReconnectTask(), 1, 1,
                TimeUnit.SECONDS);
    }

    private class ReconnectTask implements Runnable {
        public void run() {
            if (shouldReconnect()) {
                connect();
            }
        }
    }

    public synchronized void connect() {
        lastReconnectAttemptTime = SystemTime.currentTimeMillis();
        try {
            protocolSession = protocolConnector.connect(getNextSocketAddress(), protocolProvider);
        } catch (Throwable e) {
            quickfixSession.getLog().onEvent("Connection failed: " + e.getMessage());
        }
    }

    public void close() {
        if (reconnectFuture != null) {
            reconnectFuture.cancel(true);
        }
        if (protocolSession != null) {
            protocolSession.close();
        }
        nextSocketAddressIndex = 0;
    }

    //----

    private SocketAddress getNextSocketAddress() {
        SocketAddress socketAddress = socketAddresses[nextSocketAddressIndex];
        nextSocketAddressIndex = (nextSocketAddressIndex + 1) % socketAddresses.length;
        return socketAddress;
    }

    private boolean shouldReconnect() {
        return (protocolSession == null || !protocolSession.isConnected()) && isTimeForReconnect()
                && (quickfixSession.isEnabled() && quickfixSession.isSessionTime());
    }

    private boolean isTimeForReconnect() {
        return SystemTime.currentTimeMillis() - lastReconnectAttemptTime >= reconnectIntervalInMillis;
    }
}
