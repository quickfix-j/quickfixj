package quickfix;

import java.util.Arrays;

/**
 * Represents a FIX message component.
 */
public abstract class MessageComponent extends FieldMap {

    protected abstract int[] getFields();

    protected abstract int[] getGroupFields();

    protected MessageComponent() {
        super();
    }

    protected MessageComponent(int[] fieldOrder) {
        super(fieldOrder);
    }

    public void copyFrom(FieldMap fields) {
        copyFrom(fields, true, true);
    }

    public void copyFrom(FieldMap fields, boolean includeAllFields, boolean includeAllGroups) {
        copyFrom(fields, includeAllFields ? fields.getAllFields() : getFields(), includeAllGroups ? fields.getAllGroups() : getGroupFields());
    }

    public void copyFrom(FieldMap fields, int[] includeFields, int[] includeGroups) {
        try {
            for (int componentField : includeFields) {
                if (fields.isSetField(componentField)) {
                    setField(componentField, fields.getField(componentField));
                }
            }
            for (int groupField : includeGroups) {
                if (fields.isSetField(groupField)) {
                    setField(groupField, fields.getField(groupField));
                    setGroups(groupField, fields.getGroups(groupField));
                }
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
    }

    public void copyTo(FieldMap fields) {
        copyTo(fields, true, true);
    }

    public void copyTo(FieldMap fields, boolean includeAllFields, boolean includeAllGroups) {
        copyTo(fields, includeAllFields ? getAllFields() : getFields(), includeAllGroups ? getAllGroups() : getGroupFields());
    }

    public void copyTo(FieldMap fields, int[] includeFields, int[] includeGroups) {
        try {
            for (int componentField : includeFields) {
                if (isSetField(componentField)) {
                    fields.setField(componentField, getField(componentField));
                }
            }
            for (int groupField : includeGroups) {
                if (isSetField(groupField)) {
                    fields.setField(groupField, getField(groupField));
                    fields.setGroups(groupField, getGroups(groupField));
                }
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
    }
}
