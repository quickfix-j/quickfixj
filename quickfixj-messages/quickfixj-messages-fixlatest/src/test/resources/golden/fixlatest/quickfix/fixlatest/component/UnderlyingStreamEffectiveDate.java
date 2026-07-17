/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamEffectiveDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40057, 40058, 40060, 40061, 40062, 40063, 40064, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamEffectiveDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateUnadjusted get(quickfix.field.UnderlyingStreamEffectiveDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateUnadjusted getUnderlyingStreamEffectiveDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateUnadjusted() {
    return isSetField(40057);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention get(quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention getUnderlyingStreamEffectiveDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateBusinessDayConvention() {
    return isSetField(40058);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamEffectiveDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingStreamEffectiveDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDateBusinessCenterGrp getUnderlyingStreamEffectiveDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamEffectiveDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters get(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters getNoUnderlyingStreamEffectiveDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamEffectiveDateBusinessCenters() {
    return isSetField(40975);
  }

public static class NoUnderlyingStreamEffectiveDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40059, 0};

  public NoUnderlyingStreamEffectiveDateBusinessCenters() {
    super(40975, 40059, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter get(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter getUnderlyingStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateBusinessCenter() {
    return isSetField(40059);
  }
}

  public void set(quickfix.field.UnderlyingStreamEffectiveDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateRelativeTo get(quickfix.field.UnderlyingStreamEffectiveDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateRelativeTo getUnderlyingStreamEffectiveDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateRelativeTo() {
    return isSetField(40060);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod get(quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod getUnderlyingStreamEffectiveDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateOffsetPeriod() {
    return isSetField(40061);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit get(quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit getUnderlyingStreamEffectiveDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateOffsetUnit() {
    return isSetField(40062);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType get(quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType getUnderlyingStreamEffectiveDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateOffsetDayType() {
    return isSetField(40063);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateAdjusted get(quickfix.field.UnderlyingStreamEffectiveDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateAdjusted getUnderlyingStreamEffectiveDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateAdjusted() {
    return isSetField(40064);
  }
}
