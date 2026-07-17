/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendPaymentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42855, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendPaymentGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDividendPayments value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendPayments get(quickfix.field.NoUnderlyingDividendPayments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendPayments getNoUnderlyingDividendPayments() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendPayments());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendPayments field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendPayments() {
    return isSetField(42855);
  }

public static class NoUnderlyingDividendPayments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42856, 42857, 42858, 42859, 0};

  public NoUnderlyingDividendPayments() {
    super(42855, 42856, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentDate get(quickfix.field.UnderlyingDividendPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentDate getUnderlyingDividendPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentDate() {
    return isSetField(42856);
  }

  public void set(quickfix.field.UnderlyingDividendPaymentAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentAmount get(quickfix.field.UnderlyingDividendPaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentAmount getUnderlyingDividendPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentAmount() {
    return isSetField(42857);
  }

  public void set(quickfix.field.UnderlyingDividendPaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentCurrency get(quickfix.field.UnderlyingDividendPaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentCurrency getUnderlyingDividendPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentCurrency() {
    return isSetField(42858);
  }

  public void set(quickfix.field.UnderlyingDividendAccruedInterest value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccruedInterest get(quickfix.field.UnderlyingDividendAccruedInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccruedInterest getUnderlyingDividendAccruedInterest() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccruedInterest());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccruedInterest field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccruedInterest() {
    return isSetField(42859);
  }
}

  public void set(quickfix.field.UnderlyingDividendPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentDate get(quickfix.field.UnderlyingDividendPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentDate getUnderlyingDividendPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentDate() {
    return isSetField(42856);
  }

  public void set(quickfix.field.UnderlyingDividendPaymentAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentAmount get(quickfix.field.UnderlyingDividendPaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentAmount getUnderlyingDividendPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentAmount() {
    return isSetField(42857);
  }

  public void set(quickfix.field.UnderlyingDividendPaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPaymentCurrency get(quickfix.field.UnderlyingDividendPaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPaymentCurrency getUnderlyingDividendPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPaymentCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPaymentCurrency() {
    return isSetField(42858);
  }

  public void set(quickfix.field.UnderlyingDividendAccruedInterest value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccruedInterest get(quickfix.field.UnderlyingDividendAccruedInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccruedInterest getUnderlyingDividendAccruedInterest() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccruedInterest());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccruedInterest field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccruedInterest() {
    return isSetField(42859);
  }
}
