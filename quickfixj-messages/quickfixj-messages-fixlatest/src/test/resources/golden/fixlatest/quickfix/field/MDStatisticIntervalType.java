/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDStatisticIntervalType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2464;

  public static final int SLIDING_WINDOW = 1;

  public static final int SLIDING_WINDOW_PEAK = 2;

  public static final int FIXED_DATE_RANGE = 3;

  public static final int FIXED_TIME_RANGE = 4;

  public static final int CURRENT_TIME_UNIT = 5;

  public static final int PREVIOUS_TIME_UNIT = 6;

  public static final int MAXIMUM_RANGE = 7;

  public static final int MAXIMUM_RANGE_UP_TO_PREVIOUS_TIME_UNIT = 8;

  public MDStatisticIntervalType() {
    super(2464);
  }

  public MDStatisticIntervalType(Integer data) {
    super(2464, data);
  }

  public MDStatisticIntervalType(int data) {
    super(2464, data);
  }
}
