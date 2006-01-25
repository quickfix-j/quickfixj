package quickfix.mina;

import junit.framework.TestCase;

import org.apache.mina.protocol.ProtocolHandler;
import org.apache.mina.protocol.ProtocolProvider;

import quickfix.mina.message.FIXProtocolCodecFactory;

public class AbstractProtocolProviderTest extends TestCase {
    public void testProvider() throws Exception {
        ProtocolProvider provider = new AbstractProtocolProvider() {

            public ProtocolHandler getHandler() {
                return null;
            }
            
        };
        assertEquals(FIXProtocolCodecFactory.class, provider.getCodecFactory().getClass());
    }
}
