/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlValueDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40935, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlValueDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters getNoLegProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(40935);
  }

public static class NoLegProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40527, 0};

  public NoLegProvisionCashSettlValueDateBusinessCenters() {
    super(40935, 40527, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter get(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter getLegProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40527);
  }
}

  public void set(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter get(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter getLegProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40527);
  }
}
