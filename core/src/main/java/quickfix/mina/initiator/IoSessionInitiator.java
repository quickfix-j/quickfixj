/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina.initiator;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.mina.common.ConnectFuture;
import org.apache.mina.common.IoConnector;
import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoServiceConfig;
import org.apache.mina.common.IoSession;
import org.apache.mina.common.ThreadModel;
import org.apache.mina.filter.SSLFilter;
import org.apache.mina.filter.codec.ProtocolCodecFilter;

import quickfix.ConfigError;
import quickfix.LogUtil;
import quickfix.Session;
import quickfix.SystemTime;
import quickfix.mina.CompositeIoFilterChainBuilder;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.mina.ssl.SSLContextFactory;
import quickfix.mina.ssl.SSLSupport;

public class IoSessionInitiator {
    private final static long CONNECT_POLL_TIMEOUT = 2000L;
    private final ScheduledExecutorService executor;
    private final ConnectTask reconnectTask;

    private Future<?> reconnectFuture;

    public IoSessionInitiator(Session fixSession, SocketAddress[] socketAddresses,
            long reconnectIntervalInSeconds, ScheduledExecutorService executor,
            NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy,
            IoFilterChainBuilder userIoFilterChainBuilder, boolean sslEnabled, String keyStoreName,
            String keyStorePassword) throws ConfigError {
        this.executor = executor;
        try {
            reconnectTask = new ConnectTask(sslEnabled, socketAddresses, userIoFilterChainBuilder,
                    fixSession, reconnectIntervalInSeconds * 1000L, networkingOptions,
                    eventHandlingStrategy, keyStoreName, keyStorePassword);
        } catch (GeneralSecurityException e) {
            throw new ConfigError(e);
        }
    }

    private static class ConnectTask implements Runnable {
        private final SocketAddress[] socketAddresses;
        private final IoConnector ioConnector;
        private final Session fixSession;
        private final long reconnectIntervalInMillis;
        private String keyStoreName;
        private String keyStorePassword;
        private final InitiatorIoHandler ioHandler;

        private IoSession ioSession;
        private long lastReconnectAttemptTime;
        private long lastConnectTime;
        private int nextSocketAddressIndex;
        private int connectionFailureCount;
        private ConnectFuture connectFuture;

        public ConnectTask(boolean sslEnabled, SocketAddress[] socketAddresses,
                IoFilterChainBuilder userIoFilterChainBuilder, Session fixSession,
                long reconnectIntervalInMillis, NetworkingOptions networkingOptions,
                EventHandlingStrategy eventHandlingStrategy, String keyStoreName,
                String keyStorePassword) throws ConfigError, GeneralSecurityException {
            this.socketAddresses = socketAddresses;
            this.fixSession = fixSession;
            this.reconnectIntervalInMillis = reconnectIntervalInMillis;
            this.keyStoreName = keyStoreName;
            this.keyStorePassword = keyStorePassword;
            ioConnector = ProtocolFactory.createIoConnector(socketAddresses[0]);
            CompositeIoFilterChainBuilder ioFilterChainBuilder = new CompositeIoFilterChainBuilder(
                    userIoFilterChainBuilder);

            if (sslEnabled) {
                installSSLFilter(ioFilterChainBuilder);
            }

            ioFilterChainBuilder.addLast(FIXProtocolCodecFactory.FILTER_NAME,
                    new ProtocolCodecFilter(new FIXProtocolCodecFactory()));

            IoServiceConfig serviceConfig = ioConnector.getDefaultConfig();
            serviceConfig.setFilterChainBuilder(ioFilterChainBuilder);
            serviceConfig.setThreadModel(ThreadModel.MANUAL);
            ioHandler = new InitiatorIoHandler(fixSession, networkingOptions,
                    eventHandlingStrategy);
        }

        private void installSSLFilter(CompositeIoFilterChainBuilder ioFilterChainBuilder)
                throws GeneralSecurityException {
            SSLFilter sslFilter = new SSLFilter(SSLContextFactory.getInstance(keyStoreName,
                    keyStorePassword.toCharArray()));
            sslFilter.setUseClientMode(true);
            ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
        }

        public synchronized void run() {
            if (connectFuture == null) {
                if (shouldReconnect()) {
                    connect();
                }
            } else {
                pollConnectFuture();
            }
        }

        private void connect() {
            lastReconnectAttemptTime = SystemTime.currentTimeMillis();
            SocketAddress nextSocketAddress = getNextSocketAddress();
            try {
                connectFuture = ioConnector.connect(nextSocketAddress, ioHandler);
                pollConnectFuture();
            } catch (Throwable e) {
                handleConnectException(e);
            }
        }

        private void pollConnectFuture() {
            try {
                connectFuture.join(CONNECT_POLL_TIMEOUT);
                if (connectFuture.getSession() != null) {
                    ioSession = connectFuture.getSession();
                    connectionFailureCount = 0;
                    lastConnectTime = System.currentTimeMillis();
                    connectFuture = null;
                } else {
                    fixSession.getLog().onEvent(
                            "Pending connection not established after "
                                    + (System.currentTimeMillis() - lastReconnectAttemptTime)
                                    + " ms.");
                }
            } catch (Throwable e) {
                handleConnectException(e);
            }
        }

        private void handleConnectException(Throwable e) {
            while (e.getCause() != null) {
                e = e.getCause();
            }
            if ((e instanceof IOException) && (e.getMessage() != null)) {
                fixSession.getLog().onEvent(e.getMessage());
            } else {
                String msg = "Exception during connection";
                LogUtil.logThrowable(fixSession.getLog(), msg, e);
            }
            connectionFailureCount++;
            connectFuture = null;
        }

        private SocketAddress getNextSocketAddress() {
            SocketAddress socketAddress = socketAddresses[nextSocketAddressIndex];

            // QFJ-266 Recreate socket address for unresolved addresses
            if (socketAddress instanceof InetSocketAddress) {
                InetSocketAddress inetAddr = (InetSocketAddress) socketAddress;
                if (inetAddr.isUnresolved()) {
                    socketAddress = new InetSocketAddress(inetAddr.getHostName(), inetAddr
                            .getPort());
                    socketAddresses[nextSocketAddressIndex] = socketAddress;
                }
            }
            nextSocketAddressIndex = (nextSocketAddressIndex + 1) % socketAddresses.length;
            return socketAddress;
        }

        private boolean shouldReconnect() {
            return (ioSession == null || !ioSession.isConnected()) && isTimeForReconnect()
                    && (fixSession.isEnabled() && fixSession.isSessionTime());
        }

        private boolean isTimeForReconnect() {
            return SystemTime.currentTimeMillis() - lastReconnectAttemptTime >= reconnectIntervalInMillis;
        }

        // TODO JMX Expose reconnect property

        public synchronized int getConnectionFailureCount() {
            return connectionFailureCount;
        }

        public synchronized long getLastReconnectAttemptTime() {
            return lastReconnectAttemptTime;
        }

        public synchronized long getLastConnectTime() {
            return lastConnectTime;
        }
        
        public Session getFixSession() {
            return fixSession;
        }
    }

    synchronized void start() {
        if (reconnectFuture == null) {
        	// The following logon reenabled the session. The actual logon will take
        	// place as a side-effect of the session timer task (not the reconnect task).
            reconnectTask.getFixSession().logon(); // only enables the session
            reconnectFuture = executor
                    .scheduleWithFixedDelay(reconnectTask, 0, 1, TimeUnit.SECONDS);
        }
    }

    synchronized void stop() {
        if (reconnectFuture != null) {
            reconnectFuture.cancel(true);
            reconnectFuture = null;
        }
    }
}
