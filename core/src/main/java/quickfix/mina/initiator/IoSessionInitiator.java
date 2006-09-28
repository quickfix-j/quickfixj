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
import org.apache.mina.common.IoHandler;
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
import quickfix.SystemTime;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.CompositeIoFilterChainBuilder;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.mina.ssl.InitiatorSSLContextFactory;
import quickfix.mina.ssl.SSLSupport;
import edu.emory.mathcs.backport.java.util.concurrent.Future;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

class IoSessionInitiator {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final long reconnectIntervalInMillis;
    private final SocketAddress[] socketAddresses;

    private final IoHandler ioHandler;
    private IoSession ioSession;
    private long lastReconnectAttemptTime = 0;
    private int nextSocketAddressIndex = 0;
    private Future reconnectFuture;
    private final Session quickfixSession;
    private final IoFilterChainBuilder userIoFilterChainBuilder;
    private final ScheduledExecutorService executor;
    private boolean sslEnabled;
    
    public IoSessionInitiator(Session qfSession, SocketAddress[] socketAddresses,
            long reconnectIntervalInSeconds, ScheduledExecutorService executor,
            NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy,
            IoFilterChainBuilder userIoFilterChainBuilder) {

        this.executor = executor;
        this.userIoFilterChainBuilder = userIoFilterChainBuilder;
        if (socketAddresses.length == 0) {
            throw new IllegalArgumentException("socketAddresses must not be empty");
        }
        this.quickfixSession = qfSession;
        this.socketAddresses = socketAddresses;
        this.reconnectIntervalInMillis = reconnectIntervalInSeconds * 1000L;
        ioHandler = new InitiatorIoHandler(qfSession, networkingOptions, eventHandlingStrategy);
    }

    private class ReconnectTask implements Runnable {
        public void run() {
            if (shouldReconnect()) {
                connect();
            }
        }
    }

    private synchronized void connect() {
        lastReconnectAttemptTime = SystemTime.currentTimeMillis();
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
        } catch (Throwable e) {
            while (e instanceof IOException) {
                quickfixSession.getLog().onEvent("MINA IO Exception: " + e.getMessage());
                e = e.getCause();
            }
            LogUtil.logThrowable(quickfixSession.getLog(), "Exception during connection", e);
        }
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

    public void start() {
        reconnectFuture = executor.scheduleWithFixedDelay(new ReconnectTask(), 0, 1,
                TimeUnit.SECONDS);
    }

    public void stop() {
        if (reconnectFuture != null) {
            reconnectFuture.cancel(true);
        }
    }

    //----

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
    
    public void setSslEnabled(boolean flag) {
        this.sslEnabled = flag;
    }
}
