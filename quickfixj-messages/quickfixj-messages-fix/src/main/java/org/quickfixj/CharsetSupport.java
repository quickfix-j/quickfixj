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

    private static final Charset CHARSET_ISO_8859_1 = Charset.forName("ISO-8859-1");
    private static final Charset CHARSET_ASCII = Charset.forName("US-ASCII");

    private static String charset = getDefaultCharset();
    private static Charset charsetInstance = Charset.forName(charset);

    public static String getDefaultCharset() {
        return "ISO-8859-1";
    }

    /**
     * Returns whether the given charset's byte representation of a string
     * is equivalent (as unsigned values) to the string characters themselves.
     *
     * @param charset a charset
     * @return whether the charset encoding is string-equivalent
     */
    public static boolean isStringEquivalent(Charset charset) {
        // ASCII and ISO-8859-1 are unique in that their encoded byte representation
        // is equivalent to their respective Java String (UTF-16BE) chars
        return charset.equals(CHARSET_ISO_8859_1) || charset.equals(CHARSET_ASCII);
    }

    public static void setCharset(String charset) throws UnsupportedEncodingException {
        CharsetSupport.charset = validate(charset);
        CharsetSupport.charsetInstance = Charset.forName(charset);
    }

    public static String getCharset() {
        return charset;
    }

    public static Charset getCharsetInstance() {
        return charsetInstance;
    }

    public static String validate(String charset) throws UnsupportedEncodingException {
        if (!Charset.isSupported(charset)) {
            throw new UnsupportedEncodingException(charset);
        }
        return charset;
    }
}
