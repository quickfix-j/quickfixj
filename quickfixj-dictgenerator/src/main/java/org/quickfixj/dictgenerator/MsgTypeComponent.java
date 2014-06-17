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

public final class MsgTypeComponent extends Component {

    private boolean required = false;

    public MsgTypeComponent(Component component, String reqd) {
        super(component.getMsgID(), component.getName(), component.getType(), component.getCategory(), component.getNotReqXML());
        this.required = "1".equals(reqd);
        for (Object o : component.getMsgContent()) {
            addMsgContent(o);
        }
    }

    @Override
    public boolean isRequired() {
        return required;
    }

    @Override
    public String toString() {
        return "MsgTypeComponent{" +
                "required=" + required +
                ", msgID='" + msgID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", msgContents=" + msgContents +
                '}';
    }
}
