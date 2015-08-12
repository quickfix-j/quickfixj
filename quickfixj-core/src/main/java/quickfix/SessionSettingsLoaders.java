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


public class SessionSettingsLoaders {

    // *************************************************************************
    //
    // *************************************************************************

    public static SessionSettings loadFromYaml(String fileName) throws ConfigError{
        return new YamlSessionSettingsLoader(null).load(fileName);
    }

    public static SessionSettings loadFromYaml(InputStream inputStream) throws ConfigError{
        return new YamlSessionSettingsLoader(null).load(inputStream);
    }

    public static SessionSettings load(String fileName) throws ConfigError{
        return new LegacySessionSettingsLoader(null).load(fileName);
    }

    public static SessionSettings load(InputStream inputStream) throws ConfigError{
        return new LegacySessionSettingsLoader(null).load(inputStream);
    }

    // *************************************************************************
    //
    // *************************************************************************

    private static class LegacySessionSettingsLoader extends SessionSettingsLoader{

        private final Pattern sectionPattern;
        private final Pattern keyvalPatter;
        private final Pattern commentPatter;

        public LegacySessionSettingsLoader(Properties variableValues) throws ConfigError {
            super(variableValues);

            this.sectionPattern = Pattern.compile( "\\s*\\[([^]]*)\\]\\s*" );
            this.keyvalPatter = Pattern.compile( "\\s*([^=]*)=(.*)" );
            this.commentPatter = Pattern.compile("^#.*$");
        }

        @Override
        protected void loadSessionSettings(SessionSettings sessionSettings, InputStream inputStream) throws ConfigError {
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
                                        interpolate(m.group(2).trim())
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
