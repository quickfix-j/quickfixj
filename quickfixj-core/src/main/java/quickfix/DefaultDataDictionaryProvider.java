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
import quickfix.field.ApplVerID;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static quickfix.MessageUtils.toBeginString;

public class DefaultDataDictionaryProvider implements DataDictionaryProvider {
    private final Map<String, DataDictionary> transportDictionaries = new ConcurrentHashMap<>();
    private final Map<AppVersionKey, DataDictionary> applicationDictionaries = new ConcurrentHashMap<>();
    private final boolean findDataDictionaries;

    public DefaultDataDictionaryProvider() {
        findDataDictionaries = true;
    }

    public DefaultDataDictionaryProvider(boolean findDataDictionaries) {
        this.findDataDictionaries = findDataDictionaries;
    }

    public synchronized DataDictionary getSessionDataDictionary(String beginString) {
        DataDictionary dd = transportDictionaries.get(beginString);
        if (dd == null && findDataDictionaries) {
            String path = beginString.replace(".", "") + ".xml";
            try {
                dd = new DataDictionary(path);
                transportDictionaries.put(beginString, dd);
            } catch (ConfigError e) {
                throw new QFJException(e);
            }
        }
        return dd;
    }

    public DataDictionary getApplicationDataDictionary(ApplVerID applVerID) {
        AppVersionKey appVersionKey = new AppVersionKey(applVerID);
        DataDictionary dd = applicationDictionaries.get(appVersionKey);
        if (dd == null && findDataDictionaries) {
            String beginString = toBeginString(applVerID);
            String path = beginString.replace(".", "") + ".xml";
            try {
                dd = new DataDictionary(path);
                applicationDictionaries.put(appVersionKey, dd);
            } catch (ConfigError e) {
                throw new QFJException(e);
            }
        }
        return dd;
    }

    public void addTransportDictionary(String beginString, DataDictionary dd) {
        transportDictionaries.put(beginString, dd);
    }

    public void addApplicationDictionary(ApplVerID applVerID, DataDictionary dataDictionary) {
        applicationDictionaries.put(new AppVersionKey(applVerID), dataDictionary);
    }

    private static class AppVersionKey {
        private final ApplVerID applVerID;

        public AppVersionKey(ApplVerID applVerID) {
            this.applVerID = applVerID;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((applVerID == null) ? 0 : applVerID.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            AppVersionKey other = (AppVersionKey) obj;
            if (applVerID == null) {
                if (other.applVerID != null) {
                    return false;
                }
            } else if (!applVerID.equals(other.applVerID)) {
                return false;
            }
            return true;
        }
    }
}
