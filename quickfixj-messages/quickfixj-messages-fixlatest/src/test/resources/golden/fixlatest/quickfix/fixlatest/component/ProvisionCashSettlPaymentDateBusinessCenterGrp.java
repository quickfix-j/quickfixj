/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40952, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters getNoProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(40952);
  }

public static class NoProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40164, 0};

  public NoProvisionCashSettlPaymentDateBusinessCenters() {
    super(40952, 40164, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter getProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40164);
  }
}

  public void set(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter getProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40164);
  }
}
