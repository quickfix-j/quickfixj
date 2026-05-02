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

public class ProgRptReqs extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 414;
    public static final int BUYSIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUSREQUEST = 1;
    public static final int SELLSIDE_PERIODICALLY_SENDS_STATUS_USING_LISTSTATUS = 2;
    public static final int REAL_TIME_EXECUTION_REPORTS = 3;
    
    public ProgRptReqs() {
        super(414);
    }

    public ProgRptReqs(int data) {
        super(414, data);
    }
}