/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentScheduleFixingDayDistribution extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41543;

  public static final int ALL = 0;

  public static final int FIRST = 1;

  public static final int LAST = 2;

  public static final int PENULTIMATE = 3;

  public LegPaymentScheduleFixingDayDistribution() {
    super(41543);
  }

  public LegPaymentScheduleFixingDayDistribution(Integer data) {
    super(41543, data);
  }

  public LegPaymentScheduleFixingDayDistribution(int data) {
    super(41543, data);
  }
}
