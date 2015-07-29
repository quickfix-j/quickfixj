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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.*;

import org.apache.mina.core.buffer.AbstractIoBuffer;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.buffer.IoBufferAllocator;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.filter.codec.demux.MessageEncoder;
import org.quickfixj.CharsetSupport;

import quickfix.Message;

/**
 * Encodes a Message object or message string as a byte array to be
 * transmitted on MINA connection.
 */
public class FIXMessageEncoder implements MessageEncoder<Object> {

    private static final Set<Class<?>> TYPES;

    static {
        Set<Class<?>> types = new HashSet<Class<?>>();
        types.add(Message.class);
        types.add(String.class);
        TYPES = Collections.unmodifiableSet(types);
    }

    public static Set<Class<?>> getMessageTypes() {
        return TYPES;
    }

    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int MAX_BUFFERS_BY_THREAD = 16;

    protected static final class ThreadEncoder {
        private final ThreadBufferAllocator allocator = new ThreadBufferAllocator();
        private final CharsetEncoder charsetEncoder;

        private ThreadEncoder(Charset charset) {
            charsetEncoder = charset.newEncoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE);
        }
    }

    private final Charset charset;

    private final ThreadLocal<ThreadEncoder> encoders = new ThreadLocal<ThreadEncoder>() {
        @Override
        protected ThreadEncoder initialValue() {
            return new ThreadEncoder(charset);
        }
    };

    public FIXMessageEncoder() {
        String charsetName = CharsetSupport.getCharset();
        try {
            charset = Charset.forName(null != charsetName ? charsetName : "ISO-8859-1");
        } catch (Exception e) {
            throw new RuntimeException(new UnsupportedEncodingException(charsetName));
        }
    }

    @Override
    public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws ProtocolCodecException {
        String text = message.toString();
        if(text.length() > DEFAULT_BUFFER_SIZE) {
            sendWrapMessage(text, out);
        } else {
            ThreadEncoder threadEncoder = encoders.get();
            IoBuffer ioBuffer = threadEncoder.allocator.getBuffer();
            try {
                encodeBytes(text, ioBuffer, threadEncoder.charsetEncoder);
            } catch(ProtocolCodecException pce) {
                try { // possible buffer overflow
                    ioBuffer.free();
                    ioBuffer = IoBuffer.wrap(text.getBytes(threadEncoder.charsetEncoder.charset()));
                } catch(Exception e) {
                    throw new ProtocolCodecException(e);
                }
            }
            out.write(ioBuffer.flip());
        }
    }

    private void sendWrapMessage(String message, ProtocolEncoderOutput out) throws ProtocolCodecException {
        try {
            out.write(IoBuffer.wrap(message.getBytes(charset)));
        } catch (Exception e) {
            throw new ProtocolCodecException(e);
        }
    }

    private static final ProtocolCodecException overflowCodecException = new ProtocolCodecException("OVERFLOW");

    private void encodeBytes(String message, IoBuffer output, CharsetEncoder charsetEncoder) throws ProtocolCodecException {
        if(message.length() > 0) try {
            CoderResult cr = charsetEncoder.encode(CharBuffer.wrap(message), output.buf(), true);
            if(!cr.isUnderflow())
                throw overflowCodecException;
            cr = charsetEncoder.flush(output.buf());
            if(!cr.isUnderflow())
                throw overflowCodecException;
        } finally {
            charsetEncoder.reset();
        }
    }

    private static final class ThreadBufferAllocator implements IoBufferAllocator {

        private final ArrayList<IoBuffer> ioBuffers = new ArrayList<IoBuffer>();

        private ThreadBufferAllocator() {
            for(int i = 0; i < MAX_BUFFERS_BY_THREAD; i++) {
                ioBuffers.add(allocate(DEFAULT_BUFFER_SIZE, true));
            }
        }

        private IoBuffer getBuffer() {
            synchronized(ioBuffers) {
                if(!ioBuffers.isEmpty())
                    return ioBuffers.remove(ioBuffers.size() - 1);
            }
            return allocate(DEFAULT_BUFFER_SIZE, true);
        }

        @Override
        public IoBuffer allocate(int capacity, boolean direct) {
            return wrap(allocateNioBuffer(capacity, direct));
        }

        @Override
        public ByteBuffer allocateNioBuffer(int capacity, boolean direct) {
            return direct ? ByteBuffer.allocateDirect(capacity) : ByteBuffer.allocate(capacity);
        }

        @Override
        public IoBuffer wrap(ByteBuffer nioBuffer) {
            return new SimpleBuffer(this, nioBuffer);
        }

        @Override
        public void dispose() {
            synchronized (ioBuffers) {
                ioBuffers.clear();
            }
        }

        private final class SimpleBuffer extends AbstractIoBuffer {
            private ByteBuffer buf;

            protected SimpleBuffer(ThreadBufferAllocator allocator, ByteBuffer buf) {
                super(allocator, buf.capacity());
                this.buf = buf;
                buf.order(ByteOrder.BIG_ENDIAN);
            }

            protected SimpleBuffer(SimpleBuffer parent, ByteBuffer buf) {
                super(parent);
                this.buf = buf;
            }

            @Override
            public ByteBuffer buf() {
                return buf;
            }

            @Override
            protected void buf(ByteBuffer buf) {
                this.buf = buf;
            }

            @Override
            protected IoBuffer duplicate0() {
                return new SimpleBuffer(this, this.buf.duplicate());
            }

            @Override
            protected IoBuffer slice0() {
                return new SimpleBuffer(this, this.buf.slice());
            }

            @Override
            protected IoBuffer asReadOnlyBuffer0() {
                return new SimpleBuffer(this, this.buf.asReadOnlyBuffer());
            }

            @Override
            public byte[] array() {
                return buf.array();
            }

            @Override
            public int arrayOffset() {
                return buf.arrayOffset();
            }

            @Override
            public boolean hasArray() {
                return buf.hasArray();
            }

            @Override
            public void free() {
                clear();
                synchronized (ioBuffers) {
                    if(ioBuffers.size() < MAX_BUFFERS_BY_THREAD)
                        ioBuffers.add(this);
                }
            }
        }
    }
}
