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

public class SettlInstTransType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 163;
    public static final char NEW = 'N';
    public static final char CANCEL = 'C';
    public static final char REPLACE = 'R';
    public static final char RESTATE = 'T';
    
    public SettlInstTransType() {
        super(163);
    }

    public SettlInstTransType(char data) {
        super(163, data);
    }
}