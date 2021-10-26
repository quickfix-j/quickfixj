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

package quickfix.test.acceptance;

import org.apache.mina.core.future.CloseFuture;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.apache.mina.transport.vmpipe.VmPipeConnector;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.test.util.ReflectionUtil;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import quickfix.mina.SessionConnector;

public class TestConnection {
    private static final Map<Integer, IoConnector> connectors = new HashMap<>();
    private final ConcurrentMap<Integer, TestIoHandler> ioHandlers = new ConcurrentHashMap<>();
    private final Logger log = LoggerFactory.getLogger(getClass());

    public void sendMessage(int clientId, String message) throws IOException {
        TestIoHandler handler = getIoHandler(clientId);
        handler.getSession().write(message);
    }

    private TestIoHandler getIoHandler(int clientId) {
        return ioHandlers.get(clientId);
    }

    public void tearDown() {
        for (TestIoHandler testIoHandler : ioHandlers.values()) {
            IoSession session = testIoHandler.getSession();
            if (session != null) {
                CloseFuture closeFuture = session.closeNow();
                closeFuture.awaitUninterruptibly();
            }
        }
        ioHandlers.clear();
    }

    public CharSequence readMessage(int clientId, long timeout) throws InterruptedException {
        return getIoHandler(clientId).getNextMessage(timeout);
    }

    public void waitForClientDisconnect(int clientId) throws IOException, InterruptedException {
        getIoHandler(clientId).waitForDisconnect();
    }

    public void connect(int clientId, int transportType, int port)
            throws IOException {
        IoConnector connector = connectors.get(clientId);
        if (connector != null) {
            SessionConnector.closeManagedSessionsAndDispose(connector, true, log);
        }

        SocketAddress address;
        if (transportType == ProtocolFactory.SOCKET) {
            connector = new NioSocketConnector();
            address = new InetSocketAddress("localhost", port);
        } else if (transportType == ProtocolFactory.VM_PIPE) {
            connector = new VmPipeConnector();
            address = new VmPipeAddress(port);
        } else {
            throw new RuntimeException("Unsupported transport type: " + transportType);
        }
        connectors.put(clientId, connector);

        TestIoHandler testIoHandler = new TestIoHandler();
        ioHandlers.put(clientId, testIoHandler);
        connector.setHandler(testIoHandler);
        ConnectFuture future = connector.connect(address);
        future.awaitUninterruptibly(5000L);
        Throwable exception = future.getException();
        String failedMessage = "connection to server failed: " + (exception != null ? exception.getMessage() : "");
        Assert.assertTrue(failedMessage, future.isConnected());
    }

    private class TestIoHandler extends IoHandlerAdapter {
        private IoSession session;
        private final BlockingQueue<Object> messages = new LinkedBlockingQueue<>();
        private final CountDownLatch sessionCreatedLatch = new CountDownLatch(1);
        private final CountDownLatch disconnectLatch = new CountDownLatch(1);

        public void sessionCreated(IoSession session) throws Exception {
            super.sessionCreated(session);
            this.session = session;
            session.getFilterChain().addLast("codec",
                    new ProtocolCodecFilter(new FIXProtocolCodecFactory()));
            sessionCreatedLatch.countDown();
        }

        public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
            super.exceptionCaught(session, cause);
            log.error(cause.getMessage(), cause);
        }

        public void sessionClosed(IoSession session) throws Exception {
            super.sessionClosed(session);
            disconnectLatch.countDown();
        }

        public void messageReceived(IoSession session, Object message) throws Exception {
            messages.add(message);
        }

        public IoSession getSession() {
            try {
                boolean await = sessionCreatedLatch.await(5, TimeUnit.SECONDS);
                if (!await) {
                    log.error("sessionCreatedLatch timed out. Dumping threads...");
                    ReflectionUtil.dumpStackTraces();

                    final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
                    long[] threadIds = bean.findDeadlockedThreads();

                    final List<String> deadlockedThreads = new ArrayList<>();
                    if (threadIds != null) {
                        for (long threadId : threadIds) {
                            final ThreadInfo threadInfo = bean.getThreadInfo(threadId);
                            deadlockedThreads.add(threadInfo.getThreadId() + ": " + threadInfo.getThreadName()
                                    + " state: " + threadInfo.getThreadState());
                        }
                    }
                    if (!deadlockedThreads.isEmpty()) {
                        log.error("Showing deadlocked threads:");
                        for (String deadlockedThread : deadlockedThreads) {
                            log.error(deadlockedThread);
                        }
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            return session;
        }

        public String getNextMessage(long timeout) throws InterruptedException {
            return (String) messages.poll(timeout, TimeUnit.MILLISECONDS);
        }

        public void waitForDisconnect() throws InterruptedException {
            /*  Please note that this timeout should not be too little because
                there is at least one acceptance test (6_SendTestRequest) expecting
                the connection to timeout after a TestRequest. */
            if (!disconnectLatch.await(20000, TimeUnit.MILLISECONDS)) {
                Assert.fail("client not disconnected");
            }
        }
    }
}
