package quickfix;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import quickfix.test.acceptance.TestContext;

public class TestApiCompatibility {

    private static class ApiTest implements Test {
        private Class jniClass;
        private Class javaClass;

        public ApiTest(Class jniClass, Class javaClass) {
            this.jniClass = jniClass;
            this.javaClass = javaClass;
        }

        public String toString() {
            return jniClass.getName();
        }

        public int countTestCases() {
            return 1;
        }

        public void run(TestResult result) {
            result.startTest(this);
            TestContext context = null;
            try {
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

            Field[] fields = jniClass.getFields();
            for (int i = 0; i < fields.length; i++) {
                if ((fields[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Field f = null;
                    try {
                        f = javaClass.getField(fields[i].getName());
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchFieldException e) {
                        Assert.fail("missing field: "+e.getMessage());
                    }
                    Assert.assertEquals(f.getName() + ": wrong field type", fields[i].getType(), f
                            .getType());
                }
            }

            Method[] methods = jniClass.getMethods();
            for (int i = 0; i < methods.length; i++) {
                if ((methods[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Method m = null;
                    try {
                        m = javaClass.getMethod(methods[i].getName(),
                                translateParamaterTypes(methods[i].getParameterTypes()));
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        Assert.fail("missing method: "+e.getMessage());
                    } catch (ClassNotFoundException e) {
                        Assert.fail(e.getMessage());
                    }
                    Assert.assertEquals(m.getName() + ": wrong method return type",
                            translateType(methods[i].getReturnType()), m.getReturnType());
                }
            }

            Constructor[] constructors = jniClass.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; i++) {
                if ((constructors[i].getModifiers() & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
                    Constructor c = null;
                    try {
                        c = javaClass.getDeclaredConstructor(translateParamaterTypes(constructors[i].getParameterTypes()));
                    } catch (SecurityException e) {
                        Assert.fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        Assert.fail("missing ctor: "+e.getMessage());
                    } catch (ClassNotFoundException e) {
                        Assert.fail(e.getMessage());
                    }
                }
            }
        }

        private Class[] translateParamaterTypes(Class[] parameterTypes)
                throws ClassNotFoundException {
            Class[] types = new Class[parameterTypes.length];
            for (int i = 0; i < types.length; i++) {
                types[i] = translateType(parameterTypes[i]);
            }
            return types;
        }

        private Class translateType(Class jniType) throws ClassNotFoundException {
            Package pkg = jniType.getPackage();
            if (pkg == null || pkg.getName().startsWith("java.")) {
                return jniType;
            } else {
                return Class.forName(jniType.getName());
            }
        }
    }

    public static Test suite() throws Exception {
        TestSuite suite = new TestSuite();

        HashSet skippedClasses = new HashSet();
        skippedClasses.add("quickfix.CppLog");
        skippedClasses.add("quickfix.CppMessageStore");
        skippedClasses.add("quickfix.Group$Iterator");
        skippedClasses.add("quickfix.Message$Header$Iterator");
        skippedClasses.add("quickfix.Message$Trailer$Iterator");
        skippedClasses.add("quickfix.Message$Iterator");

        String jarPath = "../quickfix_cvs/lib/quickfix.jar";
        URL[] urls = new URL[] { new URL("file:" + jarPath) };
        ClassLoader classLoader = new URLClassLoader(urls, null);
        JarFile jar = new JarFile(jarPath);
        Enumeration entries = jar.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = (ZipEntry) entries.nextElement();
            String path = entry.getName();
            String directory = path.substring(0, path.lastIndexOf('/'));
            String name = path.substring(path.lastIndexOf('/') + 1);
            if (directory.equals("quickfix") && !name.equals("")) {
                String classname = path.substring(0, path.lastIndexOf(".class")).replace('/', '.');
                if (skippedClasses.contains(classname)) {
                    continue;
                }
                Class jniClass = classLoader.loadClass(classname);
                Class javaClass = Class.forName(classname);
                suite.addTest(new ApiTest(jniClass, javaClass));
            }
        }

        return suite;
    }

}