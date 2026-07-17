/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassOrderRequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2426;

  public static final int SUCCESSFUL = 0;

  public static final int RESPONSE_LEVEL_NOT_SUPPORTED = 1;

  public static final int INVALID_MARKET = 2;

  public static final int INVALID_MARKET_SEGMENT = 3;

  public static final int OTHER = 99;

  public MassOrderRequestResult() {
    super(2426);
  }

  public MassOrderRequestResult(Integer data) {
    super(2426, data);
  }

  public MassOrderRequestResult(int data) {
    super(2426, data);
  }
}
