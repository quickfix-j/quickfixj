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

public class IOIQualifier extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 104;
    public static final char ALL_OR_NONE = 'A';
    public static final char AT_THE_CLOSE = 'C';
    public static final char IN_TOUCH_WITH = 'I';
    public static final char LIMIT = 'L';
    public static final char MORE_BEHIND = 'M';
    public static final char AT_THE_OPEN = 'O';
    public static final char TAKING_A_POSITION = 'P';
    public static final char AT_THE_MARKET = 'Q';
    public static final char READY_TO_TRADE = 'R';
    public static final char PORTFOLIO_SHOWN = 'S';
    public static final char THROUGH_THE_DAY = 'T';
    public static final char VERSUS = 'V';
    public static final char INDICATION_WORKING_AWAY = 'W';
    public static final char CROSSING_OPPORTUNITY = 'X';
    public static final char AT_THE_MIDPOINT = 'Y';
    public static final char PREOPEN = 'Z';
    
    public IOIQualifier() {
        super(104);
    }

    public IOIQualifier(char data) {
        super(104, data);
    }
}