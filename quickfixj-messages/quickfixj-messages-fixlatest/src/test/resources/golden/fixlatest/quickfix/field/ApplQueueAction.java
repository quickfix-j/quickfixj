/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplQueueAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 815;

  public static final int NO_ACTION_TAKEN = 0;

  public static final int QUEUE_FLUSHED = 1;

  public static final int OVERLAY_LAST = 2;

  public static final int END_SESSION = 3;

  public ApplQueueAction() {
    super(815);
  }

  public ApplQueueAction(Integer data) {
    super(815, data);
  }

  public ApplQueueAction(int data) {
    super(815, data);
  }
}
