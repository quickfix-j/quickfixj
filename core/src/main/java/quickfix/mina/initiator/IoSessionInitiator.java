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

import edu.emory.mathcs.backport.java.util.concurrent.Future;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import org.apache.mina.common.*;
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

import java.io.IOException;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;

public class IoSessionInitiator {
    private final ScheduledExecutorService executor;
    private final ConnectTask reconnectTask;

    private Future reconnectFuture;

    public IoSessionInitiator(Session qfSession, SocketAddress[] socketAddresses,
                              long reconnectIntervalInSeconds, ScheduledExecutorService executor,
                              NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy,
                              IoFilterChainBuilder userIoFilterChainBuilder, boolean sslEnabled,
                              String keyStoreName, String keyStorePassword) throws ConfigError {
        this.executor = executor;
        try {
            reconnectTask = new ConnectTask(sslEnabled, socketAddresses, userIoFilterChainBuilder,
                    qfSession, reconnectIntervalInSeconds * 1000L, networkingOptions,
                    eventHandlingStrategy, keyStoreName, keyStorePassword);
        } catch (GeneralSecurityException e) {
            throw new ConfigError(e);
        }
    }

    private static class ConnectTask implements Runnable {
        private final SocketAddress[] socketAddresses;
        private final IoConnector ioConnector;
        private final Session quickfixSession;
        private final long reconnectIntervalInMillis;
        private String keyStoreName;
        private String keyStorePassword;
        private final InitiatorIoHandler ioHandler;

        private IoSession ioSession;
        private long lastReconnectAttemptTime;
        private long lastConnectTime;
        private int nextSocketAddressIndex;
        private int connectionFailureCount;

        public ConnectTask(boolean sslEnabled, SocketAddress[] socketAddresses,
                           IoFilterChainBuilder userIoFilterChainBuilder, Session quickfixSession,
                           long reconnectIntervalInMillis, NetworkingOptions networkingOptions,
                           EventHandlingStrategy eventHandlingStrategy,
                           String keyStoreName, String keyStorePassword) throws ConfigError,
                GeneralSecurityException {
            this.socketAddresses = socketAddresses;
            this.quickfixSession = quickfixSession;
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
            ioHandler = new InitiatorIoHandler(quickfixSession, networkingOptions,
                    eventHandlingStrategy);
        }

        private void installSSLFilter(CompositeIoFilterChainBuilder ioFilterChainBuilder)
                throws GeneralSecurityException {
            SSLFilter sslFilter = new SSLFilter(SSLContextFactory.getInstance(keyStoreName, keyStorePassword.toCharArray()));
            sslFilter.setUseClientMode(true);
            ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
        }

        public synchronized void run() {
            if (shouldReconnect()) {
                connect();
            }
        }

        private void connect() {
            lastReconnectAttemptTime = SystemTime.currentTimeMillis();
            try {
                final SocketAddress nextSocketAddress = getNextSocketAddress();
                ConnectFuture connectFuture = ioConnector.connect(nextSocketAddress, ioHandler);
                connectFuture.join();
                ioSession = connectFuture.getSession();
                connectionFailureCount = 0;
                lastConnectTime = System.currentTimeMillis();
            } catch (Throwable e) {
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                if (e instanceof IOException) {
                    quickfixSession.getLog().onEvent(e.getMessage());
                } else {
                    String msg = "Exception during connection";
                    LogUtil.logThrowable(quickfixSession.getLog(), msg, e);
                }
                connectionFailureCount++;
            }
        }

        private SocketAddress getNextSocketAddress() {
            SocketAddress socketAddress = socketAddresses[nextSocketAddressIndex];
            nextSocketAddressIndex = (nextSocketAddressIndex + 1) % socketAddresses.length;
            return socketAddress;
        }

        private boolean shouldReconnect() {
            return (ioSession == null || !ioSession.isConnected()) && isTimeForReconnect()
                    && (quickfixSession.isEnabled() && quickfixSession.isSessionTime());
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
    }

    synchronized void start() {
        if (reconnectFuture == null) {
            try {
                reconnectFuture = executor.scheduleWithFixedDelay(reconnectTask, 1, 1,
                        TimeUnit.SECONDS);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;

                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    synchronized void stop() {
        if (reconnectFuture != null) {
            reconnectFuture.cancel(true);
        }
    }
}
