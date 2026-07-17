/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlPaymentFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40171, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlPaymentFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlPaymentDates get(quickfix.field.NoProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlPaymentDates getNoProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlPaymentDates() {
    return isSetField(40171);
  }

public static class NoProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40172, 40173, 0};

  public NoProvisionCashSettlPaymentDates() {
    super(40171, 40172, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDate get(quickfix.field.ProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDate getProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDate() {
    return isSetField(40172);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType get(quickfix.field.ProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType getProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateType() {
    return isSetField(40173);
  }
}

  public void set(quickfix.field.ProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDate get(quickfix.field.ProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDate getProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDate() {
    return isSetField(40172);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType get(quickfix.field.ProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType getProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateType() {
    return isSetField(40173);
  }
}
