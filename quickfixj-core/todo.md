# TO DO
 
 This file is for 
 * development notes
 * identifying ambiguities
 * recording incomplete work or technical debt

in `quickfixj.MesssageTest` test `shouldConvertToXMLWithIndent` has been co-erced to make the test pass.
This branch has xml processing inconsistent with master. 

This is likely due to differences in XML dependencies yet to be resolved.

In master the field tag value is expected to be `CDATA`.

        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>\n" + "<message>\n" +
                "    <header/>\n" + "    <body>\n" +
                "        <field tag=\"1\"><![CDATA[test-account]]></field>\n" + "    </body>\n" +
                "    <trailer/>\n" + "</message>\n", xml);

and in the `quikfixj-base` module `quickfix.Message.java`, line 376 indentation is set to "4" but this is not respected by `javax.xml.transform.Transformer` which is settting the indentation to 3.

 ```
             if (indent) {
                serializer.setOutputProperty(OutputKeys.INDENT, "yes");
                serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            } else {
                serializer.setOutputProperty(OutputKeys.INDENT, "no");
            }
 ```