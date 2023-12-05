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

package quickfix.test.acceptance;

import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Assert;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

public class ATApplication implements Application {
    private final ATMessageCracker inboundCracker = new ATMessageCracker();
    private final MessageCracker outboundCracker = new MessageCracker(new Object());
    private final AtomicBoolean isLoggedOn = new AtomicBoolean(false);

    @Override
    public void onCreate(SessionID sessionID) {
        assertNoSessionLock(sessionID);
        Session.lookupSession(sessionID).reset();
    }

    @Override
    public void onLogon(SessionID sessionID) {
        assertNoSessionLock(sessionID);
        Assert.assertFalse("Already logged on", isLoggedOn.get());
        isLoggedOn.set(true);
    }

    private void assertNoSessionLock(SessionID sessionID) {
        Session session = Session.lookupSession(sessionID);
        Assert.assertNotNull("Can not find session: " + Thread.currentThread(), session);
        Assert.assertFalse("Application is holding session lock",
                Thread.holdsLock(session));
    }

    @Override
    public void onLogout(SessionID sessionID) {
        assertNoSessionLock(sessionID);
        inboundCracker.reset();
        Assert.assertTrue("Not logged on when logout is received", isLoggedOn.get());
        isLoggedOn.set(false);
    }

    @Override
    public void toAdmin(Message message, SessionID sessionID) {
        assertNoSessionLock(sessionID);
    }

    @Override
    public void toApp(Message message, SessionID sessionID) throws DoNotSend {
        assertNoSessionLock(sessionID);
        try {
            outboundCracker.crack(message, sessionID);
        } catch (ClassCastException e) {
            throw e;
        } catch (Exception e) {
            // ignore
        }
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionID) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        assertNoSessionLock(sessionID);
    }

    @Override
    public void fromApp(Message message, SessionID sessionID) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        assertNoSessionLock(sessionID);
        inboundCracker.crack(message, sessionID);
    }
}
