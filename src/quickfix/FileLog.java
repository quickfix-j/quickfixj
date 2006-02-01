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

import quickfix.field.converter.UtcTimestampConverter;

/**
 * File log implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN COMPATIBILITY
 * WITH THE QUICKFIX JNI. IT SHOULD ONLY BE CREATED USING A FACTORY.
 * 
 * @see quickfix.FileLogFactory
 */
public class FileLog implements Log {
    private SessionID sessionID;
    private String messagesFileName;
    private String eventFileName;
    private boolean syncAfterWrite;

    private FileOutputStream messages;
    private FileOutputStream events;

    FileLog(String path, SessionID sessionID) throws FileNotFoundException {
        String sessionName = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();
        this.sessionID = sessionID;
        if (sessionID.getSessionQualifier() != null && sessionID.getSessionQualifier().length() > 0) {
            sessionName += "-" + sessionID.getSessionQualifier();
        }

        String prefix = FileUtil.fileAppendPath(path, sessionName + ".");
        messagesFileName = prefix + "messages.log";
        eventFileName = prefix + "event.log";

        File directory = new File(messagesFileName).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        openLogStreams(true);
    }

    private void openLogStreams(boolean append) throws FileNotFoundException {
        messages = new FileOutputStream(messagesFileName, append);
        events = new FileOutputStream(eventFileName, append);
    }

    public void onIncoming(String message) {
        writeMessage(message);
    }

    private void writeMessage(String message) {
        try {
            messages.write(message.getBytes());
            messages.write('\n');
            messages.flush();
            if (syncAfterWrite) {
                messages.getFD().sync();
            }
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error writing message to log", e);
        }
    }

    public void onOutgoing(String message) {
        writeMessage(message);
    }

    public void onEvent(String message) {
        try {
            String formattedTime = UtcTimestampConverter.convert(SystemTime.getDate(), false);
            events.write(formattedTime.getBytes());
            events.write(": ".getBytes());
            events.write(message.getBytes());
            events.write('\n');
            events.flush();
            if (syncAfterWrite) {
                events.getFD().sync();
            }
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error writing event to log", e);
        }
    }

    String getEventFileName() {
        return eventFileName;
    }

    String getMessagesFileName() {
        return messagesFileName;
    }

    public void setSyncAfterWrite(boolean syncAfterWrite) {
        this.syncAfterWrite = syncAfterWrite;
    }
    
    void close() throws IOException {
        messages.close();
        events.close();
    }
    
    /**
     * Deletes the log files. Do not perform any log operations while performing
     * this operation.
     */
    public void clear() {
        try {
            close();
            openLogStreams(false);
        } catch (IOException e) {
            System.err.println("Could not clear log: "+getClass().getName());
        }
    }
}