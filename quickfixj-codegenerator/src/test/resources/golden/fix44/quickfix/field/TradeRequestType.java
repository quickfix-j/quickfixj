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

public class TradeRequestType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 569;
    public static final int ALL_TRADES = 0;
    public static final int MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST = 1;
    public static final int UNMATCHED_TRADES_THAT_MATCH_CRITERIA = 2;
    public static final int UNREPORTED_TRADES_THAT_MATCH_CRITERIA = 3;
    public static final int ADVISORIES_THAT_MATCH_CRITERIA = 4;
    
    public TradeRequestType() {
        super(569);
    }

    public TradeRequestType(int data) {
        super(569, data);
    }
}