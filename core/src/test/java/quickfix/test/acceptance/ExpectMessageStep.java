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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;
import junit.framework.TestResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.test.util.ReflectionUtil;

public class ExpectMessageStep implements TestStep {
    public static long TIMEOUT_IN_MS = 10000;
    private Logger log = LoggerFactory.getLogger(getClass());
    private final String data;
    private final Map<String, String> expectedFields;
    private static final Pattern headerPattern = Pattern.compile("^E(\\d+),.*");
    private static final Pattern fieldPattern = Pattern.compile("(\\d+)=([^\\001]+)\\001");
    private int clientId = 0;
    private static int heartBeatOverride = -1;

    static {
        String hbi = System.getProperty("atest.heartbeat");
        if (hbi != null) {
            heartBeatOverride = Integer.parseInt(hbi);
        }
    }

    public ExpectMessageStep(String data) {
        this.data = data;
        Matcher headerMatcher = headerPattern.matcher(data);
        if (headerMatcher.matches()) {
            clientId = Integer.parseInt(headerMatcher.group(1));
        } else {
            clientId = 1;
        }
        expectedFields = simpleParse(data);
    }

    private Map<String, String> simpleParse(String data) {
        HashMap<String, String> fields = new HashMap<String, String>();
        Matcher fieldMatcher = fieldPattern.matcher(data);
        while (fieldMatcher.find()) {
            fields.put(fieldMatcher.group(1), fieldMatcher.group(2));
        }
        return fields;
    }

    public void run(TestResult result, final TestConnection connection) throws InterruptedException {
        log.debug("expecting from client " + clientId + ": " + data + " " + expectedFields);
        CharSequence message = connection.readMessage(clientId, TIMEOUT_IN_MS);
        if (message == null) {
            ReflectionUtil.dumpStackTraces();
            long[] threadIds = {};
            final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            threadIds = bean.findDeadlockedThreads();

            final List<String> deadlockedThreads = new ArrayList<String>();
            if (threadIds != null) {
                for (long threadId : threadIds) {
                    final ThreadInfo threadInfo = bean.getThreadInfo(threadId);
                    deadlockedThreads.add(threadInfo.getThreadId() + ": " + threadInfo.getThreadName()
                            + " state: " + threadInfo.getThreadState());
                }
            }
            if (!deadlockedThreads.isEmpty()) {
                log.error("Showing deadlocked threads:");
                for (String deadlockedThread : deadlockedThreads) {
                    log.error(deadlockedThread);
                }
            }
            Assert.fail("message timeout: expected=" + expectedFields);
        }
        Map<String, String> actualFields = simpleParse(message.toString());
        log.debug("actual: " + message);
        assertMessageEqual(actualFields);
    }

    private static HashSet<String> timeFields = new HashSet<String>();
    static {
        timeFields.add("52");
        timeFields.add("60");
        timeFields.add("122");
    }

    private void assertMessageEqual(Map<String, String> actualFields) {
        Assert.assertEquals("wrong msg type", expectedFields.get("35"), actualFields.get("35"));
        Iterator<Map.Entry<String, String>> fieldIterator = actualFields.entrySet().iterator();
        while (fieldIterator.hasNext()) {
            Map.Entry<String, String> entry = fieldIterator.next();
            Object key = entry.getKey();
            if (timeFields.contains(key) || key.equals("10") || key.equals("9")) {
                continue;
            }
            if (expectedFields.get("108") != null && heartBeatOverride >= 0) {
                continue;
            }
            if (key.equals("58")) {
                Assert.assertTrue("field " + key + " not equal: actual=" + entry.getValue()
                        + ",expected(prefix)=" + expectedFields.get(key), entry.getValue()
                        .toString().startsWith(expectedFields.get(key)));
            } else if (!expectedFields.containsKey(key)) {
                Assert.fail("Unexpected field " + key + ",value=" + entry.getValue());
            } else {
                Assert.assertEquals("field " + key + " not equal: ", expectedFields.get(key), entry
                        .getValue());
            }
        }
        Iterator<String> expectedKey = expectedFields.keySet().iterator();
        while (expectedKey.hasNext()) {
            String key = expectedKey.next();
            Assert.assertTrue("missing expected field: " + key, actualFields.containsKey(key));
        }
        Iterator<String> timeFieldItr = timeFields.iterator();
        boolean dateLengthMismatch = false;
        while (timeFieldItr.hasNext()) {
            String key = timeFieldItr.next();
            if (expectedFields.containsKey(key)) {
                if (expectedFields.get(key).length() != actualFields.get(key).length()) {
                    dateLengthMismatch = true;
                }
            }
        }
        if (expectedFields.get("9") != null && !dateLengthMismatch && heartBeatOverride < 0) {
            Assert.assertEquals("field 9 not equal: ", expectedFields.get("9"), actualFields
                    .get("9"));
        }
    }

    public String toString() {
        return "expect message: " + data;
    }
}