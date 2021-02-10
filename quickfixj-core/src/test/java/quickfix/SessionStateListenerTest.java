package quickfix;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class SessionStateListenerTest {

	private DefaultSessionStateListener spySessionStateListener;

	@Before
	public void setUp() throws Exception {
		DefaultSessionStateListener sessionStateListener = new DefaultSessionStateListener();
		spySessionStateListener = Mockito.spy(sessionStateListener);
	}

	@Test
	public void testOnConnect() {
		// Given

		// When
		spySessionStateListener.onConnect();

		// Then
		verify(spySessionStateListener).onConnect(any());
	}

	@Test
	public void testOnDisconnect() {
		// Given

		// When
		spySessionStateListener.onDisconnect();

		// Then
		verify(spySessionStateListener).onDisconnect(null);
	}

	@Test
	public void testOnLogon() {
		// Given

		// When
		spySessionStateListener.onLogon();

		// Then
		verify(spySessionStateListener).onLogon(null);
	}

	@Test
	public void testOnLogout() {
		// Given

		// When
		spySessionStateListener.onLogout();

		// Then
		verify(spySessionStateListener).onLogout(null);
	}

	@Test
	public void testOnReset() {
		// Given

		// When
		spySessionStateListener.onReset();

		// Then
		verify(spySessionStateListener).onReset(null);
	}

	@Test
	public void testOnRefresh() {
		// Given

		// When
		spySessionStateListener.onRefresh();

		// Then
		verify(spySessionStateListener).onRefresh(null);
	}

	@Test
	public void testOnMissedHeartBeat() {
		// Given

		// When
		spySessionStateListener.onMissedHeartBeat();

		// Then
		verify(spySessionStateListener).onMissedHeartBeat(null);
	}

	@Test
	public void testOnHeartBeatTimeout() {
		// Given

		// When
		spySessionStateListener.onHeartBeatTimeout();

		// Then
		verify(spySessionStateListener).onHeartBeatTimeout(null);
	}

	@Test
	public void testOnResendRequestSent() {
		// Given
		int beginSeqNo = 1;
		int endSeqNo = 10;
		int currentEndSeqNo = 5;

		// When
		spySessionStateListener.onResendRequestSent(beginSeqNo, endSeqNo, currentEndSeqNo);

		// Then
		verify(spySessionStateListener).onResendRequestSent(eq(null), eq(beginSeqNo), eq(endSeqNo), eq(currentEndSeqNo));
	}

	@Test
	public void testOnSequenceResetReceived() {
		// Given
		int newSeqNo = 20;
		boolean gapFillFlag = true;

		// When
		spySessionStateListener.onSequenceResetReceived(newSeqNo, gapFillFlag);

		// Then
		verify(spySessionStateListener).onSequenceResetReceived(eq(null), eq(newSeqNo), eq(gapFillFlag));
	}

	@Test
	public void testOnResendRequestSatisfied() {
		// Given
		int beginSeqNo = 1;
		int endSeqNo = 10;

		// When
		spySessionStateListener.onResendRequestSatisfied(beginSeqNo, endSeqNo);

		// Then
		verify(spySessionStateListener).onResendRequestSatisfied(eq(null), eq(beginSeqNo), eq(endSeqNo));
	}

	static class DefaultSessionStateListener implements SessionStateListener {

		@Override
		public void onConnect(SessionID sessionID) {

		}

		@Override
		public void onDisconnect(SessionID sessionID) {

		}

		@Override
		public void onLogon(SessionID sessionID) {

		}

		@Override
		public void onLogout(SessionID sessionID) {

		}

		@Override
		public void onReset(SessionID sessionID) {

		}

		@Override
		public void onRefresh(SessionID sessionID) {

		}

		@Override
		public void onMissedHeartBeat(SessionID sessionID) {

		}

		@Override
		public void onHeartBeatTimeout(SessionID sessionID) {

		}

		@Override
		public void onResendRequestSent(SessionID sessionID, int beginSeqNo, int endSeqNo, int currentEndSeqNo) {

		}

		@Override
		public void onSequenceResetReceived(SessionID sessionID, int newSeqNo, boolean gapFillFlag) {

		}

		@Override
		public void onResendRequestSatisfied(SessionID sessionID, int beginSeqNo, int endSeqNo) {

		}
	}
}
