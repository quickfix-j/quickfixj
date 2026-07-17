/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentScheduleFixingDayOfWeek extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41162;

  public static final int EVERY_DAY = 0;

  public static final int MONDAY = 1;

  public static final int TUESDAY = 2;

  public static final int WEDNESDAY = 3;

  public static final int THURSDAY = 4;

  public static final int FRIDAY = 5;

  public static final int SATURDAY = 6;

  public static final int SUNDAY = 7;

  public PaymentScheduleFixingDayOfWeek() {
    super(41162);
  }

  public PaymentScheduleFixingDayOfWeek(Integer data) {
    super(41162, data);
  }

  public PaymentScheduleFixingDayOfWeek(int data) {
    super(41162, data);
  }
}
