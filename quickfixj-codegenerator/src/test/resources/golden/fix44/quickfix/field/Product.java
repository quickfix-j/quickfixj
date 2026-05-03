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

public class Product extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 460;
    public static final int AGENCY = 1;
    public static final int COMMODITY = 2;
    public static final int CORPORATE = 3;
    public static final int CURRENCY = 4;
    public static final int EQUITY = 5;
    public static final int GOVERNMENT = 6;
    public static final int INDEX = 7;
    public static final int LOAN = 8;
    public static final int MONEYMARKET = 9;
    public static final int MORTGAGE = 10;
    public static final int MUNICIPAL = 11;
    public static final int OTHER = 12;
    public static final int FINANCING = 13;
    
    public Product() {
        super(460);
    }

    public Product(int data) {
        super(460, data);
    }
}