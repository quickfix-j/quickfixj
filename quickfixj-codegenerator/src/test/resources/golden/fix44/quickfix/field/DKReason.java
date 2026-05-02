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

public class DKReason extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 127;
    public static final char UNKNOWN_SYMBOL = 'A';
    public static final char WRONG_SIDE = 'B';
    public static final char QUANTITY_EXCEEDS_ORDER = 'C';
    public static final char NO_MATCHING_ORDER = 'D';
    public static final char PRICE_EXCEEDS_LIMIT = 'E';
    public static final char CALCULATION_DIFFERENCE = 'F';
    public static final char OTHER = 'Z';
    
    public DKReason() {
        super(127);
    }

    public DKReason(char data) {
        super(127, data);
    }
}