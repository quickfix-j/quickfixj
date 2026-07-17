/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlValueDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40953, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlValueDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlValueDateBusinessCenters getNoProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(40953);
  }

public static class NoProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40117, 0};

  public NoProvisionCashSettlValueDateBusinessCenters() {
    super(40953, 40117, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter get(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter getProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40117);
  }
}

  public void set(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter get(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter getProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40117);
  }
}
