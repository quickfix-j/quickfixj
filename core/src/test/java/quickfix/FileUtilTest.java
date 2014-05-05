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

import java.io.InputStream;
import java.net.Socket;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtilTest extends TestCase {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    public void testFileLocation() throws Exception {
        // Assumption: current directory is QFJ project base directory
        InputStream in = FileUtil.open(null, "LICENSE");
        in.close();
        assertNotNull("File not found", in);
    }

    public void testClassResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "Session.class");
        in.close();
        assertNotNull("Resource not found", in);
    }

    public void testClassLoaderResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "quickfix/test/acceptance/definitions/client/Normal.def");
        in.close();
        assertNotNull("Resource not found", in);
    }

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
