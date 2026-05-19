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

import quickfix.CharField;

public class CommType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 13;
    public static final char PER_UNIT = '1';
    public static final char PERCENTAGE = '2';
    public static final char ABSOLUTE = '3';
    public static final char PERCENTAGE_WAIVED_CASH_DISCOUNT = '4';
    public static final char PERCENTAGE_WAIVED_ENHANCED_UNITS = '5';
    public static final char POINTS_PER_BOND_OR_OR_CONTRACT = '6';
    
    public CommType() {
        super(13);
    }

    public CommType(char data) {
        super(13, data);
    }
}