/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleInst extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1685;

  public static final int REJECT_IF_THROTTLE_LIMIT_EXCEEDED = 0;

  public static final int QUEUE_IF_THROTTLE_LIMIT_EXCEEDED = 1;

  public ThrottleInst() {
    super(1685);
  }

  public ThrottleInst(Integer data) {
    super(1685, data);
  }

  public ThrottleInst(int data) {
    super(1685, data);
  }
}
