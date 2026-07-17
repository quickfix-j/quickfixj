/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PriorityIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 638;

  public static final int PRIORITY_UNCHANGED = 0;

  public static final int LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE = 1;

  public PriorityIndicator() {
    super(638);
  }

  public PriorityIndicator(Integer data) {
    super(638, data);
  }

  public PriorityIndicator(int data) {
    super(638, data);
  }
}
