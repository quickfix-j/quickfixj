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

import java.io.IOException;
import java.util.Date;

public class CachedFileStoreTest extends AbstractMessageStoreTest {

    protected void tearDown() throws Exception {
        super.tearDown();
        CachedFileStore fileStore = (CachedFileStore) getStore();
        try {
            fileStore.deleteFiles();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, FieldConvertError {
        SessionSettings settings =  new SessionSettingsBuilder().legacy().build(getConfigurationFileName());
        // Initialize the session settings from the defaults
        settings.setString(getSessionID(), FileStoreFactory.SETTING_FILE_STORE_PATH, settings
                .getString(FileStoreFactory.SETTING_FILE_STORE_PATH));
        return new CachedFileStoreFactory(settings);
    }

    protected Class<?> getMessageStoreClass() {
        return CachedFileStore.class;
    }

    public void testCloseAndOpen() throws Exception {
        CachedFileStore store = (CachedFileStore) getStore();
        store.setNextSenderMsgSeqNum(123);
        store.setNextTargetMsgSeqNum(321);
        store.closeFiles();
        store.initialize(false);

        assertEquals(123, store.getNextSenderMsgSeqNum());
        assertEquals(321, store.getNextTargetMsgSeqNum());
    }

    protected void closeMessageStore(MessageStore store) throws IOException {
        ((CachedFileStore) store).closeFiles();
    }

    public void testInitialSessionCreationTime() throws Exception {
        CachedFileStore store = (CachedFileStore) getStore();
        Date creationTime1 = store.getCreationTime();
        store.closeFiles();
        Thread.sleep(100);
        store.initialize(false);
        Date creationTime2 = store.getCreationTime();
        assertEquals("wrong time diff", 0, Math.abs(creationTime1.getTime() - creationTime2.getTime()));
    }
}
