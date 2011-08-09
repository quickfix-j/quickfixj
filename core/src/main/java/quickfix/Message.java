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

import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.CstmApplVerID;
import quickfix.field.DeliverToCompID;
import quickfix.field.DeliverToLocationID;
import quickfix.field.DeliverToSubID;
import quickfix.field.LastMsgSeqNumProcessed;
import quickfix.field.MessageEncoding;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NoHops;
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
import quickfix.field.SessionRejectReason;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;
import quickfix.field.XmlData;
import quickfix.field.XmlDataLen;

/**
 * Represents a FIX message.
 */
public class Message extends FieldMap {

    static final long serialVersionUID = -3193357271891865972L;
    protected Header header = new Header();
    protected Trailer trailer = new Trailer();

    // @GuardedBy("this")
    private FieldException exception;

    public Message() {
        // empty
    }

    protected Message(int[] fieldOrder) {
        super(fieldOrder);
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

    @Override
    public Object clone() {
        try {
            final Message message = getClass().newInstance();
            return cloneTo(message);
        } catch (final InstantiationException e) {
            throw new RuntimeException(e);
        } catch (final IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Object cloneTo(Message message) {
        message.initializeFrom(this);
        message.header.initializeFrom(getHeader());
        message.trailer.initializeFrom(getTrailer());
        return message;
    }

    @Override
    public String toString() {
        header.setField(new BodyLength(bodyLength()));
        trailer.setField(new CheckSum(checkSum()));

        final StringBuffer sb = new StringBuffer();
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
        final int offset = s.lastIndexOf("\00110=");
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

    public void headerAddGroup(Group group) {
        header.addGroup(group);
    }

    public void headerReplaceGroup(int num, Group group) {
        header.replaceGroup(num, group);
    }

    public Group headerGetGroup(int num, Group group) throws FieldNotFound {
        return header.getGroup(num, group);
    }

    public void headerRemoveGroup(Group group) {
        header.removeGroup(group);
    }

    public boolean headerHasGroup(int field) {
        return header.hasGroup(field);
    }

    public boolean headerHasGroup(int num, int field) {
        return header.hasGroup(num, field);
    }

    public boolean headerHasGroup(int num, Group group) {
        return headerHasGroup(num, group.getFieldTag());
    }

    public boolean headerHasGroup(Group group) {
        return headerHasGroup(group.getFieldTag());
    }

    public void trailerAddGroup(Group group) {
        trailer.addGroup(group);
    }

    public Group trailerGetGroup(int num, Group group) throws FieldNotFound {
        return trailer.getGroup(num, group);
    }

    public void trailerReplaceGroup(int num, Group group) {
        trailer.replaceGroup(num, group);
    }

    public void trailerRemoveGroup(Group group) {
        trailer.removeGroup(group);
    }

    public boolean trailerHasGroup(int field) {
        return trailer.hasGroup(field);
    }

    public boolean trailerHasGroup(int num, int field) {
        return trailer.hasGroup(num, field);
    }

    public boolean trailerHasGroup(int num, Group group) {
        return trailerHasGroup(num, group.getFieldTag());
    }

    public boolean trailerHasGroup(Group group) {
        return trailerHasGroup(group.getFieldTag());
    }

    /**
     * Converts the message into a simple XML format. This format is
     * probably not sufficient for production use, but it more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * To get names instead of tag number, use toXML(DataDictionary)
     * instead.
     *
     * @return an XML representation of the message.
     * @see #toXML(DataDictionary)
     */
    public String toXML() {
        return toXML(null);
    }

    /**
     * Converts the message into a simple XML format. This format is
     * probably not sufficient for production use, but it more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * @param dataDictionary
     * @return the XML representation of the message
     */
    public String toXML(DataDictionary dataDictionary) {
        try {
            final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .newDocument();
            final Element message = document.createElement("message");
            document.appendChild(message);
            toXMLFields(message, "header", header, dataDictionary);
            toXMLFields(message, "body", this, dataDictionary);
            toXMLFields(message, "trailer", trailer, dataDictionary);
            final DOMSource domSource = new DOMSource(document);
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final StreamResult streamResult = new StreamResult(out);
            final TransformerFactory tf = TransformerFactory.newInstance();
            final Transformer serializer = tf.newTransformer();
            serializer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.transform(domSource, streamResult);
            return out.toString();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void toXMLFields(Element message, String section, FieldMap fieldMap,
            DataDictionary dataDictionary) throws FieldNotFound {
        final Document document = message.getOwnerDocument();
        final Element fields = document.createElement(section);
        message.appendChild(fields);
        final Iterator<Field<?>> fieldItr = fieldMap.iterator();
        while (fieldItr.hasNext()) {
            final Field<?> field = fieldItr.next();
            final Element fieldElement = document.createElement("field");
            if (dataDictionary != null) {
                final String name = dataDictionary.getFieldName(field.getTag());
                if (name != null) {
                    fieldElement.setAttribute("name", name);
                }
                final String enumValue = dataDictionary.getValueName(field.getTag(), field
                        .getObject().toString());
                if (enumValue != null) {
                    fieldElement.setAttribute("enum", enumValue);
                }
            }
            fieldElement.setAttribute("tag", Integer.toString(field.getTag()));
            final CDATASection value = document.createCDATASection(field.getObject().toString());
            fieldElement.appendChild(value);
            fields.appendChild(fieldElement);
        }
        final Iterator<Integer> groupKeyItr = fieldMap.groupKeyIterator();
        while (groupKeyItr.hasNext()) {
            final int groupKey = (groupKeyItr.next()).intValue();
            final Element groupsElement = document.createElement("groups");
            fields.appendChild(groupsElement);
            if (dataDictionary != null) {
                final String name = dataDictionary.getFieldName(groupKey);
                if (name != null) {
                    groupsElement.setAttribute("name", name);
                }
            }
            groupsElement.setAttribute("tag", Integer.toString(groupKey));
            final List<Group> groups = fieldMap.getGroups(groupKey);
            final Iterator<Group> groupItr = groups.iterator();
            while (groupItr.hasNext()) {
                final Group group = groupItr.next();
                toXMLFields(groupsElement, "group", group, dataDictionary);
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
                final String msgType = header.getString(MsgType.FIELD);
                return MessageUtils.isAdminMessage(msgType);
            } catch (final FieldNotFound e) {
                // shouldn't happen
            }
        }
        return false;
    }

    public boolean isApp() {
        return !isAdmin();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && header.isEmpty() && trailer.isEmpty();
    }

    @Override
    public void clear() {
        super.clear();
        header.clear();
        trailer.clear();
    }

    public static class Header extends FieldMap {
        static final long serialVersionUID = -3193357271891865972L;
        private static final int[] EXCLUDED_HEADER_FIELDS = { BeginString.FIELD, BodyLength.FIELD,
                MsgType.FIELD };

        @Override
        protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, EXCLUDED_HEADER_FIELDS, postFields);
        }

    }

    public static class Trailer extends FieldMap {
        static final long serialVersionUID = -3193357271891865972L;
        private static final int[] TRAILER_FIELD_ORDER = { SignatureLength.FIELD, Signature.FIELD,
                CheckSum.FIELD };

        public Trailer() {
            super(TRAILER_FIELD_ORDER);
        }

        @Override
        protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, null, new int[] { CheckSum.FIELD });
        }
    }

    public void reverseRoute(Header header) throws FieldNotFound {
        this.header.removeField(BeginString.FIELD);
        this.header.removeField(SenderCompID.FIELD);
        this.header.removeField(SenderSubID.FIELD);
        this.header.removeField(SenderLocationID.FIELD);
        this.header.removeField(TargetCompID.FIELD);
        this.header.removeField(TargetSubID.FIELD);
        this.header.removeField(TargetLocationID.FIELD);

        if (header.isSetField(BeginString.FIELD)) {
            copyField(header, BeginString.FIELD, BeginString.FIELD);

            copyField(header, SenderCompID.FIELD, TargetCompID.FIELD);
            copyField(header, SenderSubID.FIELD, TargetSubID.FIELD);
            copyField(header, SenderLocationID.FIELD, TargetLocationID.FIELD);

            copyField(header, TargetCompID.FIELD, SenderCompID.FIELD);
            copyField(header, TargetSubID.FIELD, SenderSubID.FIELD);
            copyField(header, TargetLocationID.FIELD, SenderLocationID.FIELD);

            this.header.removeField(OnBehalfOfCompID.FIELD);
            this.header.removeField(OnBehalfOfSubID.FIELD);
            this.header.removeField(DeliverToCompID.FIELD);
            this.header.removeField(DeliverToSubID.FIELD);

            copyField(header, OnBehalfOfCompID.FIELD, DeliverToCompID.FIELD);
            copyField(header, OnBehalfOfSubID.FIELD, DeliverToSubID.FIELD);
            copyField(header, DeliverToCompID.FIELD, OnBehalfOfCompID.FIELD);
            copyField(header, DeliverToSubID.FIELD, OnBehalfOfSubID.FIELD);

            this.header.removeField(OnBehalfOfLocationID.FIELD);
            this.header.removeField(DeliverToLocationID.FIELD);

            if (header.getString(BeginString.FIELD).compareTo(FixVersions.BEGINSTRING_FIX41) >= 0) {
                copyField(header, OnBehalfOfLocationID.FIELD, DeliverToLocationID.FIELD);
                copyField(header, DeliverToLocationID.FIELD, OnBehalfOfLocationID.FIELD);
            }
        }
    }

    private void copyField(Header header, int fromField, int toField) throws FieldNotFound {
        if (header.isSetField(fromField)) {
            final String value = header.getString(fromField);
            if (value.length() > 0) {
                this.header.setString(toField, value);
            }
        }
    }

    void setSessionID(SessionID sessionID) {
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        optionallySetID(header, SenderSubID.FIELD, sessionID.getSenderSubID());
        optionallySetID(header, SenderLocationID.FIELD, sessionID.getSenderLocationID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        optionallySetID(header, TargetSubID.FIELD, sessionID.getTargetSubID());
        optionallySetID(header, TargetLocationID.FIELD, sessionID.getTargetLocationID());
    }

    private void optionallySetID(Header header, int field, String value) {
        if (!value.equals(SessionID.NOT_SET)) {
            header.setString(field, value);
        }
    }

    public void fromString(String messageData, DataDictionary dd, boolean doValidation)
            throws InvalidMessage {
        parse(messageData, dd, dd, doValidation);
    }

    public void fromString(String messageData, DataDictionary sessionDictionary,
            DataDictionary applicationDictionary, boolean doValidation) throws InvalidMessage {
        if (sessionDictionary.isAdminMessage(MessageUtils.getMessageType(messageData))) {
            applicationDictionary = sessionDictionary;
        }
        parse(messageData, sessionDictionary, applicationDictionary, doValidation);
    }

    void parse(String messageData, DataDictionary sessionDataDictionary,
            DataDictionary applicationDataDictionary, boolean doValidation) throws InvalidMessage {
        this.messageData = messageData;

        try {
            parseHeader(sessionDataDictionary, doValidation);
            parseBody(applicationDataDictionary, doValidation);
            parseTrailer(sessionDataDictionary);
            if (doValidation) {
                validateCheckSum(messageData);
            }
        } catch (final FieldException e) {
            exception = e;
        }
    }

    private void validateCheckSum(String messageData) throws InvalidMessage {
        try {
            // Body length is checked at the protocol layer
            final int checkSum = trailer.getInt(CheckSum.FIELD);
            if (checkSum != checkSum(messageData)) {
                // message will be ignored if checksum is wrong or missing
                throw new InvalidMessage("Expected CheckSum=" + checkSum(messageData) + ", Received CheckSum="
                        + checkSum + " in " + messageData);
            }
        } catch (final FieldNotFound e) {
            throw new InvalidMessage("Field not found: " + e.field + " in " + messageData);
        }
    }

    private void parseHeader(DataDictionary dd, boolean doValidation) throws InvalidMessage {
        final boolean validHeaderFieldOrder = isNextField(dd, header, BeginString.FIELD)
                && isNextField(dd, header, BodyLength.FIELD)
                && isNextField(dd, header, MsgType.FIELD);

        if (doValidation && !validHeaderFieldOrder) {
            // Invalid message preamble (first three fields) is a serious
            // condition and is handled differently from other message parsing errors.
            throw new InvalidMessage("Header fields out of order in " + messageData);
        }

        StringField field = extractField(dd, header);
        while (field != null && isHeaderField(field, dd)) {
            header.setField(field);

            if (dd != null && dd.isGroup(DataDictionary.HEADER_ID, field.getField())) {
                parseGroup(DataDictionary.HEADER_ID, field, dd, header);
            }

            field = extractField(dd, header);
        }
        pushBack(field);
    }

    private boolean isNextField(DataDictionary dd, Header fields, int tag) throws InvalidMessage {
        final StringField field = extractField(dd, header);
        if (field == null || field.getTag() != tag) {
            return false;
        }
        fields.setField(field);
        return true;
    }

    private String getMsgType() throws InvalidMessage {
        String res = null;
        try {
            res = header.getString(MsgType.FIELD);
        } catch (final FieldNotFound e) {
            throw new InvalidMessage(e.getMessage() + " in " + messageData);
        }
        return res;
    }

    private void parseBody(DataDictionary dd, boolean doValidation) throws InvalidMessage {
        StringField field = extractField(dd, this);
        while (field != null) {
            if (isTrailerField(field.getField())) {
                pushBack(field);
                return;
            }

            if (isHeaderField(field.getField())) {
                // An acceptance test requires the sequence number to
                // be available even if the related field is out of order
                setField(header, field);
                // Group case
                if (dd != null && dd.isGroup(DataDictionary.HEADER_ID, field.getField())) {
                    parseGroup(DataDictionary.HEADER_ID, field, dd, header);
                }
                if (doValidation && dd != null && dd.isCheckFieldsOutOfOrder()) throw new FieldException(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER,
                        field.getTag());
            } else {
                setField(this, field);
                // Group case
                if (dd != null && dd.isGroup(getMsgType(), field.getField())) {
                    parseGroup(getMsgType(), field, dd, this);
                }
            }


            field = extractField(dd, this);
        }
    }

    private void setField(FieldMap fields, StringField field) {
        if (fields.isSetField(field)) {
            throw new FieldException(SessionRejectReason.TAG_APPEARS_MORE_THAN_ONCE, field.getTag());
        }
        fields.setField(field);
    }

    private void parseGroup(String msgType, StringField field, DataDictionary dd, FieldMap parent)
            throws InvalidMessage {
        final DataDictionary.GroupInfo rg = dd.getGroup(msgType, field.getField());
        final DataDictionary groupDataDictionary = rg.getDataDictionary();
        final int[] fieldOrder = groupDataDictionary.getOrderedFields();
        int previousOffset = -1;
        final int groupCountTag = field.getField();
        final int declaredGroupCount = Integer.parseInt(field.getValue());
        parent.setField(groupCountTag, field);
        final int firstField = rg.getDelimeterField();
        boolean firstFieldFound = false;
        Group group = null;
        boolean inGroupParse = true;
        while (inGroupParse) {
            field = extractField(group, dd, parent);
            if (field.getTag() == firstField) {
                if (group != null) {
                    parent.addGroupRef(group);
                }
                group = new Group(groupCountTag, firstField, groupDataDictionary.getOrderedFields());
                group.setField(field);
                firstFieldFound = true;
                previousOffset = -1;
            } else {
                if (groupDataDictionary.isGroup(msgType, field.getField())) {
                    if (firstFieldFound) {
                        parseGroup(msgType, field, groupDataDictionary, group);
                    } else {
                        throw new InvalidMessage("The group " + groupCountTag
                                + " must set the delimiter field " + firstField + " in " + messageData);
                    }
                } else {
                    if (groupDataDictionary.isField(field.getTag())) {
                        if (!firstFieldFound) {
                            throw new FieldException(
                                    SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, field
                                            .getTag());
                        }

                        if (fieldOrder != null && dd.isCheckUnorderedGroupFields()) {
                            final int offset = index(fieldOrder, field.getTag());
                            if (offset >= 0) {
                                if (offset > previousOffset) {
                                    previousOffset = offset;
                                } else {
                                    throw new FieldException(
                                            SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER,
                                            field.getTag());
                                }
                            }
                        }
                        if (group != null) {
                        group.setField(field);
                        }
                    } else {
                        if (group != null) {
                            parent.addGroupRef(group);
                        }
                        pushBack(field);
                        inGroupParse = false;
                    }
                }
            }
        }
        // For later validation that the group size matches the parsed group count
        parent.setGroupCount(groupCountTag, declaredGroupCount);
    }

    private int index(int[] fieldOrder, int tag) {
        for (int i = 0; i < fieldOrder.length; i++) {
            if (fieldOrder[i] == tag) {
                return i;
            }
        }
        return -1;
    }

    private void parseTrailer(DataDictionary dd) throws InvalidMessage {
        StringField field = extractField(dd, trailer);
        while (field != null) {
            if (!isTrailerField(field, dd)) {
                throw new FieldException(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER,
                        field.getTag());
            }
            trailer.setField(field);
            field = extractField(dd, trailer);
        }
    }

    static boolean isHeaderField(Field<?> field, DataDictionary dd) {
        return isHeaderField(field.getField())
                || (dd != null && dd.isHeaderField(field.getField()));
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
        case ApplVerID.FIELD:
        case CstmApplVerID.FIELD:
        case NoHops.FIELD:
            return true;
        default:
            return false;
        }
    }

    static boolean isTrailerField(Field<?> field, DataDictionary dd) {
        return isTrailerField(field.getField())
                || (dd != null && dd.isTrailerField(field.getField()));
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

    private StringField extractField(DataDictionary dataDictionary, FieldMap fields)
            throws InvalidMessage {
        return extractField(null, dataDictionary, fields);
    }

    private StringField extractField(Group group, DataDictionary dataDictionary, FieldMap fields)
            throws InvalidMessage {
        if (pushedBackField != null) {
            final StringField f = pushedBackField;
            pushedBackField = null;
            return f;
        }

        if (position >= messageData.length()) {
            return null;
        }

        final int equalsOffset = messageData.indexOf('=', position);
        if (equalsOffset == -1) {
            throw new InvalidMessage("Equal sign not found in field" + " in " + messageData);
        }

        int tag = -1;
        try {
            tag = Integer.parseInt(messageData.substring(position, equalsOffset));
        } catch (final NumberFormatException e) {
            position = messageData.indexOf('\001', position + 1) + 1;
            throw new InvalidMessage("Bad tag format: " + e.getMessage() + " in " + messageData);
        }

        int sohOffset = messageData.indexOf('\001', equalsOffset + 1);
        if (sohOffset == -1) {
            throw new InvalidMessage("SOH not found at end of field: " + tag + " in " + messageData);
        }

        if (dataDictionary != null && dataDictionary.isDataField(tag)) {
            /* Assume length field is 1 less. */
            int lengthField = tag - 1;
            /* Special case for Signature which violates above assumption. */
            if (tag == 89) {
                lengthField = 93;
            }
            int fieldLength;
            try {
                if (group == null) {
                    fieldLength = fields.getInt(lengthField);
                } else {
                    fieldLength = group.getInt(lengthField);
                }
            } catch (final FieldNotFound e1) {
                throw new InvalidMessage("Tag " + e1.field + " not found in " + messageData);
            }
            sohOffset = equalsOffset + 1 + fieldLength;
        }

        position = sohOffset + 1;
        return new StringField(tag, messageData.substring(equalsOffset + 1, sohOffset));
    }

    /**
     * Queries message structural validity.
     *
     * @return flag indicating whether the message has a valid structure
     */
    synchronized boolean hasValidStructure() {
        return exception == null;
    }

    public synchronized FieldException getException() {
        return exception;
    }

    /**
     * Returns the first invalid tag, which is all that can be reported
     * in the resulting FIX reject message.
     *
     * @return the first invalid tag
     */
    synchronized int getInvalidTag() {
        return exception != null ? exception.getField() : 0;
    }

    /**
     * Returns the msg type specified in a FIX message string.
     * @param message the FIX message string
     * @return the message type
     * @throws MessageParseError (QF JNI compatibility)
     */
    public static MsgType identifyType(String message) throws MessageParseError {
        try {
            return new MsgType(MessageUtils.getMessageType(message));
        } catch (final InvalidMessage e) {
            throw new MessageParseError(e.getMessage(), e);
        }
    }

}