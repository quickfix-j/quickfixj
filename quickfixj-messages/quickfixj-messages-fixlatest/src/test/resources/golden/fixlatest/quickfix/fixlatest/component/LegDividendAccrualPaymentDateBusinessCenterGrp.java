/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendAccrualPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42310, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendAccrualPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters getNoLegDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42310);
  }

public static class NoLegDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42311, 0};

  public NoLegDividendAccrualPaymentDateBusinessCenters() {
    super(42310, 42311, ORDER);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter get(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter getLegDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42311);
  }
}

  public void set(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter get(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter getLegDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42311);
  }
}
