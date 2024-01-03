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

package quickfix.mina;

import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;
import quickfix.LogUtil;
import quickfix.Responder;
import quickfix.Session;

import java.io.IOException;
import java.net.SocketAddress;

/**
 * The class that partially integrates the QuickFIX/J Session to
 * the MINA networking code.
 */
public class IoSessionResponder implements Responder {
    private final IoSession ioSession;
    private final boolean synchronousWrites;
    private final long synchronousWriteTimeout;
    private final int maxScheduledWriteRequests;

    public IoSessionResponder(IoSession session, boolean synchronousWrites, long synchronousWriteTimeout, int maxScheduledWriteRequests) {
        ioSession = session;
        this.synchronousWrites = synchronousWrites;
        this.synchronousWriteTimeout = synchronousWriteTimeout;
        this.maxScheduledWriteRequests = maxScheduledWriteRequests;
    }

    @Override
    public boolean send(String data) {
        // Check for and disconnect slow consumers.
        Session qfjSession = (Session) ioSession.getAttribute(SessionConnector.QF_SESSION);
        if (maxScheduledWriteRequests > 0 && ioSession.getScheduledWriteMessages() >= maxScheduledWriteRequests) {
            try {
                qfjSession.disconnect("Slow consumer", true);
            } catch (IOException e) {
            }
            return false;
        }

        // The data is written asynchronously in a MINA thread
        WriteFuture future = ioSession.write(data);
        if (synchronousWrites) {
            try {
                if (!future.awaitUninterruptibly(synchronousWriteTimeout)) {
                    qfjSession.getLog().onErrorEvent("Synchronous write timed out after " + synchronousWriteTimeout + "ms.");
                    return false;
                }
            } catch (RuntimeException e) {
                LogUtil.logThrowable(qfjSession.getSessionID(), "Synchronous write failed.", e);
                return false;
            }
        }
        return true;
    }

    @Override
    public void disconnect() {
        // We cannot call join() on the CloseFuture returned
        // by the following call. We are using a minimal
        // threading model and calling join will prevent the
        // close event from being processed by this thread (if
        // this thread is the MINA IO processor thread.
        ioSession.closeOnFlush();
        ioSession.setAttribute(SessionConnector.QFJ_RESET_IO_CONNECTOR, Boolean.TRUE);
    }

    @Override
    public String getRemoteAddress() {
        final SocketAddress remoteAddress = ioSession.getRemoteAddress();
        if (remoteAddress != null) {
            return remoteAddress.toString();
        }
        return null;
    }

    IoSession getIoSession() {
        return ioSession;
    }
}
