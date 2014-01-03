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

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;

import java.io.InvalidObjectException;

import org.junit.Before;
import org.junit.Test;

import quickfix.MessageCracker.RedundantHandlerException;
import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;

public class MessageCrackerTest {
    private int messageCracked;
    private Session mockSession;

    @Before
    public void setUp() throws Exception {
        mockSession = mock(Session.class);
        stub(mockSession.getTargetDefaultApplicationVersionID()).toReturn(
                new ApplVerID(ApplVerID.FIX50SP2));
    }

    @Test(expected=UnsupportedMessageType.class)
    public void testInvokerException1() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) throws UnsupportedMessageType {
                throw new UnsupportedMessageType();
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
    }

    @Test(expected=FieldNotFound.class)
    public void testInvokerException2() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) throws FieldNotFound {
                throw new FieldNotFound(10);
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
    }

    @Test(expected=IncorrectTagValue.class)
    public void testInvokerException3() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) throws IncorrectTagValue {
                throw new IncorrectTagValue("test");
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
    }

    @Test(expected=RuntimeException.class)
    public void testInvokerException4() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) throws InvalidObjectException {
                throw new InvalidObjectException("test");
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
    }

    @Test
    public void testAnnotationBasedCracking() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) {
                messageCracked++;
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));

        assertTrue(messageCracked > 0);
    }

    @Test(expected = RedundantHandlerException.class)
    public void testDuplicateCracks() throws Exception {
        try {
            @SuppressWarnings("unused")
        MessageCracker cracker = new MessageCracker() {
            @SuppressWarnings("unused")
            public void onMessage(quickfix.fixt11.Logon logon, SessionID sessionID) {
                messageCracked++;
            }

            @Handler
            public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) {
                messageCracked++;
            }
        };
        } catch (Exception e) {
            // toString smoke test
            assertThat(e.toString(), notNullValue());
            throw e;
        }
    }

    @Test()
    public void testFallback() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @Override
            protected void onMessage(Message message, SessionID sessionID) throws FieldNotFound,
                    UnsupportedMessageType, IncorrectTagValue {
                messageCracked++;
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
        
        assertTrue(messageCracked > 0);
    }

    @Test(expected=UnsupportedMessageType.class)
    public void testFallbackWithNoOverrid() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker();

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
     }

    @Test()
    public void testExternalDelegation() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker(new MessageHandler());

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));
        
        assertTrue(messageCracked > 0);
    }

    //
    // Legacy Tests
    //
    
    @Test
    public void testFixT11AppMessageCracking() throws Exception {
        quickfix.fix50.Email message = new quickfix.fix50.Email();
        message.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIXT11);
        message.getHeader().setString(SenderCompID.FIELD, "SENDER");
        message.getHeader().setString(TargetCompID.FIELD, "TARGET");
        message.getHeader().setString(ApplVerID.FIELD, ApplVerID.FIX50SP2);

        MessageCracker cracker = new MessageCracker() {
            @SuppressWarnings("unused")
            public void onMessage(quickfix.fix50.Email email, SessionID sessionID) {
                messageCracked++;
            }
        };

        cracker.crack(message, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));

        assertTrue(messageCracked > 0);
    }

    @Test
    public void testFixtMessageCrackingWithNonFix50ApplVerID() throws Exception {
        quickfix.fix44.Email message = createFix44Email();
        message.getHeader().setString(ApplVerID.FIELD, ApplVerID.FIX44);

        MessageCracker cracker = new MessageCracker() {
            @SuppressWarnings("unused")
            public void onMessage(quickfix.fix44.Email email, SessionID sessionID) {
                messageCracked++;
            }
        };

        cracker.crack(message, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));

        assertTrue(messageCracked > 0);
    }

    @Test
    public void testFixtMessageCrackingWithSessionDefaultApplVerID() throws Exception {
        quickfix.fix44.Email message = createFix44Email();
        stub(mockSession.getTargetDefaultApplicationVersionID()).toReturn(
                new ApplVerID(ApplVerID.FIX44));

        MessageCracker cracker = new MessageCracker() {
            @SuppressWarnings("unused")
            public void onMessage(quickfix.fix44.Email email, SessionID sessionID) {
                messageCracked++;
            }
        };

        cracker.crack(message, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));

        assertTrue(messageCracked > 0);
    }

    @Test
    public void testFixtAdminMessageCracking() throws Exception {
        quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(
                EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        MessageCracker cracker = new MessageCracker() {
            @SuppressWarnings("unused")
            public void onMessage(quickfix.fixt11.Logon logon, SessionID sessionID) {
                messageCracked++;
            }
        };

        cracker.crack(logon, new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET"));

        assertTrue(messageCracked > 0);
    }

    private class MessageHandler {
        @MessageCracker.Handler
        public void handle(quickfix.fixt11.Logon logon, SessionID sessionID) {
            messageCracked++;
        }       
    }

    private quickfix.fix44.Email createFix44Email() {
        quickfix.fix44.Email message = new quickfix.fix44.Email();
        message.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIXT11);
        message.getHeader().setString(SenderCompID.FIELD, "SENDER");
        message.getHeader().setString(TargetCompID.FIELD, "TARGET");
        return message;
    }
}
