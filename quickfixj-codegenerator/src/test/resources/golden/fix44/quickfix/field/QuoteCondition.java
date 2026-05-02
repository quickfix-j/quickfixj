/* Generated Java Source File */
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

package quickfix.field;

import quickfix.StringField;

public class QuoteCondition extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 276;
    public static final String OPEN_ACTIVE = "A";
    public static final String CLOSED_INACTIVE = "B";
    public static final String EXCHANGE_BEST = "C";
    public static final String CONSOLIDATED_BEST = "D";
    public static final String LOCKED = "E";
    public static final String CROSSED = "F";
    public static final String DEPTH = "G";
    public static final String FAST_TRADING = "H";
    public static final String NON_FIRM = "I";
    
    public QuoteCondition() {
        super(276);
    }

    public QuoteCondition(String data) {
        super(276, data);
    }
}