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

public class SettlInstReqRejCode extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 792;
    public static final int UNABLE_TO_PROCESS_REQUEST = 0;
    public static final int UNKNOWN_ACCOUNT = 1;
    public static final int NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND = 2;
    public static final int OTHER = 99;
    
    public SettlInstReqRejCode() {
        super(792);
    }

    public SettlInstReqRejCode(int data) {
        super(792, data);
    }
}