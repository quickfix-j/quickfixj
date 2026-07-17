/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSettlMethodElectionDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42574, 42575, 42576, 42577, 42578, 42579, 42580, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegSettlMethodElectionDate() {
    super();
  }

  public void set(quickfix.field.LegSettlMethodElectionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateUnadjusted get(quickfix.field.LegSettlMethodElectionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateUnadjusted getLegSettlMethodElectionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateUnadjusted() {
    return isSetField(42574);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessDayConvention get(quickfix.field.LegSettlMethodElectionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessDayConvention getLegSettlMethodElectionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateBusinessDayConvention() {
    return isSetField(42575);
  }

  public void set(quickfix.fixlatest.component.LegSettlMethodElectionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSettlMethodElectionDateBusinessCenterGrp get(quickfix.fixlatest.component.LegSettlMethodElectionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSettlMethodElectionDateBusinessCenterGrp getLegSettlMethodElectionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSettlMethodElectionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegSettlMethodElectionDateBusinessCenters get(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSettlMethodElectionDateBusinessCenters getNoLegSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSettlMethodElectionDateBusinessCenters() {
    return isSetField(42581);
  }

public static class NoLegSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42582, 0};

  public NoLegSettlMethodElectionDateBusinessCenters() {
    super(42581, 42582, ORDER);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter get(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter getLegSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateBusinessCenter() {
    return isSetField(42582);
  }
}

  public void set(quickfix.field.LegSettlMethodElectionDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateRelativeTo get(quickfix.field.LegSettlMethodElectionDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateRelativeTo getLegSettlMethodElectionDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateRelativeTo() {
    return isSetField(42576);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetPeriod get(quickfix.field.LegSettlMethodElectionDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetPeriod getLegSettlMethodElectionDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateOffsetPeriod() {
    return isSetField(42577);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetUnit get(quickfix.field.LegSettlMethodElectionDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetUnit getLegSettlMethodElectionDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateOffsetUnit() {
    return isSetField(42578);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetDayType get(quickfix.field.LegSettlMethodElectionDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateOffsetDayType getLegSettlMethodElectionDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateOffsetDayType() {
    return isSetField(42579);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateAdjusted get(quickfix.field.LegSettlMethodElectionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateAdjusted getLegSettlMethodElectionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateAdjusted() {
    return isSetField(42580);
  }
}
