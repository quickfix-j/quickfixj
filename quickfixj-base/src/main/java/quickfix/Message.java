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

import org.quickfixj.CharsetSupport;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import quickfix.field.ApplExtID;
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
import quickfix.field.converter.IntConverter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.util.List;

/**
 * Represents a FIX message.
 */
public class Message extends FieldMap {

    static final long serialVersionUID = -3193357271891865972L;

    protected Header header;
    protected Trailer trailer = new Trailer();

    private volatile FieldException exception;

    public Message() {
        initializeHeader();
    }

    protected Message(int[] fieldOrder) {
        super(fieldOrder);
        initializeHeader();
    }

    public Message(String string) throws InvalidMessage {
        initializeHeader();
        fromString(string, null, null, true, true);
    }

    public Message(String string, boolean validate) throws InvalidMessage {
        initializeHeader();
        fromString(string, null, null, validate, true);
    }

    public Message(String string, DataDictionary dd) throws InvalidMessage {
        initializeHeader();
        fromString(string, dd, new ValidationSettings(), true, true);
    }

    public Message(String string, DataDictionary dd, ValidationSettings dds) throws InvalidMessage {
        initializeHeader();
        fromString(string, dd, dds, true, true);
    }

    public Message(String string, DataDictionary dd, ValidationSettings dds, boolean validate) throws InvalidMessage {
        initializeHeader();
        fromString(string, dd, dds, validate, true);
    }
    
    public Message(String string, DataDictionary sessionDictionary, DataDictionary applicationDictionary, ValidationSettings validationSettings, boolean validate) throws InvalidMessage {
        initializeHeader();
        fromString(string, sessionDictionary, applicationDictionary, validationSettings, validate, true);
    }

    private void initializeHeader() {
        header = newHeader();
    }

    protected Header newHeader() {
        return new Header();
    }

    public static boolean InitializeXML(String url) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object clone() {
        try {
            final Message message = getClass().newInstance();
            return cloneTo(message);
        } catch (final InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Object cloneTo(Message message) {
        message.initializeFrom(this);
        message.header.initializeFrom(getHeader());
        message.trailer.initializeFrom(getTrailer());
        return message;
    }

    private static final class Context {
        private final BodyLength bodyLength = new BodyLength(100);
        private final CheckSum checkSum = new CheckSum("000");
        private final StringBuilder stringBuilder = new StringBuilder(1024);
    }

    private static final ThreadLocal<Context> stringContexts = new ThreadLocal<Context>() {
        @Override
        protected Context initialValue() {
            return new Context();
        }
    };

    /**
     * Do not call this method concurrently while modifying the contents of the message.
     * This is likely to produce unexpected results or will fail with a ConcurrentModificationException
     * since FieldMap.calculateString() is iterating over the TreeMap of fields.
     * 
     * Use toRawString() to get the raw message data.
     * 
     * @return Message as String with calculated body length and checksum.
     */
    @Override
    public String toString() {
        Context context = stringContexts.get();
        if (CharsetSupport.isStringEquivalent()) { // length & checksum can easily be calculated after message is built
            header.setField(context.bodyLength);
            trailer.setField(context.checkSum);
        } else {
            header.setInt(BodyLength.FIELD, bodyLength());
            trailer.setString(CheckSum.FIELD, checksum());
        }
        StringBuilder stringBuilder = context.stringBuilder;
        try {
            header.calculateString(stringBuilder, null, null);
            calculateString(stringBuilder, null, null);
            trailer.calculateString(stringBuilder, null, null);
            if (CharsetSupport.isStringEquivalent()) {
                setBodyLength(stringBuilder);
                setChecksum(stringBuilder);
            }
            return stringBuilder.toString();
        } finally {
            stringBuilder.setLength(0);
        }
    }

    private static final String SOH = String.valueOf('\001');
    private static final String BODY_LENGTH_FIELD = SOH + String.valueOf(BodyLength.FIELD) + '=';
    private static final String CHECKSUM_FIELD = SOH + String.valueOf(CheckSum.FIELD) + '=';

    private static void setBodyLength(StringBuilder stringBuilder) {
        int bodyLengthIndex = stringBuilder.indexOf(BODY_LENGTH_FIELD, 0);
        int sohIndex = stringBuilder.indexOf(SOH, bodyLengthIndex + 1);
        int checkSumIndex = stringBuilder.lastIndexOf(CHECKSUM_FIELD);
        int length = checkSumIndex - sohIndex;
        bodyLengthIndex += BODY_LENGTH_FIELD.length();
        stringBuilder.replace(bodyLengthIndex, bodyLengthIndex + 3, NumbersCache.get(length));
    }

    private static void setChecksum(StringBuilder stringBuilder) {
        int checkSumIndex = stringBuilder.lastIndexOf(CHECKSUM_FIELD);
        int checkSum = 0;
        for(int i = checkSumIndex; i-- != 0;)
            checkSum += stringBuilder.charAt(i);
        String checkSumValue = NumbersCache.get((checkSum + 1) & 0xFF); // better than sum % 256 since it avoids overflow issues
        checkSumIndex += CHECKSUM_FIELD.length();
        stringBuilder.replace(checkSumIndex + (3 - checkSumValue.length()), checkSumIndex + 3, checkSumValue);
    }

    /**
     * Return the raw message data as it was passed to the Message class.
     * 
     * This is only available after Message has been parsed via constructor or Message.fromString().
     * Otherwise this method will return NULL.
     * 
     * This method neither does change fields nor calculate body length or checksum.
     * Use toString() for that purpose.
     * 
     * @return Message as String without recalculating body length and checksum.
     */
    public String toRawString() {
        return messageData;
    }

    public int bodyLength() {
        return header.calculateLength() + calculateLength() + trailer.calculateLength();
    }

    private static final ThreadLocal<DecimalFormat> checksumFormat = ThreadLocal.withInitial(() -> new DecimalFormat("000"));

    private String checksum() {
        return checksumFormat.get().format(
            (header.calculateChecksum() + calculateChecksum() + trailer.calculateChecksum()) & 0xFF);
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
     * probably not sufficient for production use, but is more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * To get names instead of tag number, use toXML(DataDictionary)
     * instead.
     *
     * @return an XML representation of the message.
     * @see #toXML(DataDictionary)
     */
    public String toXML() {
        return toXML(false);
    }

    /**
     * Converts the message into a simple XML format. This format is
     * probably not sufficient for production use, but is more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * To get names instead of tag number, use toXML(DataDictionary, boolean)
     * instead.
     *
     * @param indent specifies whether the Transformer may add additional
     *               whitespace when outputting the result tree
     * @return an XML representation of the message.
     * @see #toXML(DataDictionary, boolean)
     */
    public String toXML(boolean indent) {
        return toXML(null, indent);
    }

    /**
     * Converts the message into a simple XML format. This format is
     * probably not sufficient for production use, but is more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * @param dataDictionary
     * @return the XML representation of the message
     */
    public String toXML(DataDictionary dataDictionary) {
        return toXML(dataDictionary, false);
    }

    /**
     * Converts the message into a simple XML format. This format is
     * probably not sufficient for production use, but is more intended
     * for diagnostics and debugging. THIS IS NOT FIXML.
     *
     * @param indent specifies whether the Transformer may add additional
     *               whitespace when outputting the result tree
     * @param dataDictionary
     * @return the XML representation of the message
     */
    public String toXML(DataDictionary dataDictionary, boolean indent) {
        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final Document document = factory.newDocumentBuilder()
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
            if (indent) {
                serializer.setOutputProperty(OutputKeys.INDENT, "yes");
                serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            } else {
                serializer.setOutputProperty(OutputKeys.INDENT, "no");
            }
            serializer.transform(domSource, streamResult);
            return out.toString();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void toXMLFields(Element message, String section, FieldMap fieldMap,
            DataDictionary dataDictionary) {
        final Document document = message.getOwnerDocument();
        final Element fields = document.createElement(section);
        message.appendChild(fields);
        for (final Field<?> field : fieldMap) {
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
        for (final int groupKey : fieldMap.groupKeys()) {
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
            for (Group group : groups) {
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
        return super.isEmpty() && header.isEmpty() && trailer.isEmpty() && position == 0;
    }

    @Override
    public void clear() {
        super.clear();
        header.clear();
        trailer.clear();
        position = 0;
    }

    @Override
    public void reset() {
        super.reset();
        this.position = 0;
    }

    public static class Header extends FieldMap {
        static final long serialVersionUID = -3193357271891865972L;
        private static final int[] EXCLUDED_HEADER_FIELDS = { BeginString.FIELD, BodyLength.FIELD,
                MsgType.FIELD };

        public Header() {
            super();
        }

        public Header(int[] fieldOrder) {
            super(fieldOrder);
        }

        @Override
        protected void calculateString(StringBuilder buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, EXCLUDED_HEADER_FIELDS, postFields);
        }
    }

    public static class Trailer extends FieldMap {
        static final long serialVersionUID = -3193357271891865972L;
        private static final int[] TRAILER_FIELD_ORDER = { SignatureLength.FIELD, Signature.FIELD,
                CheckSum.FIELD };
        private static final int[] TRAILER_POST_FIELDS = { CheckSum.FIELD };

        public Trailer() {
            super(TRAILER_FIELD_ORDER);
        }

        public Trailer(int[] fieldOrder) {
            super(fieldOrder);
        }

        @Override
        protected void calculateString(StringBuilder buffer, int[] excludedFields, int[] postFields) {
            super.calculateString(buffer, null, TRAILER_POST_FIELDS);
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

    public void fromString(String messageData, DataDictionary dd, ValidationSettings validationSettings, boolean doValidation)
            throws InvalidMessage {
        parse(messageData, dd, dd, validationSettings, doValidation, true);
    }

    public void fromString(String messageData, DataDictionary dd, ValidationSettings dds, boolean doValidation,
                           boolean validateChecksum) throws InvalidMessage {
        parse(messageData, dd, dd, dds, doValidation, validateChecksum);
    }

    public void fromString(String messageData, DataDictionary sessionDictionary,
                           DataDictionary applicationDictionary, ValidationSettings validationSettings, boolean doValidation) throws InvalidMessage {
        fromString(messageData, sessionDictionary, applicationDictionary, validationSettings, doValidation, true);
    }

    public void fromString(String messageData, DataDictionary sessionDictionary,
                           DataDictionary applicationDictionary, ValidationSettings validationSettings, boolean doValidation, boolean validateChecksum)
            throws InvalidMessage {
        if (sessionDictionary.isAdminMessage(MessageUtils.getMessageType(messageData))) {
            applicationDictionary = sessionDictionary;
        }
        if (validationSettings == null) {
            validationSettings = new ValidationSettings();
        }
        parse(messageData, sessionDictionary, applicationDictionary, validationSettings, doValidation, validateChecksum);
    }

    void parse(String messageData, DataDictionary sessionDataDictionary,
               DataDictionary applicationDataDictionary, ValidationSettings validationSettings, boolean doValidation,
               boolean validateChecksum) throws InvalidMessage {
        this.messageData = messageData;

        try {
            parseHeader(sessionDataDictionary, validationSettings, doValidation);
            parseBody(sessionDataDictionary, applicationDataDictionary, validationSettings, doValidation);
            parseTrailer(sessionDataDictionary);
            if (doValidation && validateChecksum) {
                validateCheckSum(messageData);
            }
        } catch (final FieldException e) {
            exception = e;
        }
    }

    private void validateCheckSum(String messageData) throws InvalidMessage {
        try {
            // Body length is checked at the protocol layer
            final int checksum = trailer.getInt(CheckSum.FIELD);
            if (checksum != MessageUtils.checksum(messageData)) {
                // message will be ignored if checksum is wrong or missing
                throw MessageUtils.newInvalidMessageException("Expected CheckSum=" + MessageUtils.checksum(messageData)
                        + ", Received CheckSum=" + checksum + " in " + messageData, this);
            }
        } catch (final FieldNotFound e) {
            throw MessageUtils.newInvalidMessageException("Field not found: " + e.field + " in " + messageData, this);
        }
    }

    private void parseHeader(DataDictionary dd, ValidationSettings dds, boolean doValidation) throws InvalidMessage {
        if (doValidation) {
            final boolean validHeaderFieldOrder = isNextField(dd, header, BeginString.FIELD)
                    && isNextField(dd, header, BodyLength.FIELD)
                    && isNextField(dd, header, MsgType.FIELD);
            if (!validHeaderFieldOrder) {
                // Invalid message preamble (first three fields) is a serious
                // condition and is handled differently from other message parsing errors.
                throw MessageUtils.newInvalidMessageException("Header fields out of order in " + messageData, MessageUtils.getMinimalMessage(messageData));
            }
        }

        StringField field = extractField(dd, header);
        while (field != null && isHeaderField(field, dd)) {
            header.setField(field);

            if (dd != null && dd.isGroup(DataDictionary.HEADER_ID, field.getField())) {
                parseGroup(DataDictionary.HEADER_ID, field, dd, dd, dds, header, doValidation);
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
        try {
            return header.getString(MsgType.FIELD);
        } catch (final FieldNotFound e) {
            throw MessageUtils.newInvalidMessageException(e.getMessage() + " in " + messageData, this);
        }
    }

    private void parseBody(DataDictionary sessionDataDictionary, DataDictionary applicationDataDictionary, ValidationSettings dds, boolean doValidation) throws InvalidMessage {
        StringField field = extractField(applicationDataDictionary, this);
        while (field != null) {
            if (isTrailerField(field.getField())) {
                pushBack(field);
                return;
            }

            if (isHeaderField(field, sessionDataDictionary)) {
                // An acceptance test requires the sequence number to
                // be available even if the related field is out of order
                setField(header, field);
                // Group case
                if (sessionDataDictionary != null && sessionDataDictionary.isGroup(DataDictionary.HEADER_ID, field.getField())) {
                    parseGroup(DataDictionary.HEADER_ID, field, sessionDataDictionary, sessionDataDictionary, dds, header, doValidation);
                }
                if (doValidation && sessionDataDictionary != null && dds.isCheckFieldsOutOfOrder()) {
                    throw new FieldException(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER,
                            field.getTag());
                }
            } else {
                setField(this, field);
                // Group case
                if (applicationDataDictionary != null && applicationDataDictionary.isGroup(getMsgType(), field.getField())) {
                    parseGroup(getMsgType(), field, applicationDataDictionary, applicationDataDictionary, dds, this, doValidation);
                }
            }

            field = extractField(applicationDataDictionary, this);
        }
    }

    private void setField(FieldMap fields, StringField field) {
        if (fields.isSetField(field)) {
            throw new FieldException(SessionRejectReason.TAG_APPEARS_MORE_THAN_ONCE, field.getTag());
        }
        fields.setField(field);
    }

    private void parseGroup(String msgType, StringField field, DataDictionary dd, DataDictionary parentDD, ValidationSettings dds, FieldMap parent, boolean doValidation)
            throws InvalidMessage {
        final DataDictionary.GroupInfo rg = dd.getGroup(msgType, field.getField());
        final DataDictionary groupDataDictionary = rg.getDataDictionary();
        final int[] fieldOrder = groupDataDictionary.getOrderedFields();
        int previousOffset = -1;
        final int groupCountTag = field.getField();
        // QFJ-533
        int declaredGroupCount = 0;
        try {
            declaredGroupCount = IntConverter.convert(field.getValue());
        } catch (final FieldConvertError e) {
            throw MessageUtils.newInvalidMessageException("Repeating group count requires an Integer but found '" + field.getValue() + "' in " + messageData, this);
        }
        parent.setField(groupCountTag, field);
        final int firstField = rg.getDelimiterField();
        Group group = null;
        boolean inGroupParse = true;
        while (inGroupParse) {
            field = extractField(dd, group != null ? group : parent);
            if (field == null) {
                // QFJ-760: stop parsing since current position is greater than message length
                break;
            }
            int tag = field.getTag();
            if (tag == firstField) {
                addGroupRefToParent(group, parent);
                group = new Group(groupCountTag, firstField, groupDataDictionary.getOrderedFields());
                group.setField(field);
                previousOffset = -1;
                // QFJ-742
                if (groupDataDictionary.isGroup(msgType, tag)) {
                    parseGroup(msgType, field, groupDataDictionary, parentDD, dds, group, doValidation);
                }
            } else if (groupDataDictionary.isGroup(msgType, tag)) {
                if (group != null) {
                    parseGroup(msgType, field, groupDataDictionary, parentDD, dds, group, doValidation);
                } else {
                    // QFJ-934: message should be rejected and not ignored when first field not found
                    throw newFieldExceptionMissingDelimiter(groupCountTag, firstField, tag);
                }
            } else if (groupDataDictionary.isField(tag)) {
                if (group != null) {
                    if (fieldOrder != null && dds.isCheckUnorderedGroupFields()) {
                        final int offset = indexOf(tag, fieldOrder);
                        if (offset > -1) {
                            if (offset <= previousOffset) {
                                // QFJ-792: add what we've already got and leave the rest to the validation (if enabled)
                                group.setField(field);
                                addGroupRefToParent(group, parent);
                                throw new FieldException(
                                        SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, tag);
                            }
                            previousOffset = offset;
                        }
                    }
                    group.setField(field);
                } else {
                    throw newFieldExceptionMissingDelimiter(groupCountTag, firstField, tag);
                }
            } else {
                // QFJ-169/QFJ-791: handle unknown repeating group fields in the body
                if (!isTrailerField(tag) && !(DataDictionary.HEADER_ID.equals(msgType) || isHeaderField(field, dd))) {
                    if (checkFieldValidation(parent, parentDD, dds, field, msgType, doValidation, group)) {
                        continue;
                    }
                }
                pushBack(field);
                inGroupParse = false;
            }
        }
        // add what we've already got and leave the rest to the validation (if enabled)
        addGroupRefToParent(group, parent);
        // For later validation that the group size matches the parsed group count
        parent.setGroupCount(groupCountTag, declaredGroupCount);
    }

    private void addGroupRefToParent(Group group, FieldMap parent) {
        if (group != null) {
            parent.addGroupRef(group);
        }
    }

    private FieldException newFieldExceptionMissingDelimiter(final int groupCountTag, final int firstField, int tag) throws FieldException {
        return new FieldException(
                SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, "The group " + groupCountTag
                + " must set the delimiter field " + firstField, tag);
    }

    private boolean checkFieldValidation(FieldMap parent, DataDictionary parentDD, ValidationSettings dds, StringField field, String msgType, boolean doValidation, Group group) throws FieldException {
        boolean isField = (parent instanceof Group) ? parentDD.isField(field.getTag()) : parentDD.isMsgField(msgType, field.getTag());
        if (!isField) {
            if (doValidation) {
                boolean fail = parentDD.checkFieldFailure(dds, field.getTag(), false);
                if (fail) {
                    throw new FieldException(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE, field.getTag());
                }
            }
            if (group == null) {
                throw new FieldException(
                        SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, field.getTag());
            }
            group.setField(field);
            return true;
        }
        return false;
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
        case ApplExtID.FIELD:
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
    private boolean isGarbled = false;

    public void pushBack(StringField field) {
        pushedBackField = field;
    }

    private StringField extractField(DataDictionary dataDictionary, FieldMap fields)
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
            throw MessageUtils.newInvalidMessageException("Equal sign not found in field in " + messageData, this);
        }

        int tag;
        try {
            tag = IntConverter.convert(messageData.substring(position, equalsOffset));
        } catch (final FieldConvertError e) {
            position = messageData.indexOf('\001', position + 1) + 1;
            throw MessageUtils.newInvalidMessageException("Bad tag format: " + e.getMessage() + " in " + messageData, this);
        }

        int sohOffset = messageData.indexOf('\001', equalsOffset + 1);
        if (sohOffset == -1) {
            throw MessageUtils.newInvalidMessageException("SOH not found at end of field: " + tag + " in " + messageData, this);
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
                fieldLength = fields.getInt(lengthField);
            } catch (final FieldNotFound e) {
                throw MessageUtils.newInvalidMessageException("Did not find length field " + e.field + " required to parse data field " + tag + " in " + messageData, this);
            }

            // since length is in bytes but data is a string, and it may also contain an SOH,
            // we find the real field-ending SOH by checking the encoded bytes length
            // (we avoid re-encoding when the chars length equals the bytes length, e.g. ASCII text,
            // by assuming the chars length is always smaller than the encoded bytes length)
            while (sohOffset - equalsOffset - 1 < fieldLength
                    && messageData.substring(equalsOffset + 1, sohOffset).getBytes(CharsetSupport.getCharsetInstance()).length < fieldLength) {
                sohOffset = messageData.indexOf('\001', sohOffset + 1);
                if (sohOffset == -1) {
                    throw MessageUtils.newInvalidMessageException("SOH not found at end of field: " + tag + " in " + messageData, this);
                }
            }
        }

        position = sohOffset + 1;
        return new StringField(tag, messageData.substring(equalsOffset + 1, sohOffset));
    }

    /**
     * Queries message structural validity.
     *
     * @return flag indicating whether the message has a valid structure
     */
    boolean hasValidStructure() {
        return exception == null;
    }

    public FieldException getException() {
        return exception;
    }

    /**
     * Returns the first invalid tag, which is all that can be reported
     * in the resulting FIX reject message.
     *
     * @return the first invalid tag
     */
    int getInvalidTag() {
        return exception != null ? exception.getField() : 0;
    }

    /**
     * Returns the msg type specified in a FIX message string.
     *
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

    boolean isGarbled() {
        return isGarbled;
    }
    
    void setGarbled(boolean isGarbled) {
        this.isGarbled = isGarbled;
    }

}
