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

package quickfix.mina.message;

import java.util.ArrayList;
import java.util.List;

import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class ProtocolDecoderOutputForTest implements ProtocolDecoderOutput {
    public List<Object> messages = new ArrayList<Object>();

    public void write(Object message) {
        messages.add(message);
    }

    public int getMessageCount() {
        return messages.size();
    }

    public String getMessage() {
        if (messages.isEmpty()) {
            return null;
        }
        return getMessage(0);
    }

    public String getMessage(int n) {
        return (String) messages.get(n);
    }

    public void reset() {
        messages.clear();
    }

    public void flush(org.apache.mina.core.filterchain.IoFilter.NextFilter filter,org.apache.mina.core.session.IoSession session) {
        // empty
    }
}
