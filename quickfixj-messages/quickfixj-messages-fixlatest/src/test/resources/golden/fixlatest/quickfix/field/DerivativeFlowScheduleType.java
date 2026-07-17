/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DerivativeFlowScheduleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1442;

  public static final int NERCEASTERN_OFF_PEAK = 0;

  public static final int NERCWESTERN_OFF_PEAK = 1;

  public static final int NERCCALENDAR_ALL_DAYS_IN_MONTH = 2;

  public static final int NERCEASTERN_PEAK = 3;

  public static final int NERCWESTERN_PEAK = 4;

  public static final int ALL_TIMES = 5;

  public static final int ON_PEAK = 6;

  public static final int OFF_PEAK = 7;

  public static final int BASE = 8;

  public static final int BLOCK = 9;

  public static final int OTHER = 99;

  public DerivativeFlowScheduleType() {
    super(1442);
  }

  public DerivativeFlowScheduleType(Integer data) {
    super(1442, data);
  }

  public DerivativeFlowScheduleType(int data) {
    super(1442, data);
  }
}
