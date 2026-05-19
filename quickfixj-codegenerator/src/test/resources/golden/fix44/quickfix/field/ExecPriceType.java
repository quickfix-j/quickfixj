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

public class ExecPriceType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 484;
    public static final char BID_PRICE = 'B';
    public static final char CREATION_PRICE = 'C';
    public static final char CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT = 'D';
    public static final char CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT = 'E';
    public static final char OFFER_PRICE = 'O';
    public static final char OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT = 'P';
    public static final char OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT = 'Q';
    public static final char SINGLE_PRICE = 'S';
    
    public ExecPriceType() {
        super(484);
    }

    public ExecPriceType(char data) {
        super(484, data);
    }
}