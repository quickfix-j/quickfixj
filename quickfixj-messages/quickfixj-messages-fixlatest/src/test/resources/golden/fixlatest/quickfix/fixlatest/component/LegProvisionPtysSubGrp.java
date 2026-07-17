/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40537, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionPtysSubGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
