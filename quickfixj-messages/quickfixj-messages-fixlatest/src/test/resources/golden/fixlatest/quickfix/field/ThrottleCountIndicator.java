/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleCountIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1686;

  public static final int OUTSTANDING_REQUESTS_UNCHANGED = 0;

  public static final int OUTSTANDING_REQUESTS_DECREASED = 1;

  public ThrottleCountIndicator() {
    super(1686);
  }

  public ThrottleCountIndicator(Integer data) {
    super(1686, data);
  }

  public ThrottleCountIndicator(int data) {
    super(1686, data);
  }
}
