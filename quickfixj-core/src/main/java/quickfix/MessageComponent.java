package quickfix;

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
        for (int componentField : getFields()) {
            if (fields.isSetField(componentField)) {
                setField(componentField, fields.getField(componentField, null));
            }
        }
        for (int groupField : getGroupFields()) {
            if (fields.isSetField(groupField)) {
                setField(groupField, fields.getField(groupField, null));
                setGroups(groupField, fields.getGroups(groupField));
            }
        }
    }

    public void copyTo(FieldMap fields) {
        for (int componentField : getFields()) {
            if (isSetField(componentField)) {
                fields.setField(componentField, getField(componentField, null));
            }
        }
        for (int groupField : getGroupFields()) {
            if (isSetField(groupField)) {
                fields.setField(groupField, getField(groupField, null));
                fields.setGroups(groupField, getGroups(groupField));
            }
        }
    }

}
