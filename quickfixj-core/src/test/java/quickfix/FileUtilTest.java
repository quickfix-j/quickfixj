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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.net.Socket;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtilTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void testFileLocation() throws Exception {
        // Assumption: current directory is QFJ project base directory
        InputStream in = FileUtil.open(null, "LICENSE");
        in.close();
        assertNotNull("File not found", in);
    }

    @Test
    public void testClassResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "Session.class");
        in.close();
        assertNotNull("Resource not found", in);
    }

    @Test
    public void testClassLoaderResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "quickfix/test/acceptance/definitions/client/Normal.def");
        in.close();
        assertNotNull("Resource not found", in);
    }

    @Test
    public void testURLLocation() throws Exception {
        // Assumption: Internet access
        if (isInternetAccessible()) {
            InputStream in = FileUtil.open(Message.class, "http://www.quickfixj.org/");
            if (in != null) {
                in.close();
            }
            assertNotNull("Resource not found", in);
        }
    }

    @Test
    // QFJ-775
    public void testSessionIDFileName() {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER???",
                "bla_/--/#()_bla", "!!!TARGET", "foo::bar");
        String sessionIdFileName = FileUtil.sessionIdFileName(sessionID);
        assertEquals("FIX.4.4-SENDER____bla__--_____bla-___TARGET_foo__bar", sessionIdFileName);
        assertTrue(sessionIdFileName.matches("[a-zA-Z0-9-._]*"));

        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        sessionIdFileName = FileUtil.sessionIdFileName(sessionID);
        assertEquals("FIX.4.4-SENDER-TARGET", sessionIdFileName);
    }

    private boolean isInternetAccessible() {
        try {
            Socket socket = new Socket("www.quickfixj.org", 80);
            socket.close();
            return true;
        } catch (Exception e) {
            log.warn("No internet access");
        }
        return false;
    }
}
