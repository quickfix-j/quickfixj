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

public class AllocStatus extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 87;
    public static final int ACCEPTED = 0;
    public static final int BLOCK_LEVEL_REJECT = 1;
    public static final int ACCOUNT_LEVEL_REJECT = 2;
    public static final int RECEIVED = 3;
    public static final int INCOMPLETE = 4;
    public static final int REJECTED_BY_INTERMEDIARY = 5;
    
    public AllocStatus() {
        super(87);
    }

    public AllocStatus(int data) {
        super(87, data);
    }
}