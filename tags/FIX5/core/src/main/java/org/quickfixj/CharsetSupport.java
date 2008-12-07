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

package org.quickfixj;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetSupport {
    private static String charset = getDefaultCharset();
    
    public static String getDefaultCharset() {
        return "ISO-8859-1";
    }
    
    public static void setCharset(String charset) throws UnsupportedEncodingException {
        CharsetSupport.charset = validate(charset);
    }
    
    public static String getCharset() {
        return charset;
    }
    
    public static String validate(String charset) throws UnsupportedEncodingException {
        if (!Charset.isSupported(charset)) {
            throw new UnsupportedEncodingException();
        }
        return charset;
    }
}
