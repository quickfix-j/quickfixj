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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListenerSupport {
    private final List<Object> listeners = new CopyOnWriteArrayList<Object>();
    private final Object multicaster;

    public ListenerSupport(Class<?> listenerClass) {
        multicaster = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class<?>[] { listenerClass }, new ListenerInvocationHandler());
    }

    public Object getMulticaster() {
        return multicaster;
    }

    private class ListenerInvocationHandler implements InvocationHandler {

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("toString") && args.length == 0) {
                return getClass().getSimpleName() + "@" + System.identityHashCode(proxy);
            } else if (method.getDeclaringClass() == Object.class) {
                return method.invoke(proxy, args);
            }
            for (Object listener : listeners) {
                method.invoke(listener, args);
            }
            return null;
        }
    }

    public void addListener(Object listener) {
        listeners.add(listener);
    }

    public void removeListener(Object listener) {
        listeners.remove(listener);
    }
}
