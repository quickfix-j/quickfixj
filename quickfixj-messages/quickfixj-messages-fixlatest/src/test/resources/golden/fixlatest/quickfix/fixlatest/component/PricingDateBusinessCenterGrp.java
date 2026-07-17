/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PricingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41230, };
  protected int[] getGroupFields() { return componentGroups; }

  public PricingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPricingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPricingDateBusinessCenters get(quickfix.field.NoPricingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPricingDateBusinessCenters getNoPricingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPricingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPricingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPricingDateBusinessCenters() {
    return isSetField(41230);
  }

public static class NoPricingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41231, 0};

  public NoPricingDateBusinessCenters() {
    super(41230, 41231, ORDER);
  }

  public void set(quickfix.field.PricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PricingDateBusinessCenter get(quickfix.field.PricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingDateBusinessCenter getPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPricingDateBusinessCenter() {
    return isSetField(41231);
  }
}

  public void set(quickfix.field.PricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PricingDateBusinessCenter get(quickfix.field.PricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingDateBusinessCenter getPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPricingDateBusinessCenter() {
    return isSetField(41231);
  }
}
