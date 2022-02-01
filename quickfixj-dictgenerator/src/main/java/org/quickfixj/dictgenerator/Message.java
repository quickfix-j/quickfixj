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

import java.util.ArrayList;
import java.util.List;

public class Message {

    String msgID = null, name = null, type = null, category = null, notReqXML = null;

    final List<Object> msgContents = new ArrayList<>();

    public Message(String msgID, String name, String type, String category, String notReqXML) {
        this.msgID = msgID;
        this.name = name;
        this.type = type;
        this.category = category;
        this.notReqXML = notReqXML;
    }

    public final String getMsgID() {
        return msgID;
    }

    public final String getName() {
        return name;
    }

    public final String getType() {
        return type;
    }

    public final String getCategory() {
        return category;
    }

    public final String getNotReqXML() {
        return notReqXML;
    }

    public final void addMsgContent(Object o) {
        msgContents.add(o);
    }

    public final List<Object> getMsgContent() {
        return msgContents;
    }

    public boolean isRequired() {
        return false;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msgID='" + msgID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", msgContents=" + msgContents +
                '}';
    }
}
