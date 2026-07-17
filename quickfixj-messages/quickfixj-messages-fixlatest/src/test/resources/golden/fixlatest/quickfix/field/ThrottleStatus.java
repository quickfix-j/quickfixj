/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1609;

  public static final int THROTTLE_LIMIT_NOT_EXCEEDED_NOT_QUEUED = 0;

  public static final int QUEUED_DUE_TO_THROTTLE_LIMIT_EXCEEDED = 1;

  public ThrottleStatus() {
    super(1609);
  }

  public ThrottleStatus(Integer data) {
    super(1609, data);
  }

  public ThrottleStatus(int data) {
    super(1609, data);
  }
}
