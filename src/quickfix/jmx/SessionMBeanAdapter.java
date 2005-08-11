/*******************************************************************************
 * * Copyright (c) 2001-2005 quickfixengine.org All rights reserved. * * This
 * file is part of the QuickFIX FIX Engine * * This file may be distributed
 * under the terms of the quickfixengine.org * license as defined by
 * quickfixengine.org and appearing in the file * LICENSE included in the
 * packaging of this file. * * This file is provided AS IS with NO WARRANTY OF
 * ANY KIND, INCLUDING THE * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE. * * See http://www.quickfixengine.org/LICENSE for
 * licensing information. * * Contact ask@quickfixengine.org if any conditions
 * of this licensing are * not clear to you. *
 ******************************************************************************/

package quickfix.jmx;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionSettings;

public class SessionMBeanAdapter implements SessionMBean {
    private final Log log = LogFactory.getLog(getClass());
    private final Session session;
    private SessionSettings settings;

    public SessionMBeanAdapter(Session session, SessionSettings settings) {
        this.session = session;
        this.settings = settings;
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getID()
     */
    public String getID() {
        return session.getSessionID().toString();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getTargetCompID()
     */
    public String getTargetCompID() {
        return session.getSessionID().getTargetCompID();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getSenderCompID()
     */
    public String getSenderCompID() {
        return session.getSessionID().getSenderCompID();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getBeginString()
     */
    public String getBeginString() {
        return session.getSessionID().getBeginString();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getRole()
     */
    public String getRole() {
        return getSetting(SessionFactory.SETTING_CONNECTION_TYPE);
    }

    private String getSetting(String key) {
        try {
            return settings.isSetting(session.getSessionID(), key) ? settings.getString(session
                    .getSessionID(), key) : "";
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            return "";
        }
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#isLoggedOn()
     */
    public boolean isLoggedOn() {
        return session.isLoggedOn();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getDescription()
     */
    public String getDescription() {
        return getSetting(Session.SETTING_DESCRIPTION);
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getIncomingMessageCount()
     */
    public int getIncomingMessageCount() {
        return getCallCount("fromAdmin") + getCallCount("fromApp");
    }

    // TODO JMX Complete statistics
    private int getCallCount(String methodName) {
        return 0;
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getOutgoingMessageCount()
     */
    public int getOutgoingMessageCount() {
        return getCallCount("toAdmin") + getCallCount("toApp");
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getRemoteIPAddress()
     */
    public String getRemoteIPAddress() {
        if (session.getResponder() != null) {
            return session.getResponder().getRemoteIPAddress();
        } else {
            return "";
        }
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#reset()
     */
    public void reset() throws IOException {
        session.reset();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getNextSenderMsgSeqNum()
     */
    public int getNextSenderMsgSeqNum() throws IOException {
        return session.getState().getNextSenderMsgSeqNum();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.QFJSessionMBean#setNextSenderMsgSeqNum(int)
     */
    public void setNextSenderMsgSeqNum(int next) throws IOException {
        session.setNextSenderMsgSeqNum(next);
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.QFJSessionMBean#setNextTargetMsgSeqNum(int)
     */
    public void setNextTargetMsgSeqNum(int next) throws IOException {
        session.setNextTargetMsgSeqNum(next);
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getNextTargetMsgSeqNum()
     */
    public int getNextTargetMsgSeqNum() throws IOException {
        return session.getState().getNextTargetMsgSeqNum();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getMessages(int, int)
     */
    public String[] getMessages(int startSequence, int endSequence) throws IOException {
        ArrayList messages = new ArrayList();
        session.getStore().get(startSequence, endSequence, messages);
        return (String[]) messages.toArray(new String[messages.size()]);
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.QFJSessionMBean#disconnect()
     */
    public void disconnect() throws IOException {
        session.disconnect();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.QFJSessionMBean#logon()
     */
    public void logon() {
        session.logon();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#logoff()
     */
    public void logoff() {
        session.logout();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.QFJSessionMBean#isReconnectEnabled()
     */
    public boolean isReconnectEnabled() {
        return session.isEnabled();
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getHost()
     */
    public String getHost() {
        try {
            return java.net.InetAddress.getLocalHost().getHostName();
        } catch (java.net.UnknownHostException uhe) {
            log.error(uhe.getMessage(), uhe);
            return "";
        }
    }

    /* (non-Javadoc)
     * @see quickfix.jmx.SessionMBean#getProcessID()
     */
    public String getProcessID() {
        return System.getProperty("java.pid");
    }

}