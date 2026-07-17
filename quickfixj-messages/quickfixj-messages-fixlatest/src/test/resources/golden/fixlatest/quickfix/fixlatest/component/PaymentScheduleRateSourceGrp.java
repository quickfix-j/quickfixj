/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentScheduleRateSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40868, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentScheduleRateSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}
