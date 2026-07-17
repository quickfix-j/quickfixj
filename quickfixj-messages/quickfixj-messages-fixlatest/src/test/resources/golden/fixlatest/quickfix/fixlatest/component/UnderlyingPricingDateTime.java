/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPricingDateTime extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41949, 41950, 41951, 41952, 41953, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPricingDateTime() {
    super();
  }

  public void set(quickfix.field.UnderlyingPricingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingDateUnadjusted get(quickfix.field.UnderlyingPricingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingDateUnadjusted getUnderlyingPricingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingDateUnadjusted() {
    return isSetField(41949);
  }

  public void set(quickfix.field.UnderlyingPricingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingDateBusinessDayConvention get(quickfix.field.UnderlyingPricingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingDateBusinessDayConvention getUnderlyingPricingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingDateBusinessDayConvention() {
    return isSetField(41950);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPricingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPricingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPricingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPricingDateBusinessCenterGrp getUnderlyingPricingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPricingDateBusinessCenterGrp());
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

  public void set(quickfix.field.UnderlyingPricingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingDateAdjusted get(quickfix.field.UnderlyingPricingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingDateAdjusted getUnderlyingPricingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingDateAdjusted() {
    return isSetField(41951);
  }

  public void set(quickfix.field.UnderlyingPricingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingTime get(quickfix.field.UnderlyingPricingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingTime getUnderlyingPricingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingTime() {
    return isSetField(41952);
  }

  public void set(quickfix.field.UnderlyingPricingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPricingTimeBusinessCenter get(quickfix.field.UnderlyingPricingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPricingTimeBusinessCenter getUnderlyingPricingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPricingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPricingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPricingTimeBusinessCenter() {
    return isSetField(41953);
  }
}
