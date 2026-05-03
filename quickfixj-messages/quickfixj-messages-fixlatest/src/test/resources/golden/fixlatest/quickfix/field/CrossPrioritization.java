/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CrossPrioritization extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 550;

  public static final int NONE = 0;

  public static final int BUY_SIDE_IS_PRIORITIZED = 1;

  public static final int SELL_SIDE_IS_PRIORITIZED = 2;

  public CrossPrioritization() {
    super(550);
  }

  public CrossPrioritization(Integer data) {
    super(550, data);
  }

  public CrossPrioritization(int data) {
    super(550, data);
  }
}
