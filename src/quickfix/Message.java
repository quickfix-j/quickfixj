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

import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
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
    static final long serialVersionUID = -3193357271891865972L;

    protected Header header = new Header();

    protected Trailer trailer = new Trailer();

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

    public static boolean InitializeXML(String url) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        try {
            Message message = (Message) getClass().newInstance();
            return cloneTo(message);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
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

    private static DecimalFormat checksumFormat = new DecimalFormat("000");

    private int checkSum(String s) {
        int offset = s.lastIndexOf("\00110=");
        int sum = 0;
        for (int i = 0; i < offset; i++) {
            sum += s.charAt(i);
        }
        return (sum + 1) % 256;
    }

    private String checkSum() {
        return checksumFormat.format((header.calculateTotal() + calculateTotal() + trailer.calculateTotal()) % 256);
    }

    public String toXml() {
        return toXML(null);
    }
    
    public String toXML(DataDictionary dataDictionary) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element message = document.createElement("message");
            document.appendChild(message);
            toXMLFields(message, "header", this.header, dataDictionary);
            toXMLFields(message, "body", this, dataDictionary);
            toXMLFields(message, "trailer", this.trailer, dataDictionary);
            DOMSource domSource = new DOMSource(document);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            StreamResult streamResult = new StreamResult(out);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer serializer = tf.newTransformer();
            serializer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
            // serializer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,"users.dtd");
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.transform(domSource, streamResult);
            return out.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void toXMLFields(Element message, String section, FieldMap fieldMap, DataDictionary dataDictionary) throws FieldNotFound {
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
                toXMLFields(fields, "group", group, dataDictionary);
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
        if (header.isSetField(MsgType.FIELD)) {
            try {
                String msgType = header.getString(MsgType.FIELD);
                return msgType.length() == 1 && "0A12345".indexOf(msgType.charAt(0)) != -1;
            } catch (FieldNotFound e) {
                // shouldn't happen
            }
        }
        return false;
    }

    public boolean isApp() {
        return !isAdmin();
    }

    public class Header extends FieldMap {

        static final long serialVersionUID = -3193357271891865972L;

        protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, new int[] { BeginString.FIELD, BodyLength.FIELD, MsgType.FIELD }, postFields);
        }
        
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        
        public void setBoolean(int field, boolean value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setBoolean(field, value);
        }

        public void setChar(int field, char value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setChar(field, value);
        }

        public void setDouble(int field, double value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setDouble(field, value);
        }

        public void setField(BooleanField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(CharField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(DoubleField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(IntField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(StringField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcDateOnlyField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcTimeOnlyField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcTimeStampField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setInt(int field, int value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setInt(field, value);
        }

        public void setString(int field, String value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setString(field, value);
        }

        public void setUtcDateOnly(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcDateOnly(field, value);
        }

        public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeOnly(field, value, includeMillseconds);
        }

        public void setUtcTimeOnly(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeOnly(field, value);
        }

        public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeStamp(field, value, includeMilliseconds);
        }

        public void setUtcTimeStamp(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeStamp(field, value);
        }

    }

    public class Trailer extends FieldMap {

        static final long serialVersionUID = -3193357271891865972L;

        protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, null, new int[] { CheckSum.FIELD });
        }
        
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        
        public void setBoolean(int field, boolean value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setBoolean(field, value);
        }

        public void setChar(int field, char value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setChar(field, value);
        }

        public void setDouble(int field, double value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setDouble(field, value);
        }

        public void setField(BooleanField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(CharField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(DoubleField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(IntField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(StringField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcDateOnlyField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcTimeOnlyField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setField(UtcTimeStampField field) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setField(field);
        }

        public void setInt(int field, int value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setInt(field, value);
        }

        public void setString(int field, String value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setString(field, value);
        }

        public void setUtcDateOnly(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcDateOnly(field, value);
        }

        public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeOnly(field, value, includeMillseconds);
        }

        public void setUtcTimeOnly(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeOnly(field, value);
        }

        public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeStamp(field, value, includeMilliseconds);
        }

        public void setUtcTimeStamp(int field, Date value) {
            // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
            super.setUtcTimeStamp(field, value);
        }

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

    public void fromString(String messageData, DataDictionary dd, boolean doValidation) throws InvalidMessage {
        this.messageData = messageData;
        this.doValidation = doValidation;
        try {
            parseHeader(dd);
            parseBody(dd);
            parseTrailer(dd);
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
                throw new InvalidMessage("Actual body length=" + actualBodyLength + ", Expected body length=" + expectedBodyLength);
            }
            int checkSum = trailer.getInt(CheckSum.FIELD);
            if (checkSum != checkSum(messageData)) {
                throw new InvalidMessage("Expected CheckSum=" + checkSum(messageData) + ", Received CheckSum=" + checkSum);
            }
        } catch (FieldNotFound e) {
            throw new InvalidMessage("Field not found: " + e.field);
        } catch (InvalidMessage e) {
            throw e;
        }
    }

    private void parseHeader(DataDictionary dd) throws InvalidMessage {
        boolean invalidHeaderFieldOrder = false;
        StringField beginString = extractField(dd);
        if (beginString.getField() != BeginString.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        StringField bodyLength = extractField(dd);
        if (bodyLength.getField() != BodyLength.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        StringField msgType = extractField(dd);
        if (msgType.getField() != MsgType.FIELD) {
            invalidHeaderFieldOrder = true;
        }
        if (doValidation && invalidHeaderFieldOrder) {
            throw new InvalidMessage("Header fields out of order");
        }
        header.setField(beginString);
        header.setField(bodyLength);
        header.setField(msgType);
        StringField field = extractField(dd);
        while (field != null && isHeaderField(field, dd)) {
            header.setField(field);
            field = extractField(dd);
        }
        pushBack(field);
    }

    private String getMsgType() throws InvalidMessage {
        String res = null;
        try {
            res = header.getString(MsgType.FIELD);
        } catch (FieldNotFound e) {
            throw new InvalidMessage(e.getMessage());
        }
        return res;
    }

    private void parseBody(DataDictionary dd) throws InvalidMessage {
        StringField field = extractField(dd);
        while (field != null) {
            if (isTrailerField(field.getField())) {
                pushBack(field);
                return;
            }
            if (isHeaderField(field.getField())) {
                if (isValidStructure) {
                    isValidStructureTag = field.getField();
                    isValidStructure = false;
                }
                header.setField(field);
            } else {
                setField(field);
            }
            // Group case
            if (dd != null && dd.isGroup(getMsgType(), field.getField())) {
                parseGroup(field, dd, this);
            }
            field = extractField(dd);
        }
    }

    private void parseGroup(StringField field, DataDictionary dd, FieldMap parent) throws InvalidMessage {
        DataDictionary.GroupInfo rg = dd.getGroup(getMsgType(), field.getField());
        int groupField = field.getField();
        int firstField = rg.getDelimeterField();
        boolean firstFieldFound = false;
        Group group = null;
        boolean inGroupParse = true;
        while (inGroupParse) {
            field = extractField(group, dd);
            if (field.getTag() == firstField) {
                if (group != null) {
                    parent.addGroup(group);
                }
                group = new Group(groupField, firstField);
                group.setField(field);
                firstFieldFound = true;
            } else {
                if (rg.getDataDictionary().isGroup(getMsgType(), field.getField())) {
                    if (firstFieldFound) {
                        parseGroup(field, rg.getDataDictionary(), group);
                    } else {
                        throw new InvalidMessage("The group " + groupField + " must set the delimiter field " + firstField);
                    }
                } else {
                    if (rg.getDataDictionary().isField(field.getTag())) {
                        group.setField(field);
                    } else {
                        if (group != null) {
                            parent.addGroup(group);
                        }
                        pushBack(field);
                        inGroupParse = false;
                    }
                }
            }
        }
    }

    private void parseTrailer(DataDictionary dd) throws InvalidMessage {
        StringField field = extractField(dd);
        while (field != null && isTrailerField(field, dd)) {
            trailer.setField(field);
            field = extractField(dd);
        }
    }

    static boolean isHeaderField(Field field, DataDictionary dd) {
        return isHeaderField(field.getField()) || (dd != null && dd.isHeaderField(field.getField()));
    }

    static boolean isHeaderField(int field) {
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

    static boolean isTrailerField(Field field, DataDictionary dd) {
        return isTrailerField(field.getField()) || (dd != null && dd.isTrailerField(field.getField()));
    }

    static boolean isTrailerField(int field) {
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

    public void pushBack(StringField field) {
        pushedBackField = field;
    }

    private StringField extractField(DataDictionary dataDictionary) throws InvalidMessage {
        return extractField(null, dataDictionary);
    }

    private StringField extractField(Group group, DataDictionary dataDictionary) throws InvalidMessage {
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
    
    public void setBoolean(int field, boolean value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setBoolean(field, value);
    }

    public void setChar(int field, char value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setChar(field, value);
    }

    public void setDouble(int field, double value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setDouble(field, value);
    }

    public void setField(BooleanField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(CharField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(DoubleField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(IntField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(StringField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcDateOnlyField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcTimeOnlyField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcTimeStampField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setInt(int field, int value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setInt(field, value);
    }

    public void setString(int field, String value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setString(field, value);
    }

    public void setUtcDateOnly(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcDateOnly(field, value);
    }

    public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeOnly(field, value, includeMillseconds);
    }

    public void setUtcTimeOnly(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeOnly(field, value);
    }

    public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeStamp(field, value, includeMilliseconds);
    }

    public void setUtcTimeStamp(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeStamp(field, value);
    }

}