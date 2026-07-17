/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendAccrualPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42236, };
  protected int[] getGroupFields() { return componentGroups; }

  public DividendAccrualPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendAccrualPaymentDateBusinessCenters getNoDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42236);
  }

public static class NoDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42237, 0};

  public NoDividendAccrualPaymentDateBusinessCenters() {
    super(42236, 42237, ORDER);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter get(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter getDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42237);
  }
}

  public void set(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter get(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter getDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42237);
  }
}
