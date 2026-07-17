/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamNotionalAdjustments extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42787;

  public static final int EXECUTION = 0;

  public static final int PORTFOLIO_REBALANCING = 1;

  public static final int STANDARD = 2;

  public StreamNotionalAdjustments() {
    super(42787);
  }

  public StreamNotionalAdjustments(Integer data) {
    super(42787, data);
  }

  public StreamNotionalAdjustments(int data) {
    super(42787, data);
  }
}
