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

public class SecurityRequestResult extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 560;
    public static final int VALID_REQUEST = 0;
    public static final int INVALID_OR_UNSUPPORTED_REQUEST = 1;
    public static final int NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA = 2;
    public static final int NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA = 3;
    public static final int INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE = 4;
    public static final int REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED = 5;
    
    public SecurityRequestResult() {
        super(560);
    }

    public SecurityRequestResult(int data) {
        super(560, data);
    }
}