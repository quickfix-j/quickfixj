package quickfix.dictgenerator;

import java.util.ArrayList;
import java.util.List;

public class Message {

    String msgID = null, name = null, type = null, category= null, notReqXML = null;

    List<Object> msgContents = new ArrayList<Object>();

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
