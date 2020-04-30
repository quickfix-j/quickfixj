package quickfix;

public class ValidationSettings {
    boolean checkFieldsOutOfOrder = true;
    boolean checkFieldsHaveValues = true;
    boolean checkUserDefinedFields = true;
    boolean checkUnorderedGroupFields = true;
    boolean allowUnknownMessageFields = false;

    public ValidationSettings() {}

    public ValidationSettings(ValidationSettings validationSettings) {
        this.checkFieldsOutOfOrder = validationSettings.checkFieldsOutOfOrder;
        this.checkFieldsHaveValues = validationSettings.checkFieldsHaveValues;
        this.checkUserDefinedFields = validationSettings.checkUserDefinedFields;
        this.checkUnorderedGroupFields = validationSettings.checkUnorderedGroupFields;
        this.allowUnknownMessageFields = validationSettings.allowUnknownMessageFields;
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
}
