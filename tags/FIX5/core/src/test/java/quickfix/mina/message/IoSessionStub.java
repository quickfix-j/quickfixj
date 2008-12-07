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

import org.apache.mina.common.IoFilterChain;
import org.apache.mina.common.IoHandler;
import org.apache.mina.common.IoService;
import org.apache.mina.common.IoServiceConfig;
import org.apache.mina.common.IoSessionConfig;
import org.apache.mina.common.TransportType;
import org.apache.mina.common.support.BaseIoSession;

public class IoSessionStub extends BaseIoSession {

    public boolean getAttributeCalled;
    
    @Override
    public Object getAttribute(String key) {
        getAttributeCalled = true;
        return super.getAttribute(key);
    }

    public boolean setAttributeCalled;
    
    @Override
    public Object setAttribute(String key) {
        setAttributeCalled = true;
        return super.setAttribute(key);
    }

    @Override
    protected void updateTrafficMask() {
        throw new UnsupportedOperationException();
        
    }

    public IoSessionConfig getConfig() {
        throw new UnsupportedOperationException();
    }

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

    public int getScheduledWriteBytes() {
        throw new UnsupportedOperationException();
    }

    public int getScheduledWriteRequests() {
        throw new UnsupportedOperationException();
    }

    public IoService getService() {
        throw new UnsupportedOperationException();
    }

    public SocketAddress getServiceAddress() {
        throw new UnsupportedOperationException();
    }

    public IoServiceConfig getServiceConfig() {
        throw new UnsupportedOperationException();
    }

    public TransportType getTransportType() {
        throw new UnsupportedOperationException();
    }

}
