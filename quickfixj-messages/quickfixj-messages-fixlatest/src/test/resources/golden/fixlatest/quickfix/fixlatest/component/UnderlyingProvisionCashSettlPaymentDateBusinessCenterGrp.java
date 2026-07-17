/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42180, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters getNoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(42180);
  }

public static class NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42181, 0};

  public NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() {
    super(42180, 42181, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter getUnderlyingProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(42181);
  }
}

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter getUnderlyingProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(42181);
  }
}
