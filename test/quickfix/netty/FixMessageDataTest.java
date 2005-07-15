package quickfix.netty;

import java.nio.ByteBuffer;

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.MessageParseException;

import junit.framework.TestCase;

public class FixMessageDataTest extends TestCase {
    public void testPartialHeader() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String data = "8=FIX.4.2";
        buffer.put(data.getBytes());
        buffer.flip();

        Message message = FIXMessageData.RECOGNIZER.recognize(buffer);
        assertNull("shouldn't recognize message", message);
    }
    
    public void testSimpleMessage() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        buffer.put(data.getBytes());
        buffer.flip();

        assertMessageFound(buffer, data);
    }

    public void testSplitMessage() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        buffer.put(data.substring(0, 15).getBytes());
        buffer.flip();

        Message message = FIXMessageData.RECOGNIZER.recognize(buffer);
        // recognize header
        assertNotNull("should recognize message", message);
        
        buffer.compact();
        buffer.put(data.substring(15, data.length()).getBytes());
        buffer.flip();

        assertMessageFound(buffer, data);
    }

    public void testGarbageAtStart() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        buffer.put(("8=!@#$%" + data).getBytes());
        buffer.flip();

        assertMessageFound(buffer, data);
    }

    private void assertMessageFound(ByteBuffer buffer, String data) throws MessageParseException {
        Message message = FIXMessageData.RECOGNIZER.recognize(buffer);
        assertNotNull("should recognize message", message);
        
        boolean done = message.read(buffer);
        assertTrue("read() return value not correct", done);
        
        assertEquals("incorrect msg framing", data, message.toString());
    }

    public void testBadLengthTooLong() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String badMessage = "8=FIX.4.2\0019=15\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        buffer.put((badMessage + goodMessage).getBytes());
        buffer.flip();

        assertMessageFound(buffer, goodMessage);
    }

    public void testBadLengthTooShort() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String badMessage = "8=FIX.4.2\0019=10\00135=X\001108=30\00110=036\001";
        String goodMessage = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        buffer.put((badMessage + goodMessage).getBytes());
        buffer.flip();

        assertMessageFound(buffer, goodMessage);
    }

    public void testBadLengthOnLogon() throws Exception {
        FIXMessageData data = new FIXMessageData();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String badMessage = "8=FIX.4.2\0019=10\00135=A\001108=30\00110=036\001";
        buffer.put(badMessage.getBytes());
        buffer.flip();

        try {
            data.read(buffer);
            fail("no exception");
        } catch (MessageParseException e) {
            // expected
        }
    }
}