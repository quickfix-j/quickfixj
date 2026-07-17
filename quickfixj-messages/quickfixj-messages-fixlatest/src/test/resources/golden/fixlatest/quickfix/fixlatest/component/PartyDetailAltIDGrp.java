/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PartyDetailAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1516, };
  protected int[] getGroupFields() { return componentGroups; }

  public PartyDetailAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltID get(quickfix.field.NoPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltID getNoPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltID() {
    return isSetField(1516);
  }

public static class NoPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1517, 1518, 1519, 0};

  public NoPartyDetailAltID() {
    super(1516, 1517, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltID get(quickfix.field.PartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltID getPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltID() {
    return isSetField(1517);
  }

  public void set(quickfix.field.PartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltIDSource get(quickfix.field.PartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltIDSource getPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltIDSource() {
    return isSetField(1518);
  }

  public void set(quickfix.fixlatest.component.PartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp get(quickfix.fixlatest.component.PartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp getPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltSubIDs get(quickfix.field.NoPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltSubIDs getNoPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltSubIDs() {
    return isSetField(1519);
  }

public static class NoPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1520, 1521, 0};

  public NoPartyDetailAltSubIDs() {
    super(1519, 1520, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubID get(quickfix.field.PartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubID getPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubID() {
    return isSetField(1520);
  }

  public void set(quickfix.field.PartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubIDType get(quickfix.field.PartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubIDType getPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubIDType() {
    return isSetField(1521);
  }
}
}

  public void set(quickfix.field.PartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltID get(quickfix.field.PartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltID getPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltID() {
    return isSetField(1517);
  }

  public void set(quickfix.field.PartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltIDSource get(quickfix.field.PartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltIDSource getPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltIDSource() {
    return isSetField(1518);
  }

  public void set(quickfix.fixlatest.component.PartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp get(quickfix.fixlatest.component.PartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp getPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltSubIDs get(quickfix.field.NoPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltSubIDs getNoPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltSubIDs() {
    return isSetField(1519);
  }

public static class NoPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1520, 1521, 0};

  public NoPartyDetailAltSubIDs() {
    super(1519, 1520, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubID get(quickfix.field.PartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubID getPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubID() {
    return isSetField(1520);
  }

  public void set(quickfix.field.PartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubIDType get(quickfix.field.PartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubIDType getPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubIDType() {
    return isSetField(1521);
  }
}
}
