/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCalculationPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40940, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCalculationPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCalculationPeriodBusinessCenters get(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCalculationPeriodBusinessCenters getNoLegStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCalculationPeriodBusinessCenters() {
    return isSetField(40940);
  }

public static class NoLegStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40266, 0};

  public NoLegStreamCalculationPeriodBusinessCenters() {
    super(40940, 40266, ORDER);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter get(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter getLegStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodBusinessCenter() {
    return isSetField(40266);
  }
}

  public void set(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter get(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter getLegStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodBusinessCenter() {
    return isSetField(40266);
  }
}
