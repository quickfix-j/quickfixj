/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.TestCase;

public class SerializationTest extends TestCase {

    private String[] srcDirs = new String[] { "src-generated", "output/ant/src-generated" };
    private String srcDir;
    public SerializationTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testSerialization() {
        srcDir = findSrcDir();
        // Check messages
        assertAllSerializations(srcDir, new MessageSerializationAssertion(),
                new JavaMessageFileFilter());
        // Check fields
        assertAllSerializations(srcDir, new FieldSerializationAssertion(),
                new JavaFieldFileFilter());
    }

    private String findSrcDir() {
        // The srcDir might be the Eclipse and/or Ant srcDir. We'll
        // take the first one we find.
        for (int i = 0; i < srcDirs.length; i++) {
            String srcDir = srcDirs[i];
            if (new File(srcDir).exists()) {
                return srcDir;
            }
        }
        return null;
    }
        
    private final class JavaMessageFileFilter implements FileFilter {
        // We want to take ONLY messages into account
        public boolean accept(File file) {
            return (file.getName().endsWith(".java") 
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
            return (file.getName().endsWith(".java") 
                    && file.getParentFile().getName().equals("field")) 
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

    private void assertAllSerializations(String baseDir, SerializationAssertion assertion, FileFilter filter) {
        File directory = new File(baseDir);
        if (!directory.isDirectory()) {
            assertion.assertSerialization(classNameFromFile(directory));
        } else {
            if (directory.exists()) {
                File[] files = directory.listFiles(filter);
                for (int i = 0; i < files.length; i++) {
                    if (!files[i].isDirectory()) {
                        assertion.assertSerialization(classNameFromFile(files[i]));
                    }
                }
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        assertAllSerializations(files[i].getPath(), assertion, filter);
                    }
                }
            } else {
                System.err.println("directory does not exist: " + directory.getPath());
            }
        }
    }

    public Message messageFromClassNameWithDefaultValues(String className, int maxGroupElts) {
        Message res = null;
        try {
            Class cl = Class.forName(className);
            // res = cl.newInstance();
            res = createMessageWithDefaultValues(cl, maxGroupElts);
        } catch (ClassNotFoundException e) {
            fail(e.getMessage());
        } catch (InstantiationException e) {
            fail(e.getMessage());
        } catch (IllegalAccessException e) {
            fail(e.getMessage());
        }
        return res;
    }

    public Object objectFromClassName(String className) {
        Object res = null;
        try {
            Class cl = Class.forName(className);
            res = cl.newInstance();
        } catch (ClassNotFoundException e) {
            fail(e.getMessage());
        } catch (InstantiationException e) {
            fail(e.getMessage());
        } catch (IllegalAccessException e) {
            fail(e.getMessage());
        }
        return res;
    }

    public Object buildSerializedObject(Object sourceMsg) {
        Object res = null;
        try {
            final String fileName = File.createTempFile("serializationTest", "dat").getPath();
            FileOutputStream out = new FileOutputStream(fileName);
            ObjectOutputStream outs = new ObjectOutputStream(out);
            outs.writeObject(sourceMsg);
            outs.flush();

            FileInputStream in = new FileInputStream(fileName);
            ObjectInputStream ins = new ObjectInputStream(in);
            res = ins.readObject();

        } catch (IOException e) {
            fail(e.getMessage());
        } catch (ClassNotFoundException e) {
            fail(e.getMessage());
        }
        return res;
    }

    private interface SerializationAssertion {

        public void assertSerialization(String className);
    }

    private final class MessageSerializationAssertion implements SerializationAssertion {

        private static final int MAX_GROUP_ELTS = 1;

        public void assertSerialization(String msgClassName) {
            Message sourceMsg = messageFromClassNameWithDefaultValues(msgClassName, MAX_GROUP_ELTS);
            String sourceFIXString = sourceMsg.toString();
            
            Message serializedMsg = (Message) buildSerializedObject(sourceMsg);
            String serializedFIXString = null;
            if (serializedMsg != null) {
                serializedFIXString = serializedMsg.toString();
            }

            // Checking
            assertEquals("Bad serialization of Message " + sourceMsg.getClass().getName(), sourceFIXString, serializedFIXString);
        }
    }

    private final class FieldSerializationAssertion implements SerializationAssertion {

        public void assertSerialization(String fieldClassName) {
            Field sourceField = (Field) objectFromClassName(fieldClassName);
            String sourceFIXString = sourceField.toString();

            Field serializedField = (Field) buildSerializedObject(sourceField);
            String serializedFIXString = null;
            if (serializedField != null) {
                serializedFIXString = serializedField.toString();
            }

            // Checking
            assertEquals("Bad serialization of Field " + sourceField.getClass().getName(), sourceFIXString, serializedFIXString);
        }
    }

    // Default values creation
    private Message createMessageWithDefaultValues(Class cl, int maxGroupElts) throws InstantiationException, IllegalAccessException {
        // Setting Fields
        Message res = (Message) createFieldMapWithDefaultValues(cl);

        // Setting Groups
        final String ADD_GROUP = "addGroup";
        Class[] classes = cl.getDeclaredClasses();
        for (int k = 0; k < classes.length; k++) {
            if (classes[k].getSuperclass().getName().equals("quickfix.Group")) {
                for (int l = 0; l < maxGroupElts; l++) {
                    Group g = createGroupWithDefaultValues(classes[k]);
                    Class[] signature = new Class[1];
                    signature[0] = g.getClass().getSuperclass();
                    try {
                        Method addGroup = cl.getMethod(ADD_GROUP, signature);
                        Object[] args = new Object[1];
                        args[0] = g;
                        addGroup.invoke(res, args);
                    } catch (SecurityException e) {
                        fail(e.getMessage());
                    } catch (NoSuchMethodException e) {
                        fail(e.getMessage());
                    } catch (IllegalArgumentException e) {
                        fail(e.getMessage());
                    } catch (IllegalAccessException e) {
                        fail(e.getMessage());
                    } catch (InvocationTargetException e) {
                        fail(e.getMessage());
                    }
                }
            }
        }
        return res;
    }

    private Group createGroupWithDefaultValues(Class cl) throws InstantiationException, IllegalAccessException {
        Group res = (Group) createFieldMapWithDefaultValues(cl);
        return res;
    }

    private FieldMap createFieldMapWithDefaultValues(Class cl) throws InstantiationException, IllegalAccessException {
        FieldMap res = (FieldMap) cl.newInstance();

        final String SET_METHOD = "set";
        final String GET_METHOD = "get";
        Method[] methods = cl.getMethods();
        for (int k = 0; k < methods.length; k++) {
            if (methods[k].getName().equals(GET_METHOD)) {
                Field f = (Field) objectFromClassName(methods[k].getReturnType().getName());
                Class[] signature = new Class[1];
                signature[0] = f.getClass();
                try {
                    Method setter = cl.getMethod(SET_METHOD, signature);
                    Object[] args = new Object[1];
                    args[0] = f;
                    setter.invoke(res, args);
                } catch (SecurityException e) {
                    fail(e.getMessage());
                } catch (NoSuchMethodException e) {
                    fail(e.getMessage());
                } catch (IllegalArgumentException e) {
                    fail(e.getMessage());
                } catch (IllegalAccessException e) {
                    fail(e.getMessage());
                } catch (InvocationTargetException e) {
                    fail(e.getMessage());
                }
            }
        }
        return res;
    }

}
