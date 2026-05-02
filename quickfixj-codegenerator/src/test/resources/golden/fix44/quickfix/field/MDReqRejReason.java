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

public class MDReqRejReason extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 281;
    public static final char UNKNOWN_SYMBOL = '0';
    public static final char DUPLICATE_MDREQID = '1';
    public static final char INSUFFICIENT_BANDWIDTH = '2';
    public static final char INSUFFICIENT_PERMISSIONS = '3';
    public static final char UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE = '4';
    public static final char UNSUPPORTED_MARKETDEPTH = '5';
    public static final char UNSUPPORTED_MDUPDATETYPE = '6';
    public static final char UNSUPPORTED_AGGREGATEDBOOK = '7';
    public static final char UNSUPPORTED_MDENTRYTYPE = '8';
    public static final char UNSUPPORTED_TRADINGSESSIONID = '9';
    public static final char UNSUPPORTED_SCOPE = 'A';
    public static final char UNSUPPORTED_OPENCLOSESETTLEFLAG = 'B';
    public static final char UNSUPPORTED_MDIMPLICITDELETE = 'C';
    
    public MDReqRejReason() {
        super(281);
    }

    public MDReqRejReason(char data) {
        super(281, data);
    }
}