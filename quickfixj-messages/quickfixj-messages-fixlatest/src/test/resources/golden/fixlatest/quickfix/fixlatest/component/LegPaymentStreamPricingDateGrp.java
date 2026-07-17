/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPricingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41593, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPricingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamPricingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPricingDates get(quickfix.field.NoLegPaymentStreamPricingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPricingDates getNoLegPaymentStreamPricingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPricingDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPricingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPricingDates() {
    return isSetField(41593);
  }

public static class NoLegPaymentStreamPricingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41594, 41595, 0};

  public NoLegPaymentStreamPricingDates() {
    super(41593, 41594, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDate get(quickfix.field.LegPaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDate getLegPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDate() {
    return isSetField(41594);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDateType get(quickfix.field.LegPaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDateType getLegPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDateType() {
    return isSetField(41595);
  }
}

  public void set(quickfix.field.LegPaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDate get(quickfix.field.LegPaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDate getLegPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDate() {
    return isSetField(41594);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDateType get(quickfix.field.LegPaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDateType getLegPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDateType() {
    return isSetField(41595);
  }
}
