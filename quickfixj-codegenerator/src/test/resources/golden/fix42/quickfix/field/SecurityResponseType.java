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

public class SecurityResponseType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 323;
    public static final int ACCEPT_SECURITY_PROPOSAL_AS_IS = 1;
    public static final int ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE = 2;
    public static final int LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST = 3;
    public static final int LIST_OF_SECURITIES_RETURNED_PER_REQUEST = 4;
    public static final int REJECT_SECURITY_PROPOSAL = 5;
    public static final int CAN_NOT_MATCH_SELECTION_CRITERIA = 6;
    
    public SecurityResponseType() {
        super(323);
    }

    public SecurityResponseType(int data) {
        super(323, data);
    }
}