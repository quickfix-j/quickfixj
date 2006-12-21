package org.quickfixj.jmx.mbean;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

public class ObjectNameFactory {

    private StringBuffer sb = new StringBuffer();

    public void addProperty(String name, String value) {
        if (value != null && value.length() > 0) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(name).append('=').append(value);
        }
    }

    public ObjectName createName() throws MalformedObjectNameException {
        return ObjectName.getInstance("org.quickfixj:" + sb);
    }
}
