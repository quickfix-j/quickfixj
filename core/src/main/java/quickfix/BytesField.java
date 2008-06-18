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

import java.io.UnsupportedEncodingException;

import org.quickfixj.QFJException;

/**
 * BytesField enables better handling of binary data. With BytesFields binary data can
 * be directly put into FIX messages without casting them into Strings.
 */
public class BytesField extends Field<byte[]> {

    public BytesField(int field) {
        super(field, new byte[0]);
    }
    
    public BytesField(int field, byte[] data) {
        super(field, data);
    }
    
    public void setValue(byte[] data) {
        setObject(data);
    }
    
    public byte[] getValue() {
        return getObject();
    }
    
    @Override
    protected String objectAsString() {
        try {
            return new String(getObject(), "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new QFJException(e);
        }
    }

    
}
