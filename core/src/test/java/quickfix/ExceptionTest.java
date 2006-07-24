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

import junit.framework.TestCase;

public class ExceptionTest extends TestCase {

    public void testDoNotSend() {
        new DoNotSend();
    }
    
    public void testIncorrectDataFormat() {
        IncorrectDataFormat e = new IncorrectDataFormat(5);
        e = new IncorrectDataFormat("test");
        e.field = 5;
    }
    
    public void testIncorrectTagValue() {
        IncorrectTagValue e = new IncorrectTagValue(5);
        e = new IncorrectTagValue("test");
        e.field = 5;
    }

    public void testRejectLogon() {
        new RejectLogon();
    }

    public void testRuntimeError() {
        new RuntimeError();
        new RuntimeError("test");
        new RuntimeError(new Exception());
    }
    
    
    public void testSessionNotFound() {
        new SessionNotFound();
        new SessionNotFound("test");
    }
    
    public void testSessionException() {
        new SessionException();
        new SessionException("test");
        new SessionException(new Exception());
    }
}
