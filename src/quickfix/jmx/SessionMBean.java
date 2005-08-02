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

package quickfix.jmx;

import java.io.IOException;

/**
 * JMX MBean interface for managing QFJ Sessions.
 * 
 * This is an early access version of the interface is subject to change.
 * We are currently providing an JSR 160 RMI connector for the MBeans.
 * 
 * The naming for the session beans is currently like the following:
 * 
 * <p>
 * <code>
 * org.quickfixengine:type=Session,BeginString=FIX.4.2,SenderCompID=ABC,TargetCompID=DEF
 * </code>
 * </p>
 * 
 * We'll add in the QF session qualifier at some point. All sessions can be
 * retrieved by using a org.quickfixengine:type=Session pattern. Similarly,
 * sessions can be retrieved for a specific FIX version, company ID, etc.
 * See the JMX API for more details.
 * 
 *  @see quickfix.Session
 */
public interface SessionMBean extends StatisticsProvider {
    /**
     * Obtain the session ID as a string.
     * 
     * @return session ID string
     */
    String getID();

    /**
     * Get the target company ID for the session.
     * 
     * @return the target company ID
     */
    String getTargetCompID();

    /**
     * Get the sender company ID for the session.
     * 
     * @return the sender company ID
     */
    String getSenderCompID();

    /**
     * Get the begin string (FIX version) for the session
     * 
     * @return the begin string for the session
     */
    String getBeginString();

    /**
     * Get the next sender message sequence number. 
     * 
     * @return the next sender message sequence number
     */
    int getNextSenderMsgSeqNum();

    /**
     * Set the next sender message sequence number. It's dangerous
     * to use this operation on an active session.
     * 
     * @param next next sender message sequence number
     */
    void setNextSenderMsgSeqNum(int next);

    /**
     * Get the next target message sequence number. 
     * 
     * @return next target message sequence number
     */
    int getNextTargetMsgSeqNum();

    /**
     * Set the next target message sequence number. It's dangerous
     * to use this operation on an active session.
     * 
     * @param next the next target message sequence number
     */
    void setNextTargetMsgSeqNum(int next);

    // The message count methods are declared in the StatisticsProvider
    // interface, However, the Java Bean Introspector appears to have problems
    // finding these readonly properties without them being repeated here.
    int getIncomingMessageCount();
    int getOutgoingMessageCount();

    /**
     * Used to query the session's logon status
     * @return true is session is logged on, false otherwise
     */
    boolean isLoggedOn();

    /**
     * Used to query the role of the session.
     * 
     * @return "acceptor" is the session accepts connections, "initiator" if
     * the session initiates sessions.
     */
    String getRole();

    /**
     * Get the host name of the machine running the session.
     * 
     * @return the host name
     */
    String getHost();

    /**
     * Get the process ID of the server process running the session.
     * 
     * @return the process ID
     */
    String getProcessID();

    /**
     * Get the IP address of the remote socket for a session.
     * 
     * @return the remote IP address
     */
    String getRemoteIP();

    /**
     * Returns the description of the session, obtained from it's
     * configuration.
     * @return the session description
     */
    String getDescription();

    // Operations

    /**
     * Get messages from the resend log. This is an experimental
     * method and will probably change significantly or be removed.
     * 
     * @param start the starting message sequence number
     * @param end the ending message sequence number
     * @return a array of message strings
     */
    String[] getMessages(int start, int end) throws IOException;

    /**
     * Reset the session's sequence numbers and clear it's resend log.
     */
    void reset();

    /**
     * Tell the session to logoff.
     */
    void logoff();

    /**
     * Tell the session to logon.
     */
    void logon();

    /**
     * Tell the session to disconnect (implies logoff)
     * @throws IOException
     */
    void disconnect() throws IOException;

    /**
     * Queries if reconnect behavior is enabled. NOTE: This method and
     * related methods like disconnect may be moved to a separate MBean
     * interface related to the Session connection.
     * 
     * @return true is reconnect is enabled, false otherwise.
     */
    boolean isReconnectEnabled();

    /**
     * Controls the reconnect behavior.
     * 
     * @param flag true allows reconnect, false does not.
     */
    void setReconnectEnabled(boolean flag);

}
