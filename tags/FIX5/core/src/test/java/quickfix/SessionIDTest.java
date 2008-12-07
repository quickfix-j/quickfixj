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

import junit.framework.TestCase;
import quickfix.field.BeginString;
import quickfix.field.SenderCompID;
import quickfix.field.SenderLocationID;
import quickfix.field.SenderSubID;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;

public class SessionIDTest extends TestCase {
    public void testAllFieldConstructor() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new SenderSubID("SENDERSUB"), new SenderLocationID("SENDERLOC"), new TargetCompID(
                        "TARGET"), new TargetSubID("TARGETSUB"), new TargetLocationID("TARGETLOC"),
                "QUALIFIER");
        assertAllFields(sessionID);
    }

    public void testAllStringConstructor() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "SENDERSUB", "SENDERLOC",
                "TARGET", "TARGETSUB", "TARGETLOC", "QUALIFIER");
        assertAllFields(sessionID);
    }

    private void assertAllFields(SessionID sessionID) {
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("SENDERSUB", sessionID.getSenderSubID());
        assertEquals("SENDERLOC", sessionID.getSenderLocationID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("TARGETSUB", sessionID.getTargetSubID());
        assertEquals("TARGETLOC", sessionID.getTargetLocationID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
    }

    public void testFieldConstructorNoLocation() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new SenderSubID("SENDERSUB"), new TargetCompID("TARGET"), new TargetSubID(
                        "TARGETSUB"));
        assertFieldsNoLocation(sessionID);
    }

    public void testStringConstructorNoLocation() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "SENDERSUB", "TARGET", "TARGETSUB");
        assertFieldsNoLocation(sessionID);
    }

    private void assertFieldsNoLocation(SessionID sessionID) {
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("SENDERSUB", sessionID.getSenderSubID());
        assertEquals("", sessionID.getSenderLocationID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("TARGETSUB", sessionID.getTargetSubID());
        assertEquals("", sessionID.getTargetLocationID());
        assertEquals("", sessionID.getSessionQualifier());
    }

    public void testFieldConstructorNoLocationOrSub() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new TargetCompID("TARGET"), "QUALIFIER");
        assertFieldsNoLocationOrSub(sessionID);
    }

    public void testStringConstructorNoLocationOrSub() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET", "QUALIFIER");
        assertFieldsNoLocationOrSub(sessionID);
    }

    private void assertFieldsNoLocationOrSub(SessionID sessionID) {
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("", sessionID.getSenderSubID());
        assertEquals("", sessionID.getSenderLocationID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getTargetSubID());
        assertEquals("", sessionID.getTargetLocationID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
    }

    public void testFieldConstructorNoLocationSubOrQualifier() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new TargetCompID("TARGET"));
        assertFieldsNoLocationSubOrQualifier(sessionID);
    }

    public void testStringConstructorNoLocationSubOrQualifier() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        assertFieldsNoLocationSubOrQualifier(sessionID);
    }

    private void assertFieldsNoLocationSubOrQualifier(SessionID sessionID) {
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("", sessionID.getSenderSubID());
        assertEquals("", sessionID.getSenderLocationID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getTargetSubID());
        assertEquals("", sessionID.getTargetLocationID());
        assertEquals("", sessionID.getSessionQualifier());
    }

    public void testDefaultConstructorException() throws Exception {
        try {
            new SessionID();
            fail("No exception");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    public void testEquals() throws Exception {
        SessionID sessionID1 = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        SessionID sessionID2 = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        SessionID sessionID3 = new SessionID("FIX.4.2:SENDER2->TARGET2:QUALIFIER");
        assertEquals(sessionID1, sessionID2);
        assertFalse(sessionID1.equals(sessionID3));
        assertFalse(sessionID2.equals(sessionID3));
        assertFalse(sessionID1.equals(null));
    }

    public void testHashCode() throws Exception {
        SessionID sessionID1 = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        SessionID sessionID2 = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        assertEquals(sessionID1.hashCode(), sessionID2.hashCode());
    }

    public void testNullInFieldConstructor() {
        SessionID sessionID = new SessionID((BeginString) null, null, null, null, null, null, null,
                null);
        assertEmptyStrings(sessionID);

    }

    public void testNullInStringConstructor() {
        SessionID sessionID = new SessionID((String) null, null, null, null, null, null, null, null);
        assertEmptyStrings(sessionID);

    }

    private void assertEmptyStrings(SessionID sessionID) {
        assertEquals("", sessionID.getBeginString());
        assertEquals("", sessionID.getSenderCompID());
        assertEquals("", sessionID.getSenderSubID());
        assertEquals("", sessionID.getSenderLocationID());
        assertEquals("", sessionID.getTargetCompID());
        assertEquals("", sessionID.getTargetSubID());
        assertEquals("", sessionID.getTargetLocationID());
        assertEquals("", sessionID.getSessionQualifier());
    }

    public void testStringConstructor() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2:SENDER/SSUB/SLOC->TARGET/TSUB/TLOC:QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("SSUB", sessionID.getSenderSubID());
        assertEquals("SLOC", sessionID.getSenderLocationID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("TSUB", sessionID.getTargetSubID());
        assertEquals("TLOC", sessionID.getTargetLocationID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER/SSUB/SLOC->TARGET/TSUB/TLOC:QUALIFIER", sessionID.toString());
    }

    public void testStringConstructorNoSubOrLocation() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER->TARGET:QUALIFIER", sessionID.toString());
    }

    public void testStringConstructorNoSubLocationOrQualifier() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2:SENDER->TARGET");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER->TARGET", sessionID.toString());
    }

    public void testStringConstructorInvalidID() throws Exception {
        try {
            new SessionID("FIX.4.2:SENDER");
            fail("No exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public void testFromStringUnsupported() {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        try {
            sessionID.fromString("FIX.4.2:SENDER->TARGET:QUALIFIER");
            fail("No exception");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    //    public void testFromString() throws Exception {
    //        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
    //        sessionID.fromString("FIX.4.2:SENDER->TARGET:QUALIFIER");
    //        assertEquals("FIX.4.2", sessionID.getBeginString());
    //        assertEquals("SENDER", sessionID.getSenderCompID());
    //        assertEquals("TARGET", sessionID.getTargetCompID());
    //        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
    //        assertEquals("FIX.4.2:SENDER->TARGET:QUALIFIER", sessionID.toString());
    //    }
    //
    //    public void testFromStringNoQualifier() throws Exception {
    //        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
    //        sessionID.fromString("FIX.4.2:SENDER->TARGET");
    //        assertEquals("FIX.4.2", sessionID.getBeginString());
    //        assertEquals("SENDER", sessionID.getSenderCompID());
    //        assertEquals("TARGET", sessionID.getTargetCompID());
    //        assertEquals("", sessionID.getSessionQualifier());
    //        assertEquals("FIX.4.2:SENDER->TARGET", sessionID.toString());
    //    }
    //
    //    public void testFromStringError1() throws Exception {
    //        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
    //        try {
    //            sessionID.fromString("FIX.4.2@SENDER->TARGET");
    //            fail("no exception");
    //        } catch (RuntimeError e) {
    //            // expected
    //        }
    //    }
    //
    //    public void testFromStringError2() throws Exception {
    //        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
    //        try {
    //            sessionID.fromString("FIX.4.2:SENDER=>TARGET");
    //            fail("no exception");
    //        } catch (RuntimeError e) {
    //            // expected
    //        }
    //    }
    //
    //    public void testFromStringError3() throws Exception {
    //        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
    //        sessionID.fromString("FIX.4.2:SENDER->TARGET:");
    //        assertEquals("FIX.4.2", sessionID.getBeginString());
    //        assertEquals("SENDER", sessionID.getSenderCompID());
    //        assertEquals("TARGET", sessionID.getTargetCompID());
    //        assertEquals("", sessionID.getSessionQualifier());
    //    }
}
