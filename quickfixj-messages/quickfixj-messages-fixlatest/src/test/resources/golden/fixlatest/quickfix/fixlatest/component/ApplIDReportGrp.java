/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ApplIDReportGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1351, };
  protected int[] getGroupFields() { return componentGroups; }

  public ApplIDReportGrp() {
    super();
  }

  public void set(quickfix.field.NoApplIDs value) {
    setField(value);
  }

  public quickfix.field.NoApplIDs get(quickfix.field.NoApplIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoApplIDs getNoApplIDs() throws FieldNotFound {
    return get(new quickfix.field.NoApplIDs());
  }

  public boolean isSet(quickfix.field.NoApplIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoApplIDs() {
    return isSetField(1351);
  }

public static class NoApplIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1355, 1399, 1357, 0};

  public NoApplIDs() {
    super(1351, 1355, ORDER);
  }

  public void set(quickfix.field.RefApplID value) {
    setField(value);
  }

  public quickfix.field.RefApplID get(quickfix.field.RefApplID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplID getRefApplID() throws FieldNotFound {
    return get(new quickfix.field.RefApplID());
  }

  public boolean isSet(quickfix.field.RefApplID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplID() {
    return isSetField(1355);
  }

  public void set(quickfix.field.ApplNewSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplNewSeqNum get(quickfix.field.ApplNewSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplNewSeqNum getApplNewSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplNewSeqNum());
  }

  public boolean isSet(quickfix.field.ApplNewSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplNewSeqNum() {
    return isSetField(1399);
  }

  public void set(quickfix.field.RefApplLastSeqNum value) {
    setField(value);
  }

  public quickfix.field.RefApplLastSeqNum get(quickfix.field.RefApplLastSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplLastSeqNum getRefApplLastSeqNum() throws FieldNotFound {
    return get(new quickfix.field.RefApplLastSeqNum());
  }

  public boolean isSet(quickfix.field.RefApplLastSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetRefApplLastSeqNum() {
    return isSetField(1357);
  }
}

  public void set(quickfix.field.RefApplID value) {
    setField(value);
  }

  public quickfix.field.RefApplID get(quickfix.field.RefApplID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplID getRefApplID() throws FieldNotFound {
    return get(new quickfix.field.RefApplID());
  }

  public boolean isSet(quickfix.field.RefApplID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplID() {
    return isSetField(1355);
  }

  public void set(quickfix.field.ApplNewSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplNewSeqNum get(quickfix.field.ApplNewSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplNewSeqNum getApplNewSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplNewSeqNum());
  }

  public boolean isSet(quickfix.field.ApplNewSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplNewSeqNum() {
    return isSetField(1399);
  }

  public void set(quickfix.field.RefApplLastSeqNum value) {
    setField(value);
  }

  public quickfix.field.RefApplLastSeqNum get(quickfix.field.RefApplLastSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplLastSeqNum getRefApplLastSeqNum() throws FieldNotFound {
    return get(new quickfix.field.RefApplLastSeqNum());
  }

  public boolean isSet(quickfix.field.RefApplLastSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetRefApplLastSeqNum() {
    return isSetField(1357);
  }
}
