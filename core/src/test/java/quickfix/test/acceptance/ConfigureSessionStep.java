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

package quickfix.test.acceptance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;
import junit.framework.TestResult;
import quickfix.Session;
import quickfix.SessionID;

public class ConfigureSessionStep implements TestStep {
    public static final Pattern SET_SETTING_PATTERN = Pattern
            .compile("iSET_SESSION (.*) (.*)=(.*)");
    private String command;

    public ConfigureSessionStep(String command) {
        this.command = command;
    }

    public void run(TestResult result, TestConnection connection) {
        Matcher matcher = SET_SETTING_PATTERN.matcher(command);
        if (matcher.matches()) {
            String sessionId = matcher.group(1);
            Session session = Session.lookupSession(new SessionID(sessionId));
            if (session == null) {
                Assert.fail("no session found for: " + sessionId);
            }
            updateSession(session, matcher.group(2), matcher.group(3));
        } else {
            Assert.fail("incorrect connect command: " + command);
        }
    }

    private void updateSession(Session session, String key, String value) {
        try {
            if ("NEXTTARGETSEQNUM".equals(key)) {
                session.setNextTargetMsgSeqNum(Integer.parseInt(value));
            } else if ("NEXTSENDERSEQNUM".equals(key)) {
                session.setNextSenderMsgSeqNum(Integer.parseInt(value));
            } 
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("setting could not be applied : " + command);
        }
    }

    public String toString() {
        return "changing session setting : " + command;
    }
}
