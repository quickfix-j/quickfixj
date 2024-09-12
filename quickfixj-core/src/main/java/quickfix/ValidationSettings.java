package quickfix;

public class ValidationSettings {
    boolean checkFieldsOutOfOrder = true;
    boolean checkFieldsHaveValues = true;
    boolean checkUserDefinedFields = true;
    boolean checkUnorderedGroupFields = true;
    boolean allowUnknownMessageFields = false;
    boolean useFirstTagAsGroupDelimiter = false;
    boolean onlyAllowSeenOrKnownFieldsInLastGroup = false;

    public ValidationSettings() {}

    public ValidationSettings(ValidationSettings validationSettings) {
        this.checkFieldsOutOfOrder = validationSettings.checkFieldsOutOfOrder;
        this.checkFieldsHaveValues = validationSettings.checkFieldsHaveValues;
        this.checkUserDefinedFields = validationSettings.checkUserDefinedFields;
        this.checkUnorderedGroupFields = validationSettings.checkUnorderedGroupFields;
        this.allowUnknownMessageFields = validationSettings.allowUnknownMessageFields;
        this.useFirstTagAsGroupDelimiter = validationSettings.useFirstTagAsGroupDelimiter;
        this.onlyAllowSeenOrKnownFieldsInLastGroup = validationSettings.onlyAllowSeenOrKnownFieldsInLastGroup;
    }

    /**
     * Controls whether out of order fields are checked.
     *
     * @param flag true = checked, false = not checked
     */
    public void setCheckFieldsOutOfOrder(boolean flag) {
        checkFieldsOutOfOrder = flag;
    }

    public boolean isCheckFieldsOutOfOrder() {
        return checkFieldsOutOfOrder;
    }

    public boolean isCheckUnorderedGroupFields() {
        return checkUnorderedGroupFields;
    }

    public boolean isCheckFieldsHaveValues() {
        return checkFieldsHaveValues;
    }

    public boolean isCheckUserDefinedFields() {
        return checkUserDefinedFields;
    }

    public boolean isAllowUnknownMessageFields() {
        return allowUnknownMessageFields;
    }

    public boolean isUseFirstTagAsGroupDelimiter() {
        return useFirstTagAsGroupDelimiter;
    }

    /**
     * Controls whether group fields are in the same order
     *
     * @param flag true = checked, false = not checked
     */
    public void setCheckUnorderedGroupFields(boolean flag) {
        checkUnorderedGroupFields = flag;
    }

    /**
     * Controls whether empty field values are checked.
     *
     * @param flag true = checked, false = not checked
     */
    public void setCheckFieldsHaveValues(boolean flag) {
        checkFieldsHaveValues = flag;
    }

    /**
     * Controls whether user defined fields are checked.
     *
     * @param flag true = checked, false = not checked
     */
    public void setCheckUserDefinedFields(boolean flag) {
        checkUserDefinedFields = flag;
    }

    public void setAllowUnknownMessageFields(boolean allowUnknownFields) {
        allowUnknownMessageFields = allowUnknownFields;
    }

    /**
     * Controls whether to just use the first tag as the delimiter when parsing a group
     *
     * @param flag true = checked, false = not checked
     */
    public void setUseFirstTagAsGroupDelimiter(boolean flag) {
        useFirstTagAsGroupDelimiter = flag;
    }

    public boolean isOnlyAllowSeenOrKnownFieldsInLastGroup() {
        return onlyAllowSeenOrKnownFieldsInLastGroup;
    }

    public void setOnlyAllowSeenOrKnownFieldsInLastGroup(boolean flag) {
        onlyAllowSeenOrKnownFieldsInLastGroup = flag;
    }
}
