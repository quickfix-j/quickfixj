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

import java.io.IOException;
import java.net.SocketAddress;

public class ConnectException extends IOException {

    private final SocketAddress socketAddress;

    public ConnectException(SocketAddress socketAddress) {
        this.socketAddress = socketAddress;
    }

    public ConnectException(String message, Throwable cause, SocketAddress socketAddress) {
        super(message, cause);
        this.socketAddress = socketAddress;
    }

    public ConnectException(String message, SocketAddress socketAddress) {
        super(message);
        this.socketAddress = socketAddress;
    }

    public ConnectException(Throwable cause, SocketAddress socketAddress) {
        super(cause.getMessage(), cause);
        this.socketAddress = socketAddress;
    }

    public SocketAddress getSocketAddress() {
        return socketAddress;
    }
}
