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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;
import quickfix.test.acceptance.ATApplication;

public class DefaultSessionFactoryTest extends TestCase {

    private SessionID sessionID;
    private SessionSettings settings;
    private SessionFactory factory;

    protected void setUp() throws Exception {
        super.setUp();
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "FOO", "BAR");
        setUpDefaultSettings();
        factory = new DefaultSessionFactory(new ATApplication(), new MemoryStoreFactory(),
                new ScreenLogFactory(true, true, true));
    }

    public void testMinimalSettings() throws Exception {
        factory.create(sessionID, settings);
    }

    public void testNoConnectionType() throws Exception {
        settings.removeSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no connection type exception", "Missing ConnectionType");
    }

    public void testWrongConnectionType() throws Exception {
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE, "fargle");
        createSessionAndAssertConfigError("no connection type exception", "Invalid ConnectionType");
    }

    public void testUseDataDictionaryByDefault() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "BOGUS");
        createSessionAndAssertDictionaryNotFound();
    }

    private void createSessionAndAssertDictionaryNotFound() throws ConfigError {
        try {
            factory.create(sessionID, settings);
            fail("no data dictionary exception");
        } catch (DataDictionary.Exception e) {
            assertTrue("exception message not matched, expected: " + "... Could not find data ..."
                    + ", got: " + e.getMessage(),
                    e.getMessage().indexOf("Could not find data") != -1);
        }
    }

    public void testBadPathForDataDictionary() throws Exception {
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "xyz");
        createSessionAndAssertDictionaryNotFound();
    }


    public void testInitiatorWithoutHeartbeat() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_HEARTBTINT);
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no exception", "HeartBtInt not defined");
    }

    public void testIncorrectTimeValues() throws Exception {
        settings.setString(sessionID, Session.SETTING_START_TIME, "00:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_TIME, "xx");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse start time 'xx'.");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_TIME, "yy");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse end time 'yy'.");
    }

    private void createSessionAndAssertConfigError(String message, String pattern) {
        try {
            factory.create(sessionID, settings);
            fail(message);
        } catch (ConfigError e) {
            if (pattern != null) {
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(e.getMessage());
                assertTrue("exception message not matched, expected: " + pattern + ", got: "
                        + e.getMessage(), m.matches());
            }
        }
    }

    private void setUpDefaultSettings() {
        settings = new SessionSettings();
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, false);
        settings.setString(sessionID, Session.SETTING_START_TIME, "09:00:00");
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        settings.setString(sessionID, Session.SETTING_HEARTBTINT, "10");
        settings.setString(sessionID, "BeginString", "FIX.4.2");
    }
}