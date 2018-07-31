package org.quickfixj.codegenerator;

import org.joor.Reflect;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import quickfix.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MessageCodeGeneratorTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void generateFromBasicFixDictionary() throws Exception {
        final File schema = new File(MessageCodeGeneratorTest.class.getResource("/org/quickfixj/codegenerator/MessageFactory.xsl").getFile());
        final File spec = new File(MessageCodeGeneratorTest.class.getResource("/basic.xml").getFile());

        final MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
        task.setName("basic");
        task.setSpecification(spec);
        task.setTransformDirectory(schema.getParentFile());
        task.setMessagePackage("basic");
        task.setOutputBaseDirectory(folder.getRoot());
        task.setFieldPackage("field");
        task.setOverwrite(true);
        task.setOrderedFields(true);
        task.setDecimalGenerated(false);
        final MessageCodeGenerator generator = new MessageCodeGenerator();
        generator.generate(task);

        final File fieldDir = new File(folder.getRoot(), "field");
        final File messageDir = new File(folder.getRoot(), "basic");

        final Map<String, String> classNameToSourceMap = new LinkedHashMap<>();
        classNameToSourceMap.put("field.BeginString", getSource(new File(fieldDir, "BeginString.java")));
        classNameToSourceMap.put("field.BodyLength", getSource(new File(fieldDir, "BodyLength.java")));
        classNameToSourceMap.put("field.CheckSum", getSource(new File(fieldDir, "CheckSum.java")));
        classNameToSourceMap.put("field.MsgType", getSource(new File(fieldDir, "MsgType.java")));
        classNameToSourceMap.put("field.Signature", getSource(new File(fieldDir, "Signature.java")));
        classNameToSourceMap.put("field.SignatureLength", getSource(new File(fieldDir, "SignatureLength.java")));
        classNameToSourceMap.put("field.TestReqID", getSource(new File(fieldDir, "TestReqID.java")));

        classNameToSourceMap.put("basic.Message", getSource(new File(messageDir, "Message.java")));
        classNameToSourceMap.put("basic.TestRequest", getSource(new File(messageDir, "TestRequest.java")));
        classNameToSourceMap.put("basic.MessageCracker", getSource(new File(messageDir, "MessageCracker.java")));
        classNameToSourceMap.put("basic.MessageFactory", getSource(new File(messageDir, "MessageFactory.java")));
        final Map<String, Reflect> classes = Compiler.compile(classNameToSourceMap);

        final Map<String, FieldDef> fieldDefs = new LinkedHashMap<>();
        fieldDefs.put("BeginString", new FieldDef(8, StringField.class));
        fieldDefs.put("BodyLength", new FieldDef(9, IntField.class));
        fieldDefs.put("CheckSum", new FieldDef(10, StringField.class));
        fieldDefs.put("MsgType", new FieldDef(35, StringField.class));
        fieldDefs.put("Signature", new FieldDef(89, StringField.class));
        fieldDefs.put("SignatureLength", new FieldDef(93, IntField.class));
        fieldDefs.put("TestReqID", new FieldDef(112, StringField.class));
        validateFields(classes, fieldDefs);

        final Map<String, MessageDef> messageDefs = new LinkedHashMap<>();
        messageDefs.put("TestRequest", new MessageDef("1"));
        validateMessages(classes, messageDefs);
    }

    /**
     * This test is based on the FXAll FIX spec post MiFID II which has the same group in different locations within a
     * message based on the context of the message.  At present this generates Java code which does not compile due to
     * duplicate case labels.
     */
    @Test(expected = RuntimeException.class)
    public void generateFromFixDictionaryWithNestedGroups() throws Exception {
        final File schema = new File(MessageCodeGeneratorTest.class.getResource("/org/quickfixj/codegenerator/MessageFactory.xsl").getFile());
        final File spec = new File(MessageCodeGeneratorTest.class.getResource("/nested-group.xml").getFile());

        final MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
        task.setName("nested");
        task.setSpecification(spec);
        task.setTransformDirectory(schema.getParentFile());
        task.setMessagePackage("nested");
        task.setOutputBaseDirectory(folder.getRoot());
        task.setFieldPackage("field");
        task.setOverwrite(true);
        task.setOrderedFields(true);
        task.setDecimalGenerated(false);
        final MessageCodeGenerator generator = new MessageCodeGenerator();
        generator.generate(task);

        final File fieldDir = new File(folder.getRoot(), "field");
        final File messageDir = new File(folder.getRoot(), "nested");

        final Map<String, String> classNameToSourceMap = new LinkedHashMap<>();
        classNameToSourceMap.put("field.BeginString", getSource(new File(fieldDir, "BeginString.java")));
        classNameToSourceMap.put("field.BodyLength", getSource(new File(fieldDir, "BodyLength.java")));
        classNameToSourceMap.put("field.CheckSum", getSource(new File(fieldDir, "CheckSum.java")));
        classNameToSourceMap.put("field.MsgType", getSource(new File(fieldDir, "MsgType.java")));
        classNameToSourceMap.put("field.Signature", getSource(new File(fieldDir, "Signature.java")));
        classNameToSourceMap.put("field.SignatureLength", getSource(new File(fieldDir, "SignatureLength.java")));
        classNameToSourceMap.put("field.TestReqID", getSource(new File(fieldDir, "TestReqID.java")));
        classNameToSourceMap.put("field.NoFoos", getSource(new File(fieldDir, "NoFoos.java")));
        classNameToSourceMap.put("field.NoBars", getSource(new File(fieldDir, "NoBars.java")));
        classNameToSourceMap.put("field.Foo", getSource(new File(fieldDir, "Foo.java")));

        classNameToSourceMap.put("basic.Message", getSource(new File(messageDir, "Message.java")));
        classNameToSourceMap.put("basic.TestRequest", getSource(new File(messageDir, "TestRequest.java")));
        classNameToSourceMap.put("basic.MessageCracker", getSource(new File(messageDir, "MessageCracker.java")));
        classNameToSourceMap.put("basic.MessageFactory", getSource(new File(messageDir, "MessageFactory.java")));
        final Map<String, Reflect> classes = Compiler.compile(classNameToSourceMap);

        final Map<String, FieldDef> fieldDefs = new LinkedHashMap<>();
        fieldDefs.put("BeginString", new FieldDef(8, StringField.class));
        fieldDefs.put("BodyLength", new FieldDef(9, IntField.class));
        fieldDefs.put("CheckSum", new FieldDef(10, StringField.class));
        fieldDefs.put("MsgType", new FieldDef(35, StringField.class));
        fieldDefs.put("Signature", new FieldDef(89, StringField.class));
        fieldDefs.put("SignatureLength", new FieldDef(93, IntField.class));
        fieldDefs.put("TestReqID", new FieldDef(112, StringField.class));
        fieldDefs.put("NoFoos", new FieldDef(112, IntField.class));
        fieldDefs.put("NoBars", new FieldDef(112, IntField.class));
        fieldDefs.put("Foo", new FieldDef(112, StringField.class));
        validateFields(classes, fieldDefs);

        final Map<String, MessageDef> messageDefs = new LinkedHashMap<>();
        messageDefs.put("TestRequest", new MessageDef("1"));
        validateMessages(classes, messageDefs);
    }

    private String getSource(final File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()));
    }

    private void validateFields(final Map<String, Reflect> classes, final Map<String, FieldDef> fieldDefs) {
        for (final Map.Entry<String, FieldDef> fieldDef : fieldDefs.entrySet()) {
            final String fieldName = fieldDef.getKey();
            final Field<?> fieldInstance = classes.get("field." + fieldName).create().get();
            assertEquals(String.format("Mismatch on field number for %s", fieldName), fieldDef.getValue().fieldNumber, fieldInstance.getField());
            assertTrue(String.format("Expected %s to be an instance of %s", fieldName, fieldDef.getValue().clazz.getSimpleName()), fieldDef.getValue().clazz.isAssignableFrom(fieldInstance.getClass()));
        }
    }

    private void validateMessages(final Map<String, Reflect> classes,  final Map<String, MessageDef> messageDefs) throws FieldNotFound {
        for (final Map.Entry<String, MessageDef> messageDef : messageDefs.entrySet()) {
            final String messageName = messageDef.getKey();
            final Message messageInstance = classes.get("basic." + messageName).create().get();
            assertEquals(String.format("Mismatch on message type for %s", messageName), messageDef.getValue().messageType, messageInstance.getHeader().getString(35));
        }
    }

    private final class FieldDef {
        private final int fieldNumber;
        private final Class<? extends Field<?>> clazz;

        FieldDef(final int fieldNumber, final Class<? extends Field<?>> clazz) {
            this.fieldNumber = fieldNumber;
            this.clazz = clazz;
        }
    }

    private final class MessageDef {
        private final String messageType;

        MessageDef(final String messageType) {
            this.messageType = messageType;
        }
    }
}
