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
import quickfix.field.TargetCompID;

public class SessionIDTest extends TestCase {
    public void testFromFields() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new TargetCompID("TARGET"), "QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
    }

    public void testFromFieldsWithoutQualifier() throws Exception {
        SessionID sessionID = new SessionID(new BeginString("FIX.4.2"), new SenderCompID("SENDER"),
                new TargetCompID("TARGET"));
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
    }

    public void testFromString() throws Exception {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET:QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER->TARGET:QUALIFIER", sessionID.toString());
    }

    public void testStringConstructor() throws Exception {
        SessionID sessionID = new SessionID("FIX.4.2:SENDER->TARGET:QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER->TARGET:QUALIFIER", sessionID.toString());
    }

    public void testFromStringNoQualifier() throws Exception {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
        assertEquals("FIX.4.2:SENDER->TARGET", sessionID.toString());
    }

    public void testFromStringError1() throws Exception {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        try {
            sessionID.fromString("FIX.4.2@SENDER->TARGET");
            fail("no exception");
        } catch (RuntimeError e) {
            // expected
        }
    }

    public void testFromStringError2() throws Exception {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        try {
            sessionID.fromString("FIX.4.2:SENDER=>TARGET");
            fail("no exception");
        } catch (RuntimeError e) {
            // expected
        }
    }

    public void testFromStringError3() throws Exception {
        SessionID sessionID = new SessionID((String) null, (String) null, (String) null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET:");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
    }
}
