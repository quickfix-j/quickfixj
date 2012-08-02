package quickfix.dictgenerator;

public final class MsgType extends Message {

    private String msgType = null;

    public MsgType(String msgID, String name, String type, String category, String notReqXML, String msgType) {
        super(msgID, name, type, category, notReqXML);
        this.msgType = msgType;
    }

    public String getMsgType() {
        return msgType;
    }

    @Override
    public String toString() {
        return "MsgType{" +
                "msgType='" + msgType + '\'' +
                ", msgID='" + msgID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", msgContents=" + msgContents +
                '}';
    }
}
