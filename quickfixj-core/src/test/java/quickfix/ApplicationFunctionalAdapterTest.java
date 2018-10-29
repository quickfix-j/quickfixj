package quickfix;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

}