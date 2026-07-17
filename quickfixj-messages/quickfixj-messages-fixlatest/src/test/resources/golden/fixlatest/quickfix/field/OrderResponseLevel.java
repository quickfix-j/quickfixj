/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderResponseLevel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2427;

  public static final int NO_ACK = 0;

  public static final int MINIMUM_ACK = 1;

  public static final int ACK_EACH = 2;

  public static final int SUMMARY_ACK = 3;

  public OrderResponseLevel() {
    super(2427);
  }

  public OrderResponseLevel(Integer data) {
    super(2427, data);
  }

  public OrderResponseLevel(int data) {
    super(2427, data);
  }
}
