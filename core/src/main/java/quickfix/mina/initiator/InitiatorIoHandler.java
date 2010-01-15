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

import org.apache.mina.common.IoSession;

import quickfix.Message;
import quickfix.Session;
import quickfix.mina.AbstractIoHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;

class InitiatorIoHandler extends AbstractIoHandler {
    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;

    public InitiatorIoHandler(Session quickfixSession, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandlingStrategy) {
        super(networkingOptions);
        this.quickfixSession = quickfixSession;
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    public void sessionCreated(IoSession session) throws Exception {
        super.sessionCreated(session);
        session.setAttribute(SessionConnector.QF_SESSION, quickfixSession);
        NetworkingOptions networkingOptions = getNetworkingOptions();
        quickfixSession.setResponder(new IoSessionResponder(session, 
                networkingOptions.getSynchronousWrites(),
                networkingOptions.getSynchronousWriteTimeout()));
        log.info("MINA session created for " + quickfixSession.getSessionID() + ": local="
                + session.getLocalAddress() + ", " + session.getClass() + ", remote="
                + session.getRemoteAddress());
    }

    protected void processMessage(IoSession protocolSession, Message message) throws Exception {
        eventHandlingStrategy.onMessage(quickfixSession, message);
    }

}
