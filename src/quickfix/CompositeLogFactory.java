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

public class CompositeLogFactory implements LogFactory {
    private final LogFactory[] logFactories;
    
    public CompositeLogFactory(LogFactory[] logFactories) {
        this.logFactories = logFactories;
    }
    
    public Log create(SessionID sessionID) {
        Log[] logs = new Log[logFactories.length];
        for (int i = 0; i < logFactories.length; i++) {
            logs[i] = logFactories[i].create(sessionID);
        }
        return new CompositeLog(logs);
    }

}
