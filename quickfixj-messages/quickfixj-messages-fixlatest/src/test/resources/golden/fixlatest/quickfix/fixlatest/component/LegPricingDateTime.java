/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPricingDateTime extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41609, 41610, 41611, 41612, 41613, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPricingDateTime() {
    super();
  }

  public void set(quickfix.field.LegPricingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPricingDateUnadjusted get(quickfix.field.LegPricingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingDateUnadjusted getLegPricingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPricingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPricingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingDateUnadjusted() {
    return isSetField(41609);
  }

  public void set(quickfix.field.LegPricingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPricingDateBusinessDayConvention get(quickfix.field.LegPricingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingDateBusinessDayConvention getLegPricingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPricingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPricingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingDateBusinessDayConvention() {
    return isSetField(41610);
  }

  public void set(quickfix.fixlatest.component.LegPricingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPricingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPricingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPricingDateBusinessCenterGrp getLegPricingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPricingDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegPricingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPricingDateAdjusted get(quickfix.field.LegPricingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingDateAdjusted getLegPricingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPricingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPricingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingDateAdjusted() {
    return isSetField(41611);
  }

  public void set(quickfix.field.LegPricingTime value) {
    setField(value);
  }

  public quickfix.field.LegPricingTime get(quickfix.field.LegPricingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingTime getLegPricingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPricingTime());
  }

  public boolean isSet(quickfix.field.LegPricingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingTime() {
    return isSetField(41612);
  }

  public void set(quickfix.field.LegPricingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPricingTimeBusinessCenter get(quickfix.field.LegPricingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPricingTimeBusinessCenter getLegPricingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPricingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPricingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPricingTimeBusinessCenter() {
    return isSetField(41613);
  }
}
