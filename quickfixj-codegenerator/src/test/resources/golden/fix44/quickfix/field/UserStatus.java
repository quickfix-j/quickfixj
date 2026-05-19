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

public class UserStatus extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 926;
    public static final int LOGGED_IN = 1;
    public static final int NOT_LOGGED_IN = 2;
    public static final int USER_NOT_RECOGNISED = 3;
    public static final int PASSWORD_INCORRECT = 4;
    public static final int PASSWORD_CHANGED = 5;
    public static final int OTHER = 6;
    
    public UserStatus() {
        super(926);
    }

    public UserStatus(int data) {
        super(926, data);
    }
}