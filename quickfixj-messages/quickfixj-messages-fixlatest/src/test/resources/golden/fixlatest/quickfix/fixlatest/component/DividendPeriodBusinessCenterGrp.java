/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42294, };
  protected int[] getGroupFields() { return componentGroups; }

  public DividendPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendPeriodBusinessCenters get(quickfix.field.NoDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendPeriodBusinessCenters getNoDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendPeriodBusinessCenters() {
    return isSetField(42294);
  }

public static class NoDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42295, 0};

  public NoDividendPeriodBusinessCenters() {
    super(42294, 42295, ORDER);
  }

  public void set(quickfix.field.DividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodBusinessCenter get(quickfix.field.DividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodBusinessCenter getDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodBusinessCenter() {
    return isSetField(42295);
  }
}

  public void set(quickfix.field.DividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodBusinessCenter get(quickfix.field.DividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodBusinessCenter getDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodBusinessCenter() {
    return isSetField(42295);
  }
}
