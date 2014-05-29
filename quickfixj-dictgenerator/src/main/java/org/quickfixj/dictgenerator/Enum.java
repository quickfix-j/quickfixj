package org.quickfixj.dictgenerator;

public final class Enum {

    private String enumName = null, desc = null;

    public Enum(String enumName, String desc) {
        this.enumName = enumName;
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "Enum{" +
                "enumName='" + enumName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getEnumName() {
        return enumName;
    }

    public String getDesc() {
        return desc;
    }
}
