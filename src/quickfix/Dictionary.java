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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.emory.mathcs.backport.java.util.Collections;

public class Dictionary {
    private String name;
    private HashMap data = new HashMap();

    public Dictionary() {
    }

    public Dictionary(String name) {
        this(name, Collections.EMPTY_MAP);
    }

    public Dictionary(Dictionary dictionary) {
        this(dictionary.name, dictionary.data);
    }

    public Dictionary(String name, Map data) {
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

    private static ArrayList dayTranslations = new ArrayList();
    
    static {
        dayTranslations.add("");
        dayTranslations.add("su");
        dayTranslations.add("mo");
        dayTranslations.add("tu");
        dayTranslations.add("we");
        dayTranslations.add("th");
        dayTranslations.add("fr");
        dayTranslations.add("sa");
    }
    
    public int getDay(String key) throws ConfigError, FieldConvertError {
        String value = getString(key);
        if (value.length() < 2) {
            throw new FieldConvertError("Day value too short: "+value);
        }
        String lcvalue = value.toLowerCase();
        int result = dayTranslations.indexOf(lcvalue.substring(0,2));
        if (result == -1) {
            throw new FieldConvertError("Could not translate day value: "+value);
        }
        return result;
    }

    public void setString(String key, String value) {
        data.put(key, value);
    }

    public void setLong(String key, long value) {
        data.put(key, new Long(value));
    }

    public void setDouble(String key, double value) {
        data.put(key, new Double(value));
    }

    public void setBool(String key, boolean value) {
        data.put(key, new Boolean(value));
    }

    public boolean has(String key) {
        return data.containsKey(key);
    }

    public void merge(Dictionary toMerge) {
        data.putAll(toMerge.data);
    }

    public Map toMap() {
        return data;
    }
}
