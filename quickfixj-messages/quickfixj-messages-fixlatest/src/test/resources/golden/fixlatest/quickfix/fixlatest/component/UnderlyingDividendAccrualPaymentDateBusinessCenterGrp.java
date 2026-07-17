/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendAccrualPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42799, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendAccrualPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters getNoUnderlyingDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42799);
  }

public static class NoUnderlyingDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42800, 0};

  public NoUnderlyingDividendAccrualPaymentDateBusinessCenters() {
    super(42799, 42800, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter get(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter getUnderlyingDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42800);
  }
}

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter get(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter getUnderlyingDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42800);
  }
}
