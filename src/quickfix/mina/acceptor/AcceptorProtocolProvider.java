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

package quickfix.mina.acceptor;

import java.util.Map;

import org.apache.mina.protocol.ProtocolHandler;

import quickfix.mina.AbstractProtocolProvider;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;

class AcceptorProtocolProvider extends AbstractProtocolProvider {
    private final AcceptorProtocolHandler protocolHandler;

    public AcceptorProtocolProvider(Map acceptorSessions, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandlingStrategy) {
        protocolHandler = new AcceptorProtocolHandler(acceptorSessions, networkingOptions,
                eventHandlingStrategy);
    }

    public ProtocolHandler getHandler() {
        return protocolHandler;
    }

}
