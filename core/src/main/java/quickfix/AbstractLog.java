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

package quickfix;

abstract class AbstractLog implements Log {
    private boolean logHeartbeats;

    protected void setLogHeartbeats(boolean logHeartbeats) {
        this.logHeartbeats = logHeartbeats;
    }

    public final void onIncoming(String message) {
        if (!logHeartbeats && MessageUtils.isHeartbeat(message)) {
            return;
        }
        logIncoming(message);
    }

    protected abstract void logIncoming(String message);
    
    public final void onOutgoing(String message) {
        if (!logHeartbeats && MessageUtils.isHeartbeat(message)) {
            return;
        }
        logOutgoing(message);
    }
    
    protected abstract void logOutgoing(String message);
}
