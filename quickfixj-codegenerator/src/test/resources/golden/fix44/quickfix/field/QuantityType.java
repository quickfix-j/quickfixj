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

public class QuantityType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 465;
    public static final int SHARES = 1;
    public static final int BONDS = 2;
    public static final int CURRENTFACE = 3;
    public static final int ORIGINALFACE = 4;
    public static final int CURRENCY = 5;
    public static final int CONTRACTS = 6;
    public static final int OTHER = 7;
    public static final int PAR = 8;
    
    public QuantityType() {
        super(465);
    }

    public QuantityType(int data) {
        super(465, data);
    }
}