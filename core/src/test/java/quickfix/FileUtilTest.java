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

import junit.framework.TestCase;

public class FileUtilTest extends TestCase {
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
        InputStream in = FileUtil.open(Message.class, "http://www.quickfixj.org/");
        in.close();
        assertNotNull("Resource not found", in);
    }
}
