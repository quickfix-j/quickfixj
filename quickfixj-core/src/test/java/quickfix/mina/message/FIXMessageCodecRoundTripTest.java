/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina.message;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.DefaultTransportMetadata;
import org.apache.mina.core.session.DummySession;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.demux.MessageDecoderResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.quickfixj.CharsetSupport;
import quickfix.Message;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;

import java.io.ByteArrayOutputStream;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Checks that FIXMessageEncoder and FIXMessageDecoder produce exactly the expected
 * bytes/strings, independent of buffer layout (position, array offset, heap/direct)
 * and of how the incoming byte stream is fragmented.
 */
public class FIXMessageCodecRoundTripTest {

    private static final String SOH = "\001";

    @Before
    public void setUp() throws Exception {
        CharsetSupport.setDefaultCharset();
    }

    @After
    public void tearDown() throws Exception {
        CharsetSupport.setDefaultCharset();
    }

    // ---------------------------------------------------------------- encoder

    @Test
    public void testEncodeStringProducesExactBytes() throws Exception {
        String message = fix("FIX.4.4", "35=0" + SOH + "49=A" + SOH + "56=B" + SOH + "34=1" + SOH);
        IoBuffer buffer = encode(message);

        assertEquals(0, buffer.position());
        assertEquals(message.length(), buffer.limit());
        assertArrayEquals(message.getBytes(CharsetSupport.getCharset()), remainingBytes(buffer));
    }

    @Test
    public void testEncodeMessageProducesExactBytes() throws Exception {
        Message message = new Message();
        message.getHeader().setString(MsgType.FIELD, "0");
        message.getHeader().setString(SenderCompID.FIELD, "SENDER");
        message.getHeader().setString(TargetCompID.FIELD, "TARGET");
        message.getHeader().setInt(MsgSeqNum.FIELD, 42);
        IoBuffer buffer = encode(message);

        assertEquals(0, buffer.position());
        assertArrayEquals(message.toString().getBytes(CharsetSupport.getCharset()), remainingBytes(buffer));
    }

    @Test
    public void testEncodeUtf8MultiByte() throws Exception {
        CharsetSupport.setCharset("UTF-8");
        String headline = "测验数据";
        String message = fix("FIX.4.4", "35=B" + SOH + "148=" + headline + SOH, "UTF-8");
        IoBuffer buffer = encode(message);

        byte[] expected = message.getBytes("UTF-8");
        assertEquals(expected.length, buffer.remaining());
        assertArrayEquals(expected, remainingBytes(buffer));
    }

    // ---------------------------------------------------------------- decoder

    @Test
    public void testDecodeMultipleMessagesInOneBuffer() throws Exception {
        List<String> messages = sampleMessages();
        IoBuffer buffer = IoBuffer.wrap(bytes(String.join("", messages)));

        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        assertEquals(MessageDecoderResult.OK, new FIXMessageDecoder().decode(null, buffer, out));

        assertEquals(messages, out.messages);
        assertFalse("all data should be consumed", buffer.hasRemaining());
    }

    @Test
    public void testDecodeWithLeadingGarbageAndNonZeroPosition() throws Exception {
        List<String> messages = sampleMessages();
        byte[] prefix = bytes("garbage-before-first-message");
        IoBuffer buffer = IoBuffer.allocate(4096);
        buffer.put(bytes("XXXXXXXX")); // skipped via position, not part of the stream
        int start = buffer.position();
        buffer.put(prefix);
        buffer.put(bytes(String.join("", messages)));
        buffer.flip();
        buffer.position(start);

        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        new FIXMessageDecoder().decode(null, buffer, out);

        assertEquals(messages, out.messages);
        assertFalse(buffer.hasRemaining());
    }

    @Test
    public void testDecodeFromSliceWithNonZeroArrayOffset() throws Exception {
        List<String> messages = sampleMessages();
        IoBuffer outer = IoBuffer.allocate(4096);
        outer.put(bytes("0123456789"));
        outer.put(bytes(String.join("", messages)));
        outer.flip();
        outer.position(10);
        IoBuffer slice = outer.slice();
        assertTrue("precondition: heap buffer", slice.hasArray());
        assertTrue("precondition: slice must have a non-zero array offset", slice.arrayOffset() > 0);

        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        new FIXMessageDecoder().decode(null, slice, out);

        assertEquals(messages, out.messages);
        assertFalse(slice.hasRemaining());
    }

    @Test
    public void testDecodeFromDirectBuffer() throws Exception {
        List<String> messages = sampleMessages();
        byte[] data = bytes(String.join("", messages));
        IoBuffer buffer = IoBuffer.allocate(data.length, true);
        buffer.put(data);
        buffer.flip();
        assertFalse("precondition: direct buffer without accessible array", buffer.hasArray());

        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        new FIXMessageDecoder().decode(null, buffer, out);

        assertEquals(messages, out.messages);
        assertFalse(buffer.hasRemaining());
    }

    @Test
    public void testDecodeUtf8MultiByte() throws Exception {
        String headline = "测验数据 äöü";
        String message = fix("FIX.4.4", "35=B" + SOH + "148=" + headline + SOH, "UTF-8");
        IoBuffer buffer = IoBuffer.wrap(message.getBytes("UTF-8"));

        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        new FIXMessageDecoder("UTF-8").decode(null, buffer, out);

        assertEquals(1, out.getMessageCount());
        assertEquals(message, out.getMessage());
    }

    // ------------------------------------------- full MINA pipeline / fragmentation

    @Test
    public void testDecodeStreamSplitAtEveryPosition() throws Exception {
        List<String> messages = sampleMessages();
        byte[] stream = bytes(String.join("", messages));

        for (int split = 1; split < stream.length; split++) {
            List<Object> decoded = decodeChunks(
                    Arrays.copyOfRange(stream, 0, split),
                    Arrays.copyOfRange(stream, split, stream.length));
            assertEquals("split at " + split, messages, decoded);
        }
    }

    @Test
    public void testDecodeStreamOneByteAtATime() throws Exception {
        List<String> messages = sampleMessages();
        byte[] stream = bytes(String.join("", messages));
        byte[][] chunks = new byte[stream.length][];
        for (int i = 0; i < stream.length; i++) {
            chunks[i] = new byte[] { stream[i] };
        }
        assertEquals(messages, decodeChunks(chunks));
    }

    @Test
    public void testEncodeThenDecodeRoundTrip() throws Exception {
        List<String> messages = sampleMessages();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        for (String message : messages) {
            stream.write(remainingBytes(encode(message)));
        }
        byte[] data = stream.toByteArray();

        // feed in irregular chunk sizes
        int[] sizes = { 1, 7, 13, 64, 3, 200 };
        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        IoSession session = newStreamSession();
        ProtocolDecoder decoder = new FIXProtocolCodecFactory().getDecoder(session);
        for (int offset = 0, i = 0; offset < data.length; i++) {
            int len = Math.min(sizes[i % sizes.length], data.length - offset);
            decoder.decode(session, IoBuffer.wrap(data, offset, len), out);
            offset += len;
        }
        assertEquals(messages, out.messages);
    }

    @Test
    public void testChecksumUsesAsciiDigitsWithArabicDefaultLocale() throws Exception {
        Locale defaultLocale = Locale.getDefault();
        try {
            Locale.setDefault(new Locale("ar", "EG"));
            String message = fix("FIX.4.4", "35=0" + SOH);
            assertTrue(message.endsWith("10=163" + SOH));
        } finally {
            Locale.setDefault(defaultLocale);
        }
    }

    // ---------------------------------------------------------------- helpers

    private static List<Object> decodeChunks(byte[]... chunks) throws Exception {
        ProtocolDecoderOutputForTest out = new ProtocolDecoderOutputForTest();
        IoSession session = newStreamSession();
        ProtocolDecoder decoder = new FIXProtocolCodecFactory().getDecoder(session);
        for (byte[] chunk : chunks) {
            decoder.decode(session, IoBuffer.wrap(chunk), out);
        }
        return out.messages;
    }

    /**
     * DummySession reports a transport without fragmentation, in which case MINA's
     * CumulativeProtocolDecoder discards incomplete data. Make it behave like TCP.
     */
    private static IoSession newStreamSession() {
        DummySession session = new DummySession();
        session.setTransportMetadata(new DefaultTransportMetadata("mina", "dummy", false, true,
                SocketAddress.class, IoSessionConfig.class, Object.class));
        return session;
    }

    private static List<String> sampleMessages() throws Exception {
        return Arrays.asList(
                fix("FIX.4.2", "35=0" + SOH + "49=A" + SOH + "56=B" + SOH + "34=1" + SOH),
                fix("FIX.4.4", "35=D" + SOH + "49=A" + SOH + "56=B" + SOH + "34=2" + SOH
                        + "11=ORDER-1" + SOH + "55=IBM" + SOH + "54=1" + SOH + "38=100" + SOH
                        + "58=10=123" + SOH),     // field value containing a fake checksum
                fix("FIXT.1.1", "35=A" + SOH + "49=A" + SOH + "56=B" + SOH + "34=3" + SOH
                        + "98=0" + SOH + "108=30" + SOH + "1137=9" + SOH),
                fix("FIX.4.4", "35=B" + SOH + "148=äbcfödçé" + SOH));
    }

    private static String fix(String beginString, String body) throws Exception {
        return fix(beginString, body, CharsetSupport.getCharset());
    }

    /** Builds a FIX message with correct BodyLength(9) and CheckSum(10) for the given charset. */
    private static String fix(String beginString, String body, String charset) throws Exception {
        Charset cs = Charset.forName(charset);
        String head = "8=" + beginString + SOH + "9=" + body.getBytes(cs).length + SOH;
        int sum = 0;
        for (byte b : (head + body).getBytes(cs)) {
            sum += b & 0xFF;
        }
        return head + body + String.format(Locale.ROOT, "10=%03d", sum % 256) + SOH;
    }

    private static IoBuffer encode(Object message) throws Exception {
        ProtocolEncoderOutputForTest out = new ProtocolEncoderOutputForTest();
        new FIXMessageEncoder().encode(null, message, out);
        return out.buffer;
    }

    private static byte[] remainingBytes(IoBuffer buffer) {
        IoBuffer dup = buffer.duplicate();
        byte[] data = new byte[dup.remaining()];
        dup.get(data);
        return data;
    }

    private static byte[] bytes(String s) throws Exception {
        return s.getBytes(CharsetSupport.getCharset());
    }
}
