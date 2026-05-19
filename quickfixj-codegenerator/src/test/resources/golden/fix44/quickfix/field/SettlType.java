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

public class SettlType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 63;
    public static final char REGULAR = '0';
    public static final char CASH = '1';
    public static final char NEXT_DAY = '2';
    public static final char T_PLUS_2 = '3';
    public static final char T_PLUS_3 = '4';
    public static final char T_PLUS_4 = '5';
    public static final char FUTURE = '6';
    public static final char WHEN_AND_IF_ISSUED = '7';
    public static final char SELLERS_OPTION = '8';
    public static final char T_PLUS_5 = '9';
    
    public SettlType() {
        super(63);
    }

    public SettlType(char data) {
        super(63, data);
    }
}