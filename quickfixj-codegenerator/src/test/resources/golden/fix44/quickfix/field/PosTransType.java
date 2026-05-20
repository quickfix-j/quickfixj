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

public class PosTransType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 709;
    public static final int EXERCISE = 1;
    public static final int DO_NOT_EXERCISE = 2;
    public static final int POSITION_ADJUSTMENT = 3;
    public static final int POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION = 4;
    public static final int PLEDGE = 5;
    
    public PosTransType() {
        super(709);
    }

    public PosTransType(int data) {
        super(709, data);
    }
}