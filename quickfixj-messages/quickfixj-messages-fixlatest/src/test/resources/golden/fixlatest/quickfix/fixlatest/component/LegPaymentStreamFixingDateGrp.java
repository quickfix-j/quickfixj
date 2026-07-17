/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42459, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamFixingDates get(quickfix.field.NoLegPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamFixingDates getNoLegPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamFixingDates() {
    return isSetField(42459);
  }

public static class NoLegPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42460, 42461, 0};

  public NoLegPaymentStreamFixingDates() {
    super(42459, 42460, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDate get(quickfix.field.LegPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDate getLegPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDate() {
    return isSetField(42460);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateType get(quickfix.field.LegPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateType getLegPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateType() {
    return isSetField(42461);
  }
}

  public void set(quickfix.field.LegPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDate get(quickfix.field.LegPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDate getLegPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDate() {
    return isSetField(42460);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateType get(quickfix.field.LegPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateType getLegPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateType() {
    return isSetField(42461);
  }
}
