package org.quickfixj.dictgenerator;

public class Component extends Message {

    public Component(String msgID, String name, String type, String category, String notReqXML) {
        super(msgID, name, type, category, notReqXML);
    }

    public final boolean isStandardHeader() {
        return "StandardHeader".equalsIgnoreCase(getName());
    }

    public final boolean isStandardTrailer() {
        return "StandardTrailer".equalsIgnoreCase(getName());
    }

    @Override
    public String toString() {
        return "Component{" +
                "msgID='" + msgID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", msgContents=" + msgContents +
                '}';
    }
}
