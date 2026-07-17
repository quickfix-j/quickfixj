/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentScheduleFixingDayDistribution extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41174;

  public static final int ALL = 0;

  public static final int FIRST = 1;

  public static final int LAST = 2;

  public static final int PENULTIMATE = 3;

  public PaymentScheduleFixingDayDistribution() {
    super(41174);
  }

  public PaymentScheduleFixingDayDistribution(Integer data) {
    super(41174, data);
  }

  public PaymentScheduleFixingDayDistribution(int data) {
    super(41174, data);
  }
}
