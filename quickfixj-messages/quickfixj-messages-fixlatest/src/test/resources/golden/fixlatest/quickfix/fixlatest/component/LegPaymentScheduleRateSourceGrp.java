/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentScheduleRateSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40414, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentScheduleRateSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}
