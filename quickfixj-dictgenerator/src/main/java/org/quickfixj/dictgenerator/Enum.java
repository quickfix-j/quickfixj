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

package org.quickfixj.dictgenerator;

public final class Enum {

    private String enumName = null, desc = null;

    public Enum(String enumName, String desc) {
        this.enumName = enumName;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "enumName='" + enumName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getEnumName() {
        return enumName;
    }

    public String getDesc() {
        return desc;
    }
}
