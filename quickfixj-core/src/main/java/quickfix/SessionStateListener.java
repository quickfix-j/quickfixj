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
    default void onConnect() {
    }

    /**
     * Called when Exception occurs during connection establishment.
     *
     * @param exception thrown Exception
     */
    default void onConnectException(Exception exception) {
    }

    /**
     * Called when connection has been disconnected.
     */
    default void onDisconnect() {
    }

    /**
     * Called when session has been logged on.
     */
    default void onLogon() {
    }

    /**
     * Called when session has been logged out.
     */
    default void onLogout() {
    }

    /**
     * Called when message store gets reset.
     */
    default void onReset() {
    }

    /**
     * Called when message store gets refreshed on Logon.
     */
    default void onRefresh() {
    }

    /**
     * Called when TestRequest is sent out due to missed Heartbeat.
     */
    default void onMissedHeartBeat() {
    }

    /**
     * Called when Heartbeat timeout has been detected.
     */
    default void onHeartBeatTimeout() {
    }

    /**
     * Called when ResendRequest has been sent out.
     *
     * @param beginSeqNo first seqnum that gets requested
     * @param endSeqNo last seqnum that gets requested
     * @param currentEndSeqNo last seqnum of range that gets requested on
     * chunked ResendRequests
     */
    default void onResendRequestSent(int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
    }

    /**
     * Called when SequenceReset has been received.
     *
     * @param newSeqNo NewSeqNo from SequenceReset
     * @param gapFillFlag GapFillFlag from SequenceReset
     */
    default void onSequenceResetReceived(int newSeqNo, boolean gapFillFlag) {
    }

    /**
     * Called when a received ResendRequest has been satisfied.
     *
     * @param beginSeqNo first seqnum that was requested
     * @param endSeqNo last seqnum that was requested
     */
    default void onResendRequestSatisfied(int beginSeqNo, int endSeqNo) {
    }

}
