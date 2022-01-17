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

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class SerializationTest extends TestCase {

    private final String[] srcDirs = {
        "../quickfixj-messages/quickfixj-generated/target/generated-sources"
    };

    private String srcDir;

    public SerializationTest(String name) {
        super(name);
    }

    public void testSerializationWithDataDictionary() throws Exception {
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
                DataDictionaryTest.getDictionary());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream outs = new ObjectOutputStream(out);
        outs.writeObject(message);
    }

    public void testSerialization() {
        srcDir = findSrcDir();
        // Check messages
        assertAllSerializations(srcDir, new MessageSerializationAssertion(),
                new JavaMessageFileFilter(".*/fix42/.*"));
        // Check fields
        assertAllSerializations(srcDir, new FieldSerializationAssertion(),
                new JavaFieldFileFilter());
    }

    private String findSrcDir() {
        // The srcDir might be the Eclipse and/or Ant srcDir. We'll
        // take the first one we find.
        for (String dir : srcDirs) {
            if (new File(dir).exists()) {
                return dir;
            }
        }
        return null;
    }

    private final class JavaMessageFileFilter implements FileFilter {
        private final Pattern pathPattern;

        public JavaMessageFileFilter(String pathPattern) {
            this.pathPattern = pathPattern != null ? Pattern.compile(pathPattern) : null;
        }

        // We want to take ONLY messages into account
        public boolean accept(File file) {
            return ((pathPattern == null ||
                        pathPattern.matcher(file.getAbsolutePath()).matches())
                    && file.getName().endsWith(".java")
                    && !file.getParentFile().getName().equals("field")
                    && !file.getName().equals("Message.java")
                    && !file.getName().equals("MessageCracker.java")
                    && !file.getName().equals("MessageFactory.java"))
                    || file.isDirectory();
        }
    }

    private final class JavaFieldFileFilter implements FileFilter {
        // We want to take ONLY fields into account
        public boolean accept(File file) {
            return (file.getName().endsWith(".java") && file.getParentFile().getName().equals(
                    "field"))
                    || file.isDirectory();
        }
    }

    private String classNameFromFile(File file) {
        String res = file.getPath().substring(srcDir.length() + 1); // Extract
        // package
        res = res.substring(0, res.length() - 5); // Remove .java extension
        res = res.replace(File.separatorChar, '.'); // Replace \ by . to build package names
        return res;
    }

    private void assertAllSerializations(String baseDir, SerializationAssertion assertion,
            FileFilter filter) {
        File directory = new File(baseDir);
        if (!directory.isDirectory()) {
            assertion.assertSerialization(classNameFromFile(directory));
        } else {
            if (directory.exists()) {
                File[] files = directory.listFiles(filter);
                for (File file : files) {
                    if (!file.isDirectory()) {
                        assertion.assertSerialization(classNameFromFile(file));
                    }
                }
                for (File file : files) {
                    if (file.isDirectory()) {
                        assertAllSerializations(file.getPath(), assertion, filter);
                    }
                }
            } else {
                System.err.println("directory does not exist: " + directory.getPath());
            }
        }
    }

    public static Message createTestMessage(String className, int maxGroupElts) {
        Message res = null;
        try {
            Class<?> cl = Class.forName(className);
            res = createMessageWithDefaultValues(cl, maxGroupElts);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            fail(e.getMessage());
        }
        return res;
    }

    private static Object objectFromClassName(String className) {
        Object res = null;
        try {
            Class<?> cl = Class.forName(className);
            Constructor<?> ctor = cl.getConstructor();
            res = ctor.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            fail(e.getMessage());
        }
        return res;
    }

    private Object buildSerializedObject(Object sourceMsg) {
        Object res = null;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream outs = new ObjectOutputStream(out);
            outs.writeObject(sourceMsg);
            outs.flush();

            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ins = new ObjectInputStream(in);
            res = ins.readObject();
        } catch (IOException | ClassNotFoundException e) {
            fail(e.getMessage());
        }
        return res;
    }

    private interface SerializationAssertion {

        void assertSerialization(String className);
    }

    private final class MessageSerializationAssertion implements SerializationAssertion {

        private static final int MAX_GROUP_ELTS = 1;

        public void assertSerialization(String msgClassName) {
            if (msgClassName.contains(".component.")) {
                return;
            }
            Message sourceMsg = createTestMessage(msgClassName, MAX_GROUP_ELTS);
            String sourceFIXString = sourceMsg.toString();

            Message serializedMsg = (Message) buildSerializedObject(sourceMsg);
            String serializedFIXString = null;
            if (serializedMsg != null) {
                serializedFIXString = serializedMsg.toString();
            }

            // Checking
            assertEquals("Bad serialization of Message " + sourceMsg.getClass().getName(),
                    sourceFIXString, serializedFIXString);
        }
    }

    private final class FieldSerializationAssertion implements SerializationAssertion {

        public void assertSerialization(String fieldClassName) {
            Field<?> sourceField = (Field<?>) objectFromClassName(fieldClassName);
            assertNotNull("Cannot obtain object for class:" + fieldClassName, sourceField);

            String sourceFIXString = sourceField.toString();

            Field<?> serializedField = (Field<?>) buildSerializedObject(sourceField);
            String serializedFIXString = null;
            if (serializedField != null) {
                serializedFIXString = serializedField.toString();
            }

            // Checking
            assertEquals("Bad serialization of Field " + sourceField.getClass().getName(),
                    sourceFIXString, serializedFIXString);
        }
    }

    // Default values creation
    private static Message createMessageWithDefaultValues(Class<?> cl, int maxGroupElts)
            throws InstantiationException, IllegalAccessException {
        // Setting Fields
        Message res = (Message) createFieldMapWithDefaultValues(cl);

        // Setting Groups
        final String ADD_GROUP = "addGroup";
        for (Class<?> clazz : cl.getDeclaredClasses()) {
            if (clazz.getSuperclass().getName().equals("quickfix.Group")) {
                for (int l = 0; l < maxGroupElts; l++) {
                    Group g = createGroupWithDefaultValues(clazz);
                    Class<?>[] signature = new Class<?>[1];
                    signature[0] = g.getClass().getSuperclass();
                    try {
                        Method addGroup = cl.getMethod(ADD_GROUP, signature);
                        Object[] args = new Object[1];
                        args[0] = g;
                        addGroup.invoke(res, args);
                    } catch (SecurityException | InvocationTargetException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
                        fail(e.getClass().getName() + " : " + e.getMessage());
                    }
                }
            }
        }
        return res;
    }

    private static Group createGroupWithDefaultValues(Class<?> cl) throws InstantiationException,
            IllegalAccessException {
        return (Group) createFieldMapWithDefaultValues(cl);
    }

    private static FieldMap createFieldMapWithDefaultValues(Class<?> cl) throws InstantiationException,
            IllegalAccessException {
        FieldMap res = (FieldMap) cl.newInstance();

        final String SET_METHOD = "set";
        final String GET_METHOD = "get";
        for (Method method : cl.getMethods()) {
            if (method.getName().equals(GET_METHOD)) {
                Object f = objectFromClassName(method.getReturnType().getName());
                Class<?>[] signature = new Class<?>[1];
                signature[0] = f.getClass();
                try {
                    Method setter = cl.getMethod(SET_METHOD, signature);
                    Object[] args = new Object[1];
                    args[0] = f;
                    setter.invoke(res, args);
                } catch (SecurityException | InvocationTargetException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
                    fail(e.getMessage());
                }
            }
        }
        return res;
    }

    private static final String[] classesBaseDirs = {
        "../quickfixj-messages/quickfixj-generated/target/classes"
    };

    private String getBaseDirectory() {
        for (String p : classesBaseDirs) {
            if (new File(p).exists()) {
                return p;
            }
        }
        return null;
    }

    public void testSerialVersionUUID() throws ClassNotFoundException {
        String baseDirectory = getBaseDirectory();
        checkSerialVersionUID(baseDirectory, "quickfix/field");
        checkSerialVersionUID(baseDirectory, "quickfix/fix40");
        checkSerialVersionUID(baseDirectory, "quickfix/fix41");
        checkSerialVersionUID(baseDirectory, "quickfix/fix42");
        checkSerialVersionUID(baseDirectory, "quickfix/fix43");
        checkSerialVersionUID(baseDirectory, "quickfix/fix44");
        checkSerialVersionUID(baseDirectory, "quickfix/fix50");
    }

    private void checkSerialVersionUID(String baseDirectory, String path) throws ClassNotFoundException {
        File classesDir = new File(baseDirectory + "/" + path);
        File[] files = classesDir.listFiles();
        assertNotNull("no files in " + classesDir, files);
        for (File file : files) {
            if (file.isDirectory() || !file.getName().endsWith(".class")) {
                continue;
            }
            Class<?> c = Class.forName(file.getPath().substring(baseDirectory.length() + 1)
                    .replaceAll(".class$", "").replace(File.separatorChar, '.'));
            if (Serializable.class.isAssignableFrom(c)) {
                try {
                    c.getDeclaredField("serialVersionUID");
                } catch (NoSuchFieldException e) {
                    fail(c + " does not contain a serialVersionUID");
                }
            }
        }
    }
}
