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

import java.util.Date;

/**
 * A timestamp-valued message field (a timestamp has both a date and a time).
 */
public class UtcTimeStampField extends DateField {
    private boolean includeMilliseconds = true;
    
    public UtcTimeStampField(int field) {
        super(field);
    }

    protected UtcTimeStampField(int field, Date data) {
        super(field, data);
    }

    public UtcTimeStampField(int field, boolean includeMilliseconds) {
        super(field);
        this.includeMilliseconds = includeMilliseconds;
    }

    protected UtcTimeStampField(int field, Date data, boolean includeMilliseconds) {
        super(field, data);
        this.includeMilliseconds = includeMilliseconds;
    }
    
    boolean showMilliseconds()   {
        return includeMilliseconds;
    }
}
