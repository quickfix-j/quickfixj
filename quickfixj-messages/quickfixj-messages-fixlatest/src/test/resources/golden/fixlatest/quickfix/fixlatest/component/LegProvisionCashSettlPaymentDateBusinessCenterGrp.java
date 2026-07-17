/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40934, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters getNoLegProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(40934);
  }

public static class NoLegProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40517, 0};

  public NoLegProvisionCashSettlPaymentDateBusinessCenters() {
    super(40934, 40517, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter getLegProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40517);
  }
}

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter getLegProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40517);
  }
}
