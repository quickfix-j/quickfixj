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

public class SessionSettingsLoader {

    public static SessionSettings loadYAML(String fileName) throws ConfigError{
        return new YamlSessionSettingsLoader(null).load(fileName);
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

    private static abstract class AbstractSessionSettingsLoader {
        protected final Pattern variablePattern;
        protected final Properties variableValues;

        protected AbstractSessionSettingsLoader(Properties variableValues) {
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

        protected void storeSection(SessionSettings settings, Map<Object,Object> currentSection) {
            settings.set(
                new SessionID(
                    (String)currentSection.get(SessionSettings.BEGINSTRING),
                    (String)currentSection.get(SessionSettings.SENDERCOMPID),
                    (String)currentSection.get(SessionSettings.SENDERSUBID),
                    (String)currentSection.get(SessionSettings.SENDERLOCID),
                    (String)currentSection.get(SessionSettings.TARGETCOMPID),
                    (String)currentSection.get(SessionSettings.TARGETSUBID),
                    (String)currentSection.get(SessionSettings.TARGETLOCID),
                    (String)currentSection.get(SessionSettings.SESSION_QUALIFIER)),
                currentSection);
        }

        protected abstract void loadSessionSettings(SessionSettings sessionSettings,InputStream inputStream) throws ConfigError;
    }

    // *************************************************************************
    //
    // *************************************************************************

    private static class DefaultSessionSettingsLoader extends AbstractSessionSettingsLoader{
        private static final String SESSION_SECTION_NAME = "session";
        private static final String DEFAULT_SECTION_NAME = "default";

        private final Pattern sectionPattern;
        private final Pattern keyvalPatter;

        public DefaultSessionSettingsLoader(Properties variableValues) throws ConfigError {
            super(variableValues);

            this.sectionPattern = Pattern.compile( "\\s*\\[([^]]*)\\]\\s*" );
            this.keyvalPatter = Pattern.compile( "\\s*([^=]*)=(.*)" );
        }

        @Override
        protected void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
            try {
                loadSessions(
                    sessionSettings,
                    DEFAULT_SECTION_NAME,
                    inputStream,
                    null);
                loadSessions(
                    sessionSettings,
                    SESSION_SECTION_NAME,
                    inputStream,
                    sessionSettings.getSessionProperties(SessionSettings.DEFAULT_SESSION_ID));
            } catch (final IOException e) {
                final ConfigError configError = new ConfigError(e.getMessage());
                configError.fillInStackTrace();
                throw configError;
            }
        }

        private void loadSessions(SessionSettings sessionSettings, String sectionId, InputStream inputStream, Properties defaults) throws IOException {
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String line = null;
                String section = null;
                Properties settings = null;
                while ((line = br.readLine()) != null) {
                    Matcher m = sectionPattern.matcher(line);
                    if (m.matches()) {
                        if(section != null) {
                            storeSection(sessionSettings, settings);
                            section = null;
                        }

                        section = m.group(1).trim();
                        if (!section.equalsIgnoreCase(sectionId)) {
                            section = null;
                            break;
                        }

                        settings = new Properties(defaults);
                    } else if (section != null) {
                        m = keyvalPatter.matcher(line);
                        if (m.matches()) {
                            String key = m.group(1).trim();
                            String value = m.group(2).trim();
                            settings.put(key, interpolate(value));
                        }
                    }
                }
            } finally {
                br.close();
            }
        }
    }

    // *************************************************************************
    //
    // *************************************************************************

    private static class YamlSessionSettingsLoader extends AbstractSessionSettingsLoader {
        private static final String SESSION_SECTION_NAME = "sessions";
        private static final String DEFAULT_SECTION_NAME = "default";

        public YamlSessionSettingsLoader(Properties variableValues) throws ConfigError {
            super(variableValues);
        }

        @Override
        protected void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
            final Yaml yaml = new Yaml();
            final Map<?,?> data = yaml.loadAs(inputStream,Map.class);

            final Map<Object,Object> defaults = (Map<Object,Object>)data.get(DEFAULT_SECTION_NAME);
            storeSection(sessionSettings, defaults);

            for(Map<Object,Object> session : (List<Map<Object,Object>>)data.get(SESSION_SECTION_NAME)) {
                Map<Object,Object> sessionData = new HashMap<Object, Object>(defaults);
                sessionData.putAll(session);

                storeSection(sessionSettings, sessionData);
            }
        }
    }

}
