/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateValuationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42770, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateValuationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters get(quickfix.field.NoReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters getNoReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDateBusinessCenters() {
    return isSetField(42770);
  }

public static class NoReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42771, 0};

  public NoReturnRateValuationDateBusinessCenters() {
    super(42770, 42771, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}
