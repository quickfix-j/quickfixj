/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 626;

  public static final int CALCULATED = 1;

  public static final int PRELIMINARY = 2;

  public static final int SELLSIDE_CALCULATED_USING_PRELIMINARY = 3;

  public static final int SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = 4;

  public static final int READY_TO_BOOK = 5;

  public static final int BUYSIDE_READY_TO_BOOK = 6;

  public static final int WAREHOUSE_INSTRUCTION = 7;

  public static final int REQUEST_TO_INTERMEDIARY = 8;

  public static final int ACCEPT = 9;

  public static final int REJECT = 10;

  public static final int ACCEPT_PENDING = 11;

  public static final int INCOMPLETE_GROUP = 12;

  public static final int COMPLETE_GROUP = 13;

  public static final int REVERSAL_PENDING = 14;

  public static final int REOPEN_GROUP = 15;

  public static final int CANCEL_GROUP = 16;

  public static final int GIVEUP = 17;

  public static final int TAKEUP = 18;

  public static final int REFUSE_TAKEUP = 19;

  public static final int INITIATE_REVERSAL = 20;

  public static final int REVERSE = 21;

  public static final int REFUSE_REVERSAL = 22;

  public static final int SUB_ALLOCATION_GIVEUP = 23;

  public static final int APPROVE_GIVEUP = 24;

  public static final int APPROVE_TAKEUP = 25;

  public static final int NOTIONAL_VALUE_AVERAGE_PX_GROUP_ALLOC = 26;

  public AllocType() {
    super(626);
  }

  public AllocType(Integer data) {
    super(626, data);
  }

  public AllocType(int data) {
    super(626, data);
  }
}
