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

public class SettlInstMode extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 160;
    public static final char DEFAULT = '0';
    public static final char STANDING_INSTRUCTIONS_PROVIDED = '1';
    public static final char SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING = '2';
    public static final char SPECIFIC_ALLOCATION_ACCOUNT_STANDING = '3';
    
    public SettlInstMode() {
        super(160);
    }

    public SettlInstMode(char data) {
        super(160, data);
    }
}