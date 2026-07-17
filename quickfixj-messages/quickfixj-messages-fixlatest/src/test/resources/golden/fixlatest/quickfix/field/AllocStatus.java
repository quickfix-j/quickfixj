/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 87;

  public static final int ACCEPTED = 0;

  public static final int BLOCK_LEVEL_REJECT = 1;

  public static final int ACCOUNT_LEVEL_REJECT = 2;

  public static final int RECEIVED = 3;

  public static final int INCOMPLETE = 4;

  public static final int REJECTED_BY_INTERMEDIARY = 5;

  public static final int ALLOCATION_PENDING = 6;

  public static final int REVERSED = 7;

  public static final int CANCELLED_BY_INTERMEDIARY = 8;

  public static final int CLAIMED = 9;

  public static final int REFUSED = 10;

  public static final int PENDING_GIVE_UP_APPROVAL = 11;

  public static final int CANCELLED = 12;

  public static final int PENDING_TAKE_UP_APPROVAL = 13;

  public static final int REVERSAL_PENDING = 14;

  public AllocStatus() {
    super(87);
  }

  public AllocStatus(Integer data) {
    super(87, data);
  }

  public AllocStatus(int data) {
    super(87, data);
  }
}
