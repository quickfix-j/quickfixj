//Added by FlexTrade

package quickfix;

/**
 * Provide the message metadata for various versions of FIX.
 */
public class DataDictionaryProxy extends DataDictionary {

	private DataDictionary underlyingDictionary;

	public DataDictionaryProxy(DataDictionary underlyingDictionary)
			throws ConfigError {
		this.underlyingDictionary = underlyingDictionary;
	}

	@Override
	public final String toString() {
		return "DictionaryProxy of " + underlyingDictionary.toString();
	}

	@Override
	public DataDictionary getUnderlyingDictionary() {
		return underlyingDictionary.getUnderlyingDictionary();
	}

	public void setUnderlyingDictionary(DataDictionary dataDictionary) {
		this.underlyingDictionary = dataDictionary;
	}

	@Override
	public String getVersion() {
		return underlyingDictionary.getVersion();
	}

    @Override
    public String getFullVersion() {
        return underlyingDictionary.getFullVersion();
    }

    @Override
    public String getMajorVersion() {
        return underlyingDictionary.getMajorVersion();
    }

    @Override
    public int getMinorVersion() {
        return underlyingDictionary.getMinorVersion();
    }

    @Override
    public int getServicePack() {
        return underlyingDictionary.getServicePack();
    }

    @Override
    public int getExtensionPack() {
        return underlyingDictionary.getExtensionPack();
    }

    @Override
	public String getFieldName(int field) {
		return underlyingDictionary.getFieldName(field);
	}

    /**
     * Get the value, if any, for an enumerated field value.
     *
     * @param field
     *            the tag
     * @param value
     *            the value
     * @return the value's name
     */
    @Override
    public String getValue(int field, String value) {
        return underlyingDictionary.getValue(field, value);
    }


	/**
	 * Get the value name, if any, for an enumerated field value.
	 *
	 * @param field
	 *            the tag
	 * @param value
	 *            the value
	 * @return the value's name
	 */
	@Override
	public String getValueName(int field, String value) {
		return underlyingDictionary.getValueName(field, value);
	}

	/**
	 * Predicate for determining if a tag is a defined field.
	 *
	 * @param field
	 *            the tag
	 * @return true if the field is defined, false otherwise
	 */
	@Override
	public boolean isField(int field) {
		return underlyingDictionary.isField(field);
	}

	/**
	 * Return the message type for the specified name.
	 *
	 * @param msgName
	 *            The message name.
	 * @return the message type
	 */
	@Override
	public String getMsgType(String msgName) {
		return underlyingDictionary.getMsgType(msgName);
	}

	/**
	 * Predicate for determining if message type is valid for a specified FIX
	 * version.
	 *
	 * @param msgType
	 *            the message type value
	 * @return true if the message type if defined, false otherwise
	 */
	@Override
	public boolean isMsgType(String msgType) {
		return underlyingDictionary.isMsgType(msgType);
	}

	/**
	 * Predicate for determining if a message is in the admin category.
	 *
	 * @param msgType
	 *            the messageType
	 * @return true, if the msgType is a AdminMessage false, if the msgType is a
	 *         ApplicationMessage
	 */
	@Override
	public boolean isAdminMessage(String msgType) {
		return underlyingDictionary.isAdminMessage(msgType);
	}

	/**
	 * Predicate for determining if a message is in the app category.
	 *
	 * @param msgType
	 *            the messageType
	 * @return true, if the msgType is a ApplicationMessage false, if the
	 *         msgType is a AdminMessage
	 */
	@Override
	public boolean isAppMessage(String msgType) {
		return underlyingDictionary.isAppMessage(msgType);
	}

	/**
	 * Predicate for determining if a field is valid for a given message type.
	 *
	 * @param msgType
	 *            the message type
	 * @param field
	 *            the tag
	 * @return true if field is defined for message, false otherwise.
	 */
	@Override
	public boolean isMsgField(String msgType, int field) {
		return underlyingDictionary.isMsgField(msgType, field);
	}

	/**
	 * Predicate for determining if field is a header field.
	 *
	 * @param field
	 *            the tag
	 * @return true if field is a header field, false otherwise.
	 */
	@Override
	public boolean isHeaderField(int field) {
		return underlyingDictionary.isHeaderField(field);
	}

	/**
	 * Predicate for determining if field is a trailer field.
	 *
	 * @param field
	 *            the tag
	 * @return true if field is a trailer field, false otherwise.
	 */
	@Override
	public boolean isTrailerField(int field) {
		return underlyingDictionary.isTrailerField(field);
	}

	/**
	 * Get the field type for a field.
	 *
	 * @param field
	 *            a tag
	 * @return the field type
	 */
	@Override
	public FieldType getFieldType(int field) {
		return underlyingDictionary.getFieldType(field);
	}

	/**
	 * Get the field tag given a field name.
	 *
	 * @param name
	 *            the field name
	 * @return the tag
	 */
	@Override
	public int getFieldTag(String name) {
		return underlyingDictionary.getFieldTag(name);
	}

	/**
	 * Predicate for determining if a field is required for a message type
	 *
	 * @param msgType
	 *            the message type
	 * @param field
	 *            the tag
	 * @return true if field is required, false otherwise
	 */
	@Override
	public boolean isRequiredField(String msgType, int field) {
		return underlyingDictionary.isRequiredField(msgType, field);
	}

	/**
	 * Predicate for determining if a header field is a required field
	 *
	 * @param field
	 *            the tag
	 * @return true if field s required, false otherwise
	 */
	@Override
	public boolean isRequiredHeaderField(int field) {
		return underlyingDictionary.isRequiredHeaderField(field);
	}

	/**
	 * Predicate for determining if a trailer field is a required field
	 *
	 * @param field
	 *            the tag
	 * @return true if field s required, false otherwise
	 */
	@Override
	public boolean isRequiredTrailerField(int field) {
		return underlyingDictionary.isRequiredTrailerField(field);
	}

	/**
	 * Predicate for determining if a field has enumerated values.
	 *
	 * @param field
	 *            the tag
	 * @return true if field is enumerated, false otherwise
	 */
	public boolean hasFieldValue(int field) {
		return underlyingDictionary.hasFieldValue(field);
	}

	/**
	 * Predicate for determining if a field value is valid
	 *
	 * @param field
	 *            the tag
	 * @param value
	 *            a possible field value
	 * @return true if field value is valid, false otherwise
	 */
	@Override
	public boolean isFieldValue(int field, String value) {
		return underlyingDictionary.isFieldValue(field, value);
	}

	/**
	 * Predicate for determining if a field is a group count field for a message
	 * type.
	 *
	 * @param msg
	 *            the message type
	 * @param field
	 *            the tag
	 * @return true if field starts a repeating group, false otherwise
	 */
	@Override
	public boolean isGroup(String msg, int field) {
		return underlyingDictionary.isGroup(msg, field);
	}

	/**
	 * Predicate for determining if a field is a header group count field
	 *
	 * @param field
	 *            the tag
	 * @return true if field starts a repeating group, false otherwise
	 */
	@Override
	public boolean isHeaderGroup(int field) {
		return underlyingDictionary.isHeaderGroup(field);
	}

	/**
	 * Get repeating group metadata.
	 *
	 * @param msg
	 *            the message type
	 * @param field
	 *            the tag
	 * @return an object containing group-related metadata
	 */
	@Override
	public DataDictionary.GroupInfo getGroup(String msg, int field) {
		return underlyingDictionary.getGroup(msg, field);
	}

	/**
	 * Predicate for determining if a field is a FIX raw data field.
	 *
	 * @param field
	 *            the tag
	 * @return true if field is a raw data field, false otherwise
	 */
	@Override
	public boolean isDataField(int field) {
		return underlyingDictionary.isDataField(field);
	}

	/**
	 * Validate a mesasge, including the header and trailer fields.
	 *
	 * @param message
	 *            the message
	 * @throws IncorrectTagValue
	 *             if a field value is not valid
	 * @throws FieldNotFound
	 *             if a field cannot be found
	 * @throws IncorrectDataFormat
	 */
	@Override
	public void validate(Message message, ValidationSettings validationSettings) throws IncorrectTagValue,
			FieldNotFound, IncorrectDataFormat {
		underlyingDictionary.validate(message, validationSettings);
	}

	/**
	 * Validate the message body, with header and trailer fields being validated
	 * conditionally.
	 *
	 * @param message
	 *            the message
	 * @param bodyOnly
	 *            whether to validate just the message body, or to validate the
	 *            header and trailer sections as well.
	 * @throws IncorrectTagValue
	 *             if a field value is not valid
	 * @throws FieldNotFound
	 *             if a field cannot be found
	 * @throws IncorrectDataFormat
	 */
	@Override
	public void validate(Message message, boolean bodyOnly, ValidationSettings validationSettings)
			throws IncorrectTagValue, FieldNotFound, IncorrectDataFormat {
		underlyingDictionary.validate(message, bodyOnly, validationSettings);
	}

	// / Check if field tag number is defined in spec.
	@Override
	public void checkValidTagNumber(Field<?> field) {
		underlyingDictionary.checkValidTagNumber(field);
	}

	// / Check if field tag is defined for message or group
	@Override
	public void checkField(ValidationSettings validationSettings, Field<?> field, String msgType, boolean message) {
		underlyingDictionary.checkField(validationSettings, field, msgType, message);
	}

	@Override
	public boolean checkFieldFailure(ValidationSettings validationSettings, int field, boolean messageField) {
		return underlyingDictionary.checkFieldFailure(validationSettings, field, messageField);
	}

	// / Check if a message has all required fields.
	@Override
	public void checkHasRequired(FieldMap header, FieldMap body, FieldMap trailer,
			String msgType, boolean bodyOnly) {
		underlyingDictionary.checkHasRequired(header, body, trailer, msgType,
				bodyOnly);
	}

	@Override
	public int getNumMessageCategories() {
		return underlyingDictionary.getNumMessageCategories();
	}

	@Override
	public int[] getOrderedFields() {
		return underlyingDictionary.getOrderedFields();
	}

	/**
	 * Returns the required ordered fields for a message type, including the
	 * Header and Trailer.
	 *
	 * @param messageType
	 * @return
	 */
	@Override
	public int[] getOrderedRequiredFieldsForMessage(String messageType) {
		return underlyingDictionary
				.getOrderedRequiredFieldsForMessage(messageType);
	}

	/**
	 * Returns the ordered fields for a message type, including the Header and
	 * Trailer.
	 *
	 * @param messageType
	 * @return
	 */
	@Override
	public int[] getOrderedFieldsForMessage(String messageType) {
		return underlyingDictionary.getOrderedFieldsForMessage(messageType);
	}
}
