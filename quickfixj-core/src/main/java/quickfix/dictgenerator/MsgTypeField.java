package quickfix.dictgenerator;

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
