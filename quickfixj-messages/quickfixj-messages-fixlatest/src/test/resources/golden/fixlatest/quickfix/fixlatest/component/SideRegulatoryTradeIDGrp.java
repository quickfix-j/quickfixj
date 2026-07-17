/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SideRegulatoryTradeIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1971, };
  protected int[] getGroupFields() { return componentGroups; }

  public SideRegulatoryTradeIDGrp() {
    super();
  }

  public void set(quickfix.field.NoSideRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoSideRegulatoryTradeIDs get(quickfix.field.NoSideRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideRegulatoryTradeIDs getNoSideRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSideRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoSideRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSideRegulatoryTradeIDs() {
    return isSetField(1971);
  }

public static class NoSideRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1972, 1973, 1974, 1975, 2416, 2398, 0};

  public NoSideRegulatoryTradeIDs() {
    super(1971, 1972, ORDER);
  }

  public void set(quickfix.field.SideRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeID get(quickfix.field.SideRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeID getSideRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeID() {
    return isSetField(1972);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDSource get(quickfix.field.SideRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDSource getSideRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDSource() {
    return isSetField(1973);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDEvent get(quickfix.field.SideRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDEvent getSideRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDEvent() {
    return isSetField(1974);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDType get(quickfix.field.SideRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDType getSideRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDType() {
    return isSetField(1975);
  }

  public void set(quickfix.field.SideRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryLegRefID get(quickfix.field.SideRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryLegRefID getSideRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryLegRefID() {
    return isSetField(2416);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDScope get(quickfix.field.SideRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDScope getSideRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDScope() {
    return isSetField(2398);
  }
}

  public void set(quickfix.field.SideRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeID get(quickfix.field.SideRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeID getSideRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeID() {
    return isSetField(1972);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDSource get(quickfix.field.SideRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDSource getSideRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDSource() {
    return isSetField(1973);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDEvent get(quickfix.field.SideRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDEvent getSideRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDEvent() {
    return isSetField(1974);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDType get(quickfix.field.SideRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDType getSideRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDType() {
    return isSetField(1975);
  }

  public void set(quickfix.field.SideRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryLegRefID get(quickfix.field.SideRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryLegRefID getSideRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryLegRefID() {
    return isSetField(2416);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDScope get(quickfix.field.SideRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDScope getSideRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDScope() {
    return isSetField(2398);
  }
}
