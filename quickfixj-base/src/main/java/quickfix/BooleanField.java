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

import java.lang.Boolean;

public class BooleanField extends Field<Boolean> {

    public BooleanField(int field) {
        super(field, false);
    }

    public BooleanField(int field, Boolean data) {
        super(field, data);
    }

    public BooleanField(int field, boolean data) {
        super(field, data);
    }

    public void setValue(Boolean value) {
        setObject(value);
    }

    public void setValue(boolean value) {
        setObject(value);
    }

    public boolean getValue() {
        return getObject();
    }

    public boolean valueEquals(Boolean value) {
        return getObject().equals(value);
    }

    public boolean valueEquals(boolean value) {
        return getObject().equals(value);
    }
}
