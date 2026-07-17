/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentScheduleFixingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41161, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentScheduleFixingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}
