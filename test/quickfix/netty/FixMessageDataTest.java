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
        String data = "8=FIX.4.2\0019=12\00135=X\001108=30\00110=036\001";
        for (int i = 1; i < data.length(); i++) {
            doSplitMessageTest(i, data);
        }
    }

    private void doSplitMessageTest(int splitOffset, String data) throws MessageParseException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String firstChunk = data.substring(0, splitOffset);
        String remaining = data.substring(splitOffset);
        buffer.put(firstChunk.getBytes());
        buffer.flip();

        if (splitOffset < 12) {
            assertNull("shouldn't recognize header; offset=" + splitOffset,
                    FIXMessageData.RECOGNIZER.recognize(buffer));
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

            Message message = FIXMessageData.RECOGNIZER.recognize(buffer);
            assertNotNull("should recognize message; offset=" + splitOffset, message);

            assertFalse(message.read(buffer));

            buffer.compact();
            buffer.put(remaining.getBytes());
            buffer.flip();

            System.out.println(splitOffset+" "+firstChunk+" "+remaining);
            assertMessageFound(buffer, data);
        }
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