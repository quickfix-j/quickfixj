/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class Triggered extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1823;

  public static final int NOT_TRIGGERED = 0;

  public static final int TRIGGERED = 1;

  public static final int STOP_ORDER_TRIGGERED = 2;

  public static final int OCOORDER_TRIGGERED = 3;

  public static final int OTOORDER_TRIGGERED = 4;

  public static final int OUOORDER_TRIGGERED = 5;

  public Triggered() {
    super(1823);
  }

  public Triggered(Integer data) {
    super(1823, data);
  }

  public Triggered(int data) {
    super(1823, data);
  }
}
