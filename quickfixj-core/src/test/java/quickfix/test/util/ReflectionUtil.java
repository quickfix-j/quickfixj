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

package quickfix.test.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Helper class for using reflection. Initially it's focused on
 * invoking methods, but other tools may be added in the future.
 */
public class ReflectionUtil {

    /**
     * Invoke an object's constructor with the specified arguments.
     *
     * @param className the class of the instance to create
     * @param args the constructor arguments
     * @return the created instance
     * @throws IllegalArgumentException
     * @throws SecurityException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws ClassNotFoundException
     */
    public static Object constructObject(String className, Object[] args)
            throws IllegalArgumentException, SecurityException, InstantiationException,
            IllegalAccessException, InvocationTargetException, NoSuchMethodException,
            ClassNotFoundException {
        Class<?> targetClass = Thread.currentThread().getContextClassLoader().loadClass(className);
        return getMatchingConstructor(targetClass, args).newInstance(args);
    }

    private static Constructor<?> getMatchingConstructor(Class<?> targetClass, Object[] args)
            throws NoSuchMethodException {
        for (Constructor<?> ctor : targetClass.getConstructors()) {
            if (isMatchingArgs(ctor.getParameterTypes(), args)) {
                return ctor;
            }
        }
        throw new NoSuchMethodException("No constructor for " + targetClass
                + " compatible with args " + Arrays.toString(args));
    }

    @SuppressWarnings("unchecked")
    public static <T> T getField(Object target, String fieldName, Class<T> fieldType) {
        try {
            Field f = target.getClass().getDeclaredField(fieldName);
            f.setAccessible(true);
            return (T) f.get(target);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Invoke a public method using reflection.
     *
     * @param target target object
     * @param method the method name
     * @param args the method arguments
     * @return the return value of the method call, if any
     * @throws IllegalArgumentException
     * @throws SecurityException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static Object callMethod(Object target, String method, Object[] args)
            throws IllegalArgumentException, SecurityException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {
        return getMatchingMethod(target.getClass(), method, args).invoke(target, args);
    }

    public static Object callMethod(Object target, Class<?> interfaceClass, String method,
            Object[] args) throws IllegalArgumentException, SecurityException,
            IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return getMatchingMethod(interfaceClass, method, args).invoke(target, args);
    }

    private static Method getMatchingMethod(Class<?> targetClass, String methodName, Object[] args)
            throws NoSuchMethodException {
        for (Method method : targetClass.getMethods()) {
            if (methodName.equals(method.getName())
                    && isMatchingArgs(method.getParameterTypes(), args)) {
                return method;
            }
        }
        throw new NoSuchMethodException(methodName);
    }

    private static boolean isMatchingArgs(Class<?>[] targetArgTypes, Object[] args) {
        if (args == null && targetArgTypes.length == 0) {
            return true;
        }
        if (args.length != targetArgTypes.length) {
            return false;
        }
        for (int j = 0; j < targetArgTypes.length; j++) {
            if (j >= args.length || !isAssignable(targetArgTypes[j], args[j].getClass())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAssignable(Class<?> assignee, Class<?> assigned) {
        if (assignee.isPrimitive()) {
            if (assignee == int.class || assignee == short.class || assignee == long.class
                    || assignee == byte.class) {
                assignee = Number.class;
            } else if (assignee == double.class || assignee == float.class) {
                assignee = Double.class;
            } else if (assignee == char.class) {
                assignee = Character.class;
            } else if (assignee == boolean.class) {
                assignee = Boolean.class;
            }
        }
        return assignee.isAssignableFrom(assigned);
    }

    /**
     * Invoke a static method with the specified arguments.
     *
     * @param methodFqn fully-qualified method name (e.g. "my.package.MyClass.someMethod")
     * @param args the arguments for the method call
     * @return the value returned by the method, if any
     * @throws IllegalArgumentException
     * @throws SecurityException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws ClassNotFoundException
     */
    public static Object callStaticMethod(String methodFqn, Object[] args)
            throws IllegalArgumentException, SecurityException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        int n = methodFqn.lastIndexOf('.');
        String className = methodFqn.substring(0, n);
        String methodName = methodFqn.substring(n + 1, methodFqn.length());
        Class<?> targetClass = Thread.currentThread().getContextClassLoader().loadClass(className);
        return getMatchingMethod(targetClass, methodName, args).invoke(null, args);
    }

}
