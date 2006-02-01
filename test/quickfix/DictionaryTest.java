package quickfix;

import junit.framework.TestCase;

public class DictionaryTest extends TestCase {
    private Dictionary dictionary;

    protected void setUp() throws Exception {
        super.setUp();
        dictionary = new Dictionary();
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
        } catch (FieldConvertError e) {
            // expected
        }
    }

    public void testDayTooUnknown() throws Exception {
        dictionary.setString("DAY", "xyz");
        try {
            dictionary.getDay("DAY");
        } catch (FieldConvertError e) {
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
}
