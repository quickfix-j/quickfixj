/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ApplicationSequenceControl extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1180, 1181, 1350, 1352, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ApplicationSequenceControl() {
    super();
  }

  public void set(quickfix.field.ApplID value) {
    setField(value);
  }

  public quickfix.field.ApplID get(quickfix.field.ApplID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplID getApplID() throws FieldNotFound {
    return get(new quickfix.field.ApplID());
  }

  public boolean isSet(quickfix.field.ApplID field) {
    return isSetField(field);
  }

  public boolean isSetApplID() {
    return isSetField(1180);
  }

  public void set(quickfix.field.ApplSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplSeqNum get(quickfix.field.ApplSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplSeqNum getApplSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplSeqNum());
  }

  public boolean isSet(quickfix.field.ApplSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplSeqNum() {
    return isSetField(1181);
  }

  public void set(quickfix.field.ApplLastSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplLastSeqNum get(quickfix.field.ApplLastSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplLastSeqNum getApplLastSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplLastSeqNum());
  }

  public boolean isSet(quickfix.field.ApplLastSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplLastSeqNum() {
    return isSetField(1350);
  }

  public void set(quickfix.field.ApplResendFlag value) {
    setField(value);
  }

  public quickfix.field.ApplResendFlag get(quickfix.field.ApplResendFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplResendFlag getApplResendFlag() throws FieldNotFound {
    return get(new quickfix.field.ApplResendFlag());
  }

  public boolean isSet(quickfix.field.ApplResendFlag field) {
    return isSetField(field);
  }

  public boolean isSetApplResendFlag() {
    return isSetField(1352);
  }
}
