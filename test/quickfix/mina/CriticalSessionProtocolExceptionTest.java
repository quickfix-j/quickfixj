package quickfix.mina;

import junit.framework.TestCase;

public class CriticalSessionProtocolExceptionTest extends TestCase {
    // For coverage
    
    public void testConstructors() throws Exception {
        new CriticalProtocolCodecException();
        new CriticalProtocolCodecException("");
        new CriticalProtocolCodecException(new Throwable());
        new CriticalProtocolCodecException("", new Throwable());
    }
}
