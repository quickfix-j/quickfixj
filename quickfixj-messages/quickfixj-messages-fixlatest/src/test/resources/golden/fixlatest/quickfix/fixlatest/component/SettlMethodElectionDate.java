/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlMethodElectionDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42777, 42778, 42779, 42780, 42781, 42782, 42783, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public SettlMethodElectionDate() {
    super();
  }

  public void set(quickfix.field.SettlMethodElectionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateUnadjusted get(quickfix.field.SettlMethodElectionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateUnadjusted getSettlMethodElectionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateUnadjusted() {
    return isSetField(42777);
  }

  public void set(quickfix.field.SettlMethodElectionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateBusinessDayConvention get(quickfix.field.SettlMethodElectionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateBusinessDayConvention getSettlMethodElectionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateBusinessDayConvention() {
    return isSetField(42778);
  }

  public void set(quickfix.fixlatest.component.SettlMethodElectionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlMethodElectionDateBusinessCenterGrp get(quickfix.fixlatest.component.SettlMethodElectionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlMethodElectionDateBusinessCenterGrp getSettlMethodElectionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlMethodElectionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoSettlMethodElectionDateBusinessCenters get(quickfix.field.NoSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlMethodElectionDateBusinessCenters getNoSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlMethodElectionDateBusinessCenters() {
    return isSetField(42775);
  }

public static class NoSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42776, 0};

  public NoSettlMethodElectionDateBusinessCenters() {
    super(42775, 42776, ORDER);
  }

  public void set(quickfix.field.SettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter get(quickfix.field.SettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter getSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateBusinessCenter() {
    return isSetField(42776);
  }
}

  public void set(quickfix.field.SettlMethodElectionDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateRelativeTo get(quickfix.field.SettlMethodElectionDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateRelativeTo getSettlMethodElectionDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateRelativeTo());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateRelativeTo() {
    return isSetField(42779);
  }

  public void set(quickfix.field.SettlMethodElectionDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateOffsetPeriod get(quickfix.field.SettlMethodElectionDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateOffsetPeriod getSettlMethodElectionDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateOffsetPeriod() {
    return isSetField(42780);
  }

  public void set(quickfix.field.SettlMethodElectionDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateOffsetUnit get(quickfix.field.SettlMethodElectionDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateOffsetUnit getSettlMethodElectionDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateOffsetUnit() {
    return isSetField(42781);
  }

  public void set(quickfix.field.SettlMethodElectionDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateOffsetDayType get(quickfix.field.SettlMethodElectionDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateOffsetDayType getSettlMethodElectionDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateOffsetDayType() {
    return isSetField(42782);
  }

  public void set(quickfix.field.SettlMethodElectionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateAdjusted get(quickfix.field.SettlMethodElectionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateAdjusted getSettlMethodElectionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateAdjusted());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateAdjusted() {
    return isSetField(42783);
  }
}
