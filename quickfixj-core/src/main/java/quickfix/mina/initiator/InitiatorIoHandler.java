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

package quickfix.mina.initiator;

import org.apache.mina.core.session.IoSession;

import quickfix.Message;
import quickfix.MessageUtils;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;
import quickfix.field.MsgType;
import quickfix.mina.AbstractIoHandler;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;

class InitiatorIoHandler extends AbstractIoHandler {
    private final Session quickfixSession;
    private final EventHandlingStrategy eventHandlingStrategy;

    public InitiatorIoHandler(Session quickfixSession, NetworkingOptions networkingOptions,
            EventHandlingStrategy eventHandlingStrategy) {
        super(networkingOptions, eventHandlingStrategy);
        this.quickfixSession = quickfixSession;
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        super.sessionCreated(session);
        session.setAttribute(SessionConnector.QF_SESSION, quickfixSession);
        NetworkingOptions networkingOptions = getNetworkingOptions();
        quickfixSession.setResponder(new IoSessionResponder(session,
                networkingOptions.getSynchronousWrites(),
                networkingOptions.getSynchronousWriteTimeout(),
                quickfixSession.getMaxScheduledWriteRequests()));
        quickfixSession.getLog().onEvent("MINA session created: " + quickfixSession.getSessionID() + ": local="
                + session.getLocalAddress() + ", " + session.getClass() + ", remote="
                + session.getRemoteAddress());
    }

    @Override
    protected void processMessage(IoSession protocolSession, Message message) throws Exception {
        if (message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
            final SessionID sessionID = MessageUtils.getReverseSessionID(message);
            if (sessionID.isFIXT()) {
                if (message.isSetField(DefaultApplVerID.FIELD)) {
                    final ApplVerID applVerID = new ApplVerID(message.getString(DefaultApplVerID.FIELD));
                    quickfixSession.setTargetDefaultApplicationVersionID(applVerID);
                    quickfixSession.getLog().onEvent("Setting DefaultApplVerID (" + DefaultApplVerID.FIELD + "="
                            + applVerID.getValue() + ") from Logon");
                }
            }
        }
        eventHandlingStrategy.onMessage(quickfixSession, message);
    }

}
