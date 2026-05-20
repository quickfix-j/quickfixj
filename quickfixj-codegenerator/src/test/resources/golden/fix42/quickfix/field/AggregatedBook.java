/* Generated Java Source File */
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

package quickfix.field;

import quickfix.BooleanField;

public class AggregatedBook extends BooleanField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 266;
    public static final boolean ONE_BOOK_ENTRY_PER_SIDE_PER_PRICE = true;
    public static final boolean MULTIPLE_ENTRIES_PER_SIDE_PER_PRICE_ALLOWED = false;
    
    public AggregatedBook() {
        super(266);
    }

    public AggregatedBook(boolean data) {
        super(266, data);
    }
}