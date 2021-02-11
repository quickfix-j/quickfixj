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

    default void onConnect(SessionID sessionID) {
    }

    default void onDisconnect(SessionID sessionID) {
    }

    default void onLogon(SessionID sessionID) {
    }

    default void onLogout(SessionID sessionID) {
    }

    default void onReset(SessionID sessionID) {
    }

    default void onRefresh(SessionID sessionID) {
    }

    default void onMissedHeartBeat(SessionID sessionID) {
    }

    default void onHeartBeatTimeout(SessionID sessionID) {
    }

    default void onResendRequestSent(SessionID sessionID, int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
    }

    default void onSequenceResetReceived(SessionID sessionID, int newSeqNo, boolean gapFillFlag) {
    }

    default void onResendRequestSatisfied(SessionID sessionID, int beginSeqNo, int endSeqNo) {
    }
}
