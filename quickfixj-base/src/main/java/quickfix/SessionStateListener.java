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

    /**
     * Called when connection has been established.
     */
    default void onConnect(SessionID sessionID) {
    }

    /**
     * Called when Exception occurs during connection establishment.
     *
     * @param sessionID affected SessionID
     * @param exception thrown Exception
     */
    default void onConnectException(SessionID sessionID, Exception exception) {
    }

    /**
     * Called when connection has been disconnected.
     */
    default void onDisconnect(SessionID sessionID) {
    }

    /**
     * Called when session has been logged on.
     */
    default void onLogon(SessionID sessionID) {
    }

    /**
     * Called when session has been logged out.
     */
    default void onLogout(SessionID sessionID) {
    }

    /**
     * Called when message store gets reset.
     */
    default void onReset(SessionID sessionID) {
    }

    /**
     * Called when message store gets refreshed on Logon.
     */
    default void onRefresh(SessionID sessionID) {
    }

    /**
     * Called when TestRequest is sent out due to missed Heartbeat.
     */
    default void onMissedHeartBeat(SessionID sessionID) {
    }

    /**
     * Called when Heartbeat timeout has been detected.
     */
    default void onHeartBeatTimeout(SessionID sessionID) {
    }

    /**
     * Called when ResendRequest has been sent out.
     *
     * @param beginSeqNo first seqnum that gets requested
     * @param endSeqNo last seqnum that gets requested
     * @param currentEndSeqNo last seqnum of range that gets requested on
     * chunked ResendRequests
     */
    default void onResendRequestSent(SessionID sessionID, int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
    }

    /**
     * Called when SequenceReset has been received.
     *
     * @param newSeqNo NewSeqNo from SequenceReset
     * @param gapFillFlag GapFillFlag from SequenceReset
     */
    default void onSequenceResetReceived(SessionID sessionID, int newSeqNo, boolean gapFillFlag) {
    }

    /**
     * Called when a received ResendRequest has been satisfied.
     *
     * @param beginSeqNo first seqnum that was requested
     * @param endSeqNo last seqnum that was requested
     */
    default void onResendRequestSatisfied(SessionID sessionID, int beginSeqNo, int endSeqNo) {
    }
}
