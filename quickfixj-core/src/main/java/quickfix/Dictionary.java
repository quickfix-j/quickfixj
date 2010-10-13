/****************************************************************************
 ** Copyright (c) quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import java.util.HashMap;
import java.util.Map;

/**
 * Name/value pairs used for specifying groups of settings.
 * @see SessionSettings
 */
public class Dictionary {
    private String name;
    private HashMap<Object,Object> data = new HashMap<Object,Object>();

    public Dictionary() {
    }

    public Dictionary(String name) {
        this(name, new HashMap<Object,Object>());
    }

    public Dictionary(Dictionary dictionary) {
        this(dictionary.name, dictionary.data);
    }

    public Dictionary(String name, Map<Object,Object> data) {
        this.name = name;
        this.data.putAll(data);
    }
    
    public String getName() {
        return name;
    }

    public int size() {
        return data.size();
    }

    public String getString(String key) throws ConfigError, FieldConvertError {
        try {
            return (String) data.get(key).toString();
        } catch (NullPointerException e) {
            throw new ConfigError("No value for key: "+key);
        }
    }

    public String getString(String key, boolean capitalize) throws ConfigError, FieldConvertError {
        String string = getString(key);
        return capitalize ? string.toUpperCase() : string;
    }

    public long getLong(String key) throws ConfigError, FieldConvertError {
        try {
            return ((Long) data.get(key)).longValue();
        } catch (ClassCastException e) {
            throw new FieldConvertError("Incorrect data type");
        } catch (NullPointerException e) {
            throw new ConfigError("No value for key: "+key);
        }
    }

    public double getDouble(String key) throws ConfigError, FieldConvertError {
        try {
            return ((Double) data.get(key)).doubleValue();
        } catch (ClassCastException e) {
            throw new FieldConvertError("Incorrect data type");
        } catch (NullPointerException e) {
            throw new ConfigError("No value for key: "+key);
        }
    }

    public boolean getBool(String key) throws ConfigError, FieldConvertError {
        try {
            return ((Boolean) data.get(key)).booleanValue();
        } catch (ClassCastException e) {
            throw new FieldConvertError("Incorrect data type");
        } catch (NullPointerException e) {
            throw new ConfigError("No value for key: "+key);
        }        
    }

    public int getDay(String key) throws ConfigError, FieldConvertError {
        Object datum = data.get(key);
        if (datum == null) {
            throw new ConfigError("No value for key.");
        }
        if (datum instanceof String) {
            return DayConverter.toInteger((String)datum);
        }
        throw new ConfigError("Invalid data type for day value: "+datum.getClass().getName());
    }

    public void setString(String key, String value) {
        data.put(key, value);
    }

    public void setLong(String key, long value) {
        data.put(key, Long.valueOf(value));
    }

    public void setDouble(String key, double value) {
        data.put(key, Double.valueOf(value));
    }

    public void setBool(String key, boolean value) {
        data.put(key, Boolean.valueOf(value));
    }

    public void setDay( String key, int value ) {
        try {
            data.put(key, DayConverter.toString(value));
        } catch (ConfigError e) {
            // JNI API doesn't allow a ConfigError to be thrown
            throw new RuntimeError(e);
        }
    }
    
    public void setDay( String key, String dayName ) {
        data.put(key, dayName);
    }

    public boolean has(String key) {
        return data.containsKey(key);
    }

    public void merge(Dictionary toMerge) {
        data.putAll(toMerge.data);
    }

    public Map<Object,Object> toMap() {
        return data;
    }
}
