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

public class CollAsgnReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 895;
    public static final int INITIAL = 0;
    public static final int SCHEDULED = 1;
    public static final int TIME_WARNING = 2;
    public static final int MARGIN_DEFICIENCY = 3;
    public static final int MARGIN_EXCESS = 4;
    public static final int FORWARD_COLLATERAL_DEMAND = 5;
    public static final int EVENT_OF_DEFAULT = 6;
    public static final int ADVERSE_TAX_EVENT = 7;
    
    public CollAsgnReason() {
        super(895);
    }

    public CollAsgnReason(int data) {
        super(895, data);
    }
}