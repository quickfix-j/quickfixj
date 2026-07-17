/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocCancReplaceReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 796;

  public static final int ORIGINAL_DETAILS_INCOMPLETE = 1;

  public static final int CHANGE_IN_UNDERLYING_ORDER_DETAILS = 2;

  public static final int CANCELLED_BY_GIVEUP_FIRM = 3;

  public static final int OTHER = 99;

  public AllocCancReplaceReason() {
    super(796);
  }

  public AllocCancReplaceReason(Integer data) {
    super(796, data);
  }

  public AllocCancReplaceReason(int data) {
    super(796, data);
  }
}
