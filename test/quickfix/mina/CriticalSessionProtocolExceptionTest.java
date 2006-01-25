package quickfix.mina;

import junit.framework.TestCase;

public class CriticalSessionProtocolExceptionTest extends TestCase {
    // For coverage
    
    public void testConstructors() throws Exception {
        new CriticalSessionProtocolException();
        new CriticalSessionProtocolException("");
        new CriticalSessionProtocolException(new Throwable());
        new CriticalSessionProtocolException("", new Throwable());
    }
}
