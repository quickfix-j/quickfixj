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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SessionSettingsLoader {

    public static final String SESSION_SECTION_NAME = "session";
    public static final String DEFAULT_SECTION_NAME = "default";

    protected final Pattern variablePattern;
    protected final Properties variableValues;

    protected SessionSettingsLoader(Properties variableValues) {
        this.variablePattern = Pattern.compile("\\$\\{(.+?)}");
        this.variableValues = new Properties(System.getProperties());
        if(variableValues != null) {
            this.variableValues.putAll(variableValues);
        }
    }

    public SessionSettings load(File file) throws ConfigError {
        try {
            return load(new FileInputStream(file));
        } catch(FileNotFoundException e) {
            final ConfigError configError = new ConfigError(e.getMessage());
            configError.fillInStackTrace();
            throw configError;
        }
    }

    public SessionSettings load(String file) throws ConfigError {
        try {
            return load(new FileInputStream(new File(file)));
        } catch(FileNotFoundException e) {
            final ConfigError configError = new ConfigError(e.getMessage());
            configError.fillInStackTrace();
            throw configError;
        }
    }

    public SessionSettings load(InputStream stream) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        settings.setVariableValues(this.variableValues);

        loadSessionSettings(settings, stream);
        return settings;
    }


    protected String interpolate(String value) {
        if (value == null || value.indexOf('$') == -1) {
            return value;
        }

        final StringBuffer buffer = new StringBuffer();
        final Matcher m = this.variablePattern.matcher(value);
        while (m.find()) {
            if (m.start() > 0 && value.charAt(m.start() - 1) == '\\') {
                continue;
            }
            final String variable = m.group(1);
            final String variableValue = variableValues.getProperty(variable);
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

    protected abstract void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError;

    // *************************************************************************
    //
    // *************************************************************************

    public static SessionSettings loadYAML(String fileName) throws ConfigError{
        return new YamlSessionSettingsLoader(null).load(fileName);
    }

    public static SessionSettings loadYAML(InputStream inputStream) throws ConfigError{
        return new YamlSessionSettingsLoader(null).load(inputStream);
    }

    public static SessionSettings loadDefault(String fileName) throws ConfigError{
        return new DefaultSessionSettingsLoader(null).load(fileName);
    }

    public static SessionSettings loadDefault(InputStream inputStream) throws ConfigError{
        return new DefaultSessionSettingsLoader(null).load(inputStream);
    }

    // *************************************************************************
    //
    // *************************************************************************

    private static class DefaultSessionSettingsLoader extends SessionSettingsLoader{

        private final Pattern sectionPattern;
        private final Pattern keyvalPatter;
        private final Pattern commentPatter;

        public DefaultSessionSettingsLoader(Properties variableValues) throws ConfigError {
            super(variableValues);

            this.sectionPattern = Pattern.compile( "\\s*\\[([^]]*)\\]\\s*" );
            this.keyvalPatter = Pattern.compile( "\\s*([^=]*)=(.*)" );
            this.commentPatter = Pattern.compile("^#.*$");
        }

        @Override
        protected void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
            try {
                loadSessions(sessionSettings, DEFAULT_SECTION_NAME, inputStream, null);
                loadSessions(sessionSettings, SESSION_SECTION_NAME, inputStream, sessionSettings.getDefaultProperties());
            } catch (final IOException e) {
                final ConfigError configError = new ConfigError(e.getMessage());
                configError.fillInStackTrace();
                throw configError;
            }
        }

        private void loadSessions(SessionSettings sessionSettings, String sectionId, InputStream inputStream, Properties defaults) throws IOException {
            inputStream.reset();

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
                            if (!section.equalsIgnoreCase(sectionId)) {
                                section = null;
                                settings = null;
                                continue;
                            }

                            settings = new Properties(defaults);
                        } else if (section != null && settings != null) {
                            m = keyvalPatter.matcher(line);
                            if (m.matches()) {
                                settings.put(
                                    m.group(1).trim(),
                                    interpolate(m.group(2).trim())
                                );
                            }
                        }
                    }
                }

                storeSection(section, sessionSettings, settings);
            } finally {
                br.close();
            }
        }
    }

    // *************************************************************************
    //
    // *************************************************************************

    private static class YamlSessionSettingsLoader extends SessionSettingsLoader {
        private final String YAML_DEFAULTS = "defaults";
        private final String YAML_SESSIONS = "sessions";

        public YamlSessionSettingsLoader(Properties variableValues) throws ConfigError {
            super(variableValues);
        }

        @Override
        protected void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
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
                settings.setProperty(entry.getKey(), entry.getValue().toString());
            }

            storeSection(sectionId, sessionSettings, settings);
        }
    }

}
