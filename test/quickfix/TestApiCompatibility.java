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
import java.util.List;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import quickfix.test.acceptance.TestContext;

public class TestApiCompatibility {

    private static class ApiTest implements Test {
        private final Class jniClass;
        private Class javaClass;

        public ApiTest(Class jniClass) throws ClassNotFoundException {
            this.jniClass = jniClass;
        }

        public String toString() {
            return "API check: " + jniClass.getName();
        }

        public int countTestCases() {
            return 1;
        }

        public void run(TestResult result) {
            result.startTest(this);
            TestContext context = null;
            try {
                try {
                    javaClass = Class.forName(jniClass.getName());
                } catch (ClassNotFoundException e) {
                    Assert.fail("class not found: " + e.getMessage());
                }
                compareApi();
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

        private void assertCompatibleInheritance() throws ClassNotFoundException {
            List jniInheritedClasses = getInheritedClasses(jniClass);
            List javaInheritedClasses = getInheritedClasses(javaClass);
            for (int i = 0; i < jniInheritedClasses.size(); i++) {
                Assert.assertTrue("missing interface: class=" + jniClass.getName()
                        + ", interface/superclass="
                        + ((Class) jniInheritedClasses.get(i)).getName(), javaInheritedClasses
                        .contains(translatedClass((Class) jniInheritedClasses.get(i))));
            }
        }

        private List getInheritedClasses(Class clazz) {
            ArrayList classList = new ArrayList();
            while (clazz != null) {
                classList.add(clazz);
                Class[] interfaces = clazz.getInterfaces();
                for (int i = 0; i < interfaces.length; i++) {
                    if (!classList.contains(interfaces[i])) {
                        classList.add(interfaces[i]);
                    }
                }
                clazz = clazz.getSuperclass();
            }
            return classList;
        }

        private void assertCompatibleConstructors() {
            Constructor[] constructors = jniClass.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; i++) {
                if ((constructors[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Constructor c = null;
                    try {
                        c = javaClass
                                .getDeclaredConstructor(translateParameterTypes(constructors[i]
                                        .getParameterTypes()));
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        Assert.fail("missing ctor: " + e.getMessage());
                    } catch (ClassNotFoundException e) {
                        Assert.fail(e.getMessage());
                    }
                }
            }
        }

        private void assertCompatibleMethods() throws ClassNotFoundException {
            Method[] methods = jniClass.getMethods();
            for (int i = 0; i < methods.length; i++) {
                if ((methods[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Method m = null;
                    try {
                        m = javaClass.getMethod(methods[i].getName(),
                                translateParameterTypes(methods[i].getParameterTypes()));
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        Assert.fail("missing method: " + e.getMessage());
                    } catch (ClassNotFoundException e) {
                        Assert.fail(e.getMessage());
                    }
                    List jniExceptionTypes = Arrays.asList(methods[i].getExceptionTypes());
                    List javaExceptionTypes = Arrays.asList(m.getExceptionTypes());
                    Assert.assertEquals(m.getName() + ": wrong method return type",
                            translatedClass(methods[i].getReturnType()), m.getReturnType());
                    assertExceptionsExist(methods[i], jniExceptionTypes, javaExceptionTypes);
                    assertNoExtraExceptions(methods[i], jniExceptionTypes, javaExceptionTypes);
                }
            }
        }

        private void assertNoExtraExceptions(Method jniMethod, List jniExceptionTypes,
                List javaExceptionTypes) throws ClassNotFoundException {
            // original list is unmodifiable
            javaExceptionTypes = new ArrayList(javaExceptionTypes);
            javaExceptionTypes.removeAll(translateClassList(jniExceptionTypes));
            Assert.assertTrue(
                    "extra exceptions: " + jniMethod.getName() + " " + javaExceptionTypes,
                    javaExceptionTypes.size() == 0);
        }

        private void assertExceptionsExist(Method jniMethod, List jniExceptionTypes,
                List javaExceptionTypes) throws ClassNotFoundException {
            for (int j = 0; j < jniExceptionTypes.size(); j++) {
                boolean foundException = false;
                for (int k = 0; k < javaExceptionTypes.size(); k++) {
                    if (translatedClass((Class) jniExceptionTypes.get(j)).equals(
                            javaExceptionTypes.get(k))) {
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

        private Class[] translateParameterTypes(Class[] parameterTypes)
                throws ClassNotFoundException {
            Class[] types = new Class[parameterTypes.length];
            for (int i = 0; i < types.length; i++) {
                types[i] = translatedClass(parameterTypes[i]);
            }
            return types;
        }

        private List translateClassList(List jniClasses) throws ClassNotFoundException {
            ArrayList classes = new ArrayList();
            for (int i = 0; i < jniClasses.size(); i++) {
                classes.add(translatedClass((Class) jniClasses.get(i)));
            }
            return classes;
        }

        private Class translatedClass(Class jniType) throws ClassNotFoundException {
            Package pkg = jniType.getPackage();
            if (pkg == null || pkg.getName().startsWith("java.")) {
                return jniType;
            } else {
                try {
                    return Class.forName(jniType.getName());
                } catch (ClassNotFoundException e) {
                    Assert.fail("class not found: " + e.getMessage());
                    return null;
                }
            }
        }
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();

        try {
            String jarPath = "../quickfix_cvs/lib/quickfix.jar";
            URL[] urls = new URL[] { new URL("file:" + jarPath) };
            ClassLoader jniClassLoader = new URLClassLoader(urls, null);
            JarFile jar = new JarFile(new File(jarPath), false, ZipFile.OPEN_READ);
            Enumeration entries = jar.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                String path = entry.getName();
                String directory = path.substring(0, path.lastIndexOf('/'));
                String name = path.substring(path.lastIndexOf('/') + 1);
                if (directory.equals("quickfix") && !name.equals("")) {
                    String classname = path.substring(0, path.lastIndexOf(".class")).replace('/',
                            '.');
                    suite.addTest(new ApiTest(jniClassLoader.loadClass(classname)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return suite;
    }

}