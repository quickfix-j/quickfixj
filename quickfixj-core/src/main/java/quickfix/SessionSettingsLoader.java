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

import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SessionSettingsLoader {
    public enum Type {
        LEGACY,
        YAML
    }

    public interface PropertyNameTranslator {
        public String translate(String propertyName);
    }

    public static final String SESSION_SECTION_NAME = "session";
    public static final String DEFAULT_SECTION_NAME = "default";

    public static final Pattern VARIABLE_PATTERN = Pattern.compile("\\$\\{(.+?)}");

    private SessionSettingsLoader() {
    }

    public SessionSettings load(Properties properties, InputStream stream) throws ConfigError {
        Properties variableValues = new Properties(System.getProperties());
        variableValues.putAll(properties);

        SessionSettings settings = new SessionSettings();
        settings.setVariableValues(variableValues);

        loadSessionSettings(variableValues, settings, stream);
        return settings;
    }


    protected String interpolate(Properties properties, String value) {
        if (value == null || value.indexOf('$') == -1) {
            return value;
        }

        final StringBuffer buffer = new StringBuffer();
        final Matcher m = VARIABLE_PATTERN.matcher(value);
        while (m.find()) {
            if (m.start() > 0 && value.charAt(m.start() - 1) == '\\') {
                continue;
            }
            final String variable = m.group(1);
            final String variableValue = properties.getProperty(variable);
            if (variableValue != null) {
                m.appendReplacement(buffer, variableValue);
            }
        }
        m.appendTail(buffer);
        return buffer.toString();
    }

    protected void storeSection(String sectionId, SessionSettings sessionSettings, Properties settings) {
        if(sectionId != null && settings != null && !settings.isEmpty()) {
            if (sectionId.equalsIgnoreCase(SESSION_SECTION_NAME)) {
                final SessionID sid = new SessionID(
                        settings.getProperty(SessionSettings.BEGINSTRING),
                        settings.getProperty(SessionSettings.SENDERCOMPID),
                        settings.getProperty(SessionSettings.SENDERSUBID),
                        settings.getProperty(SessionSettings.SENDERLOCID),
                        settings.getProperty(SessionSettings.TARGETCOMPID),
                        settings.getProperty(SessionSettings.TARGETSUBID),
                        settings.getProperty(SessionSettings.TARGETLOCID),
                        settings.getProperty(SessionSettings.SESSION_QUALIFIER));

                sessionSettings.getOrCreateSessionProperties(sid, true).putAll(settings);
            } else if (sectionId.equalsIgnoreCase(DEFAULT_SECTION_NAME)) {
                sessionSettings.getOrCreateSessionProperties(SessionSettings.DEFAULT_SESSION_ID, true).putAll(settings);
            }
        }
    }

    protected abstract void loadSessionSettings(
        Properties properties, SessionSettings sessionSettings, InputStream inputStream) throws ConfigError;


    // *************************************************************************
    //
    // *************************************************************************

    static class LegacyLoader extends SessionSettingsLoader{

        private final Pattern sectionPattern;
        private final Pattern keyvalPatter;
        private final Pattern commentPatter;

        public LegacyLoader() {
            this.sectionPattern = Pattern.compile( "\\s*\\[([^]]*)\\]\\s*" );
            this.keyvalPatter = Pattern.compile( "\\s*([^=]*)=(.*)" );
            this.commentPatter = Pattern.compile("^#.*$");
        }

        @Override
        protected void loadSessionSettings(Properties properties, SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String line = null;
                String section = null;
                Properties settings = null;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    Matcher m = commentPatter.matcher(line);
                    if(!m.matches()) {
                        m = sectionPattern.matcher(line);
                        if (m.matches()) {
                            storeSection(section, sessionSettings, settings);

                            section = m.group(1).trim();
                            if(section.equalsIgnoreCase(DEFAULT_SECTION_NAME)) {
                                settings = new Properties();
                            } if(section.equalsIgnoreCase(SESSION_SECTION_NAME)) {
                                settings = new Properties(sessionSettings.getDefaultProperties());
                            }
                        } else if (section != null && settings != null) {
                            m = keyvalPatter.matcher(line);
                            if (m.matches()) {
                                settings.put(
                                    m.group(1).trim(),
                                    interpolate(properties, m.group(2).trim())
                                );
                            }
                        }
                    }
                }

                storeSection(section, sessionSettings, settings);

                br.close();
            } catch (final IOException e) {
                final ConfigError configError = new ConfigError(e.getMessage());
                configError.fillInStackTrace();
                throw configError;
            }
        }
    }

    // *************************************************************************
    //
    // *************************************************************************

    static class YamlLoader extends SessionSettingsLoader {
        private final String YAML_DEFAULTS = "defaults";
        private final String YAML_SESSIONS = "sessions";

        public YamlLoader() {
        }

        @Override
        protected void loadSessionSettings(Properties properties, SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
            final Yaml yaml = new Yaml();
            final Map<?,?> data = yaml.loadAs(inputStream,Map.class);

            if(data.containsKey(YAML_DEFAULTS)) {
                loadSessionSettings(DEFAULT_SECTION_NAME, sessionSettings, (Map<String, Object>) data.get(YAML_DEFAULTS));
            }

            if(data.containsKey(YAML_SESSIONS)) {
                for (Map<String, Object> settingsMap : (List<Map<String, Object>>) data.get(YAML_SESSIONS)) {
                    loadSessionSettings(SESSION_SECTION_NAME, sessionSettings, settingsMap);
                }
            }
        }

        protected void loadSessionSettings(String sectionId, SessionSettings sessionSettings, Map<String, Object> sectionData) {
            final Properties settings = new Properties(sessionSettings.getDefaultProperties());
            for(Map.Entry<String, Object> entry : sectionData.entrySet()) {
                if(entry.getValue() != null) {
                    settings.setProperty(normalize(entry.getKey()), entry.getValue().toString());
                }
            }

            storeSection(sectionId, sessionSettings, settings);
        }

        protected String normalize(String propertyKey) {
            final StringBuilder key = new StringBuilder(propertyKey);
            for(int i = key.length() - 1; i >= 0; --i) {
                if(key.charAt(i) == '-' || key.charAt(i) == '_' || key.charAt(i) == '.') {
                    key.deleteCharAt(i);
                    if(i < key.length()) {
                        key.setCharAt(i, Character.toUpperCase(key.charAt(i)));
                    }
                }
            }

            key.setCharAt(0, Character.toUpperCase(key.charAt(0)));
            //Check for id
            if( key.charAt(key.length() - 2) == 'i' ||
                key.charAt(key.length() - 2) == 'I' ||
                key.charAt(key.length() - 1) == 'd' ||
                key.charAt(key.length() - 1) == 'D') {
                key.setCharAt(key.length() - 2, 'I');
                key.setCharAt(key.length() - 1, 'D');
            }


            return key.toString();
        }
    }
}
