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

import quickfix.field.BeginString;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * NOTE: There are two MessageUtilsTests.
 * One in quickfixj-base, one in quickfixj-core, which each test
 * some functionality. This test excludes some test cases that cannot
 * be tested in this module due to classes that are generated in a 
 * later step, e.g. MessageFactories.
 */
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

}
