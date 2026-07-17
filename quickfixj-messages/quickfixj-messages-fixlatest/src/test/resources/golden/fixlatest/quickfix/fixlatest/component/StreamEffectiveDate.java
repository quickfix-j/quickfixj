/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamEffectiveDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40907, 40908, 40910, 40911, 40912, 40913, 40914, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public StreamEffectiveDate() {
    super();
  }

  public void set(quickfix.field.StreamEffectiveDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateUnadjusted get(quickfix.field.StreamEffectiveDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateUnadjusted getStreamEffectiveDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateUnadjusted() {
    return isSetField(40907);
  }

  public void set(quickfix.field.StreamEffectiveDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateBusinessDayConvention get(quickfix.field.StreamEffectiveDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateBusinessDayConvention getStreamEffectiveDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateBusinessDayConvention() {
    return isSetField(40908);
  }

  public void set(quickfix.fixlatest.component.StreamEffectiveBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamEffectiveBusinessCenterGrp get(quickfix.fixlatest.component.StreamEffectiveBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamEffectiveBusinessCenterGrp getStreamEffectiveBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamEffectiveBusinessCenterGrp());
  }

  public void set(quickfix.field.NoStreamEffectiveBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamEffectiveBusinessCenters get(quickfix.field.NoStreamEffectiveBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamEffectiveBusinessCenters getNoStreamEffectiveBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamEffectiveBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamEffectiveBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamEffectiveBusinessCenters() {
    return isSetField(40960);
  }

public static class NoStreamEffectiveBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40909, 0};

  public NoStreamEffectiveBusinessCenters() {
    super(40960, 40909, ORDER);
  }

  public void set(quickfix.field.StreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter get(quickfix.field.StreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter getStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateBusinessCenter() {
    return isSetField(40909);
  }
}

  public void set(quickfix.field.StreamEffectiveDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateRelativeTo get(quickfix.field.StreamEffectiveDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateRelativeTo getStreamEffectiveDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateRelativeTo());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateRelativeTo() {
    return isSetField(40910);
  }

  public void set(quickfix.field.StreamEffectiveDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateOffsetPeriod get(quickfix.field.StreamEffectiveDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateOffsetPeriod getStreamEffectiveDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateOffsetPeriod() {
    return isSetField(40911);
  }

  public void set(quickfix.field.StreamEffectiveDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateOffsetUnit get(quickfix.field.StreamEffectiveDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateOffsetUnit getStreamEffectiveDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateOffsetUnit() {
    return isSetField(40912);
  }

  public void set(quickfix.field.StreamEffectiveDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateOffsetDayType get(quickfix.field.StreamEffectiveDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateOffsetDayType getStreamEffectiveDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateOffsetDayType() {
    return isSetField(40913);
  }

  public void set(quickfix.field.StreamEffectiveDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateAdjusted get(quickfix.field.StreamEffectiveDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateAdjusted getStreamEffectiveDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateAdjusted());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateAdjusted() {
    return isSetField(40914);
  }
}
