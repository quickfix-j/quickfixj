/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AffectedOrdGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {534, };
  protected int[] getGroupFields() { return componentGroups; }

  public AffectedOrdGrp() {
    super();
  }

  public void set(quickfix.field.NoAffectedOrders value) {
    setField(value);
  }

  public quickfix.field.NoAffectedOrders get(quickfix.field.NoAffectedOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAffectedOrders getNoAffectedOrders() throws FieldNotFound {
    return get(new quickfix.field.NoAffectedOrders());
  }

  public boolean isSet(quickfix.field.NoAffectedOrders field) {
    return isSetField(field);
  }

  public boolean isSetNoAffectedOrders() {
    return isSetField(534);
  }

public static class NoAffectedOrders extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1824, 535, 536, 0};

  public NoAffectedOrders() {
    super(534, 1824, ORDER);
  }

  public void set(quickfix.field.AffectedOrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.AffectedOrigClOrdID get(quickfix.field.AffectedOrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedOrigClOrdID getAffectedOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.AffectedOrigClOrdID());
  }

  public boolean isSet(quickfix.field.AffectedOrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedOrigClOrdID() {
    return isSetField(1824);
  }

  public void set(quickfix.field.AffectedOrderID value) {
    setField(value);
  }

  public quickfix.field.AffectedOrderID get(quickfix.field.AffectedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedOrderID getAffectedOrderID() throws FieldNotFound {
    return get(new quickfix.field.AffectedOrderID());
  }

  public boolean isSet(quickfix.field.AffectedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedOrderID() {
    return isSetField(535);
  }

  public void set(quickfix.field.AffectedSecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.AffectedSecondaryOrderID get(quickfix.field.AffectedSecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedSecondaryOrderID getAffectedSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.AffectedSecondaryOrderID());
  }

  public boolean isSet(quickfix.field.AffectedSecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedSecondaryOrderID() {
    return isSetField(536);
  }
}

  public void set(quickfix.field.AffectedOrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.AffectedOrigClOrdID get(quickfix.field.AffectedOrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedOrigClOrdID getAffectedOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.AffectedOrigClOrdID());
  }

  public boolean isSet(quickfix.field.AffectedOrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedOrigClOrdID() {
    return isSetField(1824);
  }

  public void set(quickfix.field.AffectedOrderID value) {
    setField(value);
  }

  public quickfix.field.AffectedOrderID get(quickfix.field.AffectedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedOrderID getAffectedOrderID() throws FieldNotFound {
    return get(new quickfix.field.AffectedOrderID());
  }

  public boolean isSet(quickfix.field.AffectedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedOrderID() {
    return isSetField(535);
  }

  public void set(quickfix.field.AffectedSecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.AffectedSecondaryOrderID get(quickfix.field.AffectedSecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedSecondaryOrderID getAffectedSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.AffectedSecondaryOrderID());
  }

  public boolean isSet(quickfix.field.AffectedSecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedSecondaryOrderID() {
    return isSetField(536);
  }
}
