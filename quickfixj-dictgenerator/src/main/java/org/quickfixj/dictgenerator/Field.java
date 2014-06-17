package org.quickfixj.dictgenerator;

import java.util.ArrayList;
import java.util.List;

public class Field {

    String tag = null, fieldName = null, type = null, desc = null, notReqXML = null;
    List<Enum> enums = new ArrayList<Enum>();

    public Field(String tag, String fieldName, String type, String desc, String notReqXML) {
        this.tag = tag;
        this.fieldName = fieldName;
        this.type = type;
        this.desc = desc;
        this.notReqXML = notReqXML;
    }

    public final boolean isNumInGroup() {
        return "NumInGroup".equalsIgnoreCase(getType());
    }

    public final void addEnum(Enum theEnum) {
        enums.add(theEnum);
    }

    public final List<Enum> getEnums() {
        return enums;
    }

    public final String getTag() {
        return tag;
    }

    public final String getFieldName() {
        return fieldName;
    }

    public final String getType() {
        return type;
    }

    public final String getDesc() {
        return desc;
    }

    public final String getNotReqXML() {
        return notReqXML;
    }

    public boolean isRequired() {
        return false;
    }

    @Override
    public String toString() {
        return "Field{" +
                "tag='" + tag + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", notReqXML='" + notReqXML + '\'' +
                ", enums=" + enums +
                '}';
    }
}
