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

public class HaltReason extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 327;
    public static final char ORDER_IMBALANCE = 'I';
    public static final char EQUIPMENT_CHANGEOVER = 'X';
    public static final char NEWS_PENDING = 'P';
    public static final char NEWS_DISSEMINATION = 'D';
    public static final char ORDER_INFLUX = 'E';
    public static final char ADDITIONAL_INFORMATION = 'M';
    
    public HaltReason() {
        super(327);
    }

    public HaltReason(char data) {
        super(327, data);
    }
}