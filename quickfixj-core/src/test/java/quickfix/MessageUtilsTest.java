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

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;
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

public class MessageUtilsTest extends TestCase {
    
    public void testGetStringField() throws Exception {
        String messageString = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=049\001";
        assertEquals("wrong value", "FIX.4.2", MessageUtils.getStringField(messageString,
                BeginString.FIELD));
        assertEquals("wrong value", "X", MessageUtils.getStringField(messageString, MsgType.FIELD));
        assertNull(messageString, MessageUtils.getStringField(messageString, SenderCompID.FIELD));
    }

    public void testSessionIdFromMessage() throws Exception {
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "TW");
        message.getHeader().setString(TargetCompID.FIELD, "ISLD");
        SessionID sessionID = MessageUtils.getSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("TW", sessionID.getSenderCompID());
        assertEquals("ISLD", sessionID.getTargetCompID());
    }

    public void testReverseSessionIdFromMessage() throws Exception {
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "TW");
        message.getHeader().setString(TargetCompID.FIELD, "ISLD");
        SessionID sessionID = MessageUtils.getReverseSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("ISLD", sessionID.getSenderCompID());
        assertEquals("TW", sessionID.getTargetCompID());
    }
    
    public void testReverseSessionIdFromMessageWithMissingFields() throws Exception {
        Message message = new Logon();
        SessionID sessionID = MessageUtils.getReverseSessionID(message);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals(sessionID.getSenderCompID(), SessionID.NOT_SET);
        assertEquals(sessionID.getTargetCompID(), SessionID.NOT_SET);
    }

    public void testSessionIdFromRawMessage() throws Exception {
        String messageString = "8=FIX.4.09=5635=A34=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        SessionID sessionID = MessageUtils.getSessionID(messageString);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("TW", sessionID.getSenderCompID());
        assertEquals("ISLD", sessionID.getTargetCompID());
    }

    public void testReverseSessionIdFromRawMessage() throws Exception {
        String messageString = "8=FIX.4.09=5635=A34=149=TW50=TWS142=TWL52=20060118-16:34:1956=ISLD98=0108=210=223";
        SessionID sessionID = MessageUtils.getReverseSessionID(messageString);
        assertEquals(sessionID.getBeginString(), "FIX.4.0");
        assertEquals("ISLD", sessionID.getSenderCompID());
        assertEquals("TW", sessionID.getTargetCompID());
        assertEquals("TWS", sessionID.getTargetSubID());
        assertEquals("TWL", sessionID.getTargetLocationID());
    }

    public void testMessageType() throws Exception {
        String messageString = "8=FIX.4.09=5635=A34=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        assertEquals("A", MessageUtils.getMessageType(messageString));
    }

    public void testMessageTypeError() throws Exception {
        String messageString = "8=FIX.4.09=5634=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        try {
            MessageUtils.getMessageType(messageString);
            fail("expected exception");
        } catch (InvalidMessage e) {
            // expected
        }
    }

    public void testMessageTypeError2() throws Exception {
        String messageString = "8=FIX.4.09=5635=1";
        try {
            MessageUtils.getMessageType(messageString);
            fail("expected exception");
        } catch (InvalidMessage e) {
            // expected
        }
    }

    public void testGetNonexistentStringField() throws Exception {
        String messageString = "8=FIX.4.09=5634=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        assertNull(MessageUtils.getStringField(messageString, 35));
    }

    public void testGetStringFieldWithBadValue() throws Exception {
        String messageString = "8=FIX.4.09=5634=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        assertNull(MessageUtils.getStringField(messageString, 10));
    }

    public void testParse() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new quickfix.fix40.MessageFactory());
        String messageString = "8=FIX.4.09=5635=A34=149=TW52=20060118-16:34:1956=ISLD98=0108=210=223";
        
        Message message = MessageUtils.parse(mockSession, messageString);
        
        assertThat(message, is(notNullValue()));
    }

    public void testLegacyParse() throws Exception {
        String data = "8=FIX.4.49=30935=849=ASX56=CL1_FIX4434=452=20060324-01:05:58"
            + "17=X-B-WOW-1494E9A0:58BD3F9D-1109150=D39=011=18427138=200198=1494E9A0:58BD3F9D"
            + "526=432437=B-WOW-1494E9A0:58BD3F9D55=WOW54=1151=20014=040=244=1559=16=0"
            + "453=3448=AAA35791447=D452=3448=8447=D452=4448=FIX11447=D452=36"
            + "60=20060320-03:34:2910=169";
        
        Message message = MessageUtils.parse(new quickfix.fix40.MessageFactory(), DataDictionaryTest.getDictionary(), data);
        assertThat(message, is(notNullValue()));
    }

    public void testParseFixt() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new quickfix.fix40.MessageFactory());
        
        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX42));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));
        
        Message message = MessageUtils.parse(mockSession, email.toString());
        
        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fix40.Email.class));
    }

    public void testParseFixtLogon() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new DefaultMessageFactory());
        
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));
        
        Message message = MessageUtils.parse(mockSession, logon.toString());
        
        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fixt11.Logon.class));
    }
    
    public void testParseFix50() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new DefaultMessageFactory());
        
        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX50));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));
        
        Message message = MessageUtils.parse(mockSession, email.toString());
        
        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fix50.Email.class));
    }
}
