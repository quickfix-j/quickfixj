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

public class SecurityRequestType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 321;
    public static final int REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS = 0;
    public static final int REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED = 1;
    public static final int REQUEST_LIST_SECURITY_TYPES = 2;
    public static final int REQUEST_LIST_SECURITIES = 3;
    
    public SecurityRequestType() {
        super(321);
    }

    public SecurityRequestType(int data) {
        super(321, data);
    }
}