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

import org.quickfixj.CharsetSupport;
import quickfix.field.converter.UtcTimestampConverter;

import java.io.*;

/**
 * File log implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN COMPATIBILITY
 * WITH THE QUICKFIX JNI. IT SHOULD ONLY BE CREATED USING A FACTORY.
 *
 * @see quickfix.FileLogFactory
 */
public class FileLog extends AbstractLog {
    private static final byte[] TIME_STAMP_DELIMITER;

    static {
        try {
            TIME_STAMP_DELIMITER = ": ".getBytes(CharsetSupport.getCharset());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private final String messagesFileName;
    private final String eventFileName;
    private boolean syncAfterWrite;
    private final Object messagesLock = new Object();
    private final Object eventsLock = new Object();

    private FileOutputStream messages;
    private FileOutputStream events;

    private final boolean includeMillis;
    private final boolean includeTimestampForMessages;

    FileLog(String path, SessionID sessionID, boolean includeMillis, boolean includeTimestampForMessages, boolean logHeartbeats) throws FileNotFoundException {
        String sessionName = FileUtil.sessionIdFileName(sessionID);

        setLogHeartbeats(logHeartbeats);

        String prefix = FileUtil.fileAppendPath(path, sessionName + ".");
        messagesFileName = prefix + "messages.log";
        eventFileName = prefix + "event.log";

        File directory = new File(messagesFileName).getParentFile();
        directory.mkdirs();


        this.includeMillis = includeMillis;
        this.includeTimestampForMessages = includeTimestampForMessages;

        openLogStreams(true);
    }

    private void openLogStreams(boolean append) throws FileNotFoundException {
        messages = new FileOutputStream(messagesFileName, append);
        events = new FileOutputStream(eventFileName, append);
    }

    protected void logIncoming(String message) {
        writeMessage(messages, messagesLock, message, false);
    }

    protected void logOutgoing(String message) {
        writeMessage(messages, messagesLock, message, false);
    }

    private void writeMessage(FileOutputStream stream, Object lock, String message, boolean forceTimestamp) {
        try {
            synchronized (lock) {
                if (forceTimestamp || includeTimestampForMessages) {
                    writeTimeStamp(stream);
                }
                stream.write(message.getBytes(CharsetSupport.getCharset()));
                stream.write('\n');
                stream.flush();
                if (syncAfterWrite) {
                    stream.getFD().sync();
                }
            }
        } catch (IOException e) {
            // QFJ-459: no point trying to log the error in the file if we had an IOException
            // we will end up with a java.lang.StackOverflowError
            System.err.println("error writing message to log : " + message);
            e.printStackTrace(System.err);
        }
    }

    public void onEvent(String message) {
        writeMessage(events, eventsLock, message, true);
    }

    public void onErrorEvent(String message) {
        writeMessage(events, eventsLock, message, true);
    }

    private void writeTimeStamp(OutputStream out) throws IOException {
        String formattedTime = UtcTimestampConverter.convert(SystemTime.getDate(), includeMillis);
        out.write(formattedTime.getBytes(CharsetSupport.getCharset()));
        out.write(TIME_STAMP_DELIMITER);
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

    /**
     * Closed the messages and events files.
     *
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
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
            System.err.println("Could not clear log: " + getClass().getName());
        }
    }
}
