/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

public interface Application {

    /**
     * Notification of a session being created
     */ 
    void onCreate(SessionID sessionId);

    /**
     * Notification of a session successfully logging on
     * @param sessionId QuickFIX session ID
     */
    void onLogon(SessionID sessionId);

    /**
     * Notification of a session logging off or disconnecting
     * @param sessionId QuickFIX session ID
     */
    void onLogout(SessionID sessionId);

    /**
     * Notification of admin message being sent to target
     * @param message QuickFIX message
     * @param sessionId QuickFIX session ID
     */
    void toAdmin(Message message, SessionID sessionId);

    /**
     * Notification of admin message being received from target
     * @param message QuickFIX message
     * @param sessionId QuickFIX session ID
     * @throws FieldNotFound
     * @throws IncorrectDataFormat
     * @throws IncorrectTagValue
     * @throws RejectLogon
     */
    void fromAdmin(Message message, SessionID sessionId)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;

    /**
     * Notification of app message being sent to target
     * @param message QuickFIX message
     * @param sessionId QuickFIX session ID
     * @throws DoNotSend -- This exception aborts message transmission
     */
    void toApp(Message message, SessionID sessionId)
    throws DoNotSend;

    /**
     * Notification of app message being received from target
     * @param message QuickFIX message
     * @param sessionId QuickFIX session ID
     * @throws FieldNotFound
     * @throws IncorrectDataFormat
     * @throws IncorrectTagValue
     * @throws UnsupportedMessageType
     */
    void fromApp(Message message, SessionID sessionId)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType;
}
