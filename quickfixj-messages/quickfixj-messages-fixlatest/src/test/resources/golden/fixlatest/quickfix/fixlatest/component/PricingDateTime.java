/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PricingDateTime extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41232, 41233, 41234, 41235, 41236, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PricingDateTime() {
    super();
  }

  public void set(quickfix.field.PricingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PricingDateUnadjusted get(quickfix.field.PricingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingDateUnadjusted getPricingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PricingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PricingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPricingDateUnadjusted() {
    return isSetField(41232);
  }

  public void set(quickfix.field.PricingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PricingDateBusinessDayConvention get(quickfix.field.PricingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingDateBusinessDayConvention getPricingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PricingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PricingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPricingDateBusinessDayConvention() {
    return isSetField(41233);
  }

  public void set(quickfix.fixlatest.component.PricingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PricingDateBusinessCenterGrp get(quickfix.fixlatest.component.PricingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PricingDateBusinessCenterGrp getPricingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PricingDateBusinessCenterGrp());
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

  public void set(quickfix.field.PricingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PricingDateAdjusted get(quickfix.field.PricingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingDateAdjusted getPricingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PricingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PricingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPricingDateAdjusted() {
    return isSetField(41234);
  }

  public void set(quickfix.field.PricingTime value) {
    setField(value);
  }

  public quickfix.field.PricingTime get(quickfix.field.PricingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingTime getPricingTime() throws FieldNotFound {
    return get(new quickfix.field.PricingTime());
  }

  public boolean isSet(quickfix.field.PricingTime field) {
    return isSetField(field);
  }

  public boolean isSetPricingTime() {
    return isSetField(41235);
  }

  public void set(quickfix.field.PricingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PricingTimeBusinessCenter get(quickfix.field.PricingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricingTimeBusinessCenter getPricingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PricingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PricingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPricingTimeBusinessCenter() {
    return isSetField(41236);
  }
}
