/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package quickfix.mina.ssl;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRejectedException;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.filter.FilterEvent;
import org.apache.mina.filter.ssl.EncryptedWriteRequest;
import org.apache.mina.filter.ssl.SslEvent;
import org.apache.mina.filter.ssl.SslFilter;
import org.apache.mina.filter.ssl.SslHandler;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

/**
 * Implementation adapted from Apache MINA 2.2.10. The only difference is that
 * {@link quickfix.mina.ssl.QFSSLHandlerG1#ENABLE_ASYNC_TASKS} is set to false.
 * <p>
 * Default implementation of SSLHandler
 * <p>
 * The concurrency model is enforced using a simple mutex to ensure that the state of the decode buffer and closure is
 * concurrent with the SSLEngine.
 *
 * @author Jonathan Valliere
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
class QFSSLHandlerG1 extends SslHandler {

    /**
     * Maximum number of queued messages waiting for encoding
     */
    static protected final int MAX_QUEUED_MESSAGES = 64;

    /**
     * Maximum number of messages waiting acknowledgement
     */
    static protected final int MAX_UNACK_MESSAGES = 6;

    /**
     * Writes the SSL Closure messages after a close request
     */
    static protected final boolean ENABLE_SOFT_CLOSURE = true;

    /**
     * Enable aggregation of handshake messages
     */
    static protected final boolean ENABLE_FAST_HANDSHAKE = true;

    /**
     * Enable asynchronous tasks. Default to false.
     */
    static protected final boolean ENABLE_ASYNC_TASKS = false;

    /**
     * Indicates whether the first handshake was completed
     */
    protected boolean mHandshakeComplete = false;

    /**
     * Indicated whether the first handshake was started
     */
    protected boolean mHandshakeStarted = false;

    /**
     * Indicates that the outbound is closing
     */
    protected boolean mOutboundClosing = false;

    /**
     * Indicates that previously queued messages should be written before closing
     */
    protected boolean mOutboundLinger = false;

    /**
     * Holds the decoder thread reference; used for recursion detection introduced by a delegated task
     */
    protected volatile Thread mReceiveThread = null;

    /**
     * Encoded buffers ready for processing upstream
     */
    protected final Deque<EncryptedWriteRequest> mWriteQueue = new ConcurrentLinkedDeque<>();

    /**
     * Decoded buffers ready for processing downstream
     */
    protected final Deque<IoBuffer> mReceiveQueue = new ConcurrentLinkedDeque<>();

    /**
     * Pending filter events for dispatching
     */
    protected final Deque<FilterEvent> mEventQueue = new ConcurrentLinkedDeque<>();

    /**
     * Instantiates a new handler
     *
     * @param sslEngine The SSLEngine instance
     * @param executor The executor instance to use to process tasks
     * @param session The session to handle
     */
    public QFSSLHandlerG1(SSLEngine sslEngine, Executor executor, IoSession session) {
        super(sslEngine, executor, session);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isOpen() {
        return mEngine.isOutboundDone() == false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isConnected() {
        return mHandshakeComplete && isOpen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void open(NextFilter next) throws SSLException {
        try {
            open_start(next);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_events(next);
        }
    }

    synchronized protected void open_start(NextFilter next) throws SSLException {
        if (mHandshakeStarted == false) {
            mHandshakeStarted = true;
            if (mEngine.getUseClientMode()) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} open() - begin handshaking", this);
                }
                mEngine.beginHandshake();
                write_handshake(next);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void receive(NextFilter next, IoBuffer message) throws SSLException {
        try {
            receive_start(next, message);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_received(next);
            forward_events(next);
        }
    }

    synchronized protected void receive_start(NextFilter next, IoBuffer message) throws SSLException {
        if(mReceiveThread == Thread.currentThread()) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} receive() - recursion", toString());
            }
            receive_loop(next, mDecodeBuffer);
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} receive() - message {}", toString(), message);
            }
            mReceiveThread = Thread.currentThread();
            IoBuffer source = resume_decode_buffer(message);
            try {
                receive_loop(next, source);
            } finally {
                suspend_decode_buffer(source);
                mReceiveThread = null;
            }
        }
    }

    /**
     * Process a received message
     * 
     * @param next The next filter
     * @param message The message to process
     * 
     * @throws SSLException If we get some error while processing the message
     */
    @SuppressWarnings("incomplete-switch")
    protected void receive_loop(NextFilter next, IoBuffer message) throws SSLException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} receive_loop() - source {}", toString(), message);
        }

        if (mEngine.isInboundDone()) {
            switch (mEngine.getHandshakeStatus()) {
                case NEED_WRAP:
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} receive_loop() - handshake needs wrap, invoking write", toString());
                    }
                    
                    write_handshake(next);
                    break;
            }

            if ( mPendingError != null ) {
                throw mPendingError;
            } else {
                throw new IllegalStateException("closed");
            }
        }
        
        // The message is null when we have had an exception
        if (message==null) {
            if ( mPendingError != null ) {
                throw mPendingError;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        IoBuffer source = message;
        
        // No need to go for another loop if the message is empty
        if (source.remaining() == 0) {
            return;
        }
        
        IoBuffer dest = allocate_app_buffer(source.remaining());

        SSLEngineResult result = mEngine.unwrap(source.buf(), dest.buf());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} receive_loop() - bytes-consumed {}, bytes-produced {}, status {}, handshake {}",
                    toString(), result.bytesConsumed(), result.bytesProduced(), result.getStatus(),
                    result.getHandshakeStatus());
        }

        if (result.bytesProduced() == 0) {
            dest.free();
        } else {
            dest.flip();
            
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} receive_loop() - result {}", toString(), dest);
            }

            mReceiveQueue.add(dest);
        }

        switch (result.getHandshakeStatus()) {
            case NEED_UNWRAP:
                if (result.bytesConsumed() != 0 && message.hasRemaining()) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} receive_loop() - handshake needs unwrap, looping", toString());
                    }
                    
                    receive_loop(next, message);
                }
                
                break;
            case NEED_TASK:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} receive_loop() - handshake needs task, scheduling", toString());
                }
                
                schedule_task(next);

                break;
            case NEED_WRAP:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} receive_loop() - handshake needs wrap, invoking write", toString());
                }
                
                write_handshake(next);
                break;
                
            case FINISHED:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} receive_loop() - handshake finished, flushing queue", toString());
                }
                
                finish_handshake(next);
                break;
                
            case NOT_HANDSHAKING:
                if ((result.bytesProduced() != 0 || result.bytesConsumed() != 0) && message.hasRemaining()) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} receive_loop() - trying to decode more messages, looping", toString());
                    }
                    
                    receive_loop(next, message);
                }
                
                break;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void ack(NextFilter next, WriteRequest request) throws SSLException {
        try {
            ack_start(next, request);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_events(next);
        }
    }

    synchronized protected void ack_start(NextFilter next, WriteRequest request) throws SSLException {
        if (mAckQueue.remove(request)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} ack() - accepted {}", toString(), request);
            }
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} ack() - checking to see if any messages can be flushed", toString(), request);
            }
            flush_start(next);
        } else {
            if(LOGGER.isWarnEnabled()) {
                LOGGER.warn("{} ack() - unknown message {}", toString(), request);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(NextFilter next, WriteRequest request) throws SSLException, WriteRejectedException {
        try {
            write_start(next, request);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_events(next);
        }
    }

    synchronized protected void write_start(NextFilter next, WriteRequest request) throws SSLException, WriteRejectedException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} write() - source {}", toString(), request);
        }
        if (mOutboundClosing) {
            throw new WriteRejectedException(request, "closing");
        }
        if (mEncodeQueue.isEmpty()) {
            if (write_loop(next, request) == false) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write() - unable to write right now, saving request for later", toString(),
                            request);
                }
                if (mEncodeQueue.size() == MAX_QUEUED_MESSAGES) {
                    throw new BufferOverflowException();
                }
                mEncodeQueue.add(request);
            }
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} write() - unable to write right now, saving request for later", toString(), request);
            }
            if (mEncodeQueue.size() == MAX_QUEUED_MESSAGES) {
                throw new BufferOverflowException();
            }
            mEncodeQueue.add(request);
        }
    }

    /**
     * Attempts to encode the WriteRequest and write the data to the IoSession
     * 
     * @param next
     * @param request
     * 
     * @return {@code true} if the WriteRequest was fully consumed; otherwise
     *         {@code false}
     * 
     * @throws SSLException
     */
    @SuppressWarnings("incomplete-switch")
    synchronized protected boolean write_loop(NextFilter next, WriteRequest request) throws SSLException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} write_loop() - source {}", toString(), request);
        }

        IoBuffer source = IoBuffer.class.cast(request.getMessage());
        IoBuffer dest = allocate_encode_buffer(source.remaining());

        SSLEngineResult result = mEngine.wrap(source.buf(), dest.buf());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} write_loop() - bytes-consumed {}, bytes-produced {}, status {}, handshake {}",
                    toString(), result.bytesConsumed(), result.bytesProduced(), result.getStatus(),
                    result.getHandshakeStatus());
        }

        if (result.bytesProduced() == 0) {
            dest.free();
        } else {
            if (result.bytesConsumed() == 0) {
                // an handshaking message must have been produced
                EncryptedWriteRequest encrypted = new EncryptedWriteRequest(dest, null);
                
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_loop() - result {}", toString(), encrypted);
                }

                mWriteQueue.add(encrypted);
                // do not return because we want to enter the handshake switch
            } else {
                // then we probably consumed some data
                dest.flip();
                
                if (source.hasRemaining()) {
                    EncryptedWriteRequest encrypted = new EncryptedWriteRequest(dest, null);
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} write_loop() - result {}", toString(), encrypted);
                    }

                    mWriteQueue.add(encrypted);
                    
                    if (mWriteQueue.size() + mAckQueue.size() < MAX_UNACK_MESSAGES) {
                        return write_loop(next, request); // write additional chunks
                    }
                    
                    return false;
                } else {
                    EncryptedWriteRequest encrypted = new EncryptedWriteRequest(dest, request);

                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} write_loop() - result {}", toString(), encrypted);
                    }

                    mWriteQueue.add(encrypted);
                    
                    return true;
                }
                // we return because there is not reason to enter the handshake switch
            }
        }

        switch (result.getHandshakeStatus()) {
            case NEED_TASK:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_loop() - handshake needs task, scheduling", toString());
                }
                
                schedule_task(next);
                break;
                
            case NEED_WRAP:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_loop() - handshake needs wrap, looping", toString());
                }
                
                return write_loop(next, request);
                
            case FINISHED:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_loop() - handshake finished, flushing queue", toString());
                }
                
                finish_handshake(next);
                
                return write_loop(next, request);
        }

        return false;
    }

    /**
     * Attempts to generate a handshake message and write the data to the IoSession.
     * <p>
     * If FAST_HANDSHAKE is enabled, this method will recursively loop in order to
     * combine multiple messages into one buffer.
     * 
     * @param next
     * @param source
     * @param dest
     * 
     * @return {@code true} if a message was generated and written
     * 
     * @throws SSLException
     */
    @Override
    @SuppressWarnings("incomplete-switch")
    protected boolean write_handshake_loop(NextFilter next, IoBuffer source, IoBuffer dest) throws SSLException {
        if (mOutboundClosing && mEngine.isOutboundDone()) {
            return false;
        }

        SSLEngineResult result = mEngine.wrap(source.buf(), dest.buf());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} write_handshake_loop() - bytes-consumed {}, bytes-produced {}, status {}, handshake {}",
                    toString(), result.bytesConsumed(), result.bytesProduced(), result.getStatus(),
                    result.getHandshakeStatus());
        }

        if (ENABLE_FAST_HANDSHAKE) {
            /**
             * Fast handshaking allows multiple handshake messages to be written to a single
             * buffer. This reduces the number of network messages used during the handshake
             * process.
             * 
             * Additional handshake messages are only written if a message was produced in
             * the last loop otherwise any additional messages need to be written by
             * NEED_WRAP will be handled in the standard routine below which allocates a new
             * buffer.
             */
            switch (result.getHandshakeStatus()) {
                case NEED_WRAP:
                    switch (result.getStatus()) {
                        case OK:
                            if (LOGGER.isDebugEnabled()) {
                                LOGGER.debug("{} write_handshake_loop() - handshake needs wrap, fast looping",
                                        toString());
                            }
                            
                            return write_handshake_loop(next, source, dest);
                    }
                    break;
            }
        }

        boolean success = dest.position() != 0;

        if (success == false) {
            dest.free();
        } else {
            dest.flip();
            
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} write_handshake_loop() - result {}", toString(), dest);
            }
            
            EncryptedWriteRequest encrypted = new EncryptedWriteRequest(dest, null);
            mWriteQueue.add(encrypted);
        }

        switch (result.getHandshakeStatus()) {
            case NEED_UNWRAP:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_handshake_loop() - handshake needs unwrap, invoking receive", toString());
                }
                receive_start(next, ZERO);
                break;
                
            case NEED_WRAP:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_handshake_loop() - handshake needs wrap, looping", toString());
                }
                write_handshake(next);
                break;
                
            case NEED_TASK:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_handshake_loop() - handshake needs task, scheduling", toString());
                }
                schedule_task(next);
                break;
                
            case FINISHED:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} write_handshake_loop() - handshake finished, flushing queue", toString());
                }
                finish_handshake(next);
                break;
        }

        return success;
    }

    /**
     * Marks the handshake as complete and emits any signals
     * 
     * @param next
     * @throws SSLException
     */
    synchronized protected void finish_handshake(NextFilter next) throws SSLException {
        if (mHandshakeComplete == false) {
            mHandshakeComplete = true;
            mSession.setAttribute(SslFilter.SSL_SECURED, mEngine.getSession());
            mEventQueue.add(SslEvent.SECURED);
        }
        
        /**
         * There exists a bug in the JDK which emits FINISHED twice instead of once.
         */
        receive_start(next, ZERO);
        flush_start(next);
    }

    /**
     * {@inheritDoc}
     */
    public void flush(NextFilter next) throws SSLException {
        try {
            flush_start(next);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_events(next);
        }
    }

    /**
     * Flushes the encode queue
     * 
     * @param next
     * 
     * @throws SSLException
     */
    synchronized protected void flush_start(NextFilter next) throws SSLException {
        if (mOutboundClosing && mOutboundLinger == false) {
            return;
        }

        if (mEncodeQueue.size() == 0) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} flush() - no saved messages", toString());
            }
            
            return;
        }

        WriteRequest current = null;
        
        while ((mWriteQueue.size() + mAckQueue.size() < MAX_UNACK_MESSAGES) && (current = mEncodeQueue.poll()) != null) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} flush() - {}", toString(), current);
            }
            
            if (write_loop(next, current) == false) {
                mEncodeQueue.addFirst(current);
                
                break;
            }
        }

        if (mOutboundClosing && mEncodeQueue.size() == 0) {
            mEngine.closeOutbound();
            
            if (ENABLE_SOFT_CLOSURE) {
                write_handshake(next);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close(NextFilter next, boolean linger) throws SSLException {
        try {
            close_start(next, linger);
            throw_pending_error(next);
        } finally {
            forward_writes(next);
            forward_events(next);
        }
    }

    synchronized protected void close_start(NextFilter next, boolean linger) throws SSLException {
        if (mOutboundClosing) {
            return;
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} close() - closing session", toString());
        }
        if (mHandshakeComplete) {
            next.event(mSession, SslEvent.UNSECURED);
        }
        mOutboundLinger = linger;
        mOutboundClosing = true;
        if (linger == false) {
            if (mEncodeQueue.size() != 0) {
                next.exceptionCaught(mSession, new WriteRejectedException(new ArrayList<>(mEncodeQueue), "closing"));
                mEncodeQueue.clear();
            }
            mEngine.closeOutbound();
            if (ENABLE_SOFT_CLOSURE) {
                write_handshake(next);
            }
        } else {
            flush_start(next);
        }
    }

    /**
     * Store any error we've got during the handshake or message handling
     * 
     * @param sslException The exfeption to store
     */
    synchronized protected void store_pending_error(SSLException sslException) {
        if (mPendingError == null) {
            mPendingError = sslException;
        }
    }

    protected void forward_received(NextFilter next) {
        synchronized (mReceiveQueue) {
            IoBuffer x;
            while ((x = mReceiveQueue.poll()) != null) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} forward_received() - received {}", toString(), x);
                }
                next.messageReceived(mSession, x);
            }
        }
    }

    protected void forward_writes(NextFilter next) {
         synchronized (mWriteQueue) {
            EncryptedWriteRequest x;
            while ((x = mWriteQueue.poll()) != null) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} forward_writes() - writing {}", toString(), x);
                }
                mAckQueue.add(x);
                next.filterWrite(mSession, x);
            }
         }
    }

    protected void forward_events(NextFilter next) {
        synchronized(mEventQueue) {
            FilterEvent x;
            while ((x = mEventQueue.poll()) != null) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} forward_events() - dispatching event {}", toString(), x);
                }
                next.event(mSession, x);
            }
        }
    }

    /**
     * Schedule a SSLEngine task for execution, either using an Executor, or immediately.
     *  
     * @param next The next filter to call
     */
    protected void schedule_task(NextFilter next) {
        if (ENABLE_ASYNC_TASKS && (mExecutor != null)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} schedule_task() - scheduling task", this);
            }
            mExecutor.execute(() -> {
                try {
                    execute_task(next);
                } finally {
                    forward_writes(next);
                }
            });
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} schedule_task() - scheduling disabled, executing inline", this);
            }
            execute_task(next);
        }
    }

    /**
     * Execute a SSLEngine task. We may have more than one.
     * 
     * If we get any exception during the processing, an error is stored and thrown.
     * 
     * @param next The next filer in the chain
     */
    synchronized protected void execute_task(NextFilter next) {
        Runnable task;
        while ((task = mEngine.getDelegatedTask()) != null) {
            try {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} task() - executing {}", toString(), task);
                }
                task.run();
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} task() - writing handshake messages", toString());
                }
                write_handshake(next);
            } catch (SSLException e) {
                store_pending_error(e);
                try { 
                    throw_pending_error(next);
                } catch ( SSLException ssle) {
                    // ...
                }
                if (LOGGER.isErrorEnabled()) {
                    LOGGER.error("{} task() - storing error {}", toString(), e);
                }
            }
        }
    }
}
