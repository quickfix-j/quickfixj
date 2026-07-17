/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPricingBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41561, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPricingBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamPricingBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPricingBusinessCenters get(quickfix.field.NoLegPaymentStreamPricingBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPricingBusinessCenters getNoLegPaymentStreamPricingBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPricingBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPricingBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPricingBusinessCenters() {
    return isSetField(41561);
  }

public static class NoLegPaymentStreamPricingBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41562, 0};

  public NoLegPaymentStreamPricingBusinessCenters() {
    super(41561, 41562, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingBusinessCenter get(quickfix.field.LegPaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingBusinessCenter getLegPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingBusinessCenter() {
    return isSetField(41562);
  }
}

  public void set(quickfix.field.LegPaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPricingBusinessCenter get(quickfix.field.LegPaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPricingBusinessCenter getLegPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPricingBusinessCenter() {
    return isSetField(41562);
  }
}
