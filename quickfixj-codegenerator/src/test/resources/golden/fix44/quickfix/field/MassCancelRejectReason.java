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

public class MassCancelRejectReason extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 532;
    public static final char MASS_CANCEL_NOT_SUPPORTED = '0';
    public static final char INVALID_OR_UNKNOWN_SECURITY = '1';
    public static final char INVALID_OR_UNKNOWN_UNDERLYING = '2';
    public static final char INVALID_OR_UNKNOWN_PRODUCT = '3';
    public static final char INVALID_OR_UNKNOWN_CFICODE = '4';
    public static final char INVALID_OR_UNKNOWN_SECURITY_TYPE = '5';
    public static final char INVALID_OR_UNKNOWN_TRADING_SESSION = '6';
    public static final char OTHER = '99';
    
    public MassCancelRejectReason() {
        super(532);
    }

    public MassCancelRejectReason(char data) {
        super(532, data);
    }
}