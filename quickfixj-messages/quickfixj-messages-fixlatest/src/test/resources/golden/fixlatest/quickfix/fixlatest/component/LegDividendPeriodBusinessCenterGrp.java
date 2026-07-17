/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42386, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendPeriodBusinessCenters get(quickfix.field.NoLegDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendPeriodBusinessCenters getNoLegDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendPeriodBusinessCenters() {
    return isSetField(42386);
  }

public static class NoLegDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42387, 0};

  public NoLegDividendPeriodBusinessCenters() {
    super(42386, 42387, ORDER);
  }

  public void set(quickfix.field.LegDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodBusinessCenter get(quickfix.field.LegDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodBusinessCenter getLegDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodBusinessCenter() {
    return isSetField(42387);
  }
}

  public void set(quickfix.field.LegDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodBusinessCenter get(quickfix.field.LegDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodBusinessCenter getLegDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodBusinessCenter() {
    return isSetField(42387);
  }
}
