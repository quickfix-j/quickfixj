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

public class MultiLegReportingType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 442;
    public static final char SINGLE_SECURITY = '1';
    public static final char INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = '2';
    public static final char MULTI_LEG_SECURITY = '3';
    
    public MultiLegReportingType() {
        super(442);
    }

    public MultiLegReportingType(char data) {
        super(442, data);
    }
}