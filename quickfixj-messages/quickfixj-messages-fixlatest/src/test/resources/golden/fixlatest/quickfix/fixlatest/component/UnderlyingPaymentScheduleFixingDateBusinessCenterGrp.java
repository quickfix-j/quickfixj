/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentScheduleFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40966, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentScheduleFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}
