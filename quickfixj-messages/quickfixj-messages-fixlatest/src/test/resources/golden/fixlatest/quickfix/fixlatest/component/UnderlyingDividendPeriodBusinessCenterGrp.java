/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42882, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendPeriodBusinessCenters get(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendPeriodBusinessCenters getNoUnderlyingDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendPeriodBusinessCenters() {
    return isSetField(42882);
  }

public static class NoUnderlyingDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42883, 0};

  public NoUnderlyingDividendPeriodBusinessCenters() {
    super(42882, 42883, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter get(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter getUnderlyingDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodBusinessCenter() {
    return isSetField(42883);
  }
}

  public void set(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter get(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter getUnderlyingDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodBusinessCenter() {
    return isSetField(42883);
  }
}
