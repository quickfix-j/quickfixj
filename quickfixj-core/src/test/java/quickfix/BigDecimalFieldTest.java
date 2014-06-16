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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigDecimal;
import java.lang.reflect.Constructor;

import quickfix.field.Price;
import quickfix.fix42.NewOrderSingle;

/**
 * Conditionally test that BigDecimals are handled correctly if we've generated
 * the message fields with BigDecimal support
 *
 * @author toli
 * @version $Id$
 */
public class BigDecimalFieldTest extends TestCase {
    public BigDecimalFieldTest(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new TestSuite(BigDecimalFieldTest.class);
    }

    /**
     * Verify that the round-tripping of BigDecimals works with messages
     * Run the real test inside the testcase only if we have a BigDecimal-ized fields,
     * ie if we have a constructor taking a BigDecimal.
     */
    public void testBigDecimalRoundTripping() throws Exception {
        // check to see if we have a BigDecimal constructor
        try {
            Constructor<Price> cons = Price.class.getConstructor(BigDecimal.class);

            BigDecimal originalPrice = new BigDecimal("10.3000");
            assertEquals(4, originalPrice.scale());
            Message message = new NewOrderSingle();
            message.setField(cons.newInstance (new BigDecimal("10.3000")));
            BigDecimal extractedPrice = message.getDecimal(Price.FIELD);
            assertEquals(4, extractedPrice.scale());
            assertEquals(new BigDecimal("10.3000"), extractedPrice);
            String newOrderString = message.toString();
            Message rehydratedMessage = new Message(newOrderString);
            BigDecimal rehydratedPrice = rehydratedMessage.getDecimal(Price.FIELD);
            assertEquals(new BigDecimal("10.3000"), rehydratedPrice);
            assertEquals(4, rehydratedPrice.scale());
        } catch (NoSuchMethodException ex) {
            // we are using doubles only. this isn't the testcase we are looking for
            // skip the test
        }
    }
}
