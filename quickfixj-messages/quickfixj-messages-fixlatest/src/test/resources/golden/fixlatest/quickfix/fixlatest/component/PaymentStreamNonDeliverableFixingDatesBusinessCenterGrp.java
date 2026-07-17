/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40946, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters get(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters getNoPaymentStreamNonDeliverableFixingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    return isSetField(40946);
  }

public static class NoPaymentStreamNonDeliverableFixingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40819, 0};

  public NoPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    super(40946, 40819, ORDER);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter getPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40819);
  }
}

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter getPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40819);
  }
}
