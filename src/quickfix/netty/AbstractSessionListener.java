/****************************************************************************
** Copyright (c) 2001-2004 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix.netty;

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;
import net.gleamynode.netty2.SessionListener;

/**
 * Default implementation for Netty SessionListener
 * 
 * @author sbate
 * 
 * @see net.gleamynode.netty2.SessionListener
 */
public abstract class AbstractSessionListener implements SessionListener {

    public void connectionClosed(Session session) {
    }

    public void connectionEstablished(Session session) {
    }

    public void exceptionCaught(Session session, Throwable cause) {
    }

    public void messageReceived(Session session, Message message) {
    }

    public void messageSent(Session session, Message message) {
    }

    public void sessionIdle(Session session) {
    }
}