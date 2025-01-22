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

public class ValidationSettings {
    boolean checkFieldsOutOfOrder = true;
    boolean checkFieldsHaveValues = true;
    boolean checkUserDefinedFields = true;
    boolean checkUnorderedGroupFields = true;
    boolean allowUnknownMessageFields = false;
    boolean firstFieldInGroupIsDelimiter = false;

    public ValidationSettings() {}

    public ValidationSettings(ValidationSettings validationSettings) {
        this.checkFieldsOutOfOrder = validationSettings.checkFieldsOutOfOrder;
        this.checkFieldsHaveValues = validationSettings.checkFieldsHaveValues;
        this.checkUserDefinedFields = validationSettings.checkUserDefinedFields;
        this.checkUnorderedGroupFields = validationSettings.checkUnorderedGroupFields;
        this.allowUnknownMessageFields = validationSettings.allowUnknownMessageFields;
        this.firstFieldInGroupIsDelimiter = validationSettings.firstFieldInGroupIsDelimiter;
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

    public boolean isFirstFieldInGroupIsDelimiter() {
        return firstFieldInGroupIsDelimiter;
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
     * Controls whether any field which is
     * first in the repeating group would be used as delimiter
     *
     * @param flag true = use first field from message, false = follow data dictionary
     * Must be used with disabled {@link #setCheckUnorderedGroupFields(boolean)}
     */
    public void setFirstFieldInGroupIsDelimiter(boolean flag) {
        firstFieldInGroupIsDelimiter = flag;
    }
}
