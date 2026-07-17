/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1611;

  public static final int QUEUE_INBOUND = 0;

  public static final int QUEUE_OUTBOUND = 1;

  public static final int REJECT = 2;

  public static final int DISCONNECT = 3;

  public static final int WARNING = 4;

  public ThrottleAction() {
    super(1611);
  }

  public ThrottleAction(Integer data) {
    super(1611, data);
  }

  public ThrottleAction(int data) {
    super(1611, data);
  }
}
