/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateValuationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43069, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateValuationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters get(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters getNoUnderlyingReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDateBusinessCenters() {
    return isSetField(43069);
  }

public static class NoUnderlyingReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43070, 0};

  public NoUnderlyingReturnRateValuationDateBusinessCenters() {
    super(43069, 43070, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}
