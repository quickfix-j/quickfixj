/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlPaymentFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40473, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlPaymentFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDates get(quickfix.field.NoLegProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDates getNoLegProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlPaymentDates() {
    return isSetField(40473);
  }

public static class NoLegProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40474, 40475, 0};

  public NoLegProvisionCashSettlPaymentDates() {
    super(40473, 40474, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate get(quickfix.field.LegProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate getLegProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDate() {
    return isSetField(40474);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType get(quickfix.field.LegProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType getLegProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateType() {
    return isSetField(40475);
  }
}

  public void set(quickfix.field.LegProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate get(quickfix.field.LegProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate getLegProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDate() {
    return isSetField(40474);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType get(quickfix.field.LegProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType getLegProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateType() {
    return isSetField(40475);
  }
}
