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

import quickfix.IntField;

public class EncryptMethod extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 98;
    public static final int NONE_OTHER = 0;
    public static final int PKCS = 1;
    public static final int DES = 2;
    public static final int PKCSDES = 3;
    public static final int PGPDES = 4;
    public static final int PGPDESMD5 = 5;
    public static final int PEMDESMD5 = 6;
    
    public EncryptMethod() {
        super(98);
    }

    public EncryptMethod(int data) {
        super(98, data);
    }
}