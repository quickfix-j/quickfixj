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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class UnitTestApplication implements ApplicationExtended, SessionStateListener {
    private final Logger log = LoggerFactory.getLogger(UnitTestApplication.class);

    public final List<Message> fromAppMessages = new ArrayList<>();
    public final List<Message> toAppMessages = new ArrayList<>();
    public final List<Message> fromAdminMessages = new ArrayList<>();
    public final List<Message> toAdminMessages = new ArrayList<>();
    public final List<SessionID> logonSessions = new ArrayList<>();
    public final List<SessionID> logoutSessions = new ArrayList<>();
    public final List<SessionID> createSessions = new ArrayList<>();
    public int sessionResets = 0;

    public boolean canLogon(SessionID sessionID) {
        return true;
    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        log.info("from app [{}] {}", sessionId, message);
        fromAppMessages.add(message);
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        log.info("to app [{}] {}", sessionId, message);
        toAppMessages.add(message);
    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        log.info("from admin [{}] {}", sessionId, message);
        fromAdminMessages.add(message);
    }

    public void toAdmin(Message message, SessionID sessionId) {
        log.info("to admin [{}] {}", sessionId, message);
        toAdminMessages.add(message);
    }

    public void onBeforeSessionReset(SessionID sessionId) {
        log.info("onBeforeSessionReset [{}]", sessionId);
    }

    public void onLogout(SessionID sessionId) {
        logoutSessions.add(sessionId);
    }

    public void onLogon(SessionID sessionId) {
        logonSessions.add(sessionId);
    }

    public void onCreate(SessionID sessionId) {
        createSessions.add(sessionId);
    }

    public void clear() {
        fromAppMessages.clear();
        toAppMessages.clear();
        fromAdminMessages.clear();
        toAdminMessages.clear();
        logonSessions.clear();
        logoutSessions.clear();
        createSessions.clear();
    }

    public Message lastFromAppMessage() {
        if (fromAppMessages.isEmpty())
            return null;
        return fromAppMessages.get(fromAppMessages.size() - 1);
    }

    public Message lastFromAdminMessage() {
        if (fromAdminMessages.isEmpty())
            return null;
        return fromAdminMessages.get(fromAdminMessages.size() - 1);
    }

    public Message lastToAppMessage() {
        if (toAppMessages.isEmpty())
            return null;
        return toAppMessages.get(toAppMessages.size() - 1);
    }

    public Message lastToAdminMessage() {
        if (toAdminMessages.isEmpty())
            return null;
        return toAdminMessages.get(toAdminMessages.size() - 1);
    }

    public void onConnect() {
    }

    public void onDisconnect() {
    }

    public void onLogon() {
    }

    public void onLogout() {
    }

    public void onReset() {
        sessionResets++;
    }

    public void onRefresh() {
    }

    public void onMissedHeartBeat() {
    }

    public void onHeartBeatTimeout() {
    }

    public void onResendRequestSent(int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
    }

    public void onSequenceResetReceived(int newSeqNo, boolean gapFillFlag) {
    }

    public void onResendRequestSatisfied(int beginSeqNo, int endSeqNo) {
    }
}
