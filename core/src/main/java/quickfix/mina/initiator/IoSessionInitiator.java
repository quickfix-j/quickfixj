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
import java.net.SocketAddress;
import java.security.GeneralSecurityException;

import org.apache.mina.common.ConnectFuture;
import org.apache.mina.common.IoConnector;
import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoService;
import org.apache.mina.common.IoServiceConfig;
import org.apache.mina.common.IoSession;
import org.apache.mina.common.ThreadModel;
import org.apache.mina.filter.SSLFilter;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.LogUtil;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SystemTime;
import quickfix.mina.AbstractIoHandler;
import quickfix.mina.CompositeIoFilterChainBuilder;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.mina.ssl.InitiatorSSLContextFactory;
import quickfix.mina.ssl.SSLSupport;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;

public class IoSessionInitiator {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final long reconnectIntervalInMillis;
    private final SocketAddress[] socketAddresses;

    private final AbstractIoHandler ioHandler;
    private IoSession ioSession;
    private long lastConnectAttemptTime;
    private long lastConnectTime;
    private int connectionFailureCount;
    private int nextSocketAddressIndex;
    private final Session quickfixSession;
    private final IoFilterChainBuilder userIoFilterChainBuilder;
    private boolean sslEnabled;

    public IoSessionInitiator(Session qfSession, SocketAddress[] socketAddresses,
            long reconnectIntervalInSeconds, ScheduledExecutorService executor,
            NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy,
            IoFilterChainBuilder userIoFilterChainBuilder) {
        // TODO Remove executor argument
        this.userIoFilterChainBuilder = userIoFilterChainBuilder;
        if (socketAddresses.length == 0) {
            throw new IllegalArgumentException("socketAddresses must not be empty");
        }
        this.quickfixSession = qfSession;
        this.socketAddresses = socketAddresses;
        this.reconnectIntervalInMillis = reconnectIntervalInSeconds * 1000L;
        ioHandler = new InitiatorIoHandler(qfSession, networkingOptions, eventHandlingStrategy);
    }

    private synchronized void connect() {
        lastConnectAttemptTime = SystemTime.currentTimeMillis();
        try {
            final SocketAddress nextSocketAddress = getNextSocketAddress();
            IoConnector ioConnector = ProtocolFactory.createIoConnector(nextSocketAddress);
            IoServiceConfig serviceConfig = copyDefaultIoServiceConfig(ioConnector);
            CompositeIoFilterChainBuilder ioFilterChainBuilder = new CompositeIoFilterChainBuilder(
                    userIoFilterChainBuilder);

            if (sslEnabled) {
                installSSLFilter(nextSocketAddress, ioFilterChainBuilder);
            }
            ioFilterChainBuilder.addLast(FIXProtocolCodecFactory.FILTER_NAME,
                    new ProtocolCodecFilter(new FIXProtocolCodecFactory()));

            serviceConfig.setFilterChainBuilder(ioFilterChainBuilder);
            serviceConfig.setThreadModel(ThreadModel.MANUAL);
            ConnectFuture connectFuture = ioConnector.connect(nextSocketAddress, ioHandler,
                    serviceConfig);
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
                LogUtil.logThrowable(quickfixSession.getLog(), "Exception during connection", e);
            }
            connectionFailureCount++;
        }
    }

    public int getConnectionFailureCount() {
        return connectionFailureCount;
    }

    public long getLastConnectTime() {
        return lastConnectTime;
    }

    public long getLastConnectAttemptTime() {
        return lastConnectAttemptTime;
    }

    public long getReconnectIntervalInMillis() {
        return reconnectIntervalInMillis;
    }

    public boolean isConnected() {
        return ioSession != null && ioSession.isConnected();
    }

    private void installSSLFilter(SocketAddress address, CompositeIoFilterChainBuilder ioFilterChainBuilder) throws GeneralSecurityException {
        log.info("Installing SSL filter for "+address);
        SSLFilter sslFilter = new SSLFilter(InitiatorSSLContextFactory.getInstance());
        sslFilter.setUseClientMode(true);
        ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
    }

    private IoServiceConfig copyDefaultIoServiceConfig(IoService ioService) {
        return (IoServiceConfig) ioService.getDefaultConfig().clone();
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
        return SystemTime.currentTimeMillis() - lastConnectAttemptTime >= reconnectIntervalInMillis;
    }

    public void setSslEnabled(boolean flag) {
        this.sslEnabled = flag;
    }

    public void checkConnection() {
        if (shouldReconnect()) {
            connect();
        }
    }
    
    public SessionID getSessionID() {
        return quickfixSession.getSessionID();
    }
}
