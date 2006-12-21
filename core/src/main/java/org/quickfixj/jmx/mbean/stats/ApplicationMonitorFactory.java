/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX/J FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixj.org 
 * license as defined by quickfixj.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixj.org/LICENSE for licensing information. 
 * 
 ******************************************************************************/

package org.quickfixj.jmx.mbean.stats;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import quickfix.Application;
import quickfix.SessionID;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

public class ApplicationMonitorFactory {

    public static Application monitor(Application application) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        if (classloader == null) {
            classloader = ApplicationMonitorFactory.class.getClassLoader();
        }
        return (Application) Proxy.newProxyInstance(classloader, new Class[] { Application.class }, new MonitorInvocationHandler(
                application));
    }

    private static class MonitorInvocationHandler implements InvocationHandler {

        private final Application application;

        public MonitorInvocationHandler(Application application) {
            this.application = application;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("toString".equals(method.getName()) && args == null) {
                return "Monitor[" + application + "]";
            } else if ("equals".equals(method.getName()) && method.getParameterTypes().length == 1) {
                return Boolean.valueOf(application.equals(args[0]));
            }
            SessionID sessionID = null;
            for (int i = 0; i < method.getParameterTypes().length; i++) {
                if (method.getParameterTypes()[i] == SessionID.class) {
                    sessionID = (SessionID) args[i];
                }
            }
            Monitor monitor = MonitorFactory.start(sessionID + "/" + method.getName());
            try {
                return method.invoke(application, args);
            } finally {
                monitor.stop();
            }
        }
    }
}
