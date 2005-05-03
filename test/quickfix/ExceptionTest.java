package quickfix;

import junit.framework.TestCase;

public class ExceptionTest extends TestCase {

    public void testDoNotSend() {
        DoNotSend e = new DoNotSend();
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
        RejectLogon e = new RejectLogon();
    }

    public void testRuntimeError() {
        RuntimeError e = new RuntimeError();
        e = new RuntimeError("test");
        e = new RuntimeError(new Exception());
    }
    
    
    public void testSessionNotFound() {
        SessionNotFound e = new SessionNotFound();
        e = new SessionNotFound("test");
    }
    
    public void testSessionException() {
        SessionException e = new SessionException();
        e = new SessionException("test");
        e = new SessionException(new Exception());
    }
}
