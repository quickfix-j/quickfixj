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

public class BenchmarkSecurityIDSource extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 761;
    public static final String CUSIP = "1";
    public static final String SEDOL = "2";
    public static final String QUIK = "3";
    public static final String ISIN_NUMBER = "4";
    public static final String RIC_CODE = "5";
    public static final String ISO_CURRENCY_CODE = "6";
    public static final String ISO_COUNTRY_CODE = "7";
    public static final String EXCHANGE_SYMBOL = "8";
    public static final String CONSOLIDATED_TAPE_ASSOCIATION = "9";
    public static final String BLOOMBERG_SYMBOL = "A";
    public static final String WERTPAPIER = "B";
    public static final String DUTCH = "C";
    public static final String VALOREN = "D";
    public static final String SICOVAM = "E";
    public static final String BELGIAN = "F";
    public static final String COMMON = "G";
    public static final String CLEARING_HOUSE_CLEARING_ORGANIZATION = "H";
    public static final String ISDA_FPML_PRODUCT_SPECIFICATION = "I";
    public static final String OPTIONS_PRICE_REPORTING_AUTHORITY = "J";
    
    public BenchmarkSecurityIDSource() {
        super(761);
    }

    public BenchmarkSecurityIDSource(String data) {
        super(761, data);
    }
}