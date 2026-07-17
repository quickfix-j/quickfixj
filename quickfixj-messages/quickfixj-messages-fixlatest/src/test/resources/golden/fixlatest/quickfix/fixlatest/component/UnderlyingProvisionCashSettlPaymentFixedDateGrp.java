/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlPaymentFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42099, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlPaymentFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates get(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates getNoUnderlyingProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlPaymentDates() {
    return isSetField(42099);
  }

public static class NoUnderlyingProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42100, 42101, 0};

  public NoUnderlyingProvisionCashSettlPaymentDates() {
    super(42099, 42100, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate get(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate getUnderlyingProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDate() {
    return isSetField(42100);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType getUnderlyingProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateType() {
    return isSetField(42101);
  }
}

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate get(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate getUnderlyingProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDate() {
    return isSetField(42100);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType getUnderlyingProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateType() {
    return isSetField(42101);
  }
}
