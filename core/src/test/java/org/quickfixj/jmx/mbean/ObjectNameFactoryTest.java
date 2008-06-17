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

package org.quickfixj.jmx.mbean;

import javax.management.MalformedObjectNameException;

import junit.framework.TestCase;

public class ObjectNameFactoryTest extends TestCase {
    public void testSimpleNameCreation() throws Exception {
        ObjectNameFactory nameFactory = new ObjectNameFactory();
        nameFactory.addProperty("foo", "bar");

        assertEquals("org.quickfixj:foo=bar", nameFactory.createName().toString());
    }

    public void testQuotedNameCreationQuoted() throws Exception {
        String quotedCharacters = "\",=:*?";
        String escapedCharacters = "\"*?";
        for (int i = 0; i < quotedCharacters.length(); i++) {
            Character ch = quotedCharacters.charAt(i);
            doQuoteTest(ch, escapedCharacters.contains(ch.toString()));
        }
    }

    private void doQuoteTest(Character quotedCharacter, boolean escaped)
            throws MalformedObjectNameException {
        ObjectNameFactory nameFactory = new ObjectNameFactory();
        nameFactory.addProperty("foo", "bar" + quotedCharacter + "baz");

        assertEquals("org.quickfixj:foo=\"bar" + (escaped ? "\\" : "") + quotedCharacter + "baz\"",
                nameFactory.createName().toString());
    }

}
