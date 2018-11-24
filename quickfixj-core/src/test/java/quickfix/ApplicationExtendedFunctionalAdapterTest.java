package quickfix;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ApplicationExtendedFunctionalAdapterTest {

    @Test
    public void testCanLogonPredicatesInvokedInOrder() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(true);
        when(predicate2.test(sessionID)).thenReturn(true);

        adapter.canLogon(sessionID);

        InOrder inOrder = inOrder(predicate, predicate2);
        inOrder.verify(predicate).test(sessionID);
        inOrder.verify(predicate2).test(sessionID);
        verifyNoMoreInteractions(predicate, predicate2);
    }

    @Test
    public void testRemovedCanLogonPredicateNotInvoked() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(true);
        when(predicate2.test(sessionID)).thenReturn(true);

        adapter.removeCanLogOnPredicate(predicate);
        adapter.canLogon(sessionID);

        verify(predicate2).test(sessionID);
        verifyNoMoreInteractions(predicate2);
        verifyZeroInteractions(predicate);
    }

    @Test
    public void testCanLogOnPredicatesReturnTrueIfAllPredicatesReturnTrue() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(true);
        when(predicate2.test(sessionID)).thenReturn(true);

        assertTrue(adapter.canLogon(sessionID));
    }

    @Test
    public void testCanLogOnPredicatesReturnFalseIfTheFirstPredicateReturnFalse() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(false);
        when(predicate2.test(sessionID)).thenReturn(true);

        assertFalse(adapter.canLogon(sessionID));
    }

    @Test
    public void testCanLogOnPredicatesReturnFalseIfTheSecondPredicateReturnFalse() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(true);
        when(predicate2.test(sessionID)).thenReturn(false);

        assertFalse(adapter.canLogon(sessionID));
    }

    @Test
    public void testCanLogOnPredicatesReturnFalseIfAllPredicatesReturnFalse() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Predicate<SessionID> predicate = mock(Predicate.class);
        Predicate<SessionID> predicate2 = mock(Predicate.class);

        adapter.addCanLogOnPredicate(predicate);
        adapter.addCanLogOnPredicate(predicate2);

        SessionID sessionID = mock(SessionID.class);
        when(predicate.test(sessionID)).thenReturn(false);
        when(predicate2.test(sessionID)).thenReturn(false);

        assertFalse(adapter.canLogon(sessionID));
    }

    @Test
    public void testOnBeforeSessionResetListenersInvokedInOrder() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);
        Consumer<SessionID> listener2 = mock(Consumer.class);

        adapter.addOnBeforeSessionResetListener(listener);
        adapter.addOnBeforeSessionResetListener(listener2);

        SessionID sessionID = mock(SessionID.class);
        adapter.onBeforeSessionReset(sessionID);

        InOrder inOrder = inOrder(listener, listener2);
        inOrder.verify(listener).accept(sessionID);
        inOrder.verify(listener2).accept(sessionID);
        verifyNoMoreInteractions(listener, listener2);
    }

    @Test
    public void testRemovedOnBeforeSessionResetListenersNotInvoked() {
        ApplicationExtendedFunctionalAdapter adapter = new ApplicationExtendedFunctionalAdapter();
        Consumer<SessionID> listener = mock(Consumer.class);

        adapter.addOnBeforeSessionResetListener(listener);

        SessionID sessionID = mock(SessionID.class);
        adapter.removeBeforeSessionResetListener(listener);
        adapter.onBeforeSessionReset(sessionID);

        verifyZeroInteractions(listener);
    }


}