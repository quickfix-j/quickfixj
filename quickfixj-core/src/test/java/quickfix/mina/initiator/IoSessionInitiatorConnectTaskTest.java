package quickfix.mina.initiator;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.proxy.ProxyConnector;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Log;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SessionStateListener;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ssl.SSLConfig;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

/**
 * Regression coverage for IoSessionInitiator.ConnectTask pending-connect timeout handling.
 *
 * These tests intentionally exercise the private ConnectTask via reflection because the fix is
 * inside the private polling state machine rather than the public SocketInitiator API.
 */
public class IoSessionInitiatorConnectTaskTest {

    private static final SessionID SESSION_ID = new SessionID("FIXT.1.1", "SENDER", "TARGET");

    private Session fixSession;
    private Log fixLog;
    private SessionStateListener stateListener;
    private NetworkingOptions networkingOptions;
    private EventHandlingStrategy eventHandlingStrategy;

    @Before
    public void setUp() throws Exception {
        fixSession = mock(Session.class);
        fixLog = mock(Log.class);
        stateListener = mock(SessionStateListener.class);
        networkingOptions = mock(NetworkingOptions.class);
        eventHandlingStrategy = mock(EventHandlingStrategy.class);

        when(fixSession.getSessionID()).thenReturn(SESSION_ID);
        when(fixSession.getLog()).thenReturn(fixLog);
        when(fixSession.getStateListener()).thenReturn(stateListener);
        when(fixSession.isEnabled()).thenReturn(true);
        when(fixSession.isSessionTime()).thenReturn(true);

        doNothing().when(networkingOptions).apply(any(IoConnector.class));
    }

    @Test
    public void pendingConnectIsCancelledWhenConnectTimeoutIsExceededAndRetryWaitsForReconnectInterval()
            throws Exception {
        long connectTimeoutMillis = 50L;
        long reconnectIntervalMillis = 15_000L;
        Object task = newConnectTask(connectTimeoutMillis, reconnectIntervalMillis);

        ConnectFuture future = mockPendingFuture();
        setField(task, "connectFuture", future);
        setField(task, "lastReconnectAttemptTime", System.currentTimeMillis() - 1_000L);

        long beforePoll = System.currentTimeMillis();
        invokePrivate(task, "pollConnectFuture");
        long afterPoll = System.currentTimeMillis();

        verify(future).cancel();
        verify(fixLog, atLeastOnce()).onEvent(contains("Pending connection not established after"));
        verify(fixLog, atLeastOnce()).onEvent(contains("Pending connection exceeded max wait"));
        verify(fixLog, atLeastOnce()).onErrorEvent(contains("Connect attempt exceeded max pending time"));
        verify(stateListener).onConnectException(eq(SESSION_ID), any(ConnectException.class));

        assertNull("Timed-out future must be cleared", getField(task, "connectFuture"));
        assertEquals("Timeout must be treated as one connection failure", 1, getIntField(task, "connectionFailureCount"));

        long lastConnectTime = getLongField(task, "lastConnectTime");
        long lastReconnectAttemptTime = getLongField(task, "lastReconnectAttemptTime");

        assertTrue("lastConnectTime should be reset to the timeout/failure moment",
                lastConnectTime >= beforePoll && lastConnectTime <= afterPoll);
        assertTrue("lastReconnectAttemptTime should be reset to the timeout/failure moment",
                lastReconnectAttemptTime >= beforePoll && lastReconnectAttemptTime <= afterPoll);

        boolean shouldReconnectImmediately = (Boolean) invokePrivate(task, "shouldReconnect");
        assertFalse("After timeout, next attempt must wait for ReconnectInterval", shouldReconnectImmediately);
    }

    @Test
    public void pendingConnectBelowTimeoutKeepsFutureAndDoesNotCancel() throws Exception {
        long connectTimeoutMillis = 30_000L;
        Object task = newConnectTask(connectTimeoutMillis, 15_000L);

        ConnectFuture future = mockPendingFuture();
        setField(task, "connectFuture", future);
        setField(task, "lastReconnectAttemptTime", System.currentTimeMillis() - 1_000L);

        invokePrivate(task, "pollConnectFuture");

        verify(future, never()).cancel();
        verify(fixLog, atLeastOnce()).onEvent(contains("Pending connection not established after"));
        verify(fixLog, never()).onEvent(contains("Pending connection exceeded max wait"));
        verify(fixLog, never()).onErrorEvent(contains("Connect attempt exceeded max pending time"));
        verify(stateListener, never()).onConnectException(any(SessionID.class), any(ConnectException.class));

        assertSame("Future should remain pending until connect timeout is exceeded",
                future, getField(task, "connectFuture"));
        assertEquals("Pending-but-not-timed-out case must not increment failure count",
                0, getIntField(task, "connectionFailureCount"));
    }

    @Test
    public void completedFutureExceptionUsesNormalExceptionPathAndDoesNotCancelFuture() throws Exception {
        long connectTimeoutMillis = 50L;
        long reconnectIntervalMillis = 15_000L;
        Object task = newConnectTask(connectTimeoutMillis, reconnectIntervalMillis);

        IOException connectionFailure = new IOException("synthetic connect failure");
        ConnectFuture future = mock(ConnectFuture.class);
        when(future.awaitUninterruptibly(anyLong())).thenReturn(true);
        when(future.getSession()).thenReturn(null);
        when(future.getException()).thenReturn(connectionFailure);

        setField(task, "connectFuture", future);
        setField(task, "lastReconnectAttemptTime", System.currentTimeMillis() - 1_000L);

        invokePrivate(task, "pollConnectFuture");

        verify(future, never()).cancel();
        verify(fixLog, never()).onEvent(contains("Pending connection exceeded max wait"));
        verify(fixLog, atLeastOnce()).onErrorEvent(contains("synthetic connect failure"));
        verify(stateListener).onConnectException(eq(SESSION_ID), any(ConnectException.class));
        assertNull("Failed future must be cleared by normal exception handling", getField(task, "connectFuture"));
        assertEquals(1, getIntField(task, "connectionFailureCount"));
    }

    @Test
    public void successfulConnectStoresIoSessionResetsFailureStateAndClearsFuture() throws Exception {
        Object task = newConnectTask(30_000L, 15_000L);

        IoSession ioSession = mock(IoSession.class);
        ConnectFuture future = mock(ConnectFuture.class);
        when(future.awaitUninterruptibly(anyLong())).thenReturn(true);
        when(future.getSession()).thenReturn(ioSession);

        setField(task, "connectFuture", future);
        setField(task, "connectionFailureCount", 4);
        setField(task, "nextSocketAddressIndex", 1);

        invokePrivate(task, "pollConnectFuture");

        verify(future, never()).cancel();
        verify(ioSession, never()).closeNow();
        verify(stateListener, never()).onConnectException(any(SessionID.class), any(ConnectException.class));
        assertSame(ioSession, getField(task, "ioSession"));
        assertNull(getField(task, "connectFuture"));
        assertEquals(0, getIntField(task, "connectionFailureCount"));
        assertEquals(0, getIntField(task, "nextSocketAddressIndex"));
        assertTrue("Successful connect should update lastConnectTime", getLongField(task, "lastConnectTime") > 0L);
    }

    @Test
    public void timedOutPendingConnectCancelsProxyConnectFutureAndRecreatesConnector() throws Exception {
        long connectTimeoutMillis = 50L;
        Object task = newConnectTask(connectTimeoutMillis, 15_000L);

        ConnectFuture future = mockPendingFuture();
        TestProxyConnector staleProxyConnector = new TestProxyConnector();

        setField(task, "connectFuture", future);
        setField(task, "ioConnector", staleProxyConnector);
        setField(task, "lastReconnectAttemptTime", System.currentTimeMillis() - 1_000L);

        invokePrivate(task, "pollConnectFuture");

        verify(future).cancel();
        assertTrue("ProxyConnector.cancelConnectFuture() should be called",
                staleProxyConnector.cancelConnectFutureCalled);
        assertNull(getField(task, "connectFuture"));
        assertNotSame("Proxy connector should have been recreated after timeout",
                staleProxyConnector, getField(task, "ioConnector"));
    }

    @Test
    public void cancelAndResetPendingConnectAttemptClosesOpenSessionAndCancelsFuture() throws Exception {
        Object task = newConnectTask(30_000L, 15_000L);

        ConnectFuture future = mock(ConnectFuture.class);
        IoSession halfOpenSession = mock(IoSession.class);
        when(future.getSession()).thenReturn(halfOpenSession);
        when(future.cancel()).thenReturn(true);

        invokePrivate(task, "cancelAndResetPendingConnectAttempt", new Class<?>[]{ConnectFuture.class}, future);

        verify(halfOpenSession).closeNow();
        verify(future).cancel();
    }

    @Test
    public void cancelAndResetPendingConnectAttemptProxyConnectorCancelsProxyFutureAndRecreatesConnector()
            throws Exception {
        Object task = newConnectTask(30_000L, 15_000L);

        TestProxyConnector staleProxyConnector = new TestProxyConnector();
        ConnectFuture future = mock(ConnectFuture.class);
        when(future.getSession()).thenReturn(null);
        when(future.cancel()).thenReturn(true);

        setField(task, "ioConnector", staleProxyConnector);

        invokePrivate(task, "cancelAndResetPendingConnectAttempt", new Class<?>[]{ConnectFuture.class}, future);

        verify(future).cancel();
        assertTrue("ProxyConnector.cancelConnectFuture() should be called",
                staleProxyConnector.cancelConnectFutureCalled);
        assertNotNull(getField(task, "ioConnector"));
        assertNotSame("Proxy connector should be recreated", staleProxyConnector, getField(task, "ioConnector"));
    }

    @Test
    public void handleConnectExceptionIncrementsFailureCountUnwrapsCauseNotifiesListenerAndClearsFuture()
            throws Exception {
        Object task = newConnectTask(30_000L, 15_000L);

        ConnectFuture future = mock(ConnectFuture.class);
        setField(task, "connectionFailureCount", 2);
        setField(task, "connectFuture", future);

        IOException rootCause = new IOException("root cause");
        RuntimeException wrapped = new RuntimeException("wrapper", rootCause);

        invokePrivate(task, "handleConnectException", new Class<?>[]{Throwable.class}, wrapped);

        assertEquals(3, getIntField(task, "connectionFailureCount"));
        assertNull(getField(task, "connectFuture"));
        verify(stateListener).onConnectException(eq(SESSION_ID), any(ConnectException.class));
        verify(fixLog, atLeastOnce()).onErrorEvent(contains("root cause"));
    }

    private ConnectFuture mockPendingFuture() throws Exception {
        ConnectFuture future = mock(ConnectFuture.class);
        when(future.awaitUninterruptibly(anyLong())).thenReturn(false);
        when(future.getSession()).thenReturn(null);
        when(future.getException()).thenReturn(null);
        when(future.cancel()).thenReturn(true);
        return future;
    }

    private Object newConnectTask(long connectTimeoutMillis, long reconnectIntervalMillis) throws Exception {
        Class<?> connectTaskClass = Class.forName("quickfix.mina.initiator.IoSessionInitiator$ConnectTask");
        Constructor<?> constructor = connectTaskClass.getDeclaredConstructor(
                boolean.class,
                SocketAddress[].class,
                SocketAddress.class,
                org.apache.mina.core.filterchain.IoFilterChainBuilder.class,
                Session.class,
                long.class,
                long[].class,
                SessionSettings.class,
                NetworkingOptions.class,
                EventHandlingStrategy.class,
                SSLConfig.class,
                String.class,
                String.class,
                String.class,
                int.class,
                String.class,
                String.class,
                String.class,
                String.class,
                Logger.class
        );
        constructor.setAccessible(true);

        return constructor.newInstance(
                false,
                new SocketAddress[]{new InetSocketAddress("127.0.0.1", 9)},
                null,
                new DefaultIoFilterChainBuilder(),
                fixSession,
                connectTimeoutMillis,
                new long[]{reconnectIntervalMillis},
                new SessionSettings(),
                networkingOptions,
                eventHandlingStrategy,
                null,
                null,
                null,
                null,
                0,
                null,
                null,
                null,
                null,
                LoggerFactory.getLogger(IoSessionInitiatorConnectTaskTest.class)
        );
    }

    private Object invokePrivate(Object target, String methodName) throws Exception {
        return invokePrivate(target, methodName, new Class<?>[]{});
    }

    private Object invokePrivate(Object target, String methodName, Class<?>[] parameterTypes, Object... args)
            throws Exception {
        Method method = target.getClass().getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        try {
            return method.invoke(target, args);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                throw (Exception) cause;
            }
            if (cause instanceof Error) {
                throw (Error) cause;
            }
            throw e;
        }
    }

    private Object getField(Object target, String fieldName) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(target);
    }

    private long getLongField(Object target, String fieldName) throws Exception {
        return (Long) getField(target, fieldName);
    }

    private int getIntField(Object target, String fieldName) throws Exception {
        return (Integer) getField(target, fieldName);
    }

    private void setField(Object target, String fieldName, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    private static class TestProxyConnector extends ProxyConnector {
        private boolean cancelConnectFutureCalled;

        @Override
        public void cancelConnectFuture() {
            cancelConnectFutureCalled = true;
        }
    }
}
