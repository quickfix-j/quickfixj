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

package quickfix;

import quickfix.field.SessionRejectReason;

/**
 * An exception thrown when a tags value is not valid according to the data dictionary.
 */
public class IncorrectTagValue extends Exception implements HasFieldAndReason {
    
    private String value;
    private final int field;
    private final int sessionRejectReason;

    public IncorrectTagValue(int field) {
        super(SessionRejectReasonText.getMessage(SessionRejectReason.VALUE_IS_INCORRECT) + ", field=" + field);
        this.field = field;
        this.sessionRejectReason = SessionRejectReason.VALUE_IS_INCORRECT;
    }

    public IncorrectTagValue(int field, String value) {
        super(SessionRejectReasonText.getMessage(SessionRejectReason.VALUE_IS_INCORRECT) + ", field=" + field + (value != null ? ", value=" + value : ""));
        this.field = field;
        this.value = value;
        this.sessionRejectReason = SessionRejectReason.VALUE_IS_INCORRECT;
    }

    public IncorrectTagValue(int field, String value, String message) {
        super(message);
        this.field = field;
        this.value = value;
        this.sessionRejectReason = SessionRejectReason.VALUE_IS_INCORRECT;
    }

    @Override
    public String toString() {
        String str = super.toString();
        if (field != 0)
            str += " field=" + field;
        if (value != null)
            str += " value=" + value;
        return str;
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public int getSessionRejectReason() {
        return sessionRejectReason;
    }
    
}
