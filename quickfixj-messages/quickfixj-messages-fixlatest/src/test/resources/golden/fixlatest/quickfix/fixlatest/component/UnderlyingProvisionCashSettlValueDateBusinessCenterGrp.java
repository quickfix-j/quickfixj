/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlValueDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42182, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlValueDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters getNoUnderlyingProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(42182);
  }

public static class NoUnderlyingProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42183, 0};

  public NoUnderlyingProvisionCashSettlValueDateBusinessCenters() {
    super(42182, 42183, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter getUnderlyingProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(42183);
  }
}

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter getUnderlyingProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(42183);
  }
}
