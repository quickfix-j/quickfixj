package quickfix.mina.message;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.TransportType;
import org.apache.mina.protocol.ProtocolDecoder;
import org.apache.mina.protocol.ProtocolDecoderOutput;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;
import org.apache.mina.protocol.codec.DemuxingProtocolCodecFactory;
import org.apache.mina.protocol.codec.MessageDecoderResult;
import org.easymock.MockControl;

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
        //System.out.println("@@@@@ " + splitOffset + " " + firstChunk + "  " + remaining);
        buffer.put(firstChunk.getBytes());
        buffer.flip();
        decoderOutput.reset();

        if (splitOffset < 12) {
            assertEquals("shouldn't recognize header; offset=" + splitOffset,
                    MessageDecoderResult.NEED_DATA, decoder.decodable(null, buffer));
        } else {

            assertEquals("should recognize header", MessageDecoderResult.OK, decoder.decodable(
                    null, buffer));
            if (splitOffset < data.length()) {
                assertEquals("shouldn't decode message; offset=" + splitOffset,
                        MessageDecoderResult.NEED_DATA, decoder.decode(null, buffer, decoderOutput));
                assertNull("shouldn't write message; offset=" + splitOffset, decoderOutput
                        .getMessage());

                assertEquals("can't change buffer position", 0, buffer.position());
                byte[] bytes = remaining.getBytes();

                buffer.mark();
                buffer.position(buffer.limit());
                buffer.limit(buffer.limit() + bytes.length);
                buffer.put(bytes);
                buffer.reset();

                assertMessageFound(data);

            } else {
                assertEquals("should parse message; offset=" + splitOffset,
                        MessageDecoderResult.OK, decoder.decode(null, buffer, decoderOutput));
                assertNotNull("should write message; offset=" + splitOffset, decoderOutput
                        .getMessage());
            }

        }

        buffer.clear();
    }

    public void testGarbageAtStart() throws Exception {
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer("8=!@#$%" + data);
        assertMessageFound(data);
    }

    public void testBadLengthTooLong() throws Exception {
        String badMessage = "8=FIX.4.2\0019=25\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=Y\001108=30\00110=037\001";
        setUpBuffer(badMessage + goodMessage + goodMessage);
        assertMessageFound(goodMessage);
    }

    public void testMultipleMessagesInBuffer() throws Exception {
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer(goodMessage + goodMessage + goodMessage);
        assertMessageFound(goodMessage, 3);
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

    public void testBogusMessageLength() throws Exception {
        String badMessage = "8=FIX.4.2\0019=10xyz\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        setUpBuffer(badMessage + goodMessage);
        assertMessageFound(goodMessage);
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

    public void testMinaDemux() throws Exception {
        DemuxingProtocolCodecFactory codecFactory = new DemuxingProtocolCodecFactory();
        codecFactory.register(FIXMessageDecoder.class);

        ProtocolDecoder decoder = codecFactory.newDecoder();
        ProtocolDecoderOutputForTest output = new ProtocolDecoderOutputForTest();

        MockControl mockSessionControl = MockControl.createControl(ProtocolSession.class);
        ProtocolSession mockSession = (ProtocolSession) mockSessionControl.getMock();
        mockSession.getTransportType();
        mockSessionControl.setReturnValue(TransportType.SOCKET, MockControl.ONE_OR_MORE);

        mockSessionControl.replay();

        int count = 5;
        String data = "";
        for (int i = 0; i < count; i++) {
            data += "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        }

        for (int i = 1; i < data.length(); i++) {
            String chunk1 = data.substring(0, i);
            String chunk2 = data.substring(i);
            setUpBuffer(chunk1);
            decoder.decode(mockSession, buffer, output);
            buffer.compact();

            setUpBuffer(chunk2);
            decoder.decode(mockSession, buffer, output);

            assertEquals("wrong message count", count, output.getMessageCount());
            
            output.reset();
            buffer.clear();
        }

        mockSessionControl.verify();
    }

    private void assertMessageFound(String data) throws ProtocolViolationException {
        assertMessageFound(data, 1);
    }

    private void assertMessageFound(String data, int count) throws ProtocolViolationException {
        //        assertEquals("should recognize message", MessageDecoderResult.OK, decoder.decodable(null,
        //                buffer));

        assertEquals("wrong decoder result", MessageDecoderResult.OK, decoder.decode(null, buffer,
                decoderOutput));
        assertEquals("wrong message count", count, decoderOutput.getMessageCount());
        for (int i = 0; i < count; i++) {
            assertEquals("incorrect msg framing", data, decoderOutput.getMessage(i).toString());
        }
    }

    private String setUpBuffer(String bufferContents) {
        buffer.put(bufferContents.getBytes());
        buffer.flip();
        return bufferContents;
    }

    private class ProtocolDecoderOutputForTest implements ProtocolDecoderOutput {
        public List messages = new ArrayList();

        public void write(Object message) {
            messages.add(message);
        }

        public int getMessageCount() {
            return messages.size();
        }

        public String getMessage() {
            if (messages.isEmpty()) {
                return null;
            }
            return getMessage(0);
        }

        public String getMessage(int n) {
            return (String) messages.get(n);
        }

        public void reset() {
            messages.clear();
        }
    }
}
