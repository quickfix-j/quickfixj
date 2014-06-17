package org.quickfixj.dictgenerator;

public final class ComponentComponent extends Component {

    private boolean required = false;

    public ComponentComponent(Component component, String reqd) {
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
        return "ComponentComponent{" +
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
