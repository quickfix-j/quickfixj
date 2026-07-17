/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42915, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters getNoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42915);
  }

public static class NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42916, 0};

  public NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() {
    super(42915, 42916, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter getUnderlyingPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42916);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter getUnderlyingPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42916);
  }
}
