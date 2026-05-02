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

public class MiscFeeType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 139;
    public static final char REGULATORY = '1';
    public static final char TAX = '2';
    public static final char LOCAL_COMMISSION = '3';
    public static final char EXCHANGE_FEES = '4';
    public static final char STAMP = '5';
    public static final char LEVY = '6';
    public static final char OTHER = '7';
    public static final char MARKUP = '8';
    public static final char CONSUMPTION_TAX = '9';
    public static final char PER_TRANSACTION = '10';
    public static final char CONVERSION = '11';
    public static final char AGENT = '12';
    
    public MiscFeeType() {
        super(139);
    }

    public MiscFeeType(char data) {
        super(139, data);
    }
}