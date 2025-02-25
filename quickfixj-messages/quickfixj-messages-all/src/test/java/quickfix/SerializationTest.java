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

    private String srcDir;
    
    public SerializationTest(String name) {
        super(name);
    }

    public void testSerializationWithDataDictionary() throws Exception {
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
                getDictionary(), new ValidationSettings());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream outs = new ObjectOutputStream(out);
        outs.writeObject(message);
    }

    public void testSerialization() {
        String buildDirectoryName = System.getProperty("buildDirectory");
        // generated-sources
        this.srcDir = buildDirectoryName + "/generated-sources";
        File sourceDirectory = new File(this.srcDir);
        if (sourceDirectory.exists() && sourceDirectory.isDirectory()) {
            // Check messages
            assertAllSerializations(this.srcDir, new MessageSerializationAssertion(),
                    new JavaMessageFileFilter(".*/fix42/.*"));
            // Check fields
            assertAllSerializations(this.srcDir, new FieldSerializationAssertion(),
                    new JavaFieldFileFilter());
        } else {
            fail();
        }
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
        String res = file.getPath().substring(this.srcDir.length() + 1); // Extract
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

    private static Object buildSerializedObject(Object sourceMsg) {
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

    public void testSerialVersionUUID() throws ClassNotFoundException {
        String buildDirectoryName = System.getProperty("buildDirectory");
        String baseDirectory = buildDirectoryName + "/classes";
        File classesDirectory = new File(baseDirectory);
        if (classesDirectory.exists() && classesDirectory.isDirectory()) {
            checkSerialVersionUID(baseDirectory, "quickfix/field");
            checkSerialVersionUID(baseDirectory, "quickfix/fix40");
            checkSerialVersionUID(baseDirectory, "quickfix/fix41");
            checkSerialVersionUID(baseDirectory, "quickfix/fix42");
            checkSerialVersionUID(baseDirectory, "quickfix/fix43");
            checkSerialVersionUID(baseDirectory, "quickfix/fix44");
            checkSerialVersionUID(baseDirectory, "quickfix/fix50");
            checkSerialVersionUID(baseDirectory, "quickfix/fix50sp1");
            checkSerialVersionUID(baseDirectory, "quickfix/fix50sp2");
            checkSerialVersionUID(baseDirectory, "quickfix/fixlatest");
            checkSerialVersionUID(baseDirectory, "quickfix/fixt11");
        } else {
            fail();
        }
    }

    private static void checkSerialVersionUID(String baseDirectory, String path) throws ClassNotFoundException {
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

    /**
     * Returns a singleton FIX 4.4 data dictionary.
     * This is based on getDictionary() in DataDictionaryTest in the Core package, the functionality is needed by
     * testSerializationWithDataDictionary().
     * I observe that the dictionary returned is 4.4 and the message is 4.2 but I have not changed this behaviour.
     * NOTE: the returned dictionary must not be modified in any way
     * (e.g. by calling any of its setter methods). If it needs to
     * be modified, it can be cloned by using the
     * {@link DataDictionary#DataDictionary(DataDictionary)
     * DataDictionary copy constructor}.
     *
     * @return a singleton FIX 4.4 data dictionary
     * @throws Exception if the data dictionary cannot be loaded
     */
    private static DataDictionary getDictionary() throws Exception {
        return new DataDictionary(
                SerializationTest.class.getClassLoader().getResourceAsStream("FIX44.xml"));
    }
}
