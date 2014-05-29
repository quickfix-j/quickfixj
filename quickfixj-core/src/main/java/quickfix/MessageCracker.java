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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Helper class for delegating message types for various FIX versions to
 * type-safe onMessage methods.
 */
public class MessageCracker {
    private Map<Class<?>, Invoker> invokers = new HashMap<Class<?>, Invoker>();

    @Target( { ElementType.METHOD })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Handler {

    }

    public class RedundantHandlerException extends RuntimeException {
        private final Class<?> messageClass;
        private final Method originalMethod;
        private final Method redundantMethod;

        public RedundantHandlerException(Class<?> messageClass, Method originalMethod,
                Method redundantMethod) {
            this.messageClass = messageClass;
            this.originalMethod = originalMethod;
            this.redundantMethod = redundantMethod;
        }

        @Override
        public String toString() {
            return "Duplicate handler method for " + messageClass + ", orginal method is "
                    + originalMethod + ", redundant method is " + redundantMethod;
        }
    }

    protected MessageCracker() {
        initialize(this);
    }

    public MessageCracker(Object messageHandler) {
        initialize(messageHandler);
    }

    public void initialize(Object messageHandler) {
        Class<?> handlerClass = messageHandler.getClass();
        for (Method method : handlerClass.getMethods()) {
            if (isHandlerMethod(method)) {
                Class<?> messageClass = method.getParameterTypes()[0];
                method.setAccessible(true);
                Invoker invoker = new Invoker(messageHandler, method);
                Invoker existingInvoker = invokers.get(messageClass);
                if (existingInvoker != null) {
                    throw new RedundantHandlerException(messageClass, existingInvoker.getMethod(),
                            method);
                }
                invokers.put(messageClass, invoker);
            }
        }
    }

    private boolean isHandlerMethod(Method method) {
        int modifiers = method.getModifiers();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isPrivate(modifiers) && matchesConventionOrAnnotation(method)
                && parameterTypes.length == 2 && Message.class.isAssignableFrom(parameterTypes[0])
                && parameterTypes[1] == SessionID.class;
    }

    private boolean matchesConventionOrAnnotation(Method method) {
        return method.getName().equals("onMessage") || method.isAnnotationPresent(Handler.class);
    }

    private class Invoker {
        private final Object target;
        private final Method method;

        public Invoker(Object target, Method method) {
            this.target = target;
            this.method = method;
        }

        public Method getMethod() {
            return method;
        }

        public void Invoke(Message message, SessionID sessionID) throws IllegalArgumentException,
                IllegalAccessException, InvocationTargetException {
            method.invoke(target, message, sessionID);
        }
    }

    /**
     * Process ("crack") a FIX message and call the registered handlers for that type, if any
     */
    public void crack(quickfix.Message message, SessionID sessionID) throws UnsupportedMessageType,
            FieldNotFound, IncorrectTagValue {
        Invoker invoker = invokers.get(message.getClass());
        if (invoker != null) {
            try {
                invoker.Invoke(message, sessionID);
            } catch (InvocationTargetException ite) {
                try {
                    throw ((InvocationTargetException)ite).getTargetException();
                }
                catch (UnsupportedMessageType e) {
                    throw e;
                }
                catch (FieldNotFound e) {
                    throw e;
                }
                catch (IncorrectTagValue e) {
                    throw e;
                }
                catch (Throwable t) {
                    propagate(t);
                }
            }
            catch (Exception e) {
                propagate(e);
            }
        } else {
            onMessage(message, sessionID);
        }
    }

    private void propagate(Throwable e) {
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        } else if (e instanceof Error) {
            throw (Error)e;
        } else {
            throw new RuntimeException(e);
        }
    }

    /**
     * Fallback method that is called if no invokers are found.
     */
    protected void onMessage(quickfix.Message message, SessionID sessionID) throws FieldNotFound,
            UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }
}
