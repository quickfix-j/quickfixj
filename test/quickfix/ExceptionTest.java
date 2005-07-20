package quickfix;

import junit.framework.TestCase;

public class ExceptionTest extends TestCase {

    public void testDoNotSend() {
        new DoNotSend();
    }
    
    public void testIncorrectDataFormat() {
        IncorrectDataFormat e = new IncorrectDataFormat(5);
        e = new IncorrectDataFormat("test");
        e.field = 5;
    }
    
    public void testIncorrectTagValue() {
        IncorrectTagValue e = new IncorrectTagValue(5);
        e = new IncorrectTagValue("test");
        e.field = 5;
    }

    public void testRejectLogon() {
        new RejectLogon();
    }

    public void testRuntimeError() {
        new RuntimeError();
        new RuntimeError("test");
        new RuntimeError(new Exception());
    }
    
    
    public void testSessionNotFound() {
        new SessionNotFound();
        new SessionNotFound("test");
    }
    
    public void testSessionException() {
        new SessionException();
        new SessionException("test");
        new SessionException(new Exception());
    }
}
