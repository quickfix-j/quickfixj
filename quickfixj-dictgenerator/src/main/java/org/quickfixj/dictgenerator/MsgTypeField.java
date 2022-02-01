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

public final class MsgTypeField extends Field {

    private boolean required = false;

    public MsgTypeField(Field field, String reqd) {
        super(field.getTag(), field.getFieldName(), field.getType(), field.getDesc(), field.getNotReqXML());
        for (Enum theEnum : field.getEnums()) {
            addEnum(theEnum);
        }
        this.required = "1".equals(reqd);
    }

    @Override
    public boolean isRequired() {
        return required;
    }

    @Override
    public String toString() {
        return "MsgTypeField{" +
                "required=" + required +
                ", tag='" + tag + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", enums=" + enums +
                '}';
    }
}
