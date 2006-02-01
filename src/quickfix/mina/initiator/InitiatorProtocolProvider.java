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

import org.apache.mina.protocol.ProtocolHandler;

import quickfix.Session;
import quickfix.mina.AbstractProtocolProvider;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;

class InitiatorProtocolProvider extends AbstractProtocolProvider {

    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;
    private final NetworkingOptions networkingOptions;

    public InitiatorProtocolProvider(Session quickfixSession, NetworkingOptions networkingOptions,
            EventHandlingStrategy strategy) {
        this.quickfixSession = quickfixSession;
        this.networkingOptions = networkingOptions;
        eventHandlingStrategy = strategy;
    }

    public ProtocolHandler getHandler() {
        return new InitiatorProtocolHandler(quickfixSession, networkingOptions, eventHandlingStrategy);
    }

}
