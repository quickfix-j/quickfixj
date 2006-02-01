package quickfix;

import junit.framework.TestCase;

public class SessionIDTest extends TestCase {
    public void testFromString() throws Exception {
        SessionID sessionID = new SessionID(null, null, null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET:QUALIFIER");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("QUALIFIER", sessionID.getSessionQualifier());
    }

    public void testFromStringNoQualifier() throws Exception {
        SessionID sessionID = new SessionID(null, null, null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
    }

    public void testFromStringError1() throws Exception {
        SessionID sessionID = new SessionID(null, null, null);
        try {
            sessionID.fromString("FIX.4.2@SENDER->TARGET");
            fail("no exception");
        } catch (RuntimeError e) {
            // expected
        }
    }

    public void testFromStringError2() throws Exception {
        SessionID sessionID = new SessionID(null, null, null);
        try {
            sessionID.fromString("FIX.4.2:SENDER=>TARGET");
            fail("no exception");
        } catch (RuntimeError e) {
            // expected
        }
    }

    public void testFromStringError3() throws Exception {
        SessionID sessionID = new SessionID(null, null, null);
        sessionID.fromString("FIX.4.2:SENDER->TARGET:");
        assertEquals("FIX.4.2", sessionID.getBeginString());
        assertEquals("SENDER", sessionID.getSenderCompID());
        assertEquals("TARGET", sessionID.getTargetCompID());
        assertEquals("", sessionID.getSessionQualifier());
    }
}
