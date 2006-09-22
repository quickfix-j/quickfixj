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

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;
import org.apache.mina.filter.codec.demux.MessageDecoderResult;
import org.easymock.MockControl;

import quickfix.mina.CriticalProtocolCodecException;

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

    protected void tearDown() throws Exception {
        buffer.release();
        super.tearDown();
    }

    public void testInvalidStringCharset() throws Exception {
        try {
            decoder.setCharsetName("BOGUS");
            fail("no exception thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }

    }

    public void testStringDecoding() throws Exception {
        decoder.setCharsetName("UTF-16");
        setUpBuffer("8=FIX.4.2\0019=12\00135=X\001108=30\00110=049\001");
        MessageDecoderResult decoderResult = decoder.decode(null, buffer, decoderOutput);
        assertEquals("wrong decoder result", MessageDecoderResult.OK, decoderResult);
        assertEquals("Wrong encoding", 14397, (int) decoderOutput.getMessage().charAt(0));
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

    private void doSplitMessageTest(int splitOffset, String data) throws ProtocolCodecException {
        String firstChunk = data.substring(0, splitOffset);
        String remaining = data.substring(splitOffset);
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
        } catch (CriticalProtocolCodecException e) {
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
        } catch (ProtocolCodecException e) {
            // expected
            assertTrue(e.getCause() instanceof NullPointerException);
        }
    }

    public void testMinaDemux() throws Exception {
        ByteBuffer otherBuffer = ByteBuffer.allocate(1024);
        try {
            DemuxingProtocolCodecFactory codecFactory = new DemuxingProtocolCodecFactory();
            codecFactory.register(FIXMessageDecoder.class);

            ProtocolDecoder decoder = codecFactory.getDecoder();
            ProtocolDecoderOutputForTest output = new ProtocolDecoderOutputForTest();

            MockControl mockSessionControl = MockControl.createControl(IoSession.class);
            IoSession mockSession = (IoSession) mockSessionControl.getMock();

            mockSession
                    .getAttribute("org.apache.mina.filter.codec.CumulativeProtocolDecoder.Buffer");
            mockSessionControl.setReturnValue(otherBuffer, MockControl.ONE_OR_MORE);

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
        } finally {
            otherBuffer.release();
        }
    }

    private void assertMessageFound(String data) throws ProtocolCodecException {
        assertMessageFound(data, 1);
    }

    private void assertMessageFound(String data, int count) throws ProtocolCodecException {
        assertEquals("wrong decoder result", MessageDecoderResult.OK, decoder.decode(null, buffer,
                decoderOutput));
        assertEquals("wrong message count", count, decoderOutput.getMessageCount());
        for (int i = 0; i < count; i++) {
            assertEquals("incorrect msg framing", data, decoderOutput.getMessage(i).toString());
        }
    }

    private String setUpBuffer(String bufferContents) throws UnsupportedEncodingException {
        byte[] bytes = bufferContents.getBytes();
        return setUpBuffer(bytes, "ISO_8859-1");
    }

    private String setUpBuffer(byte[] bytes, String charsetName)
            throws UnsupportedEncodingException {
        buffer.put(bytes);
        buffer.flip();
        return new String(bytes, charsetName);
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
