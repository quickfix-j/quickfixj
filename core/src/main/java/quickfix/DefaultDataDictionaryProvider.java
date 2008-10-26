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

import static quickfix.MessageUtils.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.quickfixj.QFJException;

import quickfix.field.ApplVerID;

public class DefaultDataDictionaryProvider implements DataDictionaryProvider {
    private static final String CUSTOM_APPL_VERSION_DELIM = "_";
    private Map<String, DataDictionary> transportDictionaries = new ConcurrentHashMap<String, DataDictionary>();
    private Map<AppVersionKey, DataDictionary> applicationDictionaries = new ConcurrentHashMap<AppVersionKey, DataDictionary>();
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

    public DataDictionary getApplicationDataDictionary(ApplVerID applVerID, String customApplVerID) {
        AppVersionKey appVersionKey = new AppVersionKey(applVerID, customApplVerID);
        DataDictionary dd = applicationDictionaries.get(appVersionKey);
        if (dd == null && findDataDictionaries) {
            String beginString = toBeginString(applVerID);
            String path = beginString.replace(".", "")
                    + (customApplVerID != null ? CUSTOM_APPL_VERSION_DELIM + customApplVerID : "")
                    + ".xml";
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

    public void addApplicationDictionary(ApplVerID applVerID, String customApplVerID,
            DataDictionary dataDictionary) {
        applicationDictionaries.put(new AppVersionKey(applVerID, customApplVerID), dataDictionary);
    }

    private static class AppVersionKey {
        private final ApplVerID applVerID;
        private final String customApplVerID;

        public AppVersionKey(ApplVerID applVerID, String customApplVerID) {
            this.applVerID = applVerID;
            this.customApplVerID = customApplVerID;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((applVerID == null) ? 0 : applVerID.hashCode());
            result = prime * result + ((customApplVerID == null) ? 0 : customApplVerID.hashCode());
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
            if (customApplVerID == null) {
                if (other.customApplVerID != null) {
                    return false;
                }
            } else if (!customApplVerID.equals(other.customApplVerID)) {
                return false;
            }
            return true;
        }
    }
}
