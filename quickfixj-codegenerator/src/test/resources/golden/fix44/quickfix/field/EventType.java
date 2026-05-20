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

public class EventType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 865;
    public static final int PUT = 1;
    public static final int CALL = 2;
    public static final int TENDER = 3;
    public static final int SINKING_FUND_CALL = 4;
    public static final int OTHER = 99;
    
    public EventType() {
        super(865);
    }

    public EventType(int data) {
        super(865, data);
    }
}