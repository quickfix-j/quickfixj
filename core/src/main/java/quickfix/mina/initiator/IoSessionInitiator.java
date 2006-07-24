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

import org.apache.mina.common.CloseFuture;
import org.apache.mina.common.ConnectFuture;
import org.apache.mina.common.IoConnector;
import org.apache.mina.common.IoHandler;
import org.apache.mina.common.IoSession;
import org.apache.mina.common.ThreadModel;
import org.apache.mina.common.support.BaseIoServiceConfig;

import quickfix.Session;
import quickfix.SystemTime;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import edu.emory.mathcs.backport.java.util.concurrent.Future;
import edu.emory.mathcs.backport.java.util.concurrent.ScheduledExecutorService;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

class IoSessionInitiator {

    private final long reconnectIntervalInMillis;
    private final SocketAddress[] socketAddresses;

    private final IoHandler ioHandler;
    private IoSession ioSession;
    private long lastReconnectAttemptTime = 0;
    private int nextSocketAddressIndex = 0;
    private Future reconnectFuture;
    private Session quickfixSession;

    public IoSessionInitiator(Session qfSession,
            SocketAddress[] socketAddresses, long reconnectIntervalInSeconds,
            ScheduledExecutorService executor, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandlingStrategy) {

        if (socketAddresses.length == 0) {
            throw new IllegalArgumentException("socketAddresses must not be empty");
        }
        this.quickfixSession = qfSession;
        this.socketAddresses = socketAddresses;
        this.reconnectIntervalInMillis = reconnectIntervalInSeconds * 1000L;
        ioHandler =  new InitiatorIoHandler(qfSession, networkingOptions, eventHandlingStrategy);
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
            IoConnector ioConnector = ProtocolFactory.createIoConnector(getNextSocketAddress());
            BaseIoServiceConfig connectorConfig = (BaseIoServiceConfig) ioConnector.getDefaultConfig().clone();
            connectorConfig.setThreadModel(ThreadModel.MANUAL);
            ConnectFuture connectFuture = ioConnector.connect(getNextSocketAddress(), ioHandler, connectorConfig);
            connectFuture.join();
            ioSession = connectFuture.getSession();
        } catch (Throwable e) {
            quickfixSession.getLog().onEvent("Connection failed: " + e.getMessage());
        }
    } 
    
    public void close() throws IOException {
        if (reconnectFuture != null) {
            reconnectFuture.cancel(true);
        }
        if (ioSession != null) {
            CloseFuture closeFuture = ioSession.close();
            closeFuture.join();
            ioSession = null;
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
        return (ioSession == null || !ioSession.isConnected()) && isTimeForReconnect()
                && (quickfixSession.isEnabled() && quickfixSession.isSessionTime());
    }

    private boolean isTimeForReconnect() {
        return SystemTime.currentTimeMillis() - lastReconnectAttemptTime >= reconnectIntervalInMillis;
    }
}
