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

import java.util.Date;

import quickfix.field.converter.UtcTimeOnlyConverter;

/*
 * A time-valued message field.
 */
public class UtcTimeOnlyField extends DateField {
    private boolean includeMilliseconds = true;

    public UtcTimeOnlyField(int field) {
        super(field);
    }

    protected UtcTimeOnlyField(int field, Date data) {
        super(field, data);
    }

    public UtcTimeOnlyField(int field, boolean includeMilliseconds) {
        super(field);
        this.includeMilliseconds = includeMilliseconds;
    }

    protected UtcTimeOnlyField(int field, Date data, boolean includeMilliseconds) {
        super(field, data);
        this.includeMilliseconds = includeMilliseconds;
    }

    boolean showMilliseconds() {
        return includeMilliseconds;
    }

    @Override
    protected String objectAsString() {
        return UtcTimeOnlyConverter.convert(getValue(), showMilliseconds());
    }

    @Override
    protected void objectAsString(StringBuilder stringBuilder) {
        UtcTimeOnlyConverter.convert(getValue(), stringBuilder, showMilliseconds());
    }

}
