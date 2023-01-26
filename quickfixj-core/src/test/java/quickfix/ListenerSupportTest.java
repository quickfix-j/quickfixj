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

import java.util.Observable;
import java.util.Observer;

import junit.framework.TestCase;

public class ListenerSupportTest extends TestCase {
    private static class ObserverForTest implements Observer {
        public Object arg;

        public void update(Observable o, Object arg) {
            this.arg = arg;
        }
    }

    public void testMulticasting() throws Exception {
        ListenerSupport support = new ListenerSupport(Observer.class);
        ObserverForTest observer = new ObserverForTest();
        support.addListener(observer);
        ((Observer) support.getMulticaster()).update(new Observable(), "FOO");

        assertEquals("FOO", observer.arg);

        support.removeListener(observer);
        ((Observer) support.getMulticaster()).update(new Observable(), "BAR");

        // No change
        assertEquals("FOO", observer.arg);
    }
}
