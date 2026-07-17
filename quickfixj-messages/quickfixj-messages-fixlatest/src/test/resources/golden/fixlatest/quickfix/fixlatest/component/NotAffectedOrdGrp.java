/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NotAffectedOrdGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1370, };
  protected int[] getGroupFields() { return componentGroups; }

  public NotAffectedOrdGrp() {
    super();
  }

  public void set(quickfix.field.NoNotAffectedOrders value) {
    setField(value);
  }

  public quickfix.field.NoNotAffectedOrders get(quickfix.field.NoNotAffectedOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNotAffectedOrders getNoNotAffectedOrders() throws FieldNotFound {
    return get(new quickfix.field.NoNotAffectedOrders());
  }

  public boolean isSet(quickfix.field.NoNotAffectedOrders field) {
    return isSetField(field);
  }

  public boolean isSetNoNotAffectedOrders() {
    return isSetField(1370);
  }

public static class NoNotAffectedOrders extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1372, 1371, 1825, 2677, 0};

  public NoNotAffectedOrders() {
    super(1370, 1372, ORDER);
  }

  public void set(quickfix.field.NotAffOrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.NotAffOrigClOrdID get(quickfix.field.NotAffOrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffOrigClOrdID getNotAffOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.NotAffOrigClOrdID());
  }

  public boolean isSet(quickfix.field.NotAffOrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffOrigClOrdID() {
    return isSetField(1372);
  }

  public void set(quickfix.field.NotAffectedOrderID value) {
    setField(value);
  }

  public quickfix.field.NotAffectedOrderID get(quickfix.field.NotAffectedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedOrderID getNotAffectedOrderID() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedOrderID());
  }

  public boolean isSet(quickfix.field.NotAffectedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedOrderID() {
    return isSetField(1371);
  }

  public void set(quickfix.field.NotAffSecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.NotAffSecondaryOrderID get(quickfix.field.NotAffSecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffSecondaryOrderID getNotAffSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.NotAffSecondaryOrderID());
  }

  public boolean isSet(quickfix.field.NotAffSecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffSecondaryOrderID() {
    return isSetField(1825);
  }

  public void set(quickfix.field.NotAffectedReason value) {
    setField(value);
  }

  public quickfix.field.NotAffectedReason get(quickfix.field.NotAffectedReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedReason getNotAffectedReason() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedReason());
  }

  public boolean isSet(quickfix.field.NotAffectedReason field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedReason() {
    return isSetField(2677);
  }
}

  public void set(quickfix.field.NotAffOrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.NotAffOrigClOrdID get(quickfix.field.NotAffOrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffOrigClOrdID getNotAffOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.NotAffOrigClOrdID());
  }

  public boolean isSet(quickfix.field.NotAffOrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffOrigClOrdID() {
    return isSetField(1372);
  }

  public void set(quickfix.field.NotAffectedOrderID value) {
    setField(value);
  }

  public quickfix.field.NotAffectedOrderID get(quickfix.field.NotAffectedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedOrderID getNotAffectedOrderID() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedOrderID());
  }

  public boolean isSet(quickfix.field.NotAffectedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedOrderID() {
    return isSetField(1371);
  }

  public void set(quickfix.field.NotAffSecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.NotAffSecondaryOrderID get(quickfix.field.NotAffSecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffSecondaryOrderID getNotAffSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.NotAffSecondaryOrderID());
  }

  public boolean isSet(quickfix.field.NotAffSecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffSecondaryOrderID() {
    return isSetField(1825);
  }

  public void set(quickfix.field.NotAffectedReason value) {
    setField(value);
  }

  public quickfix.field.NotAffectedReason get(quickfix.field.NotAffectedReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedReason getNotAffectedReason() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedReason());
  }

  public boolean isSet(quickfix.field.NotAffectedReason field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedReason() {
    return isSetField(2677);
  }
}
