/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSettlMethodElectionDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {43076, 43077, 43078, 43079, 43080, 43081, 43082, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSettlMethodElectionDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted get(quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted getUnderlyingSettlMethodElectionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateUnadjusted() {
    return isSetField(43076);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention get(quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention getUnderlyingSettlMethodElectionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateBusinessDayConvention() {
    return isSetField(43077);
  }

  public void set(quickfix.fixlatest.component.UnderlyingSettlMethodElectionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSettlMethodElectionDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingSettlMethodElectionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSettlMethodElectionDateBusinessCenterGrp getUnderlyingSettlMethodElectionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSettlMethodElectionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters get(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters getNoUnderlyingSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSettlMethodElectionDateBusinessCenters() {
    return isSetField(43074);
  }

public static class NoUnderlyingSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43075, 0};

  public NoUnderlyingSettlMethodElectionDateBusinessCenters() {
    super(43074, 43075, ORDER);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter get(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter getUnderlyingSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateBusinessCenter() {
    return isSetField(43075);
  }
}

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo get(quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo getUnderlyingSettlMethodElectionDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateRelativeTo() {
    return isSetField(43078);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod get(quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod getUnderlyingSettlMethodElectionDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateOffsetPeriod() {
    return isSetField(43079);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit get(quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit getUnderlyingSettlMethodElectionDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateOffsetUnit() {
    return isSetField(43080);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType get(quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType getUnderlyingSettlMethodElectionDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateOffsetDayType() {
    return isSetField(43081);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateAdjusted get(quickfix.field.UnderlyingSettlMethodElectionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateAdjusted getUnderlyingSettlMethodElectionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateAdjusted() {
    return isSetField(43082);
  }
}
