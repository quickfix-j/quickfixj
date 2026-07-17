/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplQueueResolution extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 814;

  public static final int NO_ACTION_TAKEN = 0;

  public static final int QUEUE_FLUSHED = 1;

  public static final int OVERLAY_LAST = 2;

  public static final int END_SESSION = 3;

  public ApplQueueResolution() {
    super(814);
  }

  public ApplQueueResolution(Integer data) {
    super(814, data);
  }

  public ApplQueueResolution(int data) {
    super(814, data);
  }
}
