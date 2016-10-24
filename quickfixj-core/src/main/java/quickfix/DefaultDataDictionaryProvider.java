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

import org.quickfixj.QFJException;
import org.quickfixj.SimpleCache;
import quickfix.field.ApplVerID;

import static quickfix.MessageUtils.toBeginString;

public class DefaultDataDictionaryProvider implements DataDictionaryProvider {
    private final SimpleCache<String, DataDictionary> transportDictionaries;
    private final SimpleCache<ApplVerID, DataDictionary> applicationDictionaries;

    public DefaultDataDictionaryProvider() {
        this(true);
    }

    public DefaultDataDictionaryProvider(boolean findDataDictionaries) {
        transportDictionaries = new SimpleCache<>(beginString -> {
            if (findDataDictionaries) {
                final String path = beginString.replace(".", "") + ".xml";
                try {
                    return new DataDictionary(path);
                } catch (ConfigError e) {
                    throw new QFJException(e);
                }
            }
            return null;
        });
        applicationDictionaries = new SimpleCache<>(applVerID -> {
            if (findDataDictionaries) {
                final String beginString = toBeginString(applVerID);
                final String path = beginString.replace(".", "") + ".xml";
                try {
                    return new DataDictionary(path);
                } catch (ConfigError e) {
                    throw new QFJException(e);
                }
            }
            return null;
        });
    }

    public DataDictionary getSessionDataDictionary(String beginString) {
        return transportDictionaries.computeIfAbsent(beginString);
    }

    public DataDictionary getApplicationDataDictionary(ApplVerID applVerID) {
        return applicationDictionaries.computeIfAbsent(applVerID);
    }

    public void addTransportDictionary(String beginString, DataDictionary dd) {
        transportDictionaries.put(beginString, dd);
    }

    public void addApplicationDictionary(ApplVerID applVerID, DataDictionary dataDictionary) {
        applicationDictionaries.put(applVerID, dataDictionary);
    }
}
