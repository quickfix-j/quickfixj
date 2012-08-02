package quickfix.dictgenerator;

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
