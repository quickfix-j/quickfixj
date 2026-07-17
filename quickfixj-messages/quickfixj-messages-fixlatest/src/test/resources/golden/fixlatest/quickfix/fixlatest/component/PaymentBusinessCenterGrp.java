/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40944, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentBusinessCenters get(quickfix.field.NoPaymentBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentBusinessCenters getNoPaymentBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentBusinessCenters() {
    return isSetField(40944);
  }

public static class NoPaymentBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40221, 0};

  public NoPaymentBusinessCenters() {
    super(40944, 40221, ORDER);
  }

  public void set(quickfix.field.PaymentBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessCenter get(quickfix.field.PaymentBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessCenter getPaymentBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessCenter() {
    return isSetField(40221);
  }
}

  public void set(quickfix.field.PaymentBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessCenter get(quickfix.field.PaymentBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessCenter getPaymentBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessCenter() {
    return isSetField(40221);
  }
}
