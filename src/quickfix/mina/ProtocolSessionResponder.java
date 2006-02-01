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

import org.apache.mina.protocol.ProtocolSession;

import quickfix.Responder;

public class ProtocolSessionResponder implements Responder {
    private ProtocolSession protocolSession;

    public ProtocolSessionResponder(ProtocolSession session) {
        protocolSession = session;
    }

    public boolean send(String data) {
        protocolSession.write(data);
        return true;
    }

    public void disconnect() {
        protocolSession.close();
    }

    public String getRemoteIPAddress() {
        return protocolSession.getRemoteAddress().toString();
    }

}