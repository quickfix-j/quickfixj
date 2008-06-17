/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved.
 *
 * This file is part of the QuickFIX/J FIX Engine
 *
 * This file may be distributed under the terms of the quickfixj.org
 * license as defined by quickfixj.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixj.org/LICENSE for licensing information.
 *
 ******************************************************************************/

package org.quickfixj.jmx.mbean;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

public class ObjectNameFactory {

    private StringBuffer sb = new StringBuffer();

    public void addProperty(String name, String value) {
        if (value != null && value.length() > 0) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(name).append('=').append(
                    isQuotingNeeded(value) ? ObjectName.quote(value) : value);
        }
    }

    public ObjectName createName() throws MalformedObjectNameException {
        return ObjectName.getInstance("org.quickfixj:" + sb);
    }

    private boolean isQuotingNeeded(String data) {
        return data.matches(".*[,=:\"\\*\\?].*");
    }
}
