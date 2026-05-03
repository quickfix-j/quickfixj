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

public class AllocTransType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 71;
    public static final char NEW = '0';
    public static final char REPLACE = '1';
    public static final char CANCEL = '2';
    public static final char PRELIMINARY = '3';
    public static final char CALCULATED = '4';
    public static final char CALCULATED_WITHOUT_PRELIMINARY = '5';
    
    public AllocTransType() {
        super(71);
    }

    public AllocTransType(char data) {
        super(71, data);
    }
}