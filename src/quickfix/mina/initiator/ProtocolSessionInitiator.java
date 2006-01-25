package quickfix.mina.initiator;

import java.io.IOException;
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
    private final long reconnectInterval;
    private final SocketAddress[] socketAddresses;

    private final ProtocolConnector protocolConnector;
    private ProtocolSession protocolSession;
    private long lastReconnectAttemptTime = 0;
    private int nextSocketAddressIndex = 0;
    private Future reconnectFuture;
    private Session quickfixSession;

    public ProtocolSessionInitiator(Session qfSession, ProtocolProvider protocolProvider,
            SocketAddress[] socketAddresses, long reconnectInterval,
            ScheduledExecutorService executor) {

        if (socketAddresses.length == 0) {
            throw new IllegalArgumentException("socketAddresses must not be empty");
        }
        this.quickfixSession = qfSession;
        this.executor = executor;
        this.protocolProvider = protocolProvider;
        this.socketAddresses = socketAddresses;
        this.reconnectInterval = reconnectInterval;
        this.protocolConnector = new IoProtocolConnector(new SocketConnector());
    }

    private class ReconnectTask implements Runnable {
        public void run() {
            if (shouldReconnect()) {
                lastReconnectAttemptTime = SystemTime.currentTimeMillis();
                try {
                    connect();
                } catch (IOException e) {
                    try {
                        protocolProvider.getHandler().exceptionCaught(protocolSession, e);
                    } catch (Exception ece) {
                        throw new RuntimeException(ece);
                    }
                }
            }
        }
    }

    public void connect() throws IOException {
        protocolSession = protocolConnector.connect(getNextSocketAddress(), protocolProvider);
        reconnectFuture = executor.scheduleWithFixedDelay(new ReconnectTask(), reconnectInterval,
                reconnectInterval, TimeUnit.SECONDS);
    }

    public void close() {
        reconnectFuture.cancel(true);
        protocolSession.close();
        nextSocketAddressIndex = 0;
    }

    //----

    private SocketAddress getNextSocketAddress() {
        SocketAddress socketAddress = socketAddresses[nextSocketAddressIndex];
        nextSocketAddressIndex = (nextSocketAddressIndex + 1) % socketAddresses.length;
        return socketAddress;
    }

    private boolean shouldReconnect() {
        return !protocolSession.isConnected() && isTimeForReconnect()
                && (quickfixSession.isEnabled() && quickfixSession.isSessionTime());
    }

    private boolean isTimeForReconnect() {
        return SystemTime.currentTimeMillis() - lastReconnectAttemptTime > reconnectInterval;
    }
}
