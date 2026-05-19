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

public class OwnershipType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 517;
    public static final char JOINT_INVESTORS = 'J';
    public static final char TENANTS_IN_COMMON = 'T';
    public static final char JOINT_TRUSTEES = '2';
    
    public OwnershipType() {
        super(517);
    }

    public OwnershipType(char data) {
        super(517, data);
    }
}