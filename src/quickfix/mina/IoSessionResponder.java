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

import org.apache.mina.common.IoSession;

import quickfix.Responder;

/**
 * The class that partially integrates the QuickFIX/J Session to a 
 * the MINA networking  * code.
 */
public class IoSessionResponder implements Responder {
    private IoSession ioSession;

    public IoSessionResponder(IoSession session) {
        ioSession = session;
    }

    public boolean send(String data) {
        ioSession.write(data);
        return true;
    }

    public void disconnect() {
        ioSession.close();
    }

    public String getRemoteIPAddress() {
        return ioSession.getRemoteAddress().toString();
    }

}