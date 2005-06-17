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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import quickfix.field.converter.UtcTimestampConverter;

/**
 * File log implementation. SHOULD ONLY BE CREATED USING A FACTORY.
 * 
 * @see quickfix.FileLogFactory
 */
public class FileLog implements Log {
    private SessionID sessionID;
    private String incomingFileName;
    private String outgoingFileName;
    private String eventFileName;

    private OutputStream incoming;
    private OutputStream outgoing;
    private OutputStream events;

    FileLog(String path, SessionID sessionID) throws FileNotFoundException {
        String sessionName = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();
        this.sessionID = sessionID;
        if (sessionID.getSessionQualifier().length() > 0) {
            sessionName += "-" + sessionID.getSessionQualifier();
        }

        String prefix = FileUtil.fileAppendPath(path, sessionName + ".");
        incomingFileName = prefix + "incoming";
        outgoingFileName = prefix + "outgoing";
        eventFileName = prefix + "events";

        File directory = new File(incomingFileName).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        incoming = new FileOutputStream(incomingFileName);
        outgoing = new FileOutputStream(outgoingFileName);
        events = new FileOutputStream(eventFileName);
    }

    public void onIncoming(String message) {
        try {
            incoming.write(message.getBytes());
            incoming.write('\n');
            incoming.flush();
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error writing incoming message to log", e);
        }
    }

    public void onOutgoing(String message) {
        try {
            outgoing.write(message.getBytes());
            outgoing.write('\n');
            outgoing.flush();
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error writing outgoing message to log", e);
        }
    }

    public void onEvent(String message) {
        try {
            String formattedTime = UtcTimestampConverter.convert(new Date(),
                    false);
            events.write(formattedTime.getBytes());
            events.write(": ".getBytes());
            events.write(message.getBytes());
            events.write('\n');
            events.flush();
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error writing event to log", e);
        }
    }

    String getEventFileName() {
        return eventFileName;
    }

    String getIncomingFileName() {
        return incomingFileName;
    }

    String getOutgoingFileName() {
        return outgoingFileName;
    }
}