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

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.quickfixj.CharsetSupport;

import quickfix.field.converter.UtcTimestampConverter;

public class FileLogTest {

    @Before
    public void setUp() throws Exception {
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }

    @Test
    public void testLog() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, getTempDirectory());
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.clear();
        log.setSyncAfterWrite(true);

        String prefix = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();

        log.onIncoming("INTEST");
        assertEquals("wrong message", "INTEST\n", readLog(log.getMessagesFileName()));
        assertEquals(prefix + ".messages.log", new File(log.getMessagesFileName()).getName());
        log.clear();

        // Also, tests encoding
        
        // äbcfödçé
        String outgoingText = "OUTTEST \u00E4bcf\u00F6d\u00E7\u00E9";
        log.onOutgoing(outgoingText);
        assertEquals("wrong message", outgoingText + "\n", readLog(log.getMessagesFileName()));

        // Bug #140
        assertEquals(prefix + ".event.log", new File(log.getEventFileName()).getName());

        log.onEvent("EVENTTEST");
        log.close();

        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), false);
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));

        // Test append - Bug #140
        // The last output should still be in the file
        log = (FileLog) factory.create(sessionID);
        assertEquals("wrong message", outgoingText + "\n", readLog(log.getMessagesFileName()));
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));
    }

    private String getTempDirectory() throws IOException {
        File path = File.createTempFile("test", "");
        File tempdir = path.getParentFile();
        return tempdir.getAbsolutePath();
    }

    @Test
    public void testHeartbeatFiltering() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, getTempDirectory());
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.clear();
        log.setSyncAfterWrite(true);

        String prefix = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();

        String loggedText = "HEARTBEAT\00135=0\001";

        log.onIncoming(loggedText);
        assertEquals("wrong message", loggedText + "\n", readLog(log.getMessagesFileName()));
        assertEquals(prefix + ".messages.log", new File(log.getMessagesFileName()).getName());
        log.clear();

        log.onOutgoing(loggedText);
        assertEquals("wrong message", loggedText + "\n", readLog(log.getMessagesFileName()));
        log.clear();

        settings.setBool(FileLogFactory.SETTING_LOG_HEARTBEATS, false);
        log = (FileLog) factory.create(sessionID);

        loggedText = "FILTERED_HEARTBEAT\00135=0\001";

        log.onIncoming(loggedText);
        assertEquals("wrong message", "", readLog(log.getMessagesFileName()));

        log.onOutgoing(loggedText);
        assertEquals("wrong message", "", readLog(log.getMessagesFileName()));

        log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

    }

    @Test
    public void testLogWithMessageTimestamps() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, getTempDirectory());
        settings.setBool(sessionID, FileLogFactory.SETTING_INCLUDE_TIMESTAMP_FOR_MESSAGES, true);

        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), false);

        String prefix = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();

        log.onIncoming("INTEST");
        assertEquals("wrong message", formattedTime + ": " + "INTEST\n", readLog(log
                .getMessagesFileName()));
        assertEquals(prefix + ".messages.log", new File(log.getMessagesFileName()).getName());
        log.clear();

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", formattedTime + ": " + "OUTTEST\n", readLog(log
                .getMessagesFileName()));
    }

    @Test
    public void testLogWithMillisInTimestamp() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, getTempDirectory());
        settings.setBool(sessionID, FileLogFactory.SETTING_INCLUDE_MILLIS_IN_TIMESTAMP, true);

        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

        log.onEvent("EVENTTEST");
        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), true);
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));
    }

    private String readLog(String path) throws IOException {
        File file = new File(path);
        FileInputStream in = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        in.read(data);
        in.close();
        return new String(data, CharsetSupport.getCharset());

    }
    
    @Test
    public void testLogErrorWhenFilesystemRemoved() throws IOException{
        //QFJ-459
        long systemTime = System.currentTimeMillis();
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, getTempDirectory());
        settings.setBool(sessionID, FileLogFactory.SETTING_INCLUDE_MILLIS_IN_TIMESTAMP, false);
        FileLogFactory factory = new FileLogFactory(settings);
        
        Session session = new Session(new UnitTestApplication(), new MemoryStoreFactory(),
                sessionID, new DefaultDataDictionaryProvider(), null, factory,
                new DefaultMessageFactory(), 0);
        Session.registerSession(session);
        
        FileLog log = (FileLog) session.getLog();
        log.close();
        log.logIncoming("test");
        //no stack overflow exception thrown
    }
}