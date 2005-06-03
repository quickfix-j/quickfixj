/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import quickfix.field.converter.BooleanConverter;

public class SessionSettings {
    public static final SessionID DEFAULT_SESSION_ID = new SessionID("DEFAULT", "", "");;
    private static final String SESSION_SECTION_NAME = "session";
    private static final String DEFAULT_SECTION_NAME = "default";
    public static final String SCREEN_LOG_INCOMING = "ScreenLogIncoming";
    public static final String SCREEN_LOG_OUTGOING = "ScreenLogOutgoing";
    public static final String SCREEN_LOG_EVENTS = "ScreenLogEvents";
    public static final String BEGINSTRING = "BeginString";
    public static final String SENDERCOMPID = "SenderCompID";
    public static final String TARGETCOMPID = "TargetCompID";
    public static final String SESSION_QUALIFIER = "SessionQualifier";
    public static final String CONNECTION_TYPE = "ConnectionType";
    public static final String USE_DATA_DICTIONARY = "UseDataDictionary";
    public static final String DATA_DICTIONARY = "DataDictionary";
    public static final String START_TIME = "StartTime";
    public static final String END_TIME = "EndTime";
    public static final String START_DAY = "StartDay";
    public static final String END_DAY = "EndDay";
    public static final String CHECK_LATENCY = "CheckLatency";
    public static final String MAX_LATENCY = "MaxLatency";
    public static final String HEARTBTINT = "HeartBtInt";
    public static final String SOCKET_ACCEPT_PORT = "SocketAcceptPort";
    public static final String SOCKET_REUSE_ADDRESS = "SocketReuseAddress";
    public static final String SOCKET_CONNECT_HOST = "SocketConnectHost";
    public static final String SOCKET_CONNECT_PORT = "SocketConnectPort";
    public static final String SOCKET_NODELAY = "SocketNodelay";
    public static final String RECONNECT_INTERVAL = "ReconnectInterval";
    public static final String VALIDATE_FIELDS_OUT_OF_ORDER = "ValidateFieldsOutOfOrder";
    public static final String VALIDATE_FIELDS_HAVE_VALUES = "ValidateFieldsHaveValues";
    public static final String LOGON_TIMEOUT = "LogonTimeout";
    public static final String FILE_STORE_PATH = "FileStorePath";
    public static final String MYSQL_STORE_DATABASE = "MySQLStoreDatabase";
    public static final String MYSQL_STORE_USER = "MySQLStoreUser";
    public static final String MYSQL_STORE_PASSWORD = "MySQLStorePassword";
    public static final String MYSQL_STORE_HOST = "MySQLStoreHost";
    public static final String MYSQL_STORE_PORT = "MySQLStorePort";
    public static final String JDBC_STORE_DRIVER = "JdbcStoreDriver";
    public static final String JDBC_STORE_URL = "JdbcStoreURL";
    public static final String JDBC_STORE_USER = "JdbcStoreUser";
    public static final String JDBC_STORE_PASSWORD = "JdbcStorePassword";
    public static final String FILE_LOG_PATH = "FileLogPath";
    public static final String RESET_ON_LOGOUT = "ResetOnLogout";
    public static final String RESET_ON_DISCONNECT = "ResetOnDisconnect";
    public static final String MILLISECONDS_IN_TIMESTAMP = "MillisecondsInTimeStamp";

    public SessionSettings() {
        sections.put(DEFAULT_SESSION_ID, new Properties());
    }

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

    public SessionSettings(InputStream stream) throws ConfigError {
        this();
        load(stream);
    }

    public String getString(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        String value = getSessionProperties(sessionID).getProperty(key);
        if (value == null) {
            throw new ConfigError("missing setting: "+key);
        }
        return value;
    }

    private Properties getSessionProperties(SessionID sessionID) throws ConfigError {
        Properties p = (Properties) sections.get(sessionID);
        if (p == null) {
            throw new ConfigError("unknown session: " + sessionID);
        }
        return p;
    }

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
            p = new Properties((Properties)sections.get(DEFAULT_SESSION_ID));
            sections.put(sessionID, p);
        }
        return p;
    }

    public double getDouble(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        try {
            return Double.parseDouble(getString(sessionID, key));
        } catch (NumberFormatException e) {
            throw new FieldConvertError(e.getMessage());
        }
    }

    public boolean getBool(SessionID sessionID, String key) throws ConfigError, FieldConvertError {
        try {
            return BooleanConverter.convert(getString(sessionID, key));
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    public void setString(SessionID sessionID, String key, String value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, value);
    }

    public void setLong(SessionID sessionID, String key, long value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, Long.toString(value));

    }

    public void setDouble(SessionID sessionID, String key, double value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, Double.toString(value));

    }

    public void setBool(SessionID sessionID, String key, boolean value) {
        getOrCreateSessionProperties(sessionID).setProperty(key, 
                BooleanConverter.convert(value));

    }

    private HashMap sections = new HashMap();

    // TODO CLEANUP should this be less-than-public?
    public Iterator sectionIterator() {
        return sections.keySet().iterator();
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
                            .getProperty("TargetCompID"), currentSection
                            .getProperty("SessionQualifier"));
            sections.put(sessionId, currentSection);
            currentSectionId = null;
            currentSection = null;
        }
    }

//    public Properties getDefaultSection() {
//        Properties section = (Properties) sections.get(DEFAULT_SECTION_NAME);
//        if (section == null) {
//            section = new Properties();
//            sections.put(DEFAULT_SECTION_NAME, section);
//        }
//        return section;
//    }

    public String toString() {
        return sections.toString();
    }

    public boolean isSetting(SessionID sessionID, String key) {
        return getOrCreateSessionProperties(sessionID).getProperty(key) != null;
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
            if (Character.isLetterOrDigit(ch)) {
                sb.setLength(0);
                do {
                    sb.append(ch);
                    ch = nextCharacter(inputStream);
                } while (Character.isLetterOrDigit(ch));
                return new Token(ID_TOKEN, sb.toString());
            } else if (ch == '=') {
                ch = nextCharacter(inputStream); // wrong
                skipWhitespace(inputStream);
                if (isValueCharacter(ch)) {
                    sb.setLength(0);
                    do {
                        sb.append(ch);
                        ch = nextCharacter(inputStream);
                    } while (isValueCharacter(ch));
                    return new Token(VALUE_TOKEN, sb.toString());
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
                } while ("\r\n".indexOf(ch) == -1);
                return getToken(inputStream);
            }
            // TODO QUESTION is this an error?
            return null;
        }

        private boolean isValueCharacter(char ch) {
            return Character.isLetterOrDigit(ch) || isPunctuation(ch) || ".:_-".indexOf(ch) != -1;
        }

        private char nextCharacter(InputStream inputStream) throws IOException {
            return (char) inputStream.read();
        }

        private boolean isPunctuation(char c1) {
            return (c1 > '\u0020' && c1 < '\u007E' && !Character.isSpaceChar(c1) && !Character
                    .isLetterOrDigit(c1));
        }

        private void skipWhitespace(InputStream inputStream) throws IOException {
            if (Character.isWhitespace(ch)) {
                do {
                    ch = nextCharacter(inputStream);
                } while (Character.isWhitespace(ch));
            }
        }
    }

    public boolean isSectionKey(SessionID sessionID) {
        return sections.containsKey(sessionID);
    }

}