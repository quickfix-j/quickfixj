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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * File store implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN
 * COMPATIBILITY WITH THE QUICKFIX JNI. IT SHOULD ONLY BE CREATED USING A
 * FACTORY.
 *
 * @see quickfix.FileStoreFactory
 */
public class FileStore implements MessageStore, Closeable {
    private static final String READ_OPTION = "r";
    private static final String WRITE_OPTION = "w";
    private static final String SYNC_OPTION = "d";
    private static final String NOSYNC_OPTION = "";

    private final TreeMap<Long, long[]> messageIndex;
    private final MemoryStore cache = new MemoryStore();

    private final String msgFileName;
    private final String headerFileName;
    private final String senderSeqNumFileName;
    private final String targetSeqNumFileName;
    private final String sessionFileName;
    private final boolean syncWrites;
    private final int maxCachedMsgs;
    private final String charsetEncoding = CharsetSupport.getCharset();
    private RandomAccessFile messageFileReader;
    private RandomAccessFile messageFileWriter;
    private DataOutputStream headerDataOutputStream;
    private FileOutputStream headerFileOutputStream;
    private RandomAccessFile senderSequenceNumberFile;
    private RandomAccessFile targetSequenceNumberFile;

    FileStore(String path, SessionID sessionID, boolean syncWrites, int maxCachedMsgs)
            throws IOException {
        this.syncWrites = syncWrites;
        this.maxCachedMsgs = maxCachedMsgs;

        messageIndex = maxCachedMsgs > 0 ? new TreeMap<>() : null;

        final String fullPath = new File(path == null ? "." : path).getAbsolutePath();
        final String sessionName = FileUtil.sessionIdFileName(sessionID);
        final String prefix = FileUtil.fileAppendPath(fullPath, sessionName + ".");

        msgFileName = prefix + "body";
        headerFileName = prefix + "header";
        senderSeqNumFileName = prefix + "senderseqnums";
        targetSeqNumFileName = prefix + "targetseqnums";
        sessionFileName = prefix + "session";

        final File directory = new File(msgFileName).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        initialize(false);
    }

    void initialize(boolean deleteFiles) throws IOException {
        if (deleteFiles) {
            closeAndDeleteFiles();
        } else {
            close();
        }

        String mode = READ_OPTION + WRITE_OPTION + (syncWrites ? SYNC_OPTION : NOSYNC_OPTION);
        messageFileWriter = new RandomAccessFile(msgFileName, mode); // also creates file
        messageFileReader = new RandomAccessFile(msgFileName, READ_OPTION);
        senderSequenceNumberFile = new RandomAccessFile(senderSeqNumFileName, mode);
        targetSequenceNumberFile = new RandomAccessFile(targetSeqNumFileName, mode);

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
        final File sessionTimeFile = new File(sessionFileName);
        if (sessionTimeFile.exists() && sessionTimeFile.length() > 0) {
            try (DataInputStream sessionTimeInput = new DataInputStream(new BufferedInputStream(
                    new FileInputStream(sessionTimeFile)))) {
                final Calendar c = SystemTime.getUtcCalendar(UtcTimestampConverter
                        .convert(sessionTimeInput.readUTF()));
                cache.setCreationTime(c);
            } catch (final Exception e) {
                throw new IOException(e.getMessage());
            }
        } else {
            storeSessionTimeStamp();
        }
    }

    private void storeSessionTimeStamp() throws IOException {
        try (DataOutputStream sessionTimeOutput = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(sessionFileName, false)))) {
            final Date date = SystemTime.getDate();
            cache.setCreationTime(SystemTime.getUtcCalendar(date));
            sessionTimeOutput.writeUTF(UtcTimestampConverter.convert(date, true));
        }
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#getCreationTime()
     */
    @Override
    public Date getCreationTime() throws IOException {
        return cache.getCreationTime();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#getCreationTimeCalendar()
     */
    @Override
    public Calendar getCreationTimeCalendar() throws IOException {
        return cache.getCreationTimeCalendar();
    }

    private void initializeSequenceNumbers() throws IOException {
        senderSequenceNumberFile.seek(0);
        if (senderSequenceNumberFile.length() > 0) {
            final String s = senderSequenceNumberFile.readUTF();
            cache.setNextSenderMsgSeqNum(Integer.parseInt(s));
        }

        targetSequenceNumberFile.seek(0);
        if (targetSequenceNumberFile.length() > 0) {
            final String s = targetSequenceNumberFile.readUTF();
            cache.setNextTargetMsgSeqNum(Integer.parseInt(s));
        }
    }

    private void initializeMessageIndex() throws IOException {
        // this part is unnecessary if no offsets are being stored in memory
        if (messageIndex != null) {
            messageIndex.clear();
            final File headerFile = new File(headerFileName);
            if (headerFile.exists()) {
                try (DataInputStream headerDataInputStream = new DataInputStream(
                        new BufferedInputStream(new FileInputStream(headerFile)))) {
                    while (headerDataInputStream.available() > 0) {
                        final int sequenceNumber = headerDataInputStream.readInt();
                        final long offset = headerDataInputStream.readLong();
                        final int size = headerDataInputStream.readInt();
                        updateMessageIndex(sequenceNumber, offset, size);
                    }
                }
            }
        }
        headerFileOutputStream = new FileOutputStream(headerFileName, true);
        headerDataOutputStream = new DataOutputStream(new BufferedOutputStream(
                headerFileOutputStream));
    }

    private void updateMessageIndex(long sequenceNum, long offset, int size) {
        // Remove the lowest indexed sequence number if this addition
        // would result the index growing to larger than maxCachedMsgs.
        if (messageIndex.size() >= maxCachedMsgs && messageIndex.get(sequenceNum) == null) {
            messageIndex.pollFirstEntry();
        }

        messageIndex.put(sequenceNum, new long[] { offset, size });
    }

    /**
     * Close the store's files.
     *
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        close(headerDataOutputStream);
        close(messageFileWriter);
        close(messageFileReader);
        close(senderSequenceNumberFile);
        close(targetSequenceNumberFile);
    }

    private static void close(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public void closeAndDeleteFiles() throws IOException {
        close();
        deleteFile(headerFileName);
        deleteFile(msgFileName);
        deleteFile(senderSeqNumFileName);
        deleteFile(targetSeqNumFileName);
        deleteFile(sessionFileName);
    }

    private void deleteFile(String fileName) throws IOException {
        final File file = new File(fileName);
        if (file.exists() && !file.delete()) {
            System.err.println("File delete failed: " + fileName);
        }
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#getNextSenderMsgSeqNum()
     */
    @Override
    public int getNextSenderMsgSeqNum() throws IOException {
        return cache.getNextSenderMsgSeqNum();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#getNextTargetMsgSeqNum()
     */
    @Override
    public int getNextTargetMsgSeqNum() throws IOException {
        return cache.getNextTargetMsgSeqNum();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#setNextSenderMsgSeqNum(int)
     */
    @Override
    public void setNextSenderMsgSeqNum(int next) throws IOException {
        cache.setNextSenderMsgSeqNum(next);
        storeSenderSequenceNumber();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#setNextTargetMsgSeqNum(int)
     */
    @Override
    public void setNextTargetMsgSeqNum(int next) throws IOException {
        cache.setNextTargetMsgSeqNum(next);
        storeTargetSequenceNumber();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#incrNextSenderMsgSeqNum()
     */
    @Override
    public void incrNextSenderMsgSeqNum() throws IOException {
        cache.incrNextSenderMsgSeqNum();
        storeSenderSequenceNumber();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#incrNextTargetMsgSeqNum()
     */
    @Override
    public void incrNextTargetMsgSeqNum() throws IOException {
        cache.incrNextTargetMsgSeqNum();
        storeTargetSequenceNumber();
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#get(int, int, java.util.Collection)
     */
    @Override
    public void get(int startSequence, int endSequence, Collection<String> messages)
            throws IOException {
        final Set<Integer> uncachedOffsetMsgIds = new HashSet<>();
        // Use a treemap to make sure the messages are sorted by sequence num
        final TreeMap<Integer, String> messagesFound = new TreeMap<>();
        for (int i = startSequence; i <= endSequence; i++) {
            final String message = getMessage(i);
            if (message != null) {
                messagesFound.put(i, message);
            } else {
                uncachedOffsetMsgIds.add(i);
            }
        }

        if (!uncachedOffsetMsgIds.isEmpty()) {
            // parse the header file to find missing messages
            final File headerFile = new File(headerFileName);
            try (DataInputStream headerDataInputStream = new DataInputStream(
                    new BufferedInputStream(new FileInputStream(headerFile)))) {
                while (!uncachedOffsetMsgIds.isEmpty() && headerDataInputStream.available() > 0) {
                    final int sequenceNumber = headerDataInputStream.readInt();
                    final long offset = headerDataInputStream.readLong();
                    final int size = headerDataInputStream.readInt();
                    if (uncachedOffsetMsgIds.remove(sequenceNumber)) {
                        final String message = getMessage(offset, size, sequenceNumber);
                        messagesFound.put(sequenceNumber, message);
                    }
                }
            }
        }

        messages.addAll(messagesFound.values());
    }

    /**
     * This method is here for JNI API consistency but it's not
     * implemented. Use get(int, int, Collection) with the same
     * start and end sequence.
     */
    public boolean get(int sequence, String message) throws IOException {
        throw new UnsupportedOperationException("not supported");
    }

    private String getMessage(int i) throws IOException {
        String message = null;
        if (messageIndex != null) {
            final long[] offsetAndSize = messageIndex.get((long) i);
            if (offsetAndSize != null) {
                message = getMessage(offsetAndSize[0], (int) offsetAndSize[1], i);
            }
        }
        return message;
    }

    private String getMessage(long offset, int size, int i) throws IOException {
        try {
            final byte[] data = new byte[size];
            messageFileReader.seek(offset);
            messageFileReader.readFully(data);
            return new String(data, charsetEncoding);
        } catch (EOFException eofe) { // can't read fully
            throw new IOException("Truncated input while reading message: messageIndex=" + i
                    + ", offset=" + offset + ", expected size=" + size, eofe);
        }
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#set(int, java.lang.String)
     */
    @Override
    public boolean set(int sequence, String message) throws IOException {
        final long offset = messageFileWriter.getFilePointer();
        final int size = message.length();
        if (messageIndex != null) {
            updateMessageIndex(sequence, offset, size);
        }
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

    private void storeSenderSequenceNumber() throws IOException {
        senderSequenceNumberFile.seek(0);
        senderSequenceNumberFile.writeUTF("" + cache.getNextSenderMsgSeqNum());
    }

    private void storeTargetSequenceNumber() throws IOException {
        targetSequenceNumberFile.seek(0);
        targetSequenceNumberFile.writeUTF("" + cache.getNextTargetMsgSeqNum());
    }

    /*
     * (non-Javadoc)
     * @see quickfix.RefreshableMessageStore#refresh()
     */
    @Override
    public void refresh() throws IOException {
        initialize(false);
    }

    /* (non-Javadoc)
     * @see quickfix.MessageStore#reset()
     */
    @Override
    public void reset() throws IOException {
        initialize(true);
    }
}
