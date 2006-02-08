package quickfix;

public abstract class MessageComponent extends FieldMap {
    protected abstract int[] getFields();
    protected abstract int[] getGroupFields();
    
    public void copyFrom(FieldMap fields) {
        try {
            int[] componentFields = getFields();
            for (int i = 0; i < componentFields.length; i++) {
                if (fields.isSetField(componentFields[i])) {
                    setField(componentFields[i], fields.getField(componentFields[i]));
                }
            }
            int[] groupFields = getGroupFields();
            for (int i = 0; i < groupFields.length; i++) {
                if (isSetField(groupFields[i])) {
                    setGroups(groupFields[i], fields.getGroups(groupFields[i]));
                }
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
    }
    
    public void copyTo(FieldMap fields) {
        try {
            int[] componentFields = getFields();
            for (int i = 0; i < componentFields.length; i++) {
                if (isSetField(componentFields[i])) {
                    fields.setField(componentFields[i], getField(componentFields[i]));
                }
            }
            int[] groupFields = getGroupFields();
            for (int i = 0; i < groupFields.length; i++) {
                if (isSetField(groupFields[i])) {
                    fields.setGroups(groupFields[i], getGroups(groupFields[i]));
                }
            }
        } catch (FieldNotFound e) {
            // should not happen
        }
       
    }
}
