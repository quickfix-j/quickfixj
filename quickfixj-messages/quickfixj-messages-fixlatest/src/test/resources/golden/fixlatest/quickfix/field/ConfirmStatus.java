/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ConfirmStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 665;

  public static final int RECEIVED = 1;

  public static final int MISMATCHED_ACCOUNT = 2;

  public static final int MISSING_SETTLEMENT_INSTRUCTIONS = 3;

  public static final int CONFIRMED = 4;

  public static final int REQUEST_REJECTED = 5;

  public ConfirmStatus() {
    super(665);
  }

  public ConfirmStatus(Integer data) {
    super(665, data);
  }

  public ConfirmStatus(int data) {
    super(665, data);
  }
}
