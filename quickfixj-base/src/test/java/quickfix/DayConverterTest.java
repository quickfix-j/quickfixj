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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DayConverterTest {
    private Locale defaultLocale;

    @Before
    public void setUp() throws Exception {
        defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @After
    public void tearDown() throws Exception {
        Locale.setDefault(defaultLocale);
    }

    @Test
    public void testConversionToInt() throws Exception {
        assertEquals(1, DayConverter.toInteger("sU"));
        assertEquals(4, DayConverter.toInteger("WEDnes"));

        try {
            DayConverter.toInteger("bogus");
            fail("expected an exception");
        } catch (ConfigError e) {
            // expected
        }

        // check that day values are US days either default local is set to France
        Locale.setDefault(Locale.FRANCE);
        assertEquals(1, DayConverter.toInteger("Su"));
        assertEquals(2, DayConverter.toInteger("Mo"));
    }

    @Test
    public void testConversionToString() throws Exception {
        Locale.setDefault(Locale.US);
        assertEquals("sunday", DayConverter.toString(1));
        assertEquals("wednesday", DayConverter.toString(4));

        try {
            DayConverter.toString(999);
            fail("expected an exception");
        } catch (ConfigError e) {
            // expected
        }

        // check that day values are US days either default local is set to France
        Locale.setDefault(Locale.FRANCE);
        assertEquals("sunday", DayConverter.toString(1));
        assertEquals("wednesday", DayConverter.toString(4));
    }
}
