/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPricingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41607, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPricingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPricingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPricingDateBusinessCenters get(quickfix.field.NoLegPricingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPricingDateBusinessCenters getNoLegPricingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPricingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPricingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPricingDateBusinessCenters() {
    return isSetField(41607);
  }

public static class NoLegPricingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41608, 0};

  public NoLegPricingDateBusinessCenters() {
    super(41607, 41608, ORDER);
  }

  public void set(quickfix.field.LegPricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPricingDateBusinessCenter get(quickfix.field.LegPricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingDateBusinessCenter getLegPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingDateBusinessCenter() {
    return isSetField(41608);
  }
}

  public void set(quickfix.field.LegPricingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPricingDateBusinessCenter get(quickfix.field.LegPricingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingDateBusinessCenter getLegPricingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPricingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPricingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingDateBusinessCenter() {
    return isSetField(41608);
  }
}
