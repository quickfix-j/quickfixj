/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/


package quickfix;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickfix.field.converter.BooleanConverter;

/**
 * Settings for sessions. Settings are grouped by FIX version and target company
 * ID. There is also a default settings section that is inherited by the
 * session-specific sections.
 *
 * Setting constants are declared in the classes using the settings. To find the
 * string constants, navigate to the class constant for the setting, select the
 * link for the setting and then and select the "Constant Field Values" link in
 * the detailed field description.
 *
 * @see quickfix.Acceptor
 * @see quickfix.Initiator
 * @see quickfix.FileLogFactory
 * @see quickfix.ScreenLogFactory
 * @see quickfix.FileStoreFactory
 * @see quickfix.JdbcSetting
 * @see quickfix.Session
 * @see quickfix.DefaultSessionFactory
 */
public class SessionSettings {
    private static final SessionID DEFAULT_SESSION_ID = new SessionID("DEFAULT", "", "");

    private static final String SESSION_SECTION_NAME = "session";

    private static final String DEFAULT_SECTION_NAME = "default";

    public static final String TARGETCOMPID = "TargetCompID";

    public static final String SESSION_QUALIFIER = "SessionQualifier";

    // This was using the line.separator system property but that caused
    // problems with moving configuration files between *nix and Windows.
    private static final String NEWLINE = "\r\n";

    private Map variableValues = System.getProperties();
    
    /**
     * Creates an empty session settings object.
     */
    public SessionSettings() {
        sections.put(DEFAULT_SESSION_ID, new Properties());
    }

    /**
     * Loads session settings from a file.
     *
     * @param filename
     *            the path to the file containing the session settings
     */
    public SessionSettings(String filename) throws ConfigError {
        this();
        InputStream in = getClass().getClassLoader().getResourceAsStream(filename);
        if (in == null) {
            try {
                in = new FileInputStream(filename);
            } catch (IOException e) {
                throw new ConfigError(e.getMessage());
            }
        }
        load(in);
    }

    /**
     * Loads session settings from an input stream.
     *
     * @param stream
     *            the input stream
     * @throws ConfigError
     */
    public SessionSettings(InputStream stream) throws ConfigError {
        this();
        load(stream);
    }

    /**
     * Gets a string from the default section of the settings.
     *
     * @param key
     * @return the default string value
     * @throws ConfigError
     * @throws FieldConvertError
     */
    public String getString(String key) throws ConfigError, FieldConvertError {
        return getString(DEFAULT_SESSION_ID, key);
    }

    /**
     * Get a settings string.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the settings key
     * @return the string value for the setting
     *
     * @throws ConfigError
     *             configurion error, probably a missing setting.
     * @throws FieldConvertError
     *             error during field type conversion.
     */
    public String getString(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        String value = interpolate(getSessionProperties(sessionID).getProperty(key));
        if (value == null) {
            throw new ConfigError(key + " not defined");
        }
        return value;
    }

    /**
     * Return the settings for a session as a Properties object.
     *
     * @param sessionID
     * @return the Properties object with the session settings
     * @throws ConfigError
     * @see java.util.Properties
     */
    public Properties getSessionProperties(SessionID sessionID) throws ConfigError {
        Properties p = (Properties) sections.get(sessionID);
        if (p == null) {
            throw new ConfigError("Session not found");
        }
        return p;
    }

    /**
     * Returns the defaults for the session-level settings.
     * @return the default properties
     * @throws ConfigError
     */
    public Properties getDefaultProperties() throws ConfigError {
        return getSessionProperties(DEFAULT_SESSION_ID);
    }

    /**
     * Gets a long from the default section of settings.
     *
     * @param key
     * @return the default value
     * @throws ConfigError
     * @throws FieldConvertError
     */
    public long getLong(String key) throws ConfigError, FieldConvertError {
        return getLong(DEFAULT_SESSION_ID, key);
    }

    /**
     * Get a settings value as a long integer.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the settings key
     * @return the long integer value for the setting
     *
     * @throws ConfigError
     *             configurion error, probably a missing setting.
     * @throws FieldConvertError
     *             error during field type conversion.
     */
    public long getLong(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        try {
            return Long.parseLong(getString(sessionID, key));
        } catch (NumberFormatException e) {
            throw new FieldConvertError(e.getMessage());
        }
    }

    private Properties getOrCreateSessionProperties(SessionID sessionID) {
        Properties p = (Properties) sections.get(sessionID);
        if (p == null) {
            p = new Properties((Properties) sections.get(DEFAULT_SESSION_ID));
            sections.put(sessionID, p);
        }
        return p;
    }

    /**
     * Gets a double value from the default section of the settings.
     *
     * @param key
     * @return the default value
     * @throws ConfigError
     * @throws FieldConvertError
     */
    public double getDouble(String key) throws ConfigError, FieldConvertError {
        return getDouble(DEFAULT_SESSION_ID, key);
    }

    /**
     * Get a settings value as a double number.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the settings key
     * @return the double number value for the setting
     *
     * @throws ConfigError
     *             configurion error, probably a missing setting.
     * @throws FieldConvertError
     *             error during field type conversion.
     */
    public double getDouble(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        try {
            return Double.parseDouble(getString(sessionID, key));
        } catch (NumberFormatException e) {
            throw new FieldConvertError(e.getMessage());
        }
    }

    /**
     * Gets a boolean value from the default section of the settings.
     *
     * @param key
     * @return the boolean value
     * @throws ConfigError
     * @throws FieldConvertError
     */
    public boolean getBool(String key) throws ConfigError, FieldConvertError {
        return getBool(DEFAULT_SESSION_ID, key);
    }

    /**
     * Get a settings value as a boolean value.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the settings key
     * @return the boolean value for the setting
     *
     * @throws ConfigError
     *             configurion error, probably a missing setting.
     * @throws FieldConvertError
     *             error during field type conversion.
     */
    public boolean getBool(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        try {
            return BooleanConverter.convert(getString(sessionID, key));
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    /**
     * Sets a string-valued session setting.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the setting key
     * @param value
     *            the string value
     */
    public void setString(SessionID sessionID, String key, String value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, value);
    }

    /**
     * Sets a long integer-valued session setting.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the setting key
     * @param value
     *            the long integer value
     */
    public void setLong(SessionID sessionID, String key, long value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, Long.toString(value));

    }

    /**
     * Sets a double-valued session setting.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the setting key
     * @param value
     *            the double value
     */
    public void setDouble(SessionID sessionID, String key, double value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, Double.toString(value));

    }

    /**
     * Sets a boolean-valued session setting.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the setting key
     * @param value
     *            the boolean value
     */
    public void setBool(SessionID sessionID, String key, boolean value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, BooleanConverter.convert(value));

    }

    private HashMap sections = new HashMap();

    public Iterator sectionIterator() {
        HashSet nondefaultSessions = new HashSet(sections.keySet());
        nondefaultSessions.remove(DEFAULT_SESSION_ID);
        return nondefaultSessions.iterator();
    }

    private void load(InputStream inputStream) throws ConfigError {
        try {
            Properties currentSection = null;
            String currentSectionId = null;
            Tokenizer tokenizer = new Tokenizer();
            Tokenizer.Token token = tokenizer.getToken(inputStream);
            while (token != null) {
                if (token.getType() == Tokenizer.SECTION_TOKEN) {
                    storeSection(currentSectionId, currentSection);
                    if (token.getValue().equalsIgnoreCase(DEFAULT_SECTION_NAME)) {
                        currentSectionId = DEFAULT_SECTION_NAME;
                        currentSection = getSessionProperties(DEFAULT_SESSION_ID);
                    } else if (token.getValue().equalsIgnoreCase(SESSION_SECTION_NAME)) {
                        currentSectionId = SESSION_SECTION_NAME;
                        currentSection = new Properties(getSessionProperties(DEFAULT_SESSION_ID));
                    }
                } else if (token.getType() == Tokenizer.ID_TOKEN) {
                    Tokenizer.Token valueToken = tokenizer.getToken(inputStream);
                    if (currentSection != null && token != null) {
                        currentSection.put(token.getValue(), valueToken.getValue());
                    }
                }
                token = tokenizer.getToken(inputStream);
            }
            storeSection(currentSectionId, currentSection);
        } catch (IOException e) {
            ConfigError configError = new ConfigError(e.getMessage());
            configError.fillInStackTrace();
            throw configError;
        }
    }

    private void storeSection(String currentSectionId, Properties currentSection) {
        if (currentSectionId != null && currentSectionId.equals(SESSION_SECTION_NAME)) {
            SessionID sessionId = new SessionID(currentSection.getProperty("BeginString"),
                    currentSection.getProperty("SenderCompID"), currentSection
                            .getProperty("TargetCompID"), currentSection.getProperty(
                            "SessionQualifier", ""));
            sections.put(sessionId, currentSection);
            currentSectionId = null;
            currentSection = null;
        }
    }

    /**
     * Predicate for determining if a setting is in the default section.
     *
     * @param key
     * @return true if setting is in the defaults, false otherwise
     */
    public boolean isSetting(String key) {
        return isSetting(DEFAULT_SESSION_ID, key);
    }

    /**
     * Predicate for determining if a setting exists.
     *
     * @param sessionID
     *            the session ID
     * @param key
     *            the setting key
     * @return true is setting exists, false otherwise.
     */
    public boolean isSetting(SessionID sessionID, String key) {
        return getOrCreateSessionProperties(sessionID).getProperty(key) != null;
    }

    public void removeSetting(SessionID sessionID, String key) {
        getOrCreateSessionProperties(sessionID).remove(key);
    }

    private static class Tokenizer {
        public static final int NONE_TOKEN = 1;

        public static final int ID_TOKEN = 2;

        public static final int VALUE_TOKEN = 3;

        public static final int SECTION_TOKEN = 4;

        private class Token {
            private int type;

            private String value;

            public Token(int type, String value) {
                super();
                this.type = type;
                this.value = value;
            }

            public int getType() {
                return type;
            }

            public String getValue() {
                return value;
            }

            public String toString() {
                return type + ": " + value;
            }
        }

        private char ch = '\0';

        private StringBuffer sb = new StringBuffer();

        private Token getToken(InputStream inputStream) throws IOException {
            if (ch == '\0') {
                ch = nextCharacter(inputStream);
            }
            skipWhitespace(inputStream);
            if (isLabelCharacter(ch)) {
                sb.setLength(0);
                do {
                    sb.append(ch);
                    ch = nextCharacter(inputStream);
                } while (isLabelCharacter(ch));
                return new Token(ID_TOKEN, sb.toString());
            } else if (ch == '=') {
                ch = nextCharacter(inputStream);
                skipWhitespace(inputStream);
                if (isValueCharacter(ch)) {
                    sb.setLength(0);
                    do {
                        sb.append(ch);
                        ch = nextCharacter(inputStream);
                    } while (isValueCharacter(ch));
                    return new Token(VALUE_TOKEN, sb.toString().trim());
                }
            } else if (ch == '[') {
                ch = nextCharacter(inputStream);
                Token id = getToken(inputStream);
                // check ]
                ch = nextCharacter(inputStream); // skip ]
                return new Token(SECTION_TOKEN, id.getValue());
            } else if (ch == '#') {
                do {
                    ch = nextCharacter(inputStream);
                } while (!isNewLineCharacter(ch));
                return getToken(inputStream);
            }
            return null;
        }

        private boolean isNewLineCharacter(char ch) {
            return NEWLINE.indexOf(ch) != -1;
        }

        private boolean isLabelCharacter(char ch) {
            return !isEndOfStream(ch) && "[]=#".indexOf(ch) == -1;
        }

        private boolean isValueCharacter(char ch) {
            return !isEndOfStream(ch) && !isNewLineCharacter(ch);
        }

        private boolean isEndOfStream(char ch) {
            return (byte) ch == -1;
        }

        private char nextCharacter(InputStream inputStream) throws IOException {
            return (char) inputStream.read();
        }

        private void skipWhitespace(InputStream inputStream) throws IOException {
            if (Character.isWhitespace(ch)) {
                do {
                    ch = nextCharacter(inputStream);
                } while (Character.isWhitespace(ch));
            }
        }
    }

    private Pattern variablePattern = Pattern.compile("\\$\\{(.+?)}");
    
    private String interpolate(String value) {
        if (value == null || value.indexOf('$') == -1) {
            return value;
        }
        StringBuffer buffer = new StringBuffer();
        Matcher m = variablePattern.matcher(value);
        while (m.find()) {
            if (m.start() > 0 && value.charAt(m.start()-1) == '\\') {
                continue;
            }
            String variable = m.group(1);
            if (variableValues.containsKey(variable)) {
                m.appendReplacement(buffer, variableValues.get(variable).toString());
            }
        }
        m.appendTail(buffer);
        return buffer.toString();
    }
    
    public void setVariableValues(Map variableValues) {
        this.variableValues = variableValues;
    }
    
    /**
     * Adds defaults to the settings. Will not delete existing settings not
     * overlapping with the new defaults, but will overwrite existing settings
     * specified in this call.
     *
     * @param defaults
     */
    public void set(Map defaults) {
        getOrCreateSessionProperties(DEFAULT_SESSION_ID).putAll(defaults);
    }

    /**
     * Set a default boolean parameter.
     * @param key the settings key
     * @param value the settings value
     */
    public void setBool(String key, boolean value) {
        setBool(DEFAULT_SESSION_ID, key, value);
    }

    /**
     * Set a default double parameter.
     * @param key the settings key
     * @param value the settings value
     */
    public void setDouble(String key, double value) {
        setDouble(DEFAULT_SESSION_ID, key, value);
    }

    /**
     * Set a default long parameter.
     * @param key the settings key
     * @param value the settings value
     */
    public void setLong(String key, long value) {
        setLong(DEFAULT_SESSION_ID, key, value);
    }

    /**
     * Set a default string parameter.
     * @param key the settings key
     * @param value the settings value
     */
    public void setString(String key, String value) {
        setString(DEFAULT_SESSION_ID, key, value);
    }

    public int size() {
        // Always a default section
        return sections.size() - 1;
    }

    public Dictionary get(SessionID sessionID) throws ConfigError {
        return new Dictionary(null, getSessionProperties(sessionID));
    }

    public void set(SessionID sessionID, Dictionary dictionary) throws ConfigError {
        Properties p = getOrCreateSessionProperties(sessionID);
        p.clear();
        p.putAll(dictionary.toMap());
    }

    public Dictionary get() {
        try {
            return new Dictionary(null, getDefaultProperties());
        } catch (ConfigError e) {
            return null;
        }
    }

    public void set(Dictionary dictionary) throws ConfigError {
        getDefaultProperties().putAll(dictionary.toMap());
    }

}