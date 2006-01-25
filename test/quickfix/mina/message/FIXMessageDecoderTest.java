package quickfix.mina.message;

import junit.framework.TestCase;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.protocol.ProtocolDecoderOutput;
import org.apache.mina.protocol.ProtocolViolationException;
import org.apache.mina.protocol.codec.MessageDecoderResult;

import quickfix.mina.CriticalSessionProtocolException;

public class FIXMessageDecoderTest extends TestCase {
    private FIXMessageDecoder decoder;
    private ByteBuffer buffer;
    private ProtocolDecoderOutputForTest decoderOutput;

    protected void setUp() throws Exception {
        super.setUp();
        decoder = new FIXMessageDecoder();
        buffer = ByteBuffer.allocate(1024);
        decoderOutput = new ProtocolDecoderOutputForTest();
    }

    public void testPartialHeader() throws Exception {
        setUpBuffer("8=FIX.4.2");
        assertEquals("wrong result", MessageDecoderResult.NEED_DATA, decoder
                .decodable(null, buffer));
    }

    private String setUpBuffer(String bufferContents) {
        buffer.put(bufferContents.getBytes());
        buffer.flip();
        return bufferContents;
    }

    public void testSimpleMessage() throws Exception {
        String data = setUpBuffer("8=FIX.4.2\0019=12\00135=X\001108=30\00110=049\001");
        assertMessageFound(data);
    }

    public void testSplitMessage() throws Exception {
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=049\001";
        for (int i = 1; i < data.length(); i++) {
            doSplitMessageTest(i, data);
        }
    }

    private void doSplitMessageTest(int splitOffset, String data) throws ProtocolViolationException {
        String firstChunk = data.substring(0, splitOffset);
        String remaining = data.substring(splitOffset);
        buffer.put(firstChunk.getBytes());
        buffer.flip();
        decoderOutput.message = null;

        if (splitOffset < 12) {
            assertEquals("shouldn't recognize header; offset=" + splitOffset,
                    MessageDecoderResult.NEED_DATA, decoder.decodable(null, buffer));
        } else {

            // Bug #127 - Resolved.
            //Since the message will be recognized after the first 12 bytes then the
            //message can be processed after the first 12 bytes.  This means that if
            //A partial buffer comes in with 12,13,14 bytes (depending on size), extraction 
            //of the message will fail.
            //This type of Exception will only occur during heavy loads of incoming messages,
            //which may cause the buffers to come in as partial messages.
            //
            //The ByteBuffer.hasRemaining() will fail, because the buffer always has remaining
            //if you don't move it's internal positioning.

            assertEquals("should recognize header", MessageDecoderResult.OK, decoder.decodable(
                    null, buffer));
            if (splitOffset < data.length()) {
                assertEquals("shouldn't decode message; offset=" + splitOffset,
                        MessageDecoderResult.NEED_DATA, decoder.decode(null, buffer, decoderOutput));
                assertNull("shouldn't write message; offset=" + splitOffset, decoderOutput.message);

                buffer.compact();
                buffer.put(remaining.getBytes());
                buffer.flip();

                assertMessageFound(data);
            } else {
                assertEquals("should parse message; offset=" + splitOffset,
                        MessageDecoderResult.OK, decoder.decode(null, buffer, decoderOutput));
                assertNotNull("should write message; offset=" + splitOffset, decoderOutput.message);
            }

        }

        buffer.clear();
    }

    public void testGarbageAtStart() throws Exception {
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer("8=!@#$%" + data);
        assertMessageFound(data);
    }

    private void assertMessageFound(String data) throws ProtocolViolationException {
        assertEquals("should recognize message", MessageDecoderResult.OK, decoder.decodable(null,
                buffer));

        assertEquals("wrong decoder result", MessageDecoderResult.OK, decoder.decode(null, buffer,
                decoderOutput));
        assertEquals("incorrect msg framing", data, decoderOutput.message.toString());
    }

    public void testBadLengthTooLong() throws Exception {
        String badMessage = "8=FIX.4.2\0019=15\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer(badMessage + goodMessage + goodMessage);
        assertMessageFound(goodMessage);
    }

    public void testBadLengthTooShort() throws Exception {
        String badMessage = "8=FIX.4.2\0019=10\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer(badMessage + goodMessage);
        assertMessageFound(goodMessage);
    }

    public void testBadLengthOnLogon() throws Exception {
        String badMessage = "8=FIX.4.2\0019=10\00135=A\001108=30\00110=036\001";
        setUpBuffer(badMessage);

        try {
            decoder.decode(null, buffer, decoderOutput);
            fail("no exception");
        } catch (CriticalSessionProtocolException e) {
            // expected
        }
    }

    public void testNPE() throws Exception {
        try {
            decoder.decode(null, null, null);
            fail("no exception");
        } catch (ProtocolViolationException e) {
            // expected
            assertTrue(e.getCause() instanceof NullPointerException);
        }
    }

    public void testBogusMessageLength() throws Exception {
        String badMessage = "8=FIX.4.2\0019=10xyz\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer(badMessage + goodMessage);
        assertMessageFound(goodMessage);
    }

    private class ProtocolDecoderOutputForTest implements ProtocolDecoderOutput {
        public Object message;

        public void write(Object message) {
            this.message = message;
        }

    }
}
