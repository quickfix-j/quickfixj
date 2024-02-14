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
    String BEGINSTRING_FIX40 = "FIX.4.0";
    String BEGINSTRING_FIX41 = "FIX.4.1";
    String BEGINSTRING_FIX42 = "FIX.4.2";
    String BEGINSTRING_FIX43 = "FIX.4.3";
    String BEGINSTRING_FIX44 = "FIX.4.4";

    /*
     * FIX 5.0+ does not have a BeginString.
     */
    String FIX50 = "FIX.5.0";
    String FIX50SP1 = "FIX.5.0SP1";
    String FIX50SP2 = "FIX.5.0SP2";
    
    String LATEST = "Latest";
    String FIXLATEST = "FIX." + LATEST;

    // FIXT.x.x support

    String FIXT_SESSION_PREFIX = "FIXT.";
    String BEGINSTRING_FIXT11 = FIXT_SESSION_PREFIX + "1.1";
}
