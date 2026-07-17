/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderEventType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1796;

  public static final int ADDED = 1;

  public static final int MODIFIED = 2;

  public static final int DELETED = 3;

  public static final int PARTIALLY_FILLED = 4;

  public static final int FILLED = 5;

  public static final int SUSPENDED = 6;

  public static final int RELEASED = 7;

  public static final int RESTATED = 8;

  public static final int LOCKED = 9;

  public static final int TRIGGERED = 10;

  public static final int ACTIVATED = 11;

  public OrderEventType() {
    super(1796);
  }

  public OrderEventType(Integer data) {
    super(1796, data);
  }

  public OrderEventType(int data) {
    super(1796, data);
  }
}
