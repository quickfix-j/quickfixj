/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RegulatoryTradeIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1907, };
  protected int[] getGroupFields() { return componentGroups; }

  public RegulatoryTradeIDGrp() {
    super();
  }

  public void set(quickfix.field.NoRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoRegulatoryTradeIDs get(quickfix.field.NoRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRegulatoryTradeIDs getNoRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRegulatoryTradeIDs() {
    return isSetField(1907);
  }

public static class NoRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1903, 1905, 1904, 1906, 2411, 2397, 0};

  public NoRegulatoryTradeIDs() {
    super(1907, 1903, ORDER);
  }

  public void set(quickfix.field.RegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeID get(quickfix.field.RegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeID getRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeID() {
    return isSetField(1903);
  }

  public void set(quickfix.field.RegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDSource get(quickfix.field.RegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDSource getRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDSource() {
    return isSetField(1905);
  }

  public void set(quickfix.field.RegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDEvent get(quickfix.field.RegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDEvent getRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDEvent() {
    return isSetField(1904);
  }

  public void set(quickfix.field.RegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDType get(quickfix.field.RegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDType getRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDType() {
    return isSetField(1906);
  }

  public void set(quickfix.field.RegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryLegRefID get(quickfix.field.RegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryLegRefID getRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.RegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryLegRefID() {
    return isSetField(2411);
  }

  public void set(quickfix.field.RegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDScope get(quickfix.field.RegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDScope getRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDScope() {
    return isSetField(2397);
  }
}

  public void set(quickfix.field.RegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeID get(quickfix.field.RegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeID getRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeID() {
    return isSetField(1903);
  }

  public void set(quickfix.field.RegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDSource get(quickfix.field.RegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDSource getRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDSource() {
    return isSetField(1905);
  }

  public void set(quickfix.field.RegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDEvent get(quickfix.field.RegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDEvent getRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDEvent() {
    return isSetField(1904);
  }

  public void set(quickfix.field.RegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDType get(quickfix.field.RegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDType getRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDType() {
    return isSetField(1906);
  }

  public void set(quickfix.field.RegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryLegRefID get(quickfix.field.RegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryLegRefID getRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.RegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryLegRefID() {
    return isSetField(2411);
  }

  public void set(quickfix.field.RegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDScope get(quickfix.field.RegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDScope getRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDScope() {
    return isSetField(2397);
  }
}
