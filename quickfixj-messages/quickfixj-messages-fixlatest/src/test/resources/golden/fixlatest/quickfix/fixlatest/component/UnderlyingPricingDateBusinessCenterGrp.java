/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPricingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41947, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPricingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPricingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPricingDateBusinessCenters get(quickfix.field.NoUnderlyingPricingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPricingDateBusinessCenters getNoUnderlyingPricingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPricingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPricingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPricingDateBusinessCenters() {
    return isSetField(41947);
  }

public static class NoUnderlyingPricingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41948, 0};

  public NoUnderlyingPricingDateBusinessCenters() {
    super(41947, 41948, ORDER);
  }

  public void set(quickfix.field.UnderlyingPricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingDateBusinessCenter get(quickfix.field.UnderlyingPricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingDateBusinessCenter getUnderlyingPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingDateBusinessCenter() {
    return isSetField(41948);
  }
}

  public void set(quickfix.field.UnderlyingPricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingDateBusinessCenter get(quickfix.field.UnderlyingPricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingDateBusinessCenter getUnderlyingPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingDateBusinessCenter() {
    return isSetField(41948);
  }
}
