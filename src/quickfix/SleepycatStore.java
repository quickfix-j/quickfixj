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

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sleepycat.bind.EntryBinding;
import com.sleepycat.bind.tuple.TupleBinding;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.Cursor;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.OperationStatus;

public class SleepycatStore implements RefreshableMessageStore {
    private Log log = LogFactory.getLog(getClass());
    private final SessionID sessionID; // session key
    private SessionInfo info;

    private final String dbDir;
    private String seqDbName = "seq";
    private String msgDbName = "outmsg";

    private Database messageDatabase;
    private Database sequenceDatabase;
    private SessionIDTupleBinding sessionIDBinding = new SessionIDTupleBinding();
    private SessionInfoTupleBinding sessionInfoBinding = new SessionInfoTupleBinding();
    private Environment environment;

    private static class SessionIDTupleBinding extends TupleBinding {
        /*
         * (non-Javadoc)
         * 
         * @see com.sleepycat.bind.tuple.TupleBinding#entryToObject(com.sleepycat.bind.tuple.TupleInput)
         */
        public Object entryToObject(TupleInput tupleIn) {
            return new SessionID(tupleIn.readString(), tupleIn.readString(), tupleIn.readString(),
                    tupleIn.readString());
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sleepycat.bind.tuple.TupleBinding#objectToEntry(java.lang.Object,
         *      com.sleepycat.bind.tuple.TupleOutput)
         */
        public void objectToEntry(Object object, TupleOutput tupleOut) {
            SessionID sessionID = (SessionID) object;
            tupleOut.writeString(sessionID.getBeginString());
            tupleOut.writeString(sessionID.getSenderCompID());
            tupleOut.writeString(sessionID.getTargetCompID());
            tupleOut.writeString(sessionID.getSessionQualifier());
        }
    }

    private static class SessionInfoTupleBinding extends TupleBinding {
        /*
         * (non-Javadoc)
         * 
         * @see com.sleepycat.bind.tuple.TupleBinding#entryToObject(com.sleepycat.bind.tuple.TupleInput)
         */
        public Object entryToObject(TupleInput tupleIn) {
            return new SessionInfo(SystemTime.getUtcCalendar(new Date(tupleIn.readLong())), tupleIn
                    .readInt(), tupleIn.readInt());
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sleepycat.bind.tuple.TupleBinding#objectToEntry(java.lang.Object,
         *      com.sleepycat.bind.tuple.TupleOutput)
         */
        public void objectToEntry(Object object, TupleOutput tupleOut) {
            SessionInfo sessionInfo = (SessionInfo) object;
            tupleOut.writeLong(sessionInfo.getCreationTime().getTimeInMillis());
            tupleOut.writeInt(sessionInfo.getNextSenderMsgSeqNum());
            tupleOut.writeInt(sessionInfo.getNextTargetMsgSeqNum());
        }
    }

    private static class SessionInfo {
        private int nextSenderMsgSeqNum;
        private int nextTargetMsgSeqNum;
        private Calendar creationTime;

        public SessionInfo() {
            this(SystemTime.getUtcCalendar(), 1, 1);
        }

        public SessionInfo(Calendar creationTime, int nextSenderMsgSeqNum, int nextTargetMsgSeqNum) {
            super();
            this.creationTime = creationTime;
            this.nextSenderMsgSeqNum = nextSenderMsgSeqNum;
            this.nextTargetMsgSeqNum = nextTargetMsgSeqNum;
        }

        public Calendar getCreationTime() {
            return creationTime;
        }

        public int getNextSenderMsgSeqNum() {
            return nextSenderMsgSeqNum;
        }

        public int getNextTargetMsgSeqNum() {
            return nextTargetMsgSeqNum;
        }

        public void setCreationTime(Calendar creationTime) {
            this.creationTime = creationTime;
        }

        public void setNextSenderMsgSeqNum(int nextSenderMsgSeqNum) {
            this.nextSenderMsgSeqNum = nextSenderMsgSeqNum;
        }

        public void setNextTargetMsgSeqNum(int nextTargetMsgSeqNum) {
            this.nextTargetMsgSeqNum = nextTargetMsgSeqNum;
        }
    }

    public SleepycatStore(SessionID sessionID, String databaseDir, String sequenceDbName,
            String messageDbName) throws IOException {
        this.sessionID = sessionID;
        dbDir = databaseDir;
        seqDbName = sequenceDbName;
        msgDbName = messageDbName;
        open();
    }

    void open() throws IOException {
        try {
            // Open the environment. Create it if it does not already exist.
            EnvironmentConfig envConfig = new EnvironmentConfig();
            envConfig.setAllowCreate(true);
            environment = new Environment(new File(dbDir), envConfig);

            DatabaseConfig dbConfig = new DatabaseConfig();
            dbConfig.setAllowCreate(true);

            // Open the database. Create it if it does not already exist.
            messageDatabase = environment.openDatabase(null, msgDbName, dbConfig);
            sequenceDatabase = environment.openDatabase(null, seqDbName, dbConfig);

            loadSessionInfo();
        } catch (DatabaseException dbe) {
            convertToIOExceptionAndRethrow(dbe);
        }
    }

    void close() throws IOException {
        try {
            messageDatabase.close();
            sequenceDatabase.close();
            environment.close();
        } catch (DatabaseException e) {
            convertToIOExceptionAndRethrow(e);
        }
    }

    public synchronized void get(int startSequence, int endSequence, Collection messages)
            throws IOException {
        Cursor cursor = null;
        try {
            DatabaseEntry sequenceKey = new DatabaseEntry();
            EntryBinding sequenceBinding = TupleBinding.getPrimitiveBinding(Integer.class);
            // Must start at start-1 because db will look for next record larger
            sequenceBinding.objectToEntry(new Integer(startSequence - 1), sequenceKey);

            cursor = messageDatabase.openCursor(null, null);
            DatabaseEntry messageBytes = new DatabaseEntry();
            OperationStatus retVal = cursor.getSearchKeyRange(sequenceKey, messageBytes,
                    LockMode.DEFAULT);

            if (retVal == OperationStatus.NOTFOUND) {
                log.debug(sequenceKey + "/" + messageBytes + " not matched in database "
                        + messageDatabase.getDatabaseName());
                return;
            } else {
                Integer sequenceNumber = (Integer) sequenceBinding.entryToObject(sequenceKey);
                while (sequenceNumber.intValue() <= endSequence) {
                    messages.add(new String(messageBytes.getData()));
                    if (log.isDebugEnabled()) {
                        log.debug("Found record " + sequenceNumber + "=>"
                                + new String(messageBytes.getData()) + " for search key/data: "
                                + sequenceKey + "=>" + messageBytes);
                    }
                    cursor.getNext(sequenceKey, messageBytes, LockMode.DEFAULT);
                    sequenceNumber = (Integer) sequenceBinding.entryToObject(sequenceKey);
                }
            }
        } catch (Exception e) {
            convertToIOExceptionAndRethrow(e);
        } finally {
            try {
                cursor.close();
            } catch (DatabaseException dbe) {
                convertToIOExceptionAndRethrow(dbe);
            }
        }
    }

    private void convertToIOExceptionAndRethrow(Exception e) throws IOException {
        if (e instanceof IOException) {
            throw (IOException) e;
        }
        IOException ioe = new IOException(e.getMessage());
        ioe.setStackTrace(e.getStackTrace());
        throw ioe;
    }

    public Date getCreationTime() throws IOException {
        return info.getCreationTime().getTime();
    }

    public int getNextSenderMsgSeqNum() throws IOException {
        return info.getNextSenderMsgSeqNum();
    }

    public int getNextTargetMsgSeqNum() throws IOException {
        return info.getNextTargetMsgSeqNum();
    }

    public void incrNextSenderMsgSeqNum() throws IOException {
        info.setNextSenderMsgSeqNum(info.getNextSenderMsgSeqNum() + 1);
        storeSessionInfo();
    }

    public void incrNextTargetMsgSeqNum() throws IOException {
        info.setNextTargetMsgSeqNum(info.getNextTargetMsgSeqNum() + 1);
        storeSessionInfo();
    }

    public void reset() throws IOException {
        try {
            info = new SessionInfo();
            storeSessionInfo();
            sequenceDatabase.close();
            messageDatabase.close();
            environment.truncateDatabase(null, seqDbName, false);
            environment.truncateDatabase(null, msgDbName, false);
            environment.close();
            open();
        } catch (DatabaseException e) {
            convertToIOExceptionAndRethrow(e);
        }
    }

    public boolean set(int sequence, String message) throws IOException {
        try {
            DatabaseEntry sequenceKey = new DatabaseEntry();
            EntryBinding sequenceBinding = TupleBinding.getPrimitiveBinding(Integer.class);
            sequenceBinding.objectToEntry(new Integer(sequence), sequenceKey);
            DatabaseEntry messageBytes = new DatabaseEntry(message.getBytes("UTF-8"));
            messageDatabase.put(null, sequenceKey, messageBytes);
        } catch (Exception e) {
            convertToIOExceptionAndRethrow(e);
        }
        return true;
    }

    public void setNextSenderMsgSeqNum(int next) throws IOException {
        info.setNextSenderMsgSeqNum(next);
        storeSessionInfo();
    }

    public void setNextTargetMsgSeqNum(int next) throws IOException {
        info.setNextTargetMsgSeqNum(next);
        storeSessionInfo();
    }

    private final DatabaseEntry sessionIDKey = new DatabaseEntry();
    private final DatabaseEntry sessionInfoBytes = new DatabaseEntry();

    private void loadSessionInfo() throws IOException {
        synchronized (sessionIDKey) {
            sessionIDBinding.objectToEntry(sessionID, sessionIDKey);

            try {
                sequenceDatabase.get(null, sessionIDKey, sessionInfoBytes, LockMode.DEFAULT);
                if (sessionInfoBytes.getSize() > 0) {
                    info = (SessionInfo) sessionInfoBinding.entryToObject(sessionInfoBytes);
                } else {
                    info = new SessionInfo();
                    storeSessionInfo();
                }

            } catch (DatabaseException e) {
                convertToIOExceptionAndRethrow(e);
            }
        }
    }

    private void storeSessionInfo() throws IOException {
        synchronized (sessionIDKey) {
            sessionIDBinding.objectToEntry(sessionID, sessionIDKey);
            sessionInfoBinding.objectToEntry(info, sessionInfoBytes);

            try {
                sequenceDatabase.put(null, sessionIDKey, sessionInfoBytes);
            } catch (DatabaseException e) {
                convertToIOExceptionAndRethrow(e);
            }
        }
    }

    public void refresh() throws IOException {
        loadSessionInfo();
    }
}