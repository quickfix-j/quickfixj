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

package quickfix.mina.initiator;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.proxy.AbstractProxyIoHandler;

class InitiatorProxyIoHandler extends AbstractProxyIoHandler {
    private final InitiatorIoHandler initiatorIoHandler;

    InitiatorProxyIoHandler(InitiatorIoHandler initiatorIoHandler) {
        super();
        this.initiatorIoHandler = initiatorIoHandler;
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        this.initiatorIoHandler.sessionCreated(session);
    }

    @Override
    public void sessionClosed(IoSession ioSession) {
        this.initiatorIoHandler.sessionClosed(ioSession);
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        this.initiatorIoHandler.messageReceived(session, message);
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        this.initiatorIoHandler.messageSent(session, message);
    }

    @Override
    public void exceptionCaught(IoSession ioSession, Throwable cause) throws Exception {
        this.initiatorIoHandler.exceptionCaught(ioSession, cause);
    }

    @Override
    public void proxySessionOpened(IoSession ioSession) {
    }
}
