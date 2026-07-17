/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentScheduleRateSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40704, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentScheduleRateSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}
