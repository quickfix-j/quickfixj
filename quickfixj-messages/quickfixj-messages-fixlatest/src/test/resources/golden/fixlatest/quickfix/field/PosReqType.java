/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosReqType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 724;

  public static final int POSITIONS = 0;

  public static final int TRADES = 1;

  public static final int EXERCISES = 2;

  public static final int ASSIGNMENTS = 3;

  public static final int SETTLEMENT_ACTIVITY = 4;

  public static final int BACKOUT_MESSAGE = 5;

  public static final int DELTA_POSITIONS = 6;

  public static final int NET_POSITION = 7;

  public static final int LARGE_POSITIONS_REPORTING = 8;

  public static final int EXERCISE_POSITION_REPORTING_SUBMISSION = 9;

  public static final int POSITION_LIMIT_REPORTING_SUBMISSING = 10;

  public PosReqType() {
    super(724);
  }

  public PosReqType(Integer data) {
    super(724, data);
  }

  public PosReqType(int data) {
    super(724, data);
  }
}
