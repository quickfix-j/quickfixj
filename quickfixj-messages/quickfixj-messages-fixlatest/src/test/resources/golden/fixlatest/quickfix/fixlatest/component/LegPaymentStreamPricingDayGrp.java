/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPricingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41596, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPricingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamPricingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPricingDays get(quickfix.field.NoLegPaymentStreamPricingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPricingDays getNoLegPaymentStreamPricingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPricingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPricingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPricingDays() {
    return isSetField(41596);
  }

public static class NoLegPaymentStreamPricingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41597, 41598, 0};

  public NoLegPaymentStreamPricingDays() {
    super(41596, 41597, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDayOfWeek get(quickfix.field.LegPaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDayOfWeek getLegPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDayOfWeek() {
    return isSetField(41597);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDayNumber get(quickfix.field.LegPaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDayNumber getLegPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDayNumber() {
    return isSetField(41598);
  }
}

  public void set(quickfix.field.LegPaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDayOfWeek get(quickfix.field.LegPaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDayOfWeek getLegPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDayOfWeek() {
    return isSetField(41597);
  }

  public void set(quickfix.field.LegPaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingDayNumber get(quickfix.field.LegPaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingDayNumber getLegPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingDayNumber() {
    return isSetField(41598);
  }
}
