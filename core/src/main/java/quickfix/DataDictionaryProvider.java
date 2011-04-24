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

import quickfix.field.ApplVerID;

/**
 * Provide data dictionaries for specified session protocol or application versions.
 */
public interface DataDictionaryProvider {

    /**
     * Retrieve the data dictionary for parsing a specific version of the transport header/trailer.
     * 
     * @param beginString FIX.4.0 through FIXT.1.1
     * @return the data dictionary for the specified session protocol version 
     * or null if no such dictionary is available.
     * @see FixVersions
     */
    DataDictionary getSessionDataDictionary(String beginString);

    /**
     * Retrieve the data dictionary for the specified application version.
     * 
     * @param applVerID the application version ID. Prior to FIXT.1.1, the applVerID 
     * will be determined by BeginString field.
     * @return the data dictionary for the specified application version or null if no such
     * dictionary is available.
     */
    DataDictionary getApplicationDataDictionary(ApplVerID applVerID);
}
