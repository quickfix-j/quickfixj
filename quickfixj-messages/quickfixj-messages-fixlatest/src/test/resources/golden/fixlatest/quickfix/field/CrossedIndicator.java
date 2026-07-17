/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CrossedIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2523;

  public static final int NO_CROSS = 0;

  public static final int CROSS_REJECTED = 1;

  public static final int CROSS_ACCEPTED = 2;

  public CrossedIndicator() {
    super(2523);
  }

  public CrossedIndicator(Integer data) {
    super(2523, data);
  }

  public CrossedIndicator(int data) {
    super(2523, data);
  }
}
