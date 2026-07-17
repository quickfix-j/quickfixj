/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentScheduleInterimExchangeDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40945, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentScheduleInterimExchangeDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}
