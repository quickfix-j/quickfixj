package quickfix.mina.message;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.protocol.ProtocolEncoderOutput;
import org.apache.mina.protocol.ProtocolViolationException;

import quickfix.Message;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;
import quickfix.fix40.Logon;
import junit.framework.TestCase;

public class FIXMessageEncoderTest extends TestCase {
    private final class ProtocolEncoderOutputForTest implements ProtocolEncoderOutput {
        public ByteBuffer buffer;
        
        public void mergeAll() {
        }

        public void write(ByteBuffer buf) {
            buffer = buf;
        }
    }

    public void testEncoding() throws Exception {
        FIXMessageEncoder encoder = new FIXMessageEncoder();
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "TW");
        message.getHeader().setString(TargetCompID.FIELD, "ISLD");
        ProtocolEncoderOutputForTest protocolEncoderOutputForTest = new ProtocolEncoderOutputForTest();
        encoder.encode(null, message, protocolEncoderOutputForTest);
        assertTrue(protocolEncoderOutputForTest.buffer.limit() > 0);
    }

    public void testEncodingBadType() throws Exception {
        FIXMessageEncoder encoder = new FIXMessageEncoder();
        try {
            encoder.encode(null, new Object(), new ProtocolEncoderOutputForTest());
            fail("expected exception");
        } catch (ProtocolViolationException e) {
            // expected
        }
    }

    public void testEncodingString() throws Exception {
        FIXMessageEncoder encoder = new FIXMessageEncoder();
        ProtocolEncoderOutputForTest protocolEncoderOutputForTest = new ProtocolEncoderOutputForTest();
        encoder.encode(null, "abcd", protocolEncoderOutputForTest);
        assertEquals(4, protocolEncoderOutputForTest.buffer.limit());
    }

}
