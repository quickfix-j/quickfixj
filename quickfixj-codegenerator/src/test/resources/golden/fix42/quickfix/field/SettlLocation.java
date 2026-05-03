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

public class SettlLocation extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 166;
    public static final String CEDEL = "CED";
    public static final String DEPOSITORY_TRUST_COMPANY = "DTC";
    public static final String EUROCLEAR = "EUR";
    public static final String FEDERAL_BOOK_ENTRY = "FED";
    public static final String PHYSICAL = "PNY";
    public static final String PARTICIPANT_TRUST_COMPANY = "PTC";
    public static final String LOCAL_MARKET_SETTLE_LOCATION = "ISO";
    
    public SettlLocation() {
        super(166);
    }

    public SettlLocation(String data) {
        super(166, data);
    }
}