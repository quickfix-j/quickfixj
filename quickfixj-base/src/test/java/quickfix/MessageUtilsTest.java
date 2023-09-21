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

import org.junit.Test;

import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EmailThreadID;
import quickfix.field.EmailType;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.Subject;
import quickfix.field.TargetCompID;
import quickfix.fix40.Logon;
import quickfix.fix50.Email;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MessageUtilsTest {

    @Test
    public void testGetStringField() throws Exception {
        String messageString = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=049\001";
        assertEquals("wrong value", "FIX.4.2", MessageUtils.getStringField(messageString,
                BeginString.FIELD));
        assertEquals("wrong value", "X", MessageUtils.getStringField(messageString, MsgType.FIELD));
        assertNull(messageString, MessageUtils.getStringField(messageString, SenderCompID.FIELD));
    }

    @Test
    public void testSessionIdFromMessage() throws Exception {
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "TW");
        message.getHeader().setString(TargetCompID.FIELD, "ISLD");
        SessionID sessionID = MessageUtils.getSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("TW", sessionID.getSenderCompID());
        assertEquals("ISLD", sessionID.getTargetCompID());
    }

    @Test
    public void testReverseSessionIdFromMessage() throws Exception {
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "TW");
        message.getHeader().setString(TargetCompID.FIELD, "ISLD");
        SessionID sessionID = MessageUtils.getReverseSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("ISLD", sessionID.getSenderCompID());
        assertEquals("TW", sessionID.getTargetCompID());
    }

    @Test
    public void testReverseSessionIdFromMessageWithMissingFields() throws Exception {
        Message message = new Logon();
        SessionID sessionID = MessageUtils.getReverseSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals(sessionID.getSenderCompID(), SessionID.NOT_SET);
        assertEquals(sessionID.getTargetCompID(), SessionID.NOT_SET);
    }

    @Test
    public void testSessionIdFromRawMessage() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";
        SessionID sessionID = MessageUtils.getSessionID(messageString);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("TW", sessionID.getSenderCompID());
        assertEquals("ISLD", sessionID.getTargetCompID());
    }

    @Test
    public void testReverseSessionIdFromRawMessage() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\00150=TWS\001" +
            "142=TWL\00152=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";
        SessionID sessionID = MessageUtils.getReverseSessionID(messageString);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("ISLD", sessionID.getSenderCompID());
        assertEquals("TW", sessionID.getTargetCompID());
        assertEquals("TWS", sessionID.getTargetSubID());
        assertEquals("TWL", sessionID.getTargetLocationID());
    }

    @Test
    public void testMessageType() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";
        assertEquals("A", MessageUtils.getMessageType(messageString));
    }

    @Test
    public void testMessageTypeError() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";
        try {
            MessageUtils.getMessageType(messageString);
            fail("expected exception");
        } catch (InvalidMessage e) {
            // expected
        }
    }

    @Test
    public void testMessageTypeError2() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00135=1";
        try {
            MessageUtils.getMessageType(messageString);
            fail("expected exception");
        } catch (InvalidMessage e) {
            // expected
        }
    }

    @Test
    public void testGetNonexistentStringField() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";
        assertNull(MessageUtils.getStringField(messageString, 35));
    }

    @Test
    public void testGetStringFieldWithBadValue() throws Exception {
        String messageString = "8=FIX.4.0\0019=56\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223";
        assertNull(MessageUtils.getStringField(messageString, 10));
    }

    @Test
    public void testParse() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new quickfix.fix40.MessageFactory());
        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";

        Message message = MessageSessionUtils.parse(mockSession, messageString);

        assertThat(message, notNullValue());
    }

    @Test
    public void testLegacyParse() throws Exception {
        String data = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
            "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\001" +
            "39=0\00111=184271\00138=200\001198=1494E9A0:58BD3F9D\001526=4324\001" +
            "37=B-WOW-1494E9A0:58BD3F9D\00155=WOW\00154=1\001151=200\00114=0\00140=2\001" +
            "44=15\00159=1\0016=0\001453=3\001448=AAA35791\001447=D\001452=3\001448=8\001" +
            "447=D\001452=4\001448=FIX11\001447=D\001452=36\00160=20060320-03:34:29\00110=169\001";

        Message message = MessageUtils.parse(new quickfix.fix40.MessageFactory(), DataDictionaryTest.getDictionary(), data);
        assertThat(message, notNullValue());
    }

    @Test
    public void testParseFixt() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new quickfix.fix40.MessageFactory());

        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX42));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));

        Message message = MessageSessionUtils.parse(mockSession, email.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, instanceOf(quickfix.fix40.Email.class));
    }

    @Test
    public void testParseFixtLogon() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new DefaultMessageFactory());

        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        Message message = MessageSessionUtils.parse(mockSession, logon.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, instanceOf(quickfix.fixt11.Logon.class));
    }

    @Test
    public void testParseFixtLogout() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new DefaultMessageFactory());

        quickfix.fixt11.Logout logout = new quickfix.fixt11.Logout();

        Message message = MessageSessionUtils.parse(mockSession, logout.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, instanceOf(quickfix.fixt11.Logout.class));
    }

    @Test
    public void testParseFix50() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new DefaultMessageFactory());

        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX50));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));

        Message message = MessageSessionUtils.parse(mockSession, email.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, instanceOf(quickfix.fix50.Email.class));
    }

    // QFJ-973
    @Test
    public void testParseMessageWithoutChecksumValidation() throws InvalidMessage {
        Session mockSession = mock(Session.class);
        when(mockSession.isValidateChecksum()).thenReturn(Boolean.FALSE);

        DataDictionary dataDictionary = mock(DataDictionary.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        when(mockDataDictionaryProvider.getSessionDataDictionary(any(String.class))).thenReturn(dataDictionary);
        when(mockSession.getDataDictionaryProvider()).thenReturn(mockDataDictionaryProvider);
        when(mockSession.getMessageFactory()).thenReturn(new quickfix.fix40.MessageFactory());

        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\001" +
                "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=283\001";

        Message message = MessageSessionUtils.parse(mockSession, messageString);

        assertThat(message, notNullValue());
    }

}
