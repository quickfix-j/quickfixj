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

    /**
     * Copies fields defined in the data dictionary inside this message component from specified source fields. This
     * method is not symmetric with {@link MessageComponent#copyTo(FieldMap)} method.
     *
     * @param fields source fields
     */
    public void copyFrom(FieldMap fields) {
        try {
            for (int componentField : getFields()) {
                if (fields.isSetField(componentField)) {
                    setField(componentField, fields.getField(componentField));
                }
            }
            for (int groupField : getGroupFields()) {
                if (fields.isSetField(groupField)) {
                    setField(groupField, fields.getField(groupField));
                    setGroups(groupField, fields.getGroups(groupField));
                }
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
    }

    /**
     * Copies all fields inside this message component to specified destination fields. This method is not symmetric
     * with {@link MessageComponent#copyFrom(FieldMap)} method.
     *
     * @param fields destination fields
     */
    public void copyTo(FieldMap fields) {
        try {
            for (int componentField : this.fields.keySet()) {
                fields.setField(componentField, getField(componentField));
            }
            for (int groupField : this.groups.keySet()) {
                fields.setField(groupField, getField(groupField));
                fields.setGroups(groupField, getGroups(groupField));
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
    }
}
