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

import java.util.ArrayList;
import java.util.List;

public class UnitTestApplication implements Application {
    public List fromAppMessages = new ArrayList();
    public List toAppMessages = new ArrayList();
    public List fromAdminMessages = new ArrayList();
    public List toAdminMessages = new ArrayList();
    public List logonSessions = new ArrayList();
    public List logoutSessions = new ArrayList();
    public List createSessions = new ArrayList();
    
    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        fromAppMessages.add(message);
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        toAppMessages.add(message);
    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        fromAdminMessages.add(message);
    }

    public void toAdmin(Message message, SessionID sessionId) {
        toAdminMessages.add(message);
    }

    public void onLogout(SessionID sessionId) {
        logoutSessions.add(sessionId);
    }

    public void onLogon(SessionID sessionId) {
        logonSessions.add(sessionId);
    }

    public void onCreate(SessionID sessionId) {
        createSessions.add(sessionId);
    }
    
    public void clear() {
        fromAppMessages.clear();;
        toAppMessages.clear();;
        fromAdminMessages.clear();;
        toAdminMessages.clear();;
        logonSessions.clear();;
        logoutSessions.clear();;
        createSessions.clear();;
    }
}