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

import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.DeliverToCompID;
import quickfix.field.DeliverToLocationID;
import quickfix.field.DeliverToSubID;
import quickfix.field.LastMsgSeqNumProcessed;
import quickfix.field.MessageEncoding;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.OnBehalfOfCompID;
import quickfix.field.OnBehalfOfLocationID;
import quickfix.field.OnBehalfOfSendingTime;
import quickfix.field.OnBehalfOfSubID;
import quickfix.field.OrigSendingTime;
import quickfix.field.PossDupFlag;
import quickfix.field.PossResend;
import quickfix.field.SecureDataLen;
import quickfix.field.SenderCompID;
import quickfix.field.SenderLocationID;
import quickfix.field.SenderSubID;
import quickfix.field.SendingTime;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;
import quickfix.field.XmlData;
import quickfix.field.XmlDataLen;

public class Message extends FieldMap {
    protected Header header = new Header();
    protected Trailer trailer = new Trailer();
    private DataDictionary dd;
    private boolean doValidation;
    private int isValidStructureTag = 0;
    private boolean isValidStructure = true;

    public Message() {
        // empty
    }

    public Message(String string) throws InvalidMessage {
        fromString(string, null, true);
    }

    public Message(String string, boolean validate) throws InvalidMessage {
        fromString(string, null, validate);
    }

    public Message(String string, DataDictionary dd) throws InvalidMessage {
        fromString(string, dd, true);
    }

    public Message(String string, DataDictionary dd, boolean validate) throws InvalidMessage {
        fromString(string, dd, validate);
    }

    /* package */Message(Message message, DataDictionary dd) {
        cloneTo(this);
        this.dd = dd;
    }

    public static boolean InitializeXML(String url) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        try {
            Message message = (Message)getClass().newInstance();
            return cloneTo(message);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    private Object cloneTo(Message message) {
        message.initializeFrom(this);
        message.header.initializeFrom(this.getHeader());
        message.trailer.initializeFrom(this.getTrailer());
        return message;
    }

    public String toString() {
        header.setField(new BodyLength(bodyLength()));
        trailer.setField(new CheckSum(checkSum()));

        StringBuffer sb = new StringBuffer();
        header.calculateString(sb, null, null);
        calculateString(sb, null, null);
        trailer.calculateString(sb, null, null);

        return sb.toString();
    }

    public int bodyLength() {
        return header.calculateLength() + calculateLength() + trailer.calculateLength();
    }

    private DecimalFormat checksumFormat = new DecimalFormat("000");

    private int checkSum(String s) {
        int offset = s.lastIndexOf("\00110=");
        int sum = 0;
        for (int i = 0; i < offset; i++) {
            sum += s.charAt(i);
        }
        return (sum + 1) % 256;
    }

    private String checkSum() {
        return checksumFormat.format((header.calculateTotal() + calculateTotal() + trailer
                .calculateTotal()) % 256);
    }

    public String toXML() {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .newDocument();
            Element message = document.createElement("message");
            document.appendChild(message);
            try {
                toXMLFields(message, "header", this.header);
                toXMLFields(message, "body", this);
                toXMLFields(message, "trailer", this.trailer);
            } catch (FieldNotFound e1) {
                // TODO Original toXML doesn't declare any exceptions
                throw new RuntimeException(e1);
            }
            DOMSource domSource = new DOMSource(document);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            StreamResult streamResult = new StreamResult(out);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer serializer = tf.newTransformer();
            serializer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
            //serializer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,"users.dtd");
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.transform(domSource, streamResult);
            return out.toString();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FactoryConfigurationError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        throw new UnsupportedOperationException();
    }

    public void toXMLFields(Element message, String section, FieldMap fieldMap)
            throws FieldNotFound {
        Document document = message.getOwnerDocument();
        Element fields = document.createElement(section);
        message.appendChild(fields);
        Iterator fieldItr = fieldMap.iterator();
        while (fieldItr.hasNext()) {
            StringField field = (StringField) fieldItr.next();
            Element fieldElement = document.createElement("field");
            if (dataDictionary != null) {
                String name = dataDictionary.getFieldName(field.getTag());
                if (name != null) {
                    fieldElement.setAttribute("name", name);
                }
                String enumValue = dataDictionary.getValueName(field.getTag(), field.getValue());
                if (enumValue != null) {
                    fieldElement.setAttribute("enum", enumValue);
                }
            }
            fieldElement.setAttribute("number", Integer.toString(field.getTag()));
            CDATASection value = document.createCDATASection(field.getValue());
            fieldElement.appendChild(value);
            fields.appendChild(fieldElement);
        }
        Iterator groupKeyItr = fieldMap.groupKeyIterator();
        while (groupKeyItr.hasNext()) {
            int groupKey = ((Integer) groupKeyItr.next()).intValue();
            List groups = fieldMap.getGroups(groupKey);
            Iterator groupItr = groups.iterator();
            while (groupItr.hasNext()) {
                Group group = (Group) groupItr.next();
                toXMLFields(fields, "group", group);
            }
        }
    }

    public final Header getHeader() {
        return header;
    }

    public final Trailer getTrailer() {
        return trailer;
    }

    public boolean isAdmin() {
        throw new UnsupportedOperationException();
    }

    public boolean isApp() {
        throw new UnsupportedOperationException();
    }

    public class Header extends FieldMap {
        void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, new int[] { BeginString.FIELD, BodyLength.FIELD,
                    MsgType.FIELD }, postFields);
        }
    }

    public class Trailer extends FieldMap {
        void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, null, new int[] { CheckSum.FIELD });
        }
    }

    public static boolean isAdminMsgType(String msgType) {
        return msgType.length() == 1 && "0A12345".indexOf(msgType) != -1;
    }

    public void reverseRoute(Header header) throws FieldNotFound {
        this.header.removeField(BeginString.FIELD);
        this.header.removeField(SenderCompID.FIELD);
        this.header.removeField(TargetCompID.FIELD);

        if (header.isSetField(BeginString.FIELD)) {
            String beginString = header.getString(BeginString.FIELD);
            if (beginString.length() > 0)
                this.header.setString(BeginString.FIELD, beginString);

            this.header.removeField(OnBehalfOfLocationID.FIELD);
            this.header.removeField(DeliverToLocationID.FIELD);

            if (beginString.compareTo(FixVersions.BEGINSTRING_FIX41) >= 0) {
                copyField(header, OnBehalfOfLocationID.FIELD, DeliverToLocationID.FIELD);
                copyField(header, DeliverToLocationID.FIELD, OnBehalfOfLocationID.FIELD);
            }

            copyField(header, SenderCompID.FIELD, TargetCompID.FIELD);
            copyField(header, TargetCompID.FIELD, SenderCompID.FIELD);

            this.header.removeField(OnBehalfOfCompID.FIELD);
            this.header.removeField(OnBehalfOfSubID.FIELD);
            this.header.removeField(DeliverToCompID.FIELD);
            this.header.removeField(DeliverToSubID.FIELD);

            copyField(header, OnBehalfOfCompID.FIELD, DeliverToCompID.FIELD);
            copyField(header, OnBehalfOfSubID.FIELD, DeliverToSubID.FIELD);
            copyField(header, DeliverToCompID.FIELD, OnBehalfOfCompID.FIELD);
            copyField(header, DeliverToSubID.FIELD, OnBehalfOfSubID.FIELD);
        }
    }

    private void copyField(Header header, int fromField, int toField) throws FieldNotFound {
        if (header.isSetField(fromField)) {
            String value = header.getString(fromField);
            if (value.length() > 0)
                this.header.setString(toField, value);
        }
    }

    void setSessionID(SessionID sessionID) {
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
    }

    public void fromString(String messageData, DataDictionary dd, boolean doValidation)
            throws InvalidMessage {
        this.messageData = messageData;
        this.dd = dd;
        this.doValidation = doValidation;
        try {
            parseHeader();
            parseBody();
            parseTrailer();
        } catch (InvalidMessage e) {
            isValidStructure = false;
        }
        if (doValidation) {
            validate(messageData);
        }
    }

    private void validate(String messageData) throws InvalidMessage {
        try {
            int expectedBodyLength = header.getInt(BodyLength.FIELD);
            int actualBodyLength = bodyLength();
            if (expectedBodyLength != actualBodyLength) {
                throw new InvalidMessage("actual body length=" + actualBodyLength
                        + ", expected body length=" + expectedBodyLength);
            }
            int checkSum = trailer.getInt(CheckSum.FIELD);
            if (checkSum != checkSum(messageData)) {
                throw new InvalidMessage("Expected CheckSum=" + checkSum(messageData) + ", Received CheckSum="
                        + checkSum);
            }
        } catch (FieldNotFound e) {
            throw new InvalidMessage("Field not found: " + e.field);
        } catch (InvalidMessage e) {
            throw e;
        }
    }

    private void parseHeader() throws InvalidMessage {
        boolean invalidHeaderFieldOrder = false;
        StringField beginString = extractField();
        if (beginString.getField() != BeginString.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        StringField bodyLength = extractField();
        if (bodyLength.getField() != BodyLength.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        StringField msgType = extractField();
        if (msgType.getField() != MsgType.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        if (doValidation && invalidHeaderFieldOrder) {
            throw new InvalidMessage("Header fields out of order");
        }
        header.setField(beginString);
        header.setField(bodyLength);
        header.setField(msgType);
        StringField field = extractField();
        while (field != null && isHeaderField(field, dd)) {
            header.setField(field);
            field = extractField();
        }
        pushBack(field);
    }

    private void parseBody() throws InvalidMessage {
        StringField field = extractField();
        while (field != null) {
            int tag = field.getField();
            if (isTrailerField(tag)) {
                pushBack(field);
                return;
            }
            if (isHeaderField(tag)) {
                if (isValidStructure) {
                    isValidStructureTag = tag;
                    isValidStructure = false;
                }
                header.setField(field);
            } else {
                setField(field);
            }
            String msgType;
            try {
                msgType = header.getString(MsgType.FIELD);
            } catch (FieldNotFound e) {
                throw new InvalidMessage(e.getMessage());
            }
            if (dd != null && dd.isGroup(msgType, tag)) {
                DataDictionary.RepeatingGroup rg = dd.getGroup(msgType, tag);
                int groupField = tag;
                int firstField = ((Integer) rg.getFirstField().getKey()).intValue();
                Group group = null;
                boolean inGroupParse = true;
                while (inGroupParse) {
                    field = extractField(group);
                    if (field.getTag() == firstField) {
                        if (group != null) {
                            addGroup(group);
                        }
                        group = new Group(groupField, firstField);
                        group.setField(field);
                    } else if (rg
                            .isElementInContainer(DataDictionary.Field.class, new Integer(field.getTag()))) {
                        group.setField(field);
                    } else {
                        if (group != null) {
                            addGroup(group);
                        }
                        pushBack(field);
                        inGroupParse = false;
                    }
                }
            }
            field = extractField();
        }
    }

    private void parseTrailer() throws InvalidMessage {
        StringField field = extractField();
        while (field != null && isTrailerField(field, dd)) {
            trailer.setField(field);
            field = extractField();
        }
    }

    private boolean isHeaderField(Field field, DataDictionary dd) {
        return isHeaderField(field.getField())
                || (dd != null && dd.isHeaderField(field.getField()));
    }

    private boolean isHeaderField(int field) {
        switch (field) {
        case BeginString.FIELD:
        case BodyLength.FIELD:
        case MsgType.FIELD:
        case SenderCompID.FIELD:
        case TargetCompID.FIELD:
        case OnBehalfOfCompID.FIELD:
        case DeliverToCompID.FIELD:
        case SecureDataLen.FIELD:
        case MsgSeqNum.FIELD:
        case SenderSubID.FIELD:
        case SenderLocationID.FIELD:
        case TargetSubID.FIELD:
        case TargetLocationID.FIELD:
        case OnBehalfOfSubID.FIELD:
        case OnBehalfOfLocationID.FIELD:
        case DeliverToSubID.FIELD:
        case DeliverToLocationID.FIELD:
        case PossDupFlag.FIELD:
        case PossResend.FIELD:
        case SendingTime.FIELD:
        case OrigSendingTime.FIELD:
        case XmlDataLen.FIELD:
        case XmlData.FIELD:
        case MessageEncoding.FIELD:
        case LastMsgSeqNumProcessed.FIELD:
        case OnBehalfOfSendingTime.FIELD:
            return true;
        default:
            return false;
        }
    }

    private boolean isTrailerField(Field field, DataDictionary dd) {
        return isTrailerField(field.getField())
                || (dd != null && dd.isTrailerField(field.getField()));
    }

    private boolean isTrailerField(int field) {
        switch (field) {
        case SignatureLength.FIELD:
        case Signature.FIELD:
        case CheckSum.FIELD:
            return true;
        default:
            return false;
        }
    }

    //
    // Extract field
    //
    private String messageData;
    private int position;
    private StringField pushedBackField;
    private DataDictionary dataDictionary;

    public void pushBack(StringField field) {
        pushedBackField = field;
    }

    private StringField extractField() throws InvalidMessage {
        return extractField(null);
    }

    private StringField extractField(Group group) throws InvalidMessage {
        if (pushedBackField != null) {
            StringField f = pushedBackField;
            pushedBackField = null;
            return f;
        }

        if (position >= messageData.length()) {
            return null;
        }

        int equalsOffset = messageData.indexOf('=', position);
        if (equalsOffset == -1) {
            throw new InvalidMessage("Equal sign not found in field");
        }

        int tag = -1;
        try {
            tag = Integer.parseInt(messageData.substring(position, equalsOffset));
        } catch (NumberFormatException e) {
            throw new InvalidMessage("bad tag format: " + e.getMessage());
        }
        int sohOffset = messageData.indexOf('\001', equalsOffset + 1);
        if (sohOffset == -1) {
            throw new InvalidMessage("SOH not found at end of field: " + tag);
        }

        if (dataDictionary != null && dataDictionary.isDataField(tag)) {
            /* Assume length field is 1 less. */
            int lengthField = tag - 1;
            /* Special case for Signature which violates above assumption. */
            if (tag == 89)
                lengthField = 93;
            int fieldLength;
            try {
                if (group == null) {
                    fieldLength = getInt(lengthField);
                } else {
                    fieldLength = group.getInt(lengthField);
                }
            } catch (FieldNotFound e1) {
                throw new InvalidMessage(e1.getMessage());
            }
            sohOffset = equalsOffset + 1 + fieldLength;
        }

        position = sohOffset + 1;
        return new StringField(tag, messageData.substring(equalsOffset + 1, sohOffset));
    }

    /**
     * Queries message structural validity. (smb - I'm not sure how this is
     * related to other message validations.)
     * 
     * @return flag indicating whether the message has a valid structure
     */
    public boolean hasValidStructure() {
        return isValidStructure;
    }

    public int getInvalidStructureTag() {
        return isValidStructureTag;
    }
}