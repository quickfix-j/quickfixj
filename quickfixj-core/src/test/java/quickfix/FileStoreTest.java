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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileStoreTest extends AbstractMessageStoreTest {

    public void tearDown() throws Exception {
        super.tearDown();
        CharsetSupport.setDefaultCharset();
        FileStore fileStore = (FileStore) getStore();
        try {
            fileStore.closeAndDeleteFiles();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, FieldConvertError {
        SessionSettings settings = new SessionSettings(getConfigurationFileName());
        // Initialize the session settings from the defaults
        settings.setString(getSessionID(), FileStoreFactory.SETTING_FILE_STORE_PATH, settings
                .getString(FileStoreFactory.SETTING_FILE_STORE_PATH));
        return new FileStoreFactory(settings);
    }

    @Override
    protected Class<?> getMessageStoreClass() {
        return FileStore.class;
    }

    public void testMessageIndexReset() throws Exception {
        FileStore store = (FileStore) getStore();
        store.set(1, "MESSAGE");
        store.reset();

        store.set(2, "MESSAGE");

        List<String> messages = new ArrayList<>();
        store.get(1, 1, messages);

        assertEquals(0, messages.size());
    }

    public void testCloseAndOpen() throws Exception {
        FileStore store = (FileStore) getStore();
        store.setNextSenderMsgSeqNum(123);
        store.setNextTargetMsgSeqNum(321);
        store.close();
        store.initialize(false);

        assertEquals(123, store.getNextSenderMsgSeqNum());
        assertEquals(321, store.getNextTargetMsgSeqNum());
    }

    protected void closeMessageStore(MessageStore store) throws IOException {
        ((FileStore) store).close();
    }

    public void testInitialSessionCreationTime() throws Exception {
        FileStore store = (FileStore) getStore();
        Date creationTime1 = store.getCreationTime();
        store.close();
        Thread.sleep(100);
        store.initialize(false);
        Date creationTime2 = store.getCreationTime();
        assertEquals("wrong time diff", 0, Math.abs(creationTime1.getTime() - creationTime2.getTime()));
    }

    public void testResetShouldNeverFail() throws Exception {
        final MockSystemTimeSource mockSystemTimeSource = new MockSystemTimeSource(System.currentTimeMillis());
        SystemTime.setTimeSource(mockSystemTimeSource);
        final FileStore store = (FileStore) getStore();
        final Thread thread = new Thread(() -> {
            while (true) {
                try {
                    store.set(0, "SettingSomething");
                    if (Thread.interrupted()) {
                        break;
                    }
                } catch (IOException e) {
                    // it is ok for this to fail
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        Date creationTime = store.getCreationTime();
        for (int i = 0; i < 20; i++) {
            mockSystemTimeSource.increment(1);
            store.reset();
            final Date newCreationTime = store.getCreationTime();
            assertTrue(newCreationTime.after(creationTime));
            creationTime = newCreationTime;
        }
        SystemTime.setTimeSource(null);

        thread.interrupt();
        thread.join();
    }
}
