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

import java.net.SocketAddress;

import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.session.DummySession;

public class IoSessionStub extends DummySession {

    public IoFilterChain getFilterChain() {
        throw new UnsupportedOperationException();
    }

    public IoHandler getHandler() {
        throw new UnsupportedOperationException();
    }

    public SocketAddress getLocalAddress() {
        throw new UnsupportedOperationException();
    }

    public SocketAddress getRemoteAddress() {
        throw new UnsupportedOperationException();
    }

    public IoService getService() {
        throw new UnsupportedOperationException();
    }

    public SocketAddress getServiceAddress() {
        throw new UnsupportedOperationException();
    }
}
