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

public class NetworkRequestType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 935;
    public static final int SNAPSHOT = 1;
    public static final int SUBSCRIBE = 2;
    public static final int STOP_SUBSCRIBING = 4;
    public static final int LEVEL_OF_DETAIL = 8;
    
    public NetworkRequestType() {
        super(935);
    }

    public NetworkRequestType(int data) {
        super(935, data);
    }
}