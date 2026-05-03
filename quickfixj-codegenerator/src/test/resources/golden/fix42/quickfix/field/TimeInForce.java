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

public class TimeInForce extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 59;
    public static final char DAY = '0';
    public static final char GOOD_TILL_CANCEL = '1';
    public static final char AT_THE_OPENING = '2';
    public static final char IMMEDIATE_OR_CANCEL = '3';
    public static final char FILL_OR_KILL = '4';
    public static final char GOOD_TILL_CROSSING = '5';
    public static final char GOOD_TILL_DATE = '6';
    
    public TimeInForce() {
        super(59);
    }

    public TimeInForce(char data) {
        super(59, data);
    }
}