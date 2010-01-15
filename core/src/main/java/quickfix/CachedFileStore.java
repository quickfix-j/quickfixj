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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.quickfixj.CharsetSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.field.converter.UtcTimestampConverter;

/**
 * File store implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN COMPATIBILITY WITH THE QUICKFIX JNI. IT SHOULD ONLY
 * BE CREATED USING A FACTORY.
 * 
 * @see quickfix.CachedFileStoreFactory
 */
public class CachedFileStore implements MessageStore {
    
    private Logger log = LoggerFactory.getLogger(getClass());

    private static final String READ_OPTION = "r";

    private static final String WRITE_OPTION = "w";

    private static final String SYNC_OPTION = "d";

    private static final String NOSYNC_OPTION = "";

    private MemoryStore cache = new MemoryStore();

    private final String msgFileName;

    private final String headerFileName;

    private final String seqNumFileName;

    private final String sessionFileName;

    private RandomAccessFile messageFileReader;

    private RandomAccessFile messageFileWriter;

    private DataOutputStream headerDataOutputStream;

    private RandomAccessFile sequenceNumberFile;

    private final boolean syncWrites;

    private CachedHashMap messageIndex = new CachedHashMap(100);

    private FileOutputStream headerFileOutputStream;

    private String charsetEncoding = CharsetSupport.getCharset();

    CachedFileStore(String path, SessionID sessionID, boolean syncWrites) throws IOException {
        this.syncWrites = syncWrites;

        final String fullPath = new File(path == null ? "." : path).getAbsolutePath();
        String sessionName = FileUtil.sessionIdFileName(sessionID);
        String prefix = FileUtil.fileAppendPath(fullPath, sessionName + ".");

        msgFileName = prefix + "body";
        headerFileName = prefix + "header";
        seqNumFileName = prefix + "seqnums";
        sessionFileName = prefix + "session";

        File directory = new File(msgFileName).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        initialize(false);
    }

    void initialize(boolean deleteFiles) throws IOException {
        closeFiles();

        if (deleteFiles) {
            deleteFiles();
        }

        messageFileWriter = new RandomAccessFile(msgFileName, getRandomAccessFileOptions());
        messageFileReader = new RandomAccessFile(msgFileName, READ_OPTION);
        sequenceNumberFile = new RandomAccessFile(seqNumFileName, getRandomAccessFileOptions());

        initializeCache();
    }

    private void initializeCache() throws IOException {
        cache.reset();
        initializeMessageIndex();
        initializeSequenceNumbers();
        initializeSessionCreateTime();
        messageFileWriter.seek(messageFileWriter.length());
    }

    private void initializeSessionCreateTime() throws IOException {
        File sessionTimeFile = new File(sessionFileName);
        if (sessionTimeFile.exists()) {
            DataInputStream sessionTimeInput = new DataInputStream(new BufferedInputStream(new FileInputStream(sessionTimeFile)));
            try {
                Calendar c = SystemTime.getUtcCalendar(UtcTimestampConverter.convert(sessionTimeInput.readUTF()));
                cache.setCreationTime(c);
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            } finally {
                sessionTimeInput.close();
            }
        } else {
            storeSessionTimeStamp();
        }
    }

    private void storeSessionTimeStamp() throws IOException {
        DataOutputStream sessionTimeOutput = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(sessionFileName, false)));
        try {
            Date date = SystemTime.getDate();
            cache.setCreationTime(SystemTime.getUtcCalendar(date));
            sessionTimeOutput.writeUTF(UtcTimestampConverter.convert(date, true));
        } finally {
            sessionTimeOutput.close();
        }
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#getCreationTime()
     */
    public Date getCreationTime() throws IOException {
        return cache.getCreationTime();
    }

    private void initializeSequenceNumbers() throws IOException {
        sequenceNumberFile.seek(0);
        if (sequenceNumberFile.length() > 0) {
            String s = sequenceNumberFile.readUTF();
            int offset = s.indexOf(':');
            if (offset < 0) {
                throw new IOException("Invalid sequenceNumbderFile '" + seqNumFileName + "' character ':' is missing");
            }
            cache.setNextSenderMsgSeqNum(Integer.parseInt(s.substring(0, offset)));
            cache.setNextTargetMsgSeqNum(Integer.parseInt(s.substring(offset + 1)));
        }
    }

    private void initializeMessageIndex() throws IOException {
        File headerFile = new File(headerFileName);
        if (headerFile.exists()) {
            DataInputStream headerDataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(headerFile)));
            try {
                while (headerDataInputStream.available() > 0) {
                    int sequenceNumber = headerDataInputStream.readInt();
                    long offset = headerDataInputStream.readLong();
                    int size = headerDataInputStream.readInt();
                    messageIndex.put(Long.valueOf(sequenceNumber), new long[] { offset, size });
                }
            } finally {
                headerDataInputStream.close();
            }
        }
        headerFileOutputStream = new FileOutputStream(headerFileName, true);
        headerDataOutputStream = new DataOutputStream(new BufferedOutputStream(headerFileOutputStream));
    }

    private String getRandomAccessFileOptions() {
        return READ_OPTION + WRITE_OPTION + (syncWrites ? SYNC_OPTION : NOSYNC_OPTION);
    }

    /**
     * Close the store's files.
     * 
     * @throws IOException
     */
    public void closeFiles() throws IOException {
        closeOutputStream(headerDataOutputStream);
        closeFile(messageFileWriter);
        closeFile(messageFileReader);
        closeFile(sequenceNumberFile);
    }

    private void closeFile(RandomAccessFile file) throws IOException {
        if (file != null) {
            file.close();
        }
    }

    private void closeOutputStream(OutputStream stream) throws IOException {
        if (stream != null) {
            stream.close();
        }
    }

    public void deleteFiles() throws IOException {
        closeFiles();
        deleteFile(headerFileName);
        deleteFile(msgFileName);
        deleteFile(seqNumFileName);
        deleteFile(sessionFileName);
    }

    private void deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists() && !file.delete()) {
            log.error("File delete failed: " + fileName);
        }
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#getNextSenderMsgSeqNum()
     */
    public int getNextSenderMsgSeqNum() throws IOException {
        return cache.getNextSenderMsgSeqNum();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#getNextTargetMsgSeqNum()
     */
    public int getNextTargetMsgSeqNum() throws IOException {
        return cache.getNextTargetMsgSeqNum();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#setNextSenderMsgSeqNum(int)
     */
    public void setNextSenderMsgSeqNum(int next) throws IOException {
        cache.setNextSenderMsgSeqNum(next);
        storeSequenceNumbers();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#setNextTargetMsgSeqNum(int)
     */
    public void setNextTargetMsgSeqNum(int next) throws IOException {
        cache.setNextTargetMsgSeqNum(next);
        storeSequenceNumbers();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#incrNextSenderMsgSeqNum()
     */
    public void incrNextSenderMsgSeqNum() throws IOException {
        cache.incrNextSenderMsgSeqNum();
        storeSequenceNumbers();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#incrNextTargetMsgSeqNum()
     */
    public void incrNextTargetMsgSeqNum() throws IOException {
        cache.incrNextTargetMsgSeqNum();
        storeSequenceNumbers();
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#get(int, int, java.util.Collection)
     */
    public void get(int startSequence, int endSequence, Collection<String> messages) throws IOException {
        Collection<String> readedMsg = getMessage(startSequence, endSequence);
        messages.addAll(readedMsg);
    }

    /**
     * This method is here for JNI API consistency but it's not implemented. Use get(int, int, Collection) with the same
     * start and end sequence.
     */
    public boolean get(int sequence, String message){
        throw new UnsupportedOperationException("not supported");
    }

    private String read(long offset, long size) throws IOException {
        String message = null;
        byte[] data = new byte[(int) size];

        messageFileReader.seek(offset);
        if (messageFileReader.read(data) != size) {
            throw new IOException("Truncated input while reading message: "+new String(data, charsetEncoding));
        }
        message = new String(data, charsetEncoding);

        return message;
    }

    private Collection<String> getMessage(long startSequence, long endSequence) throws IOException {
        Collection<String> messages = new ArrayList<String>();

        List<long[]> offsetAndSizes = messageIndex.get(startSequence, endSequence);
        for (long[] offsetAndSize : offsetAndSizes) {
            if (offsetAndSize != null) {
                String message = read(offsetAndSize[0], offsetAndSize[1]);
                messages.add(message);
            }
        }

        messageFileReader.seek(messageFileReader.length());
        return messages;
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#set(int, java.lang.String)
     */
    public boolean set(int sequence, String message) throws IOException {
        long offset = messageFileWriter.getFilePointer();
        int size = message.length();
        messageIndex.put(Long.valueOf(sequence), new long[] { offset, size });
        headerDataOutputStream.writeInt(sequence);
        headerDataOutputStream.writeLong(offset);
        headerDataOutputStream.writeInt(size);
        headerDataOutputStream.flush();
        if (syncWrites) {
            headerFileOutputStream.getFD().sync();
        }
        messageFileWriter.write(message.getBytes(CharsetSupport.getCharset()));
        return true;
    }

    private void storeSequenceNumbers() throws IOException {
        sequenceNumberFile.seek(0);
        // I changed this from explicitly using a StringBuffer because of
        // recommendations from Sun. The performance also appears higher
        // with this implementation. -- smb.
        // http://bugs.sun.com/bugdatabase/view_bug.do;:WuuT?bug_id=4259569
        sequenceNumberFile.writeUTF("" + cache.getNextSenderMsgSeqNum() + ':' + cache.getNextTargetMsgSeqNum());
    }

    String getHeaderFileName() {
        return headerFileName;
    }

    String getMsgFileName() {
        return msgFileName;
    }

    String getSeqNumFileName() {
        return seqNumFileName;
    }

    /*
     * (non-Javadoc)
     * @see quickfix.RefreshableMessageStore#refresh()
     */
    public void refresh() throws IOException {
        initialize(false);
    }

    /*
     * (non-Javadoc)
     * @see quickfix.MessageStore#reset()
     */
    public void reset() throws IOException {
        initialize(true);
    }

    /**
     * @author mratsimbazafy 29 août 2008
     */
    private class CachedHashMap implements Map<Long, long[]> {

        private TreeMap<Long, long[]> cacheIndex = new TreeMap<Long, long[]>();

        private int currentSize;

        private int maxSize;

        public CachedHashMap(int _maxSize) {
            currentSize = 0;
            maxSize = _maxSize;
        }

        public void clear() {
            cacheIndex.clear();
            currentSize = 0;
        }

        public boolean containsKey(Object key) {
            return cacheIndex.containsKey(key);
        }

        public boolean containsValue(Object value) {
            return cacheIndex.containsValue(value);
        }

        public Set<java.util.Map.Entry<Long, long[]>> entrySet() {
            return cacheIndex.entrySet();
        }

        public long[] get(Object key) {
            final long[] v = cacheIndex.get(key);
            if (v != null)
                return v;
            return seekMessageIndex((Long) key);
        }

        public boolean isEmpty() {
            return cacheIndex.isEmpty();
        }

        public Set<Long> keySet() {
            return cacheIndex.keySet();
        }

        public long[] put(Long key, long[] value) {
            cacheIndex.put(key, value);
            currentSize++;
            if (currentSize > maxSize) {
                Iterator<Entry<Long, long[]>> it = cacheIndex.entrySet().iterator();
                it.next();
                it.remove();
                currentSize--;
            }
            return value;
        }

        public void putAll(Map<? extends Long, ? extends long[]> t) {
            throw new UnsupportedOperationException("not supported");
        }

        public long[] remove(Object key) {
            throw new UnsupportedOperationException("not supported");
        }

        public int size() {
            return cacheIndex.size();
        }

        public Collection<long[]> values() {
            return cacheIndex.values();
        }

        private long[] seekMessageIndex(final long index) {
            File headerFile = new File(headerFileName);
            if (headerFile.exists()) {
                DataInputStream headerDataInputStream = null;
                try {
                    headerDataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(headerFile)));
                    while (headerDataInputStream.available() > 0) {
                        final int sequenceNumber = headerDataInputStream.readInt();
                        final long offset = headerDataInputStream.readLong();
                        final int size = headerDataInputStream.readInt();
                        if (index == sequenceNumber) {
                            return new long[] { offset, size };
                        }
                    }
                } catch (IOException e) {
                    return null;
                } finally {
                    try {
                        if (headerDataInputStream != null) {
                            headerDataInputStream.close();
                        }
                    } catch (IOException e) {
                        log.error("", e);
                    }
                }
            }
            return null;
        }

        private List<long[]> seekMessageIndex(final long startSequence, final long endSequence) {
            TreeMap<Integer  , long[]> indexPerSequenceNumber = new TreeMap<Integer , long[]>();
            File headerFile = new File(headerFileName);
            if (headerFile.exists()) {
                DataInputStream headerDataInputStream = null;
                try {
                    headerDataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(headerFile)));
                    while (headerDataInputStream.available() > 0) {
                        final int sequenceNumber = headerDataInputStream.readInt();
                      final Integer sequenceNumberInteger = Integer.valueOf(sequenceNumber);
                        final long offset = headerDataInputStream.readLong();
                        final int size = headerDataInputStream.readInt();
                        if (sequenceNumber >= startSequence && sequenceNumber <= endSequence) {
                           indexPerSequenceNumber.put(sequenceNumberInteger, new long[] { offset, size });
                        }
                    }
                } catch (IOException e) {
                    log.error("", e);
                    return null;
                } finally {
                    try {
                        if (headerDataInputStream != null) {
                            headerDataInputStream.close();
                        }
                    } catch (IOException e) {
                        log.error("", e);
                    }
                }
            }
            return new ArrayList<long[]>(indexPerSequenceNumber.values());
        }

        public List<long[]> get(final long startSequence, final long endSequence) {
            return seekMessageIndex(startSequence, endSequence);
        }

    }
}