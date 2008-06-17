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

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class ApiCompatibilityTest {
    static Set<String> testedDirectories = new HashSet<String>();

    static {
        testedDirectories.add("quickfix");
        testedDirectories.add("quickfix/field");
        testedDirectories.add("quickfix/fix40");
        testedDirectories.add("quickfix/fix41");
        testedDirectories.add("quickfix/fix42");
        testedDirectories.add("quickfix/fix43");
        testedDirectories.add("quickfix/fix44");
    }

    private static class ApiTest implements Test {
        private final Class<?> jniClass;
        private final IgnoredItems ignoredItems;
        private Class<?> javaClass;

        public ApiTest(Class<?> jniClass, IgnoredItems ignoredItems) {
            this.jniClass = jniClass;
            this.ignoredItems = ignoredItems;
        }

        public String toString() {
            return getName();
        }

        public String getName() {
            return "API check: " + jniClass.getName();
        }

        public int countTestCases() {
            return 1;
        }

        public void run(TestResult result) {
            result.startTest(this);
            try {
                if (!ignoredItems.isIgnoredClass(jniClass)) {
                    try {
                        javaClass = Class.forName(jniClass.getName());
                        int jniModifiers = jniClass.getModifiers();
                        int javaModifiers = javaClass.getModifiers();
                        if (!Modifier.isStatic(jniModifiers)) {
                            // ignore additional static declarations on classes
                            javaModifiers = javaModifiers & ~Modifier.STATIC; 
                        }
                        Assert.assertEquals("different class modifiers: " + jniClass.getName(),
                                jniModifiers, javaModifiers);
                    } catch (ClassNotFoundException e) {
                        Assert.fail("class not found: " + e.getMessage());
                    }
                    compareApi();
                }
            } catch (AssertionFailedError e) {
                result.addFailure(this, e);
            } catch (Throwable t) {
                result.addError(this, t);
            } finally {
                // empty
            }
            result.endTest(this);
        }

        public void compareApi() throws Exception {
            assertCompatibleFields();
            assertCompatibleMethods();
            assertCompatibleConstructors();
            assertCompatibleInheritance();
        }

        private void assertCompatibleInheritance() {
            List<Class<?>> jniInheritedClasses = getInheritedClasses(jniClass);
            List<Class<?>> javaInheritedClasses = getInheritedClasses(javaClass);
            for (int i = 0; i < jniInheritedClasses.size(); i++) {
                if (!ignoredItems.isIgnoredClass(jniInheritedClasses.get(i))) {
                    Assert.assertTrue("missing interface: class=" + jniClass.getName()
                            + ", interface/superclass="
                            + jniInheritedClasses.get(i).getName(), javaInheritedClasses
                            .contains(translatedClass(jniInheritedClasses.get(i), javaClass
                                    .getClassLoader())));
                }
            }
        }

        private List<Class<?>> getInheritedClasses(Class<?> clazz) {
            HashSet<Class<?>> classSet = new HashSet<Class<?>>();
            getInheritedClasses(clazz, classSet);
            return new ArrayList<Class<?>>(classSet);
        }

        private void getInheritedClasses(Class<?> clazz, HashSet<Class<?>> classSet) {
            while (clazz != null) {
                classSet.add(clazz);
                Class<?>[] interfaces = clazz.getInterfaces();
                for (int i = 0; i < interfaces.length; i++) {
                    classSet.add(interfaces[i]);
                    getInheritedClasses(interfaces[i], classSet);
                }
                clazz = clazz.getSuperclass();
            }
        }

        private void assertCompatibleConstructors() {
            Constructor<?>[] constructors = jniClass.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; i++) {
                if (!ignoredItems.isIgnoredConstructor(constructors[i])) {
                    if ((constructors[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                        try {
                            javaClass.getDeclaredConstructor(translateClassArray(constructors[i]
                                    .getParameterTypes(), javaClass.getClassLoader()));
                        } catch (SecurityException e) {
                            Assert.fail(e.getMessage());
                        } catch (NoSuchMethodException e) {
                            Assert.fail("missing ctor: " + e.getMessage());
                        }
                    }
                }
            }
        }

        private void assertCompatibleMethods() {
            Method[] methods = jniClass.getDeclaredMethods();
            if (jniClass.isInterface()) {
                assertNoExtraJavaInterfaceMethods();
            }
            for (int i = 0; i < methods.length; i++) {
                if ((methods[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Method m = null;
                    try {
                        if (ignoredItems.isIgnoredMethod(methods[i])) {
                            return;
                        }
                        m = findCompatibleJavaMethod(methods[i]);
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        Assert.fail("missing method: " + e.getMessage());
                    }
                    List<Class<?>> jniExceptionTypes = Arrays.asList(methods[i].getExceptionTypes());
                    List<Class<?>> javaExceptionTypes = Arrays.asList(m.getExceptionTypes());
                    Assert.assertEquals(m + ": wrong method return type", translatedClass(
                            methods[i].getReturnType(), javaClass.getClassLoader()), m
                            .getReturnType());
                    assertExceptionsExist(methods[i], jniExceptionTypes, javaExceptionTypes);
                    assertNoExtraExceptions(methods[i], jniExceptionTypes, javaExceptionTypes);
                }
            }
        }

        private void assertNoExtraJavaInterfaceMethods() {
            assertNoExtraJavaInterfaceMethods(javaClass);
        }

        private void assertNoExtraJavaInterfaceMethods(Class<?> javaInterface) {
            Method[] methods = javaInterface.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                try {
                    findCompatibleJniMethod(methods[i]);
                } catch (NoSuchMethodException e) {
                    Assert.fail("Extra interface method: " + methods[i]);
                }
            }
            Class<?>[] interfaces = javaInterface.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                assertNoExtraJavaInterfaceMethods(interfaces[i]);
            }
        }

        public Method findCompatibleJniMethod(Method javaMethod) throws NoSuchMethodException {
            Method method = null;
            final String methodName = javaMethod.getName();
            final Class<?>[] parameterTypes = translateClassArray(javaMethod.getParameterTypes(),
                    jniClass.getClassLoader());
            if ((javaMethod.getModifiers() & Modifier.PUBLIC) != 0) {
                method = jniClass.getMethod(methodName, parameterTypes);
            } else {
                // Search for a protected method
                Class<?> clazz = jniClass;
                while (clazz != null) {
                    try {
                        method = clazz.getDeclaredMethod(methodName, parameterTypes);
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                        if (clazz == null) {
                            throw e;
                        }
                    }
                }
            }
            return method;
        }

        private Method findCompatibleJavaMethod(Method jniMethod) throws NoSuchMethodException {
            Method method = null;
            final String methodName = jniMethod.getName();
            final Class<?>[] parameterTypes = translateClassArray(jniMethod.getParameterTypes(),
                    javaClass.getClassLoader());
            if ((jniMethod.getModifiers() & Modifier.PUBLIC) != 0) {
                method = javaClass.getMethod(methodName, parameterTypes);
            } else {
                // Search for a protected method
                Class<?> clazz = javaClass;
                while (clazz != null) {
                    try {
                        method = clazz.getDeclaredMethod(methodName, parameterTypes);
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                        if (clazz == null) {
                            throw e;
                        }
                    }
                }
            }
            return method;
        }

        private void assertNoExtraExceptions(Method jniMethod, List<Class<?>> jniExceptionTypes,
                List<Class<?>> javaExceptionTypes) {
            // original list is unmodifiable
            javaExceptionTypes = new ArrayList<Class<?>>(javaExceptionTypes);
            javaExceptionTypes.removeAll(translateClassList(jniExceptionTypes));
            Assert.assertTrue(
                    "extra exceptions: " + jniMethod.getName() + " " + javaExceptionTypes,
                    javaExceptionTypes.size() == 0);
        }

        private void assertExceptionsExist(Method jniMethod, List<Class<?>> jniExceptionTypes,
                List<Class<?>> javaExceptionTypes) {
            for (int j = 0; j < jniExceptionTypes.size(); j++) {
                boolean foundException = false;
                for (int k = 0; k < javaExceptionTypes.size(); k++) {
                    if (translatedClass((Class<?>) jniExceptionTypes.get(j),
                            javaClass.getClassLoader()).equals(javaExceptionTypes.get(k))) {
                        foundException = true;
                        break;
                    }
                }
                Assert.assertTrue("missing exception: method=" + jniMethod.getName() + "; "
                        + jniExceptionTypes.get(j), foundException);
            }
        }

        private void assertCompatibleFields() {
            Field[] fields = jniClass.getFields();
            for (int i = 0; i < fields.length; i++) {
                if ((fields[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Field f = null;
                    try {
                        f = javaClass.getField(fields[i].getName());
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchFieldException e) {
                        Assert.fail("missing field: " + e.getMessage());
                    }
                    Assert.assertEquals(f.getName() + ": wrong field type", fields[i].getType(), f
                            .getType());
                }
            }
        }

        private List<Class<?>> translateClassList(List<Class<?>> jniClasses) {
            ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
            for (int i = 0; i < jniClasses.size(); i++) {
                classes.add(translatedClass((Class<?>) jniClasses.get(i), javaClass.getClassLoader()));
            }
            return classes;
        }

        private Class<?>[] translateClassArray(Class<?>[] classArray, ClassLoader toClassloader) {
            if (classArray == null) {
                return null;
            }
            Class<?>[] types = new Class[classArray.length];
            for (int i = 0; i < types.length; i++) {
                types[i] = translatedClass(classArray[i], toClassloader);
            }
            return types;
        }

        private Class<?> translatedClass(Class<?> type, ClassLoader toClassLoader) {
            Package pkg = type.getPackage();
            if (pkg == null || pkg.getName().startsWith("java.")) {
                return type;
            } else {
                try {
                    return toClassLoader.loadClass(type.getName());
                } catch (ClassNotFoundException e) {
                    Assert.fail("Class not found: " + e.getMessage());
                    return null;
                }
            }
        }
    }

    private static class IgnoredItems {
        private HashSet<Class<?>> ignoredClasses = new HashSet<Class<?>>();
        private HashSet<Constructor<?>> ignoredConstructors = new HashSet<Constructor<?>>();
        private HashSet<Method> ignoredMethods = new HashSet<Method>();

        public IgnoredItems(ClassLoader jniClassLoader) throws ClassNotFoundException,
                SecurityException, NoSuchMethodException {
            ignoreConstructor(jniClassLoader, "quickfix.Message", new Class<?>[] {
                    Message.Header.class, Message.Trailer.class });
            
            // JNI has constructor for Header inner class that takes a instance
            // to the outer class, which is redundant. The Header class has been
            // made static in QFJ to support nested classes for repeating groups
            ignoreConstructor(jniClassLoader, "quickfix.fix40.Message$Header", new Class<?>[] {
                    quickfix.fix40.Message.class, quickfix.fix40.Message.class });
            ignoreConstructor(jniClassLoader, "quickfix.fix41.Message$Header", new Class<?>[] {
                    quickfix.fix41.Message.class, quickfix.fix41.Message.class });
            ignoreConstructor(jniClassLoader, "quickfix.fix42.Message$Header", new Class<?>[] {
                    quickfix.fix42.Message.class, quickfix.fix42.Message.class });
            ignoreConstructor(jniClassLoader, "quickfix.fix43.Message$Header", new Class<?>[] {
                    quickfix.fix43.Message.class, quickfix.fix43.Message.class });
            ignoreConstructor(jniClassLoader, "quickfix.fix44.Message$Header", new Class<?>[] {
                    quickfix.fix44.Message.class, quickfix.fix44.Message.class });
            
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.CppLog"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.CppMessageStore"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.Group$Iterator"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.Group$Iterator"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.Message$Iterator"));

            //
            // TEMPORARY
            //
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.MessageFactory"));
            
            //
            // Ignore C++ database adapters
            //
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.PostgreSQLLog"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.PostgreSQLLogFactory"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.PostgreSQLStore"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.PostgreSQLStoreFactory"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.OdbcLog"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.OdbcLogFactory"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.OdbcStore"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.OdbcStoreFactory"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.MySQLLog"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.MySQLLogFactory"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.MySQLStore"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.MySQLStoreFactory"));

            // The following string is split so that CVS will not insert log data
            // during commit
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.Message$Header" + "$Iterator"));
            ignoredClasses.add(jniClassLoader.loadClass("quickfix.Message$Trailer$Iterator"));
            ignoreConstructor(jniClassLoader, "quickfix.FileStore", null);
            ignoreConstructor(jniClassLoader, "quickfix.FileStore", new Class<?>[] { long.class });
            ignoreConstructor(jniClassLoader, "quickfix.MemoryStore", new Class<?>[] { long.class });
            ignoreConstructor(jniClassLoader, "quickfix.Message$Header", new Class<?>[] {
                    Message.class, Message.class });
            ignoreConstructor(jniClassLoader, "quickfix.Message$Trailer", new Class<?>[] {
                    Message.class, Message.class });
        }

        public boolean isIgnoredMethod(Method m) {
            if (m.getName().equals("finalize") && m.getParameterTypes().length == 0) {
                return true;
            }
            return ignoredMethods.contains(m);
        }

        //        private void ignoreMethod(ClassLoader jniClassLoader, String className, String methodName,
        //                Class<?>[] argumentTypes) throws ClassNotFoundException, SecurityException,
        //                NoSuchMethodException {
        //            Class c = jniClassLoader.loadClass(className);
        //            Method m = c.getDeclaredMethod(methodName, argumentTypes);
        //            ignoredMethods.add(m);
        //        }

        private void ignoreConstructor(ClassLoader jniClassLoader, String classname, Class<?>[] args)
                throws ClassNotFoundException, NoSuchMethodException {
            Class<?> c = jniClassLoader.loadClass(classname);
            if (args != null) {
                Class<?>[] jniClasses = new Class<?>[args.length];
                for (int i = 0; i < args.length; i++) {
                    Package pkg = args[i].getPackage();
                    if (pkg != null && pkg.getName().startsWith("quickfix")) {
                        jniClasses[i] = jniClassLoader.loadClass(args[i].getName());
                    } else {
                        jniClasses[i] = args[i];
                    }
                }
                args = jniClasses;
            }
            ignoredConstructors.add(c.getDeclaredConstructor(args));
        }

        public boolean isIgnoredClass(Class<?> jniClass) {
            return ignoredClasses.contains(jniClass);
        }

        public boolean isIgnoredConstructor(Constructor<?> jniConstructor) {
            return ignoredConstructors.contains(jniConstructor);
        }
    }

    public static Test suite() {
        TestSuite suite = new TestSuite() {
            public String toString() {
                return ApiCompatibilityTest.class.getName();
            }
        };
        try {
            String jarPath = System.getProperty("utest.jnijar");
            if (jarPath == null) {
                jarPath = "core/src/test/lib/quickfix-jni.jar";
            }
            URL[] urls = new URL[] { new URL("file:" + jarPath) };
            ClassLoader jniClassLoader = new URLClassLoader(urls, null);
            IgnoredItems ignoredItems = new IgnoredItems(jniClassLoader);
            JarFile jar = new JarFile(new File(jarPath), false, ZipFile.OPEN_READ);
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                String path = entry.getName();
                String directory = path.substring(0, path.lastIndexOf('/'));
                String name = path.substring(path.lastIndexOf('/') + 1);
                if (testedDirectories.contains(directory) && !name.equals("")) {
                    String classname = path.substring(0, path.lastIndexOf(".class")).replace('/',
                            '.');
                    Class<?> jniClass = jniClassLoader.loadClass(classname);
                    if (!ignoredItems.isIgnoredClass(jniClass)) {
                        suite.addTest(new ApiTest(jniClass, ignoredItems));
                    }
                }
            }
        } catch (Exception e) {
            suite.addTest(new FailureTestCase("testInitializationFailure", e));
        }

        return suite;
    }

    /**
     * This class is used as a JUnit trick for getting a test failure when the
     * API test suite initialization fails.
     */
    protected static class FailureTestCase extends TestCase {
        private final Throwable cause;

        public FailureTestCase(String test, Throwable e) {
            super(test);
            this.cause = e;
        }

        public void testInitializationFailure() {
            throw new RuntimeException("error during initialization, see cause below", cause);
        }
    }
}