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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
        } catch(final FileNotFoundException e) {
            final ConfigError configError = new ConfigError(e.getMessage());
            configError.fillInStackTrace();
            throw configError;
        }
    }

    public SessionSettings load(String file) throws ConfigError {
        InputStream in = getClass().getClassLoader().getResourceAsStream(file);
        if (in == null) {
            try {
                in = new FileInputStream(file);
            } catch (final IOException e) {
                throw new ConfigError(e.getMessage());
            }
        } else {
            in = new BufferedInputStream(in);
        }

        return load(in);
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


}
