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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpectDisconnectStep implements TestStep {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private static final Pattern DISCONNECT_PATTERN = Pattern.compile("e(\\d+)*,?DISCONNECT");
    private int clientId = 0;
    private final String command;

    public ExpectDisconnectStep(String data) {
        this.command = data;
    }

    public void run(TestResult result, TestConnection connection) throws Exception {
        Matcher matcher = DISCONNECT_PATTERN.matcher(command);
        if (matcher.lookingAt()) {
            if (matcher.group(1) != null) {
                clientId = Integer.parseInt(matcher.group(1));
            } else {
                clientId = 1;
            }
        } else {
            Assert.fail("incorrect disconnect command: " + command);
        }
        log.debug("expecting disconnect from client " + clientId);
        connection.waitForClientDisconnect(clientId);
    }

    public String toString() {
        return "disconnect from server: " + command;
    }

}
