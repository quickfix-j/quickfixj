/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPricingBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41909, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPricingBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters getNoUnderlyingPaymentStreamPricingBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPricingBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPricingBusinessCenters() {
    return isSetField(41909);
  }

public static class NoUnderlyingPaymentStreamPricingBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41910, 0};

  public NoUnderlyingPaymentStreamPricingBusinessCenters() {
    super(41909, 41910, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter get(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter getUnderlyingPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingBusinessCenter() {
    return isSetField(41910);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter get(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter getUnderlyingPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingBusinessCenter() {
    return isSetField(41910);
  }
}
