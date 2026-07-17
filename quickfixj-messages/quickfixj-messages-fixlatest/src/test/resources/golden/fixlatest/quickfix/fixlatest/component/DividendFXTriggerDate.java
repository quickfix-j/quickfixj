/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendFXTriggerDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42265, 42266, 42267, 42268, 42269, 42270, 42271, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DividendFXTriggerDate() {
    super();
  }

  public void set(quickfix.field.DividendFXTriggerDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateRelativeTo get(quickfix.field.DividendFXTriggerDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateRelativeTo getDividendFXTriggerDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateRelativeTo());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateRelativeTo() {
    return isSetField(42265);
  }

  public void set(quickfix.field.DividendFXTriggerDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateOffsetPeriod get(quickfix.field.DividendFXTriggerDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateOffsetPeriod getDividendFXTriggerDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateOffsetPeriod() {
    return isSetField(42266);
  }

  public void set(quickfix.field.DividendFXTriggerDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateOffsetUnit get(quickfix.field.DividendFXTriggerDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateOffsetUnit getDividendFXTriggerDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateOffsetUnit() {
    return isSetField(42267);
  }

  public void set(quickfix.field.DividendFXTriggerDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateOffsetDayType get(quickfix.field.DividendFXTriggerDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateOffsetDayType getDividendFXTriggerDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateOffsetDayType() {
    return isSetField(42268);
  }

  public void set(quickfix.field.DividendFXTriggerDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateUnadjusted get(quickfix.field.DividendFXTriggerDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateUnadjusted getDividendFXTriggerDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateUnadjusted() {
    return isSetField(42269);
  }

  public void set(quickfix.field.DividendFXTriggerDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateBusinessDayConvention get(quickfix.field.DividendFXTriggerDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateBusinessDayConvention getDividendFXTriggerDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateBusinessDayConvention() {
    return isSetField(42270);
  }

  public void set(quickfix.fixlatest.component.DividendFXTriggerDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendFXTriggerDateBusinessCenterGrp get(quickfix.fixlatest.component.DividendFXTriggerDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendFXTriggerDateBusinessCenterGrp getDividendFXTriggerDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendFXTriggerDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoDividendFXTriggerDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendFXTriggerDateBusinessCenters get(quickfix.field.NoDividendFXTriggerDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendFXTriggerDateBusinessCenters getNoDividendFXTriggerDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendFXTriggerDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendFXTriggerDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendFXTriggerDateBusinessCenters() {
    return isSetField(42272);
  }

public static class NoDividendFXTriggerDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42273, 0};

  public NoDividendFXTriggerDateBusinessCenters() {
    super(42272, 42273, ORDER);
  }

  public void set(quickfix.field.DividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter get(quickfix.field.DividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter getDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateBusinessCenter() {
    return isSetField(42273);
  }
}

  public void set(quickfix.field.DividendFXTriggerDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateAdjusted get(quickfix.field.DividendFXTriggerDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateAdjusted getDividendFXTriggerDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateAdjusted());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateAdjusted() {
    return isSetField(42271);
  }
}
