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

package quickfix.examples.banzai;

import java.util.HashMap;

public class TwoWayMap {
    private HashMap<Object, Object> firstToSecond = new HashMap<Object, Object>();
    private HashMap<Object, Object> secondToFirst = new HashMap<Object, Object>();

    public void put(Object first, Object second) {
        firstToSecond.put(first, second);
        secondToFirst.put(second, first);
    }

    public Object getFirst(Object first) {
        return firstToSecond.get(first);
    }

    public Object getSecond(Object second) {
        return secondToFirst.get(second);
    }

    public String toString() {
        return firstToSecond.toString() + "\n" + secondToFirst.toString();
    }
}
