/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventRelativeDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41739, 41740, 41741, 41742, 41743, 41744, 41745, 41746, 41747, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventRelativeDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingComplexEventDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateUnadjusted get(quickfix.field.UnderlyingComplexEventDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateUnadjusted getUnderlyingComplexEventDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateUnadjusted() {
    return isSetField(41739);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateRelativeTo get(quickfix.field.UnderlyingComplexEventDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateRelativeTo getUnderlyingComplexEventDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateRelativeTo() {
    return isSetField(41740);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetPeriod get(quickfix.field.UnderlyingComplexEventDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetPeriod getUnderlyingComplexEventDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateOffsetPeriod() {
    return isSetField(41741);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetUnit get(quickfix.field.UnderlyingComplexEventDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetUnit getUnderlyingComplexEventDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateOffsetUnit() {
    return isSetField(41742);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetDayType get(quickfix.field.UnderlyingComplexEventDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateOffsetDayType getUnderlyingComplexEventDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateOffsetDayType() {
    return isSetField(41743);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessDayConvention get(quickfix.field.UnderlyingComplexEventDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessDayConvention getUnderlyingComplexEventDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateBusinessDayConvention() {
    return isSetField(41744);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingComplexEventDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDateBusinessCenterGrp getUnderlyingComplexEventDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDateBusinessCenters get(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDateBusinessCenters getNoUnderlyingComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDateBusinessCenters() {
    return isSetField(41737);
  }

public static class NoUnderlyingComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41738, 0};

  public NoUnderlyingComplexEventDateBusinessCenters() {
    super(41737, 41738, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter get(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter getUnderlyingComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateBusinessCenter() {
    return isSetField(41738);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateAdjusted get(quickfix.field.UnderlyingComplexEventDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateAdjusted getUnderlyingComplexEventDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateAdjusted() {
    return isSetField(41745);
  }

  public void set(quickfix.field.UnderlyingComplexEventFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFixingTime get(quickfix.field.UnderlyingComplexEventFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFixingTime getUnderlyingComplexEventFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFixingTime() {
    return isSetField(41746);
  }

  public void set(quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter get(quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter getUnderlyingComplexEventFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFixingTimeBusinessCenter() {
    return isSetField(41747);
  }
}
