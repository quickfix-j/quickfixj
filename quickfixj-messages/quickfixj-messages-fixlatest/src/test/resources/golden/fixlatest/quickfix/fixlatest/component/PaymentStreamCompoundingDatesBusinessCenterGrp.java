/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42620, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters getNoPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42620);
  }

public static class NoPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42621, 0};

  public NoPaymentStreamCompoundingDatesBusinessCenters() {
    super(42620, 42621, ORDER);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter getPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42621);
  }
}

  public void set(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter getPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42621);
  }
}
