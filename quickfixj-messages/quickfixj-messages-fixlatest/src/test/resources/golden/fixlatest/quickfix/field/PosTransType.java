/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosTransType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 709;

  public static final int EXERCISE = 1;

  public static final int DO_NOT_EXERCISE = 2;

  public static final int POSITION_ADJUSTMENT = 3;

  public static final int POSITION_CHANGE_SUBMISSION = 4;

  public static final int PLEDGE = 5;

  public static final int LARGE_TRADER_SUBMISSION = 6;

  public static final int LARGE_POSITIONS_REPORTING_SUBMISSION = 7;

  public static final int LONG_HOLDINGS = 8;

  public static final int INTERNAL_TRANSFER = 9;

  public static final int TRANSFER_OF_FIRM = 10;

  public static final int EXTERNAL_TRANSFER = 11;

  public static final int CORPORATE_ACTION = 12;

  public static final int NOTIFICATION = 13;

  public static final int POSITION_CREATION = 14;

  public static final int CLOSEOUT = 15;

  public static final int REOPEN = 16;

  public PosTransType() {
    super(709);
  }

  public PosTransType(Integer data) {
    super(709, data);
  }

  public PosTransType(int data) {
    super(709, data);
  }
}
