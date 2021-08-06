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
import java.util.Collections;
import java.util.List;

public class UnitTestApplication implements ApplicationExtended, SessionStateListener {

    private final Logger log = LoggerFactory.getLogger(UnitTestApplication.class);

    public final List<Message> fromAppMessages = Collections.synchronizedList(new ArrayList<>());
    public final List<Message> toAppMessages = Collections.synchronizedList(new ArrayList<>());
    public final List<Message> fromAdminMessages = Collections.synchronizedList(new ArrayList<>());
    public final List<Message> toAdminMessages = Collections.synchronizedList(new ArrayList<>());
    public final List<SessionID> logonSessions = Collections.synchronizedList(new ArrayList<>());
    public final List<SessionID> logoutSessions = Collections.synchronizedList(new ArrayList<>());
    public final List<SessionID> createSessions = Collections.synchronizedList(new ArrayList<>());
    public int sessionResets = 0;

    @Override
    public boolean canLogon(SessionID sessionID) {
        return true;
    }

    @Override
    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        log.info("from app [{}] {}", sessionId, message);
        fromAppMessages.add(message);
    }

    @Override
    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        log.info("to app [{}] {}", sessionId, message);
        toAppMessages.add(message);
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        log.info("from admin [{}] {}", sessionId, message);
        fromAdminMessages.add(message);
    }

    @Override
    public void toAdmin(Message message, SessionID sessionId) {
        log.info("to admin [{}] {}", sessionId, message);
        toAdminMessages.add(message);
    }

    @Override
    public void onBeforeSessionReset(SessionID sessionId) {
        log.info("onBeforeSessionReset [{}]", sessionId);
    }

    @Override
    public void onLogout(SessionID sessionId) {
        logoutSessions.add(sessionId);
    }

    @Override
    public void onLogon(SessionID sessionId) {
        logonSessions.add(sessionId);
    }

    @Override
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
        if (fromAppMessages.isEmpty()) {
            return null;
        }
        return fromAppMessages.get(fromAppMessages.size() - 1);
    }

    public Message lastFromAdminMessage() {
        if (fromAdminMessages.isEmpty()) {
            return null;
        }
        return fromAdminMessages.get(fromAdminMessages.size() - 1);
    }

    public Message lastToAppMessage() {
        if (toAppMessages.isEmpty()) {
            return null;
        }
        return toAppMessages.get(toAppMessages.size() - 1);
    }

    public Message lastToAdminMessage() {
        if (toAdminMessages.isEmpty()) {
            return null;
        }
        return toAdminMessages.get(toAdminMessages.size() - 1);
    }

    @Override
    public void onReset() {
        sessionResets++;
    }
}
