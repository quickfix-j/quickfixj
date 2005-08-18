/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import junit.framework.TestCase;
import quickfix.fix44.QuoteRequest;

public class RepeatingGroupTest extends TestCase {

    public RepeatingGroupTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testAddingGroupsWithNonOrderedFields() {
        QuoteRequest qr = new QuoteRequest();
        QuoteRequest.NoRelatedSym.NoLegs grp = new QuoteRequest.NoRelatedSym.NoLegs();

        grp.setField(new StringField(1, "a1"));
        grp.setField(new StringField(2, "a2"));
        grp.setField(new StringField(3, "a3"));

        qr.addGroup(grp);

        grp.setField(new StringField(1, "b1"));
        grp.setField(new StringField(2, "b2"));
        grp.setField(new StringField(3, "b3"));

        qr.addGroup(grp);

        String expectedString = "8=FIX.4.49=3535=R555=21=a12=a23=a31=b12=b23=b310=248";

        assertEquals("Bad content of repeating groups ", expectedString, qr.toString());
    }

    public void testAddingGroupsWithDuplicatedNonOrderedFields() {
        QuoteRequest qr = new QuoteRequest();
        QuoteRequest.NoRelatedSym.NoLegs grp = new QuoteRequest.NoRelatedSym.NoLegs();

        grp.setField(new StringField(1, "a1"));
        grp.setField(new StringField(1, "a2"));

        qr.addGroup(grp);

        grp.setField(new StringField(1, "b1"));
        grp.setField(new StringField(1, "b2"));

        qr.addGroup(grp);
        
        String expectedString = "8=FIX.4.49=2535=R555=21=a11=a21=b11=b210=247";

        assertEquals("Bad content of repeating groups ", expectedString, qr.toString());
    }

    public void testAddingGroupsWithOrderedFields() {
        QuoteRequest qr = new QuoteRequest();
        QuoteRequest.NoRelatedSym.NoLegs grp = new QuoteRequest.NoRelatedSym.NoLegs();
        
        grp.setField(new StringField(600, "a1"));
        grp.setField(new StringField(601, "a2"));
        grp.setField(new StringField(602, "a3"));

        qr.addGroup(grp);

        grp.setField(new StringField(600, "b1"));
        grp.setField(new StringField(601, "b2"));
        grp.setField(new StringField(602, "b3"));

        qr.addGroup(grp);
        
        String expectedString = "8=FIX.4.49=4735=R555=2600=a1601=a2602=a3600=b1601=b2602=b310=251";

        assertEquals("Bad content of repeating groups ", expectedString, qr.toString());
    }
    
    public void testAddingGroupsWithDuplicatedOrderedFields() {
        QuoteRequest qr = new QuoteRequest();
        QuoteRequest.NoRelatedSym.NoLegs grp = new QuoteRequest.NoRelatedSym.NoLegs();
        
        grp.setField(new StringField(600, "a1"));
        grp.setField(new StringField(600, "a2"));

        qr.addGroup(grp);

        grp.setField(new StringField(600, "b1"));
        grp.setField(new StringField(600, "b2"));

        qr.addGroup(grp);
        
        String expectedString = "8=FIX.4.49=1935=R555=2600=a2600=b210=250";

        assertEquals("Bad content of repeating groups ", expectedString, qr.toString());
    }
    
}
