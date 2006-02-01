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

import org.apache.mina.protocol.ProtocolSession;

import quickfix.Message;
import quickfix.Session;
import quickfix.mina.AbstractProtocolHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolSessionResponder;
import quickfix.mina.SessionConnector;

class InitiatorProtocolHandler extends AbstractProtocolHandler {
    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;
    
    public InitiatorProtocolHandler(Session quickfixSession, NetworkingOptions networkingOptions, EventHandlingStrategy eventHandlingStrategy) {
        super(networkingOptions);
        this.quickfixSession = quickfixSession;
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    public void sessionCreated(ProtocolSession session) throws Exception {
        super.sessionCreated(session);
        session.setAttribute(SessionConnector.QF_SESSION, quickfixSession);
        quickfixSession.setResponder(new ProtocolSessionResponder(session));
        log.info("MINA session created: " + session.getLocalAddress());
    }

    protected void processMessage(ProtocolSession protocolSession, Message message) throws Exception {
        eventHandlingStrategy.onMessage(quickfixSession, message);
    }

}
