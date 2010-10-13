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

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.FixVersions;
import quickfix.field.converter.UtcTimestampConverter;

public class InitiateMessageStep implements TestStep {

    private Logger log = LoggerFactory.getLogger(getClass());

    private final String data;

    private int clientId = 0;

    // Matches FIX.X.X or FIXT.X.X style begin string
    private static final Pattern MESSAGE_PATTERN = Pattern
              .compile("I(\\d,)*(8=FIXT?\\.\\d\\.\\d\\001)(.*?\\001)(10=.*|)$");

    private static final Pattern TIME_PATTERN = Pattern.compile("<TIME([+-](\\d+))*>");

    private static final Pattern HEARTBEAT_PATTERN = Pattern.compile("108=\\d+\001");

    private static final DecimalFormat CHECKSUM_FORMAT = new DecimalFormat("000");

    private static int heartBeatOverride = -1;

    static {
        String hbi = System.getProperty("atest.heartbeat");
        if (hbi != null) {
            heartBeatOverride = Integer.parseInt(hbi);
        }
    }

    public InitiateMessageStep(String data) {
        this.data = data;
    }

    public void run(TestResult result, TestConnection connection) {
        Matcher messageStructureMatcher = MESSAGE_PATTERN.matcher(data);
        String message;
        if (messageStructureMatcher.matches()) {
            if (messageStructureMatcher.group(1) != null
                    && !messageStructureMatcher.group(1).equals("")) {
                clientId = Integer.parseInt(messageStructureMatcher.group(1).replaceAll(",", ""));
            } else {
                clientId = 1;
            }
            String version = messageStructureMatcher.group(2);
            String messageTail = insertTimes(messageStructureMatcher.group(3));
            messageTail = modifyHeartbeat(messageTail);
            String checksum = messageStructureMatcher.group(4);
            if ("10=0\001".equals(checksum)) {
                checksum = "10=000\001";
            }
            message = version
                    + (!messageTail.startsWith("9=") ? "9=" + messageTail.length() + "\001" : "")
                    + messageTail + checksum;
        } else {
            log.info("garbled message being sent");
            clientId = 1;
            message = data.substring(1);
        }
        if (message.indexOf("\00110=") == -1) {
            message += "10=" + CHECKSUM_FORMAT.format(checksum(message)) + '\001';
        }
        log.debug("sending to client " + clientId + ": " + message);
        try {
            connection.sendMessage(clientId, message);
        } catch (IOException e) {
            AssertionFailedError error = new AssertionFailedError(message);
            error.setStackTrace(e.getStackTrace());
            throw error;
        }
    }

    private String modifyHeartbeat(String messageTail) {
        if (heartBeatOverride > 0 && messageTail.indexOf("35=A\001") != -1) {
            Matcher matcher = HEARTBEAT_PATTERN.matcher(messageTail);
            if (matcher.find()) {
                return matcher.replaceFirst("108=" + heartBeatOverride + "\001");
            }
        }
        return messageTail;
    }

    private String insertTimes(String message) {
        Matcher matcher = TIME_PATTERN.matcher(message);
        while (matcher.find()) {
            long offset = 0;
            if (matcher.group(2) != null) {
                offset = Long.parseLong(matcher.group(2)) * 1100L;
                if (matcher.group(1).startsWith("-")) {
                    offset *= -1;
                }
            }
            String beginString = message.substring(2, 9);
            boolean includeMillis = beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0;
            message = matcher.replaceFirst(UtcTimestampConverter.convert(new Date(System
                    .currentTimeMillis()
                    + offset), includeMillis));
            matcher = TIME_PATTERN.matcher(message);
        }
        return message;
    }

    private int checksum(String message) {
        int sum = 0;
        for (int i = 0; i < message.length(); i++) {
            sum += message.charAt(i);
        }
        return sum % 256;
    }

    public String toString() {
        return "initiate message: " + data;
    }
}