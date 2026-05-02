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

import quickfix.CharField;

public class MatchStatus extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 573;
    public static final char COMPARED_MATCHED_OR_AFFIRMED = '0';
    public static final char UNCOMPARED_UNMATCHED_OR_UNAFFIRMED = '1';
    public static final char ADVISORY_OR_ALERT = '2';
    
    public MatchStatus() {
        super(573);
    }

    public MatchStatus(char data) {
        super(573, data);
    }
}