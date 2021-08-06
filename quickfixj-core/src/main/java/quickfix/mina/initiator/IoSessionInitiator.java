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

import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.proxy.ProxyConnector;
import org.apache.mina.transport.socket.SocketConnector;
import quickfix.ConfigError;
import quickfix.LogUtil;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SystemTime;
import quickfix.mina.CompositeIoFilterChainBuilder;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.mina.ssl.SSLConfig;
import quickfix.mina.ssl.SSLContextFactory;
import quickfix.mina.ssl.SSLFilter;
import quickfix.mina.ssl.SSLSupport;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoSessionInitiator {
    private final static long CONNECT_POLL_TIMEOUT = 2000L;
    private final ScheduledExecutorService executor;
    private final ConnectTask reconnectTask;
    private final Logger log = LoggerFactory.getLogger(getClass());

    private Future<?> reconnectFuture;

    public IoSessionInitiator(Session fixSession, SocketAddress[] socketAddresses,
            SocketAddress localAddress, int[] reconnectIntervalInSeconds,
            ScheduledExecutorService executor, SessionSettings sessionSettings, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandlingStrategy,
            IoFilterChainBuilder userIoFilterChainBuilder, boolean sslEnabled, SSLConfig sslConfig,
            String proxyType, String proxyVersion, String proxyHost, int proxyPort,
            String proxyUser, String proxyPassword, String proxyDomain, String proxyWorkstation) throws ConfigError {
        this.executor = executor;
        final long[] reconnectIntervalInMillis = new long[reconnectIntervalInSeconds.length];
        for (int ii = 0; ii != reconnectIntervalInSeconds.length; ++ii) {
            reconnectIntervalInMillis[ii] = reconnectIntervalInSeconds[ii] * 1000L;
        }
        try {
            reconnectTask = new ConnectTask(sslEnabled, socketAddresses, localAddress,
                    userIoFilterChainBuilder, fixSession, reconnectIntervalInMillis,
                    sessionSettings, networkingOptions, eventHandlingStrategy, sslConfig,
                    proxyType, proxyVersion, proxyHost, proxyPort, proxyUser, proxyPassword, proxyDomain, proxyWorkstation, log);
        } catch (GeneralSecurityException e) {
            throw new ConfigError(e);
        }

        fixSession.getLog().onEvent("Configured socket addresses for session: " + Arrays.asList(socketAddresses));
    }

    private static class ConnectTask implements Runnable {
        private final boolean sslEnabled;
        private final SocketAddress[] socketAddresses;
        private final SocketAddress localAddress;
        private final IoFilterChainBuilder userIoFilterChainBuilder;
        private IoConnector ioConnector;
        private final Session fixSession;
        private final long[] reconnectIntervalInMillis;
        private final SessionSettings sessionSettings;
        private final NetworkingOptions networkingOptions;
        private final EventHandlingStrategy eventHandlingStrategy;
        private final SSLConfig sslConfig;
        private final Logger log;

        private IoSession ioSession;
        private long lastReconnectAttemptTime;
        private long lastConnectTime;
        private int nextSocketAddressIndex;
        private int connectionFailureCount;
        private ConnectFuture connectFuture;

        private final String proxyType;
        private final String proxyVersion;
        private final String proxyHost;
        private final int proxyPort;
        private final String proxyUser;
        private final String proxyPassword;
        private final String proxyDomain;
        private final String proxyWorkstation;

        public ConnectTask(boolean sslEnabled, SocketAddress[] socketAddresses,
                SocketAddress localAddress, IoFilterChainBuilder userIoFilterChainBuilder,
                Session fixSession, long[] reconnectIntervalInMillis,
                SessionSettings sessionSettings, NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy, SSLConfig sslConfig,
                String proxyType, String proxyVersion, String proxyHost,
                int proxyPort, String proxyUser, String proxyPassword, String proxyDomain,
                String proxyWorkstation, Logger log) throws ConfigError, GeneralSecurityException {
            this.sslEnabled = sslEnabled;
            this.socketAddresses = socketAddresses;
            this.localAddress = localAddress;
            this.userIoFilterChainBuilder = userIoFilterChainBuilder;
            this.fixSession = fixSession;
            this.reconnectIntervalInMillis = reconnectIntervalInMillis;
            this.sessionSettings = sessionSettings;
            this.networkingOptions = networkingOptions;
            this.eventHandlingStrategy = eventHandlingStrategy;
            this.sslConfig = sslConfig;
            this.log = log;

            this.proxyType = proxyType;
            this.proxyVersion = proxyVersion;
            this.proxyHost = proxyHost;
            this.proxyPort = proxyPort;
            this.proxyUser = proxyUser;
            this.proxyPassword = proxyPassword;
            this.proxyDomain = proxyDomain;
            this.proxyWorkstation = proxyWorkstation;

            setupIoConnector();
        }

        private void setupIoConnector() throws ConfigError, GeneralSecurityException {
            final CompositeIoFilterChainBuilder ioFilterChainBuilder = new CompositeIoFilterChainBuilder(userIoFilterChainBuilder);

            boolean hasProxy = proxyType != null && proxyPort > 0 && socketAddresses[nextSocketAddressIndex] instanceof InetSocketAddress;

            SSLFilter sslFilter = null;
            if (sslEnabled) {
                sslFilter = installSslFilter(ioFilterChainBuilder, !hasProxy);
            }

            ioFilterChainBuilder.addLast(FIXProtocolCodecFactory.FILTER_NAME, new ProtocolCodecFilter(new FIXProtocolCodecFactory()));

            IoConnector newConnector;
            newConnector = ProtocolFactory.createIoConnector(socketAddresses[nextSocketAddressIndex]);
            networkingOptions.apply(newConnector);
            newConnector.setHandler(new InitiatorIoHandler(fixSession, sessionSettings, networkingOptions, eventHandlingStrategy));
            newConnector.setFilterChainBuilder(ioFilterChainBuilder);

            if (hasProxy) {
                ProxyConnector proxyConnector = ProtocolFactory.createIoProxyConnector(
                        (SocketConnector) newConnector,
                        (InetSocketAddress) socketAddresses[nextSocketAddressIndex],
                        new InetSocketAddress(proxyHost, proxyPort),
                        proxyType, proxyVersion, proxyUser, proxyPassword, proxyDomain, proxyWorkstation
                );

                proxyConnector.setHandler(new InitiatorProxyIoHandler(
                        new InitiatorIoHandler(fixSession, sessionSettings, networkingOptions, eventHandlingStrategy),
                        sslFilter
                ));

                newConnector = proxyConnector;
            }

            if (ioConnector != null) {
                SessionConnector.closeManagedSessionsAndDispose(ioConnector, true, log);
            }
            ioConnector = newConnector;
        }

        private SSLFilter installSslFilter(CompositeIoFilterChainBuilder ioFilterChainBuilder, boolean autoStart)
                throws GeneralSecurityException {
            final SSLContext sslContext = SSLContextFactory.getInstance(sslConfig);
            final SSLFilter sslFilter = new SSLFilter(sslContext, autoStart);
            sslFilter.setUseClientMode(true);
            sslFilter.setCipherSuites(sslConfig.getEnabledCipherSuites() != null ? sslConfig.getEnabledCipherSuites()
                    : SSLSupport.getDefaultCipherSuites(sslContext));
            sslFilter.setEnabledProtocols(sslConfig.getEnabledProtocols() != null ? sslConfig.getEnabledProtocols()
                    : SSLSupport.getSupportedProtocols(sslContext));
            sslFilter.setUseSNI(sslConfig.isUseSNI());
            ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
            return sslFilter;
        }

        @Override
        public void run() {
            resetIoConnector();
            try {
                if (connectFuture == null) {
                    if (shouldReconnect()) {
                        connect();
                    }
                } else {
                    pollConnectFuture();
                }
            } catch (Throwable e) {
                LogUtil.logThrowable(fixSession.getLog(), "Exception during ConnectTask run", e);
            }
        }

        private void connect() {
            try {
                lastReconnectAttemptTime = SystemTime.currentTimeMillis();
                SocketAddress nextSocketAddress = getNextSocketAddress();
                if (localAddress == null) {
                    connectFuture = ioConnector.connect(nextSocketAddress);
                } else {
                    // QFJ-482
                    connectFuture = ioConnector.connect(nextSocketAddress, localAddress);
                }
                pollConnectFuture();
            } catch (Throwable e) {
                handleConnectException(e);
            }
        }

        private void pollConnectFuture() {
            try {
                connectFuture.awaitUninterruptibly(CONNECT_POLL_TIMEOUT);
                if (connectFuture.getSession() != null) {
                    ioSession = connectFuture.getSession();
                    connectionFailureCount = 0;
                    nextSocketAddressIndex = 0;
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
            ++connectionFailureCount;
            SocketAddress socketAddress = socketAddresses[getCurrentSocketAddressIndex()];
            while (e.getCause() != null) {
                e = e.getCause();
            }
            final String nextRetryMsg = " (Next retry in " + computeNextRetryConnectDelay() + " milliseconds)";
            if (e instanceof IOException) {
                fixSession.getLog().onErrorEvent(e.getClass().getName() + " during connection to " + socketAddress + ": " + e + nextRetryMsg);
                fixSession.getStateListener().onConnectException((IOException) e);
            } else {
                LogUtil.logThrowable(fixSession.getLog(), "Exception during connection to " + socketAddress + nextRetryMsg, e);
                fixSession.getStateListener().onConnectException(new Exception(e));
            }
            connectFuture = null;
        }

        private SocketAddress getNextSocketAddress() {
            SocketAddress socketAddress = socketAddresses[nextSocketAddressIndex];

            // Recreate socket address to avoid cached address resolution
            if (socketAddress instanceof InetSocketAddress) {
                InetSocketAddress inetAddr = (InetSocketAddress) socketAddress;
                socketAddress = new InetSocketAddress(inetAddr.getHostName(), inetAddr.getPort());
                socketAddresses[nextSocketAddressIndex] = socketAddress;
            }
            nextSocketAddressIndex = (nextSocketAddressIndex + 1) % socketAddresses.length;
            return socketAddress;
        }

        private int getCurrentSocketAddressIndex() {
            return (nextSocketAddressIndex + socketAddresses.length - 1) % socketAddresses.length;
        }

        private boolean shouldReconnect() {
            return (ioSession == null || !ioSession.isConnected()) && isTimeForReconnect()
                    && (fixSession.isEnabled() && fixSession.isSessionTime());
        }

        private long computeNextRetryConnectDelay() {
            int index = connectionFailureCount - 1;
            if (index < 0)
                index = 0;
            long millis;
            if (index >= reconnectIntervalInMillis.length) {
                millis = reconnectIntervalInMillis[reconnectIntervalInMillis.length - 1];
            } else {
                millis = reconnectIntervalInMillis[index];
            }
            return millis;
        }

        private boolean isTimeForReconnect() {
            return SystemTime.currentTimeMillis() - lastReconnectAttemptTime >= computeNextRetryConnectDelay();
        }

        // TODO JMX Expose reconnect property

        @SuppressWarnings("unused") // exposed via JMX
        public synchronized int getConnectionFailureCount() {
            return connectionFailureCount;
        }

        @SuppressWarnings("unused") // exposed via JMX
        public synchronized long getLastReconnectAttemptTime() {
            return lastReconnectAttemptTime;
        }

        @SuppressWarnings("unused") // exposed via JMX
        public synchronized long getLastConnectTime() {
            return lastConnectTime;
        }

        public Session getFixSession() {
            return fixSession;
        }

        private void resetIoConnector() {
            if (ioSession != null && Boolean.TRUE.equals(ioSession.getAttribute(SessionConnector.QFJ_RESET_IO_CONNECTOR))) {
                try {
                    setupIoConnector();
                    if (connectFuture != null) {
                        connectFuture.cancel();
                    }
                    connectFuture = null;
                    if (!ioSession.isClosing()) {
                        ioSession.closeNow();
                    }
                    ioSession = null;
                } catch (Throwable e) {
                    LogUtil.logThrowable(fixSession.getLog(), "Exception during resetIoConnector call", e);
                }
            }
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
        SessionConnector.closeManagedSessionsAndDispose(reconnectTask.ioConnector, true, log);
    }

    public SessionID getSessionID() {
        return reconnectTask.fixSession.getSessionID();
    }

    public SocketAddress getLocalAddress() {
        return reconnectTask.localAddress;
    }

    public SocketAddress[] getSocketAddresses() {
        return Arrays.copyOf(reconnectTask.socketAddresses, reconnectTask.socketAddresses.length);
    }
}
