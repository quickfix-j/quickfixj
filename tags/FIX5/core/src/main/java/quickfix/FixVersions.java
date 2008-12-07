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

/**
 * Constants containing the BeginString field values for various FIX versions.
 */
public interface FixVersions {
    public static final String BEGINSTRING_FIX40 = "FIX.4.0";
    public static final String BEGINSTRING_FIX41 = "FIX.4.1";
    public static final String BEGINSTRING_FIX42 = "FIX.4.2";
    public static final String BEGINSTRING_FIX43 = "FIX.4.3";
    public static final String BEGINSTRING_FIX44 = "FIX.4.4";
    
    /**
     * FIX 5.0 does not have a begin string.
     */
    public static final String FIX50 = "FIX.5.0";

    // FIXT.x.x support
    
    public static final String FIXT_SESSION_PREFIX = "FIXT.";
    public static final String BEGINSTRING_FIXT11 = FIXT_SESSION_PREFIX + "1.1";
}
