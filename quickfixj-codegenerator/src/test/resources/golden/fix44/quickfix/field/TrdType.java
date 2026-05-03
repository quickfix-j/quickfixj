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

import quickfix.IntField;

public class TrdType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 828;
    public static final int REGULAR_TRADE = 0;
    public static final int BLOCK_TRADE = 1;
    public static final int EFP = 2;
    public static final int TRANSFER = 3;
    public static final int LATE_TRADE = 4;
    public static final int T_TRADE = 5;
    public static final int WEIGHTED_AVERAGE_PRICE_TRADE = 6;
    public static final int BUNCHED_TRADE = 7;
    public static final int LATE_BUNCHED_TRADE = 8;
    public static final int PRIOR_REFERENCE_PRICE_TRADE = 9;
    public static final int AFTER_HOURS_TRADE = 10;
    
    public TrdType() {
        super(828);
    }

    public TrdType(int data) {
        super(828, data);
    }
}