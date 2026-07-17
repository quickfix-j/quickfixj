/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class FlowScheduleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1439;

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

  public FlowScheduleType() {
    super(1439);
  }

  public FlowScheduleType(Integer data) {
    super(1439, data);
  }

  public FlowScheduleType(int data) {
    super(1439, data);
  }
}
