package quickfix;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ApplicationFunctionalAdapterTest {

    @Test
    public void testOnCreateListenersInvokedInOrder() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnCreateListener(listener);
        adapter.addOnCreateListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.onCreate(sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(sessionID);
        inOrder.verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedOnCreateListenersNotInvoked() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnCreateListener(listener);
        adapter.addOnCreateListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.removeOnCreateListener(listener);
        adapter.onCreate(sessionID);

        verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testOnLogonListenersInvokedInOrder() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnLogonListener(listener);
        adapter.addOnLogonListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.onLogon(sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(sessionID);
        inOrder.verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedOnLogonListenersNotInvoked() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnLogonListener(listener);
        adapter.addOnLogonListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.removeOnLogonListener(listener);
        adapter.onLogon(sessionID);

        verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testOnLogoutListenersInvokedInOrder() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnLogoutListener(listener);
        adapter.addOnLogoutListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.onLogout(sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(sessionID);
        inOrder.verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedOnLogoutListenersNotInvoked() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnLogoutListener(listener);
        adapter.addOnLogoutListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.removeOnLogoutListener(listener);
        adapter.onLogout(sessionID);

        verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testToAdminListenersInvokedInOrder() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        BiConsumer<Message, SessionID> listener = mock(BiConsumer.class);
        BiConsumer<Message, SessionID> listener2 = mock(BiConsumer.class);

        adapter.addToAdminListener(listener);
        adapter.addToAdminListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.toAdmin(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedToAdminListenersNotInvoked() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        BiConsumer<Message, SessionID> listener = mock(BiConsumer.class);
        BiConsumer<Message, SessionID> listener2 = mock(BiConsumer.class);

        adapter.addToAdminListener(listener);
        adapter.addToAdminListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.removeToAdminListener(listener);
        adapter.toAdmin(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testToAdminTypeSafeListenersInvokedInOrder() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        BiConsumer<MyMessage1, SessionID> listener = mock(BiConsumer.class);
        BiConsumer<MyMessage1, SessionID> listener2 = mock(BiConsumer.class);

        adapter.addToAdminListener(MyMessage1.class, listener);
        adapter.addToAdminListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.toAdmin(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testToAdminTypeSafeListenersNotInvokedForUnmatchedMessageType() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        BiConsumer<MyMessage1, SessionID> listener = mock(BiConsumer.class);
        BiConsumer<MyMessage2, SessionID> listener2 = mock(BiConsumer.class);

        adapter.addToAdminListener(MyMessage1.class, listener);
        adapter.addToAdminListener(MyMessage2.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.toAdmin(message, sessionID);

        verify(listener).accept(message, sessionID);
        verifyNoMoreInteractions(listener);
        verifyZeroInteractions(listener2);
    }

    @Test
    public void testRemovedToAdminTypeSafeListenersNotInvoked() {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        BiConsumer<MyMessage1, SessionID> listener = mock(BiConsumer.class);
        BiConsumer<MyMessage1, SessionID> listener2 = mock(BiConsumer.class);

        adapter.addToAdminListener(MyMessage1.class, listener);
        adapter.addToAdminListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.removeToAdminListener(listener);
        adapter.toAdmin(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testFromAdminListenersInvokedInOrder() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener listener = mock(FromAdminListener.class);
        FromAdminListener listener2 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(listener);
        adapter.addFromAdminListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.fromAdmin(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedFromAdminListenersNotInvoked() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener listener = mock(FromAdminListener.class);
        FromAdminListener listener2 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(listener);
        adapter.addFromAdminListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.removeFromAdminListener(listener);
        adapter.fromAdmin(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testFromAdminListenersFailFastForFieldNotFound() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminListenersFailFast(new FieldNotFound(35));
    }

    @Test
    public void testFromAdminListenersFailFastForIncorrectTagValue() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminListenersFailFast(new IncorrectTagValue(35));
    }

    @Test
    public void testFromAdminListenersFailFastForIncorrectDataFormat() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminListenersFailFast(new IncorrectDataFormat(35));
    }

    @Test
    public void testFromAdminListenersFailFastForRejectLogon() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminListenersFailFast(new RejectLogon("Log on not allowed"));
    }

    private void assertFromAdminListenersFailFast(Exception exception) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener listener = mock(FromAdminListener.class);
        FromAdminListener listener2 = mock(FromAdminListener.class);
        FromAdminListener listener3 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(listener);
        adapter.addFromAdminListener(listener2);
        adapter.addFromAdminListener(listener3);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.fromAdmin(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    @Test
    public void testFromAdminTypeSafeListenersInvokedInOrder() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener<MyMessage1> listener = mock(FromAdminListener.class);
        FromAdminListener<MyMessage1> listener2 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(MyMessage1.class, listener);
        adapter.addFromAdminListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.fromAdmin(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testFromAdminTypeSafeListenersNotInvokedForUnmatchedMessageType() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener<MyMessage1> listener = mock(FromAdminListener.class);
        FromAdminListener<MyMessage2> listener2 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(MyMessage1.class, listener);
        adapter.addFromAdminListener(MyMessage2.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.fromAdmin(message, sessionID);

        verify(listener).accept(message, sessionID);
        verifyNoMoreInteractions(listener);
        verifyZeroInteractions(listener2);
    }

    @Test
    public void testRemovedFromAdminTypeSafeListenersNotInvoked() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener<MyMessage1> listener = mock(FromAdminListener.class);
        FromAdminListener<MyMessage1> listener2 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(MyMessage1.class, listener);
        adapter.addFromAdminListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.removeFromAdminListener(listener);
        adapter.fromAdmin(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verify(listener, times(0)).accept(message, sessionID);
    }

    @Test
    public void testFromAdminTypeSafeListenersFailFastForFieldNotFound() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminTypeSafeListenersFailFast(new FieldNotFound(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAdminTypeSafeListenersFailFastForIncorrectTagValue() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminTypeSafeListenersFailFast(new IncorrectTagValue(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAdminTypeSafeListenersFailFastForIncorrectDataFormat() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminTypeSafeListenersFailFast(new IncorrectDataFormat(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAdminTypeSafeListenersFailFastForRejectLogon() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, RejectLogon {
        assertFromAdminTypeSafeListenersFailFast(new RejectLogon("Log on not allowed"), MyMessage1.class, new MyMessage1());
    }

    private <T extends Message> void assertFromAdminTypeSafeListenersFailFast(Exception exception, Class<T> clazz, T message) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAdminListener<T> listener = mock(FromAdminListener.class);
        FromAdminListener<T> listener2 = mock(FromAdminListener.class);
        FromAdminListener<T> listener3 = mock(FromAdminListener.class);

        adapter.addFromAdminListener(clazz, listener);
        adapter.addFromAdminListener(clazz, listener2);
        adapter.addFromAdminListener(clazz, listener3);

        SessionID sessionID = mock(SessionID.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.fromAdmin(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    @Test
    public void testToAppListenersInvokedInOrder() throws DoNotSend {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener listener = mock(ToAppListener.class);
        ToAppListener listener2 = mock(ToAppListener.class);

        adapter.addToAppListener(listener);
        adapter.addToAppListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.toApp(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedToAppListenersNotInvoked() throws DoNotSend {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener listener = mock(ToAppListener.class);
        ToAppListener listener2 = mock(ToAppListener.class);

        adapter.addToAppListener(listener);
        adapter.addToAppListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.removeToAppListener(listener);
        adapter.toApp(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testToAppListenersFailFastForDoNotSend() throws DoNotSend {
        Exception exception = new DoNotSend();
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener listener = mock(ToAppListener.class);
        ToAppListener listener2 = mock(ToAppListener.class);
        ToAppListener listener3 = mock(ToAppListener.class);

        adapter.addToAppListener(listener);
        adapter.addToAppListener(listener2);
        adapter.addToAppListener(listener3);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.toApp(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    @Test
    public void testToAppTypeSafeListenersInvokedInOrder() throws DoNotSend {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener<MyMessage1> listener = mock(ToAppListener.class);
        ToAppListener<MyMessage1> listener2 = mock(ToAppListener.class);

        adapter.addToAppListener(MyMessage1.class, listener);
        adapter.addToAppListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.toApp(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testToAppTypeSafeListenersNotInvokedForUnmatchedMessageType() throws DoNotSend {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener<MyMessage1> listener = mock(ToAppListener.class);
        ToAppListener<MyMessage2> listener2 = mock(ToAppListener.class);

        adapter.addToAppListener(MyMessage1.class, listener);
        adapter.addToAppListener(MyMessage2.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.toApp(message, sessionID);

        verify(listener).accept(message, sessionID);
        verifyNoMoreInteractions(listener);
        verifyZeroInteractions(listener2);
    }

    @Test
    public void testRemovedToAppTypeSafeListenersNotInvoked() throws DoNotSend {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener<MyMessage1> listener = mock(ToAppListener.class);
        ToAppListener<MyMessage1> listener2 = mock(ToAppListener.class);

        adapter.addToAppListener(MyMessage1.class, listener);
        adapter.addToAppListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.removeToAppListener(listener);
        adapter.toApp(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verify(listener, times(0)).accept(message, sessionID);
    }

    @Test
    public void testToAppTypeSafeListenersFailFastForFieldNotFound() throws DoNotSend {
        Exception exception = new DoNotSend();
        MyMessage1 message = new MyMessage1();
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        ToAppListener<MyMessage1> listener = mock(ToAppListener.class);
        ToAppListener<MyMessage1> listener2 = mock(ToAppListener.class);
        ToAppListener<MyMessage1> listener3 = mock(ToAppListener.class);

        adapter.addToAppListener(MyMessage1.class, listener);
        adapter.addToAppListener(MyMessage1.class, listener2);
        adapter.addToAppListener(MyMessage1.class, listener3);

        SessionID sessionID = mock(SessionID.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.toApp(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    @Test
    public void testFromAppListenersInvokedInOrder() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener listener = mock(FromAppListener.class);
        FromAppListener listener2 = mock(FromAppListener.class);

        adapter.addFromAppListener(listener);
        adapter.addFromAppListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.fromApp(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedFromAppListenersNotInvoked() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener listener = mock(FromAppListener.class);
        FromAppListener listener2 = mock(FromAppListener.class);

        adapter.addFromAppListener(listener);
        adapter.addFromAppListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);
        adapter.removeFromAppListener(listener);
        adapter.fromApp(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verifyZeroInteractions(listener);
    }

    @Test
    public void testFromAppListenersFailFastForFieldNotFound() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppListenersFailFast(new FieldNotFound(35));
    }

    @Test
    public void testFromAppListenersFailFastForIncorrectTagValue() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppListenersFailFast(new IncorrectTagValue(35));
    }

    @Test
    public void testFromAppListenersFailFastForIncorrectDataFormat() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppListenersFailFast(new IncorrectDataFormat(35));
    }

    @Test
    public void testFromAppListenersFailFastForRejectLogon() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppListenersFailFast(new UnsupportedMessageType());
    }

    private void assertFromAppListenersFailFast(Exception exception) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener listener = mock(FromAppListener.class);
        FromAppListener listener2 = mock(FromAppListener.class);
        FromAppListener listener3 = mock(FromAppListener.class);

        adapter.addFromAppListener(listener);
        adapter.addFromAppListener(listener2);
        adapter.addFromAppListener(listener3);

        SessionID sessionID = mock(SessionID.class);
        Message message = mock(Message.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.fromApp(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    @Test
    public void testFromAppTypeSafeListenersInvokedInOrder() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener<MyMessage1> listener = mock(FromAppListener.class);
        FromAppListener<MyMessage1> listener2 = mock(FromAppListener.class);

        adapter.addFromAppListener(MyMessage1.class, listener);
        adapter.addFromAppListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.fromApp(message, sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(message, sessionID);
        inOrder.verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testFromAppTypeSafeListenersNotInvokedForUnmatchedMessageType() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener<MyMessage1> listener = mock(FromAppListener.class);
        FromAppListener<MyMessage2> listener2 = mock(FromAppListener.class);

        adapter.addFromAppListener(MyMessage1.class, listener);
        adapter.addFromAppListener(MyMessage2.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.fromApp(message, sessionID);

        verify(listener).accept(message, sessionID);
        verifyNoMoreInteractions(listener);
        verifyZeroInteractions(listener2);
    }

    @Test
    public void testRemovedFromAppTypeSafeListenersNotInvoked() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener<MyMessage1> listener = mock(FromAppListener.class);
        FromAppListener<MyMessage1> listener2 = mock(FromAppListener.class);

        adapter.addFromAppListener(MyMessage1.class, listener);
        adapter.addFromAppListener(MyMessage1.class, listener2);

        SessionID sessionID = mock(SessionID.class);
        MyMessage1 message = new MyMessage1();
        adapter.removeFromAppListener(listener);
        adapter.fromApp(message, sessionID);

        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener2);
        verify(listener, times(0)).accept(message, sessionID);
    }

    @Test
    public void testFromAppTypeSafeListenersFailFastForFieldNotFound() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppTypeSafeListenersFailFast(new FieldNotFound(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAppTypeSafeListenersFailFastForIncorrectTagValue() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppTypeSafeListenersFailFast(new IncorrectTagValue(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAppTypeSafeListenersFailFastForIncorrectDataFormat() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppTypeSafeListenersFailFast(new IncorrectDataFormat(35), MyMessage1.class, new MyMessage1());
    }

    @Test
    public void testFromAppTypeSafeListenersFailFastForRejectLogon() throws FieldNotFound, IncorrectTagValue, IncorrectDataFormat, UnsupportedMessageType {
        assertFromAppTypeSafeListenersFailFast(new UnsupportedMessageType(), MyMessage1.class, new MyMessage1());
    }

    private <T extends Message> void assertFromAppTypeSafeListenersFailFast(Exception exception, Class<T> clazz, T message) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        ApplicationFunctionalAdapter adapter = new ApplicationFunctionalAdapter();
        FromAppListener<T> listener = mock(FromAppListener.class);
        FromAppListener<T> listener2 = mock(FromAppListener.class);
        FromAppListener<T> listener3 = mock(FromAppListener.class);

        adapter.addFromAppListener(clazz, listener);
        adapter.addFromAppListener(clazz, listener2);
        adapter.addFromAppListener(clazz, listener3);

        SessionID sessionID = mock(SessionID.class);

        doThrow(exception).when(listener2).accept(message, sessionID);

        try {
            adapter.fromApp(message, sessionID);
        } catch (Exception actual)
        {
            assertSame(exception, actual);
        }

        verify(listener).accept(message, sessionID);
        verify(listener2).accept(message, sessionID);
        verifyNoMoreInteractions(listener, listener2);
        verifyZeroInteractions(listener3);
    }

    private static class MyMessage1 extends Message {

    }

    private static class MyMessage2 extends Message {

    }
}