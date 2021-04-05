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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.field.ApplVerID;
import quickfix.test.acceptance.ATApplication;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DefaultSessionFactoryTest {

    private SessionID sessionID;
    private SessionSettings settings;
    private SessionFactory factory;

    @Before
    public void setUp() throws Exception {
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER", "TARGET");
        setUpDefaultSettings(sessionID);
        factory = new DefaultSessionFactory(new ATApplication(), new MemoryStoreFactory(),
                new SLF4JLogFactory(new SessionSettings()));
    }

    @After
    public void tearDown() {
        Session.unregisterSession(sessionID, true);
    }

    @Test
    public void testMinimalSettings() throws Exception {
        factory.create(sessionID, settings);
    }

    @Test
    public void testFixTMinimalSettings() throws Exception {
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET");
        setUpDefaultSettings(sessionID);
        factory = new DefaultSessionFactory(new ATApplication(), new MemoryStoreFactory(),
                new SLF4JLogFactory(new SessionSettings()));
        Exception e = null;
        try {
            factory.create(sessionID, settings);
        } catch (Exception ex) {
            e = ex;
        }
        assertNotNull(e);

        settings.setString(sessionID, Session.SETTING_DEFAULT_APPL_VER_ID, "5");
        e = null;
        try {
            Session sess = factory.create(sessionID, settings);
            assertNotNull(sess);
            assertEquals(new ApplVerID("5"), sess.getSenderDefaultApplicationVersionID());
        } catch (Exception ex) {
            e = ex;
        }
        assertNull(e);
    }

    @Test
    public void testFixtDataDictionaryConfiguration() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET");
        setUpDefaultSettings(sessionID);
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);
        settings.setString(sessionID, Session.SETTING_TRANSPORT_DATA_DICTIONARY, "FIXT11.xml");
        settings.setString(sessionID, Session.SETTING_DEFAULT_APPL_VER_ID, "FIX.4.2");
        settings.setString(sessionID, Session.SETTING_APP_DATA_DICTIONARY, "FIX42.xml");
        settings.setString(sessionID, Session.SETTING_APP_DATA_DICTIONARY + "." + FixVersions.BEGINSTRING_FIX40, "FIX40.xml");

        try (Session session = factory.create(sessionID, settings)) {

            DataDictionaryProvider provider = session.getDataDictionaryProvider();
            assertThat(provider.getSessionDataDictionary(sessionID.getBeginString()),
                    is(notNullValue()));
            
            assertThat(provider.getApplicationDataDictionary(new ApplVerID(ApplVerID.FIX42)),
                    is(notNullValue()));
            assertThat(provider.getApplicationDataDictionary(new ApplVerID(ApplVerID.FIX40)),
                    is(notNullValue()));
        }
    }

    @Test
    public void testPreFixtDataDictionaryConfiguration() throws Exception {
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);

        try (Session session = factory.create(sessionID, settings)) {

            DataDictionaryProvider provider = session.getDataDictionaryProvider();
            assertThat(provider.getSessionDataDictionary(sessionID.getBeginString()),
                    is(notNullValue()));
            assertThat(provider.getApplicationDataDictionary(new ApplVerID(ApplVerID.FIX42)),
                    is(notNullValue()));
        }
    }

    @Test
    public void testNoConnectionType() throws Exception {
        settings.removeSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no connection type exception", "Missing ConnectionType");
    }

    @Test
    public void testWrongConnectionType() throws Exception {
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE, "fargle");
        createSessionAndAssertConfigError("no connection type exception", "Invalid ConnectionType");
    }

    @Test
    public void testUseDataDictionaryByDefault() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "BOGUS");
        createSessionAndAssertDictionaryNotFound();
    }

    private void createSessionAndAssertDictionaryNotFound() {
        try {
            factory.create(sessionID, settings);
            fail("no data dictionary exception");
        } catch (ConfigError e) {
            assertTrue("exception message not matched, expected: " + "... Could not find data ..."
                    + ", got: " + e.getMessage(),
                    e.getMessage().contains("Could not find data"));
        }
    }

    @Test
    public void testBadPathForDataDictionary() throws Exception {
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "xyz");
        createSessionAndAssertDictionaryNotFound();
    }

    @Test
    public void testInitiatorWithoutHeartbeat() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_HEARTBTINT);
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no exception", "HeartBtInt not defined");
    }

    @Test
    public void testIncorrectTimeValues() throws Exception {
        settings.setString(sessionID, Session.SETTING_START_TIME, "00:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings(sessionID);
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings(sessionID);
        settings.setString(sessionID, Session.SETTING_START_TIME, "xx");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:SENDER->TARGET: could not parse time 'xx'.");

        setUpDefaultSettings(sessionID);
        settings.setString(sessionID, Session.SETTING_END_TIME, "yy");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:SENDER->TARGET: could not parse time 'yy'.");
    }

    @Test
    public void testTestRequestDelayMultiplier() throws Exception {
        settings.setString(sessionID, Session.SETTING_TEST_REQUEST_DELAY_MULTIPLIER, "0.37");
        try (Session session = factory.create(sessionID, settings)) {
            assertEquals(0.37, session.getTestRequestDelayMultiplier(), 0);
        }
    }

    private void createSessionAndAssertConfigError(String message, String pattern) {
        Session session = null;
        try {
            session = factory.create(sessionID, settings);
            fail(message);
        } catch (ConfigError e) {
            if (pattern != null) {
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(e.getMessage());
                assertTrue("exception message not matched, expected: " + pattern + ", got: "
                        + e.getMessage(), m.matches());
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (IOException ex) {
                    // ignore
                }
            }
        }
    }

    private void setUpDefaultSettings(SessionID sessionID) {
        settings = new SessionSettings();
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, false);
        settings.setString(sessionID, Session.SETTING_START_TIME, "09:00:00");
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        settings.setString(sessionID, Session.SETTING_HEARTBTINT, "10");
        settings.setString(sessionID, "BeginString", "FIX.4.2");
    }

    // QFJ-629
    @Test
    public void testReconnectIntervalInDefaultSession() throws Exception {
        settings.setString(sessionID, "ReconnectInterval", "2x5;3x15");
        Session session = factory.create(sessionID, settings);
        session.close();
    }
    
    @Test
    // QFJ-873
    public void testTimestampPrecision() throws Exception {
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "FOO");
        createSessionAndAssertConfigError("no exception", ".*No enum constant quickfix.UtcTimestampPrecision.FOO.*");
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "SECONDS");
        factory.create(sessionID, settings);
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "MILLIS");
        factory.create(sessionID, settings);
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "NANOS");
        factory.create(sessionID, settings);
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "MICROS");
        factory.create(sessionID, settings);
        settings.setString(Session.SETTING_TIMESTAMP_PRECISION, "PICOS");
        createSessionAndAssertConfigError("no exception", ".*No enum constant quickfix.UtcTimestampPrecision.PICOS.*");
    }

    // QFJ-973
    @Test
    public void testRejectGarbledMessageAndNotValidateChecksumError() {
        settings.setString(Session.SETTING_REJECT_GARBLED_MESSAGE, "Y");
        settings.setString(Session.SETTING_VALIDATE_CHECKSUM, "N");
        createSessionAndAssertConfigError("no exception", ".*Not possible to reject " +
                "garbled message and process messages with invalid checksum at the same time.*");
    }

}
