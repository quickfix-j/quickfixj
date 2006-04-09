package quickfix.mina.message;

import junit.framework.TestCase;

public class FIXProtocolCodecFactoryTest extends TestCase {
    public void testFactory() throws Exception {
        // Unfortunately, there's not a lot of testing that can be done here
        FIXProtocolCodecFactory factory = new FIXProtocolCodecFactory();
        assertNotNull(factory);
        assertNotNull(factory.getDecoder());
        assertNotNull(factory.getEncoder());
    }
}
