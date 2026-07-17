/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCalculationPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40973, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCalculationPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters get(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters getNoUnderlyingStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCalculationPeriodBusinessCenters() {
    return isSetField(40973);
  }

public static class NoUnderlyingStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40557, 0};

  public NoUnderlyingStreamCalculationPeriodBusinessCenters() {
    super(40973, 40557, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter get(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter getUnderlyingStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodBusinessCenter() {
    return isSetField(40557);
  }
}

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter get(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter getUnderlyingStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodBusinessCenter() {
    return isSetField(40557);
  }
}
