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

package quickfix;

public interface SessionStateListener {

	@Deprecated
	default void onConnect() {
		onConnect(null);
	}

	void onConnect(SessionID sessionID);

	@Deprecated
	default void onDisconnect() {
		onDisconnect(null);
	}

	void onDisconnect(SessionID sessionID);

	@Deprecated
	default void onLogon() {
		onLogon(null);
	}

	void onLogon(SessionID sessionID);

	@Deprecated
	default void onLogout() {
		onLogout(null);
	}

	void onLogout(SessionID sessionID);

	@Deprecated
	default void onReset() {
		onReset(null);
	}

	void onReset(SessionID sessionID);

	@Deprecated
	default void onRefresh() {
		onRefresh(null);
	}

	void onRefresh(SessionID sessionID);

	@Deprecated
	default void onMissedHeartBeat() {
		onMissedHeartBeat(null);
	}

	void onMissedHeartBeat(SessionID sessionID);

	@Deprecated
	default void onHeartBeatTimeout() {
		onHeartBeatTimeout(null);
	}

	void onHeartBeatTimeout(SessionID sessionID);

	@Deprecated
	default void onResendRequestSent(int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
		onResendRequestSent(null, beginSeqNo, endSeqNo, currentEndSeqNo);
	}

	void onResendRequestSent(SessionID sessionID, int beginSeqNo, int endSeqNo, int currentEndSeqNo);

	@Deprecated
	default void onSequenceResetReceived(int newSeqNo, boolean gapFillFlag) {
		onSequenceResetReceived(null, newSeqNo, gapFillFlag);
	}

	void onSequenceResetReceived(SessionID sessionID, int newSeqNo, boolean gapFillFlag);

	@Deprecated
	default void onResendRequestSatisfied(int beginSeqNo, int endSeqNo) {
		onResendRequestSatisfied(null, beginSeqNo, endSeqNo);
	}

    void onResendRequestSatisfied(SessionID sessionID, int beginSeqNo, int endSeqNo);
}
