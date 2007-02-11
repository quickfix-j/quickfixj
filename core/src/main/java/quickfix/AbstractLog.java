/*============================================================================
 *
 * Copyright (c) 2000-2007 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

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
