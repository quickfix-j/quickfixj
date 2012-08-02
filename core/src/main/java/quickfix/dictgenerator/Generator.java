package quickfix.dictgenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.Writer;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * QFJ-483: QFJ Dictionary Generator
 * Credit for the initial version goes to Morten Kristiansen.
 * There were some changes made regarding ordering of tags etc, in order to make the
 * dictionaries look more similar to the existing QFJ dictionaries.
 * 
 * NB: Do not forget to correct the major/minor number in the session data dictionary afterwards.
 * 
 * This generator only works with the FPL 2008/09 repository files (http://fixprotocol.org/repository-2008).
 */
public class Generator {

    private final Repository repository;
    private final int major;
    private final int minor;

    public Generator(File repositoryDir, int major, int minor ) throws Exception {
        System.out.println("Building Repository: " + repositoryDir.getAbsolutePath() + "...");
        this.repository = new Repository(repositoryDir);
        this.major = major;
        this.minor = minor;
    }

    public void generate() throws Exception {
        generateDictionary("session.xml", true, false);
        generateDictionary("application.xml", false, false);
        generateDictionary("merged.xml", false, true);      // for versions below FIX5.0
    }

    private void generateDictionary(String file, boolean admin, boolean merged ) {
        File dictionaryFile = new File(file);
        System.out.println("Creating file: " + dictionaryFile.getAbsolutePath());
        StringBuilder builder = new StringBuilder();
        if (!merged) {
            if (admin) {
                builder.append("<fix type=\"FIXT\" major=\"TODO\" minor=\"TODO\">\n");
            } else {
                builder.append("<fix major=\"" + major + "\" minor=\"" + minor + "\">\n");
            }
        } else {
            builder.append("<fix major=\"" + major + "\" minor=\"" + minor + "\">\n");
        }

        Map<String, MsgType> msgTypes = new LinkedHashMap<String, MsgType>();
        if ( !merged) {
            if (admin) {
                msgTypes.putAll( repository.getSessionMsgTypes() );
            } else {
                msgTypes.putAll( repository.getApplicationMsgTypes() );
            }
        } else {
            msgTypes.putAll( repository.getSessionMsgTypes() );
            msgTypes.putAll(repository.getApplicationMsgTypes());
        }
        Set<Integer> fieldsUsed = getAllFieldsUsed(msgTypes);
        Set<String> componentsUsed = getAllComponentsUsed(msgTypes);

        // Header
        if (!merged) {
            if (admin) {
                builder.append("  <header>\n");
                Component standardHeader = repository.getStandardHeader(msgTypes.values().iterator().next());
                addMsgContents(builder, standardHeader.getMsgContent(), "    ");
                builder.append("  </header>\n");
                builder.append("  <trailer>\n");
                Component standardTrailer = repository.getStandardTrailer(msgTypes.values().iterator().next());
                addMsgContents(builder, standardTrailer.getMsgContent(), "    ");
                builder.append("  </trailer>\n");
            } else {
                builder.append("  <header/>\n");
                builder.append("  <trailer/>\n");
            }
        } else {
            builder.append("  <header>\n");
            Component standardHeader = repository.getStandardHeader(msgTypes.values().iterator().next());
            addMsgContents(builder, standardHeader.getMsgContent(), "    ");
            builder.append("  </header>\n");
            builder.append("  <trailer>\n");
            Component standardTrailer = repository.getStandardTrailer(msgTypes.values().iterator().next());
            addMsgContents(builder, standardTrailer.getMsgContent(), "    ");
            builder.append("  </trailer>\n");
        }

        // Message
        if (!merged ) {
            String msgcat = admin ? "admin" : "app";
            builder.append("  <messages>\n");
            for (MsgType msgType : msgTypes.values()) {
                if ( msgType.getMsgType().equals("n")) {
                    builder.append("    <!-- \n");
                }
                builder.append("    <message name=\"" + msgType.getName() + "\" msgtype=\"" + msgType.getMsgType() + "\" msgcat=\"" + msgcat + "\">\n");
                addMsgContents(builder, msgType.getMsgContent(), "      ");
                builder.append("    </message>\n");
                if ( msgType.getMsgType().equals("n")) {
                    builder.append("    --> \n");
                }
            }
            builder.append("  </messages>\n");
        } else {
            builder.append("  <messages>\n");
            for (MsgType msgType : msgTypes.values()) {
                String msgcat = msgType.getCategory().equals("Session") ? "admin" : "app";
                if ( msgType.getMsgType().equals("n")) {
                    builder.append("    <!-- \n");
                }
                builder.append("    <message name=\"" + msgType.getName() + "\" msgtype=\"" + msgType.getMsgType() + "\" msgcat=\"" + msgcat + "\">\n");
                addMsgContents(builder, msgType.getMsgContent(), "      ");
                builder.append("    </message>\n");
                if ( msgType.getMsgType().equals("n")) {
                    builder.append("    --> \n");
                }
            }
            builder.append("  </messages>\n");
        }

        // Components
        builder.append("  <components>\n");
        Map<String, Component> components = repository.getComponents();
        for (String name : componentsUsed) {
            Component component = components.get(name);
            builder.append("    <component name=\"" + name + "\">\n");
            Field numInGroup = null;
            for (Object o : component.getMsgContent()) {
                if (o instanceof Field && ((Field)o).isNumInGroup()) {
                    numInGroup = (Field) o;
                    break;
                }
            }

            if (numInGroup != null) {
                builder.append("      <group name=\"" + numInGroup.getFieldName() + "\" required=\"" + (numInGroup.isRequired() ? "Y" : "N") + "\">\n");
                addMsgContents(builder, component.getMsgContent(), "        ");
                builder.append("      </group>\n");
            } else {
                addMsgContents(builder, component.getMsgContent(), "      ");
            }

            builder.append("    </component>\n");
        }
        builder.append("  </components>\n");

        // Fields
        builder.append("  <fields>\n");
        Map<String, Field> fields = repository.getFields();
        for (Integer tagInt : fieldsUsed) {
            String tag = String.valueOf(tagInt);
            Field field = fields.get(tag);
            String fieldType = field.getType();
            builder.append("    <field number=\"" + tag + "\" name=\"" + field.getFieldName() + "\" type=\"" + fieldType.toUpperCase() + "\"");
            if (!field.getEnums().isEmpty()) {
                builder.append(">\n");
                for (Enum theEnum : field.getEnums()) {
                    String enumDesc = theEnum.getDesc().toUpperCase();
                    enumDesc = enumDesc.replaceAll("\\(.*\\)", "" );    // remove stuff in parentheses
                    enumDesc = enumDesc.replaceAll("'","" );            // replace ticks (as in DON'T_KNOW_TRADE)
                    enumDesc = enumDesc.replaceAll("\"","" );
                    enumDesc = enumDesc.trim();                         // trim leading and trailing whitespaces
                    enumDesc = enumDesc.replaceAll("\\W+","_" );        // replace rest of non-word characters by _
                    builder.append("      <value enum=\"" + theEnum.getEnumName() + "\" description=\"" + enumDesc + "\"/>\n");
                }
                builder.append("    </field>\n");
            } else {
                builder.append("/>\n");
            }
        }
        builder.append("  </fields>\n");

        builder.append("</fix>");

        try {
            Writer writer = new BufferedWriter(new java.io.FileWriter(dictionaryFile));
            writer.write(builder.toString());
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void addMsgContents(StringBuilder builder, List<Object> msgContents, String prefix) {
        for (Object o : msgContents) {
            if (o instanceof Field) {
                Field field = (Field) o;
                if (field.isNumInGroup()) {
                    continue;
                }
                builder.append(prefix + "<field name=\"" + field.getFieldName() + "\" required=\"" + (field.isRequired() ? "Y" : "N") + "\"/>\n");
            } else if (o instanceof Component) {
                Component component = (Component) o;
                if (component.isStandardHeader() || component.isStandardTrailer()) {
                    continue;
                }
                builder.append(prefix + "<component name=\"" + component.getName() + "\" required=\"" + (component.isRequired() ? "Y" : "N") + "\"/>\n");
            }
        }
    }

    private Set<Integer> getAllFieldsUsed(Map<String, MsgType> msgTypes) {
        Set<Integer> result = new TreeSet<Integer>();
        for (MsgType msgType : msgTypes.values()) {
            result = addFields(result, msgType.getMsgContent());
        }
        System.out.println("Fields used: " + result);
        return result;
    }

    private Set<Integer> addFields(Set<Integer> result, List<Object> msgContents) {
        for (Object o : msgContents) {
            if (o instanceof Field) {
                result.add(Integer.valueOf(((Field)o).getTag()));
            } if (o instanceof Component) {
                result = addFields(result, ((Component)o).getMsgContent());
            }
        }
        return result;
    }

    private Set<String> getAllComponentsUsed(Map<String, MsgType> msgTypes) {
        Set<String> result = new HashSet<String>();
        for (MsgType msgType : msgTypes.values()) {
            result = addComponents(result, msgType.getMsgContent());
        }
        System.out.println("Components used: " + result);
        return result;
    }

    private Set<String> addComponents(Set<String> result, List<Object> msgContents) {
        for (Object o : msgContents) {
            if (o instanceof Component) {
                Component component = (Component) o;
                if (!component.isStandardHeader() && !component.isStandardTrailer()) {
                    result.add(((Component)o).getName());
                }
                result = addComponents(result, ((Component)o).getMsgContent());
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 3) {
            System.err.println("Usage: Generator [repository path] [major number] [minor number]");
            System.exit(1);
            return;
        }
        File repository = new File(args[0]);
        if (!repository.exists() || !repository.isDirectory()) {
            System.err.println("Invalid repository: " + repository.getAbsolutePath());
            System.exit(1);
            return;
        }
        int major = Integer.valueOf(args[1]);
        int minor = Integer.valueOf(args[2]);
        
        new Generator(repository, major, minor).generate();
    }
}
