/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TargetPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2433, };
  protected int[] getGroupFields() { return componentGroups; }

  public TargetPtysSubGrp() {
    super();
  }

  public void set(quickfix.field.NoTargetPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoTargetPartySubIDs get(quickfix.field.NoTargetPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetPartySubIDs getNoTargetPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoTargetPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoTargetPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetPartySubIDs() {
    return isSetField(2433);
  }

public static class NoTargetPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2434, 2435, 0};

  public NoTargetPartySubIDs() {
    super(2433, 2434, ORDER);
  }

  public void set(quickfix.field.TargetPartySubID value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubID get(quickfix.field.TargetPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubID getTargetPartySubID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubID());
  }

  public boolean isSet(quickfix.field.TargetPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubID() {
    return isSetField(2434);
  }

  public void set(quickfix.field.TargetPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubIDType get(quickfix.field.TargetPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubIDType getTargetPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubIDType());
  }

  public boolean isSet(quickfix.field.TargetPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubIDType() {
    return isSetField(2435);
  }
}

  public void set(quickfix.field.TargetPartySubID value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubID get(quickfix.field.TargetPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubID getTargetPartySubID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubID());
  }

  public boolean isSet(quickfix.field.TargetPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubID() {
    return isSetField(2434);
  }

  public void set(quickfix.field.TargetPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubIDType get(quickfix.field.TargetPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubIDType getTargetPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubIDType());
  }

  public boolean isSet(quickfix.field.TargetPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubIDType() {
    return isSetField(2435);
  }
}
