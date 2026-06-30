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

import javax.xml.parsers.DocumentBuilderFactory;

final class ExternalDtdDataDictionaryLoader {
    private static final String DEFAULT_CONNECT_TIMEOUT_PROPERTY = "sun.net.client.defaultConnectTimeout";
    private static final String DEFAULT_READ_TIMEOUT_PROPERTY = "sun.net.client.defaultReadTimeout";
    private static final int EXTERNAL_DTD_TIMEOUT_MILLIS = 5000;
    private static final int EXTERNAL_DTD_LOAD_RETRIES = 3;
    private static final int EXTERNAL_DTD_RETRY_DELAY_MILLIS = 250;

    private ExternalDtdDataDictionaryLoader() {
    }

    static DataDictionary load(String location) throws ConfigError {
        final String previousConnectTimeout = System.getProperty(DEFAULT_CONNECT_TIMEOUT_PROPERTY);
        final String previousReadTimeout = System.getProperty(DEFAULT_READ_TIMEOUT_PROPERTY);
        try {
            final String timeout = String.valueOf(EXTERNAL_DTD_TIMEOUT_MILLIS);
            System.setProperty(DEFAULT_CONNECT_TIMEOUT_PROPERTY, timeout);
            System.setProperty(DEFAULT_READ_TIMEOUT_PROPERTY, timeout);

            ConfigError lastError = new ConfigError("Could not parse data dictionary file");
            for (int attempt = 1; attempt <= EXTERNAL_DTD_LOAD_RETRIES; attempt++) {
                try {
                    return new DataDictionary(location, DocumentBuilderFactory::newInstance);
                } catch (ConfigError e) {
                    lastError = e;
                    if (attempt < EXTERNAL_DTD_LOAD_RETRIES) {
                        try {
                            Thread.sleep((1L << (attempt - 1)) * EXTERNAL_DTD_RETRY_DELAY_MILLIS);
                        } catch (InterruptedException interruptedException) {
                            Thread.currentThread().interrupt();
                            throw new ConfigError("Interrupted while retrying " + location + " load",
                                    interruptedException);
                        }
                    }
                }
            }
            throw new ConfigError("Failed to load " + location + " after " + EXTERNAL_DTD_LOAD_RETRIES
                    + " attempts", lastError);
        } finally {
            restoreSystemProperty(DEFAULT_CONNECT_TIMEOUT_PROPERTY, previousConnectTimeout);
            restoreSystemProperty(DEFAULT_READ_TIMEOUT_PROPERTY, previousReadTimeout);
        }
    }

    private static void restoreSystemProperty(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
        } else {
            System.setProperty(key, value);
        }
    }
}
