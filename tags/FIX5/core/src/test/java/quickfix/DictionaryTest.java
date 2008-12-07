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

import java.util.Locale;

import junit.framework.TestCase;

public class DictionaryTest extends TestCase {
    private Dictionary dictionary;
    private Locale defaultLocale;
    
    protected void setUp() throws Exception {
        super.setUp();
        dictionary = new Dictionary();
        defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
        Locale.setDefault(defaultLocale);
    }

    public void testDay() throws Exception {
        assertFalse(dictionary.has("DAY"));
        dictionary.setString("DAY", "monday");
        assertTrue(dictionary.has("DAY"));
        assertEquals(2, dictionary.getDay("DAY"));

        dictionary.setString("DAY", "tue");
        assertEquals(3, dictionary.getDay("DAY"));

        dictionary.setString("DAY", "we");
        assertEquals(4, dictionary.getDay("DAY"));
    }

    public void testDayTooShort() throws Exception {
        dictionary.setString("DAY", "t");
        try {
            dictionary.getDay("DAY");
        } catch (ConfigError e) {
            // expected
        }
    }

    public void testDayTooUnknown() throws Exception {
        dictionary.setString("DAY", "xyz");
        try {
            dictionary.getDay("DAY");
        } catch (ConfigError e) {
            // expected
        }
    }

    public void testBoolean() throws Exception {
        dictionary.setBool("B", true);
        assertTrue(dictionary.getBool("B"));

        dictionary.setBool("B", false);
        assertFalse(dictionary.getBool("B"));
    }

    public void testBooleanError() throws Exception {
        dictionary.setString("B", "XYZ");
        try {
            dictionary.getBool("B");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    public void testBooleanMissing() throws Exception {
        try {
            dictionary.getBool("B");
        } catch (ConfigError e) {
            // expected
        }
    }

    public void testString() throws Exception {
        dictionary.setString("B", "X");
        assertEquals("X", dictionary.getString("B"));
    }

    public void testStringMissing() throws Exception {
        try {
            dictionary.getString("X");
        } catch (ConfigError e) {
            // expected
        }
    }
    
    public void testDouble() throws Exception {
        dictionary.setDouble("B", 1.1);
        assertEquals(1.1, dictionary.getDouble("B"), 0);
    }

    public void testDoubleError() throws Exception {
        dictionary.setString("B", "XYZ");
        try {
            dictionary.getDouble("B");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    public void testDoubleMissing() throws Exception {
        try {
            dictionary.getDouble("B");
        } catch (ConfigError e) {
            // expected
        }
    }

    public void testLong() throws Exception {
        dictionary.setLong("B", 1);
        assertEquals(1, dictionary.getLong("B"));
    }

    public void testLongError() throws Exception {
        dictionary.setString("B", "XYZ");
        try {
            dictionary.getLong("B");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    public void testLongMissing() throws Exception {
        try {
            dictionary.getLong("B");
        } catch (ConfigError e) {
            // expected
        }
    }
    
    public void testMerge() throws Exception {
        Dictionary d2 = new Dictionary("ABC");
        d2.setString("XYZ", "123");
        
        dictionary.setString("ABC", "DEF");
        assertFalse(dictionary.has("XYZ"));
        dictionary.merge(d2);
        assertTrue(dictionary.has("XYZ"));
        assertEquals("123", dictionary.getString("XYZ"));
        assertEquals(2, dictionary.toMap().size());
        
        assertEquals(1, d2.toMap().size());
    }
    
    public void testName() throws Exception {
        assertNull(dictionary.getName());
        
        Dictionary d = new Dictionary("NAME");
        assertEquals("NAME", d.getName());
    }

    public void testConstructors() throws Exception {
        Dictionary dw = new Dictionary();
        assertNull(dw.getName());
        assertTrue(dw.toMap().isEmpty());
        
        // Tested dictionary("name") already
        Dictionary dx = new Dictionary("NAME");
        dx.setString("FOO", "BAR");
        
        Dictionary dy = new Dictionary(dx);
        assertEquals("NAME", dy.getName());
        assertEquals(1, dy.toMap().size());
        assertEquals("BAR", dy.getString("FOO"));
        
        Dictionary dz = new Dictionary("XYZ", dx.toMap());
        assertEquals("XYZ", dz.getName());
        assertEquals(1, dz.toMap().size());
        assertEquals("BAR", dz.getString("FOO"));
    }
    
    // From C++ tests
    public void testGetDay() throws Exception {
        Dictionary object = new Dictionary();
        
        object.setString( "DAY1", "SU" );
        object.setString( "DAY2", "MO" );
        object.setString( "DAY3", "TU" );
        object.setString( "DAY4", "WE" );
        object.setString( "DAY5", "TH" );
        object.setString( "DAY6", "FR" );
        object.setString( "DAY7", "SA" );

        assertEquals( 1, object.getDay( "DAY1" ));
        assertEquals( 2, object.getDay( "DAY2" ));
        assertEquals( 3, object.getDay( "DAY3" ));
        assertEquals( 4, object.getDay( "DAY4" ) );
        assertEquals( 5, object.getDay( "DAY5" ));
        assertEquals( 6, object.getDay( "DAY6" ));
        assertEquals( 7, object.getDay( "DAY7" ));

        object.setDay( "NEXTDAY1", 1 );
        object.setDay( "NEXTDAY2", 2 );
        object.setDay( "NEXTDAY3", 3 );
        object.setDay( "NEXTDAY4", 4 );
        object.setDay( "NEXTDAY5", 5 );
        object.setDay( "NEXTDAY6", 6 );
        object.setDay( "NEXTDAY7", 7 );

        assertEquals( 1, object.getDay( "NEXTDAY1" ));
        assertEquals( 2, object.getDay( "NEXTDAY2" ));
        assertEquals( 3, object.getDay( "NEXTDAY3" ));
        assertEquals( 4, object.getDay( "NEXTDAY4" ));
        assertEquals( 5, object.getDay( "NEXTDAY5" ));
        assertEquals( 6, object.getDay( "NEXTDAY6" ));
        assertEquals( 7, object.getDay( "NEXTDAY7" ));

    }
}
