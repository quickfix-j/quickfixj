/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamCompoundingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42405, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamCompoundingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDates get(quickfix.field.NoLegPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDates getNoLegPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamCompoundingDates() {
    return isSetField(42405);
  }

public static class NoLegPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42406, 42407, 0};

  public NoLegPaymentStreamCompoundingDates() {
    super(42405, 42406, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDate get(quickfix.field.LegPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDate getLegPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDate() {
    return isSetField(42406);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType get(quickfix.field.LegPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType getLegPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDateType() {
    return isSetField(42407);
  }
}

  public void set(quickfix.field.LegPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDate get(quickfix.field.LegPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDate getLegPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDate() {
    return isSetField(42406);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType get(quickfix.field.LegPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType getLegPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDateType() {
    return isSetField(42407);
  }
}
