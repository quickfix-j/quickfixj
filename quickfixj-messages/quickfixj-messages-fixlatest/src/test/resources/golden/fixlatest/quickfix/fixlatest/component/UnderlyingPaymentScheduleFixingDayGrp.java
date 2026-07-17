/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentScheduleFixingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41878, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentScheduleFixingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}
