/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentScheduleFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40977, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentScheduleFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}
