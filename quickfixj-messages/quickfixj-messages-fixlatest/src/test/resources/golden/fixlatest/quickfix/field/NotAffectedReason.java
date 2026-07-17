/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NotAffectedReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2677;

  public static final int ORDER_SUSPENDED = 0;

  public static final int INSTRUMENT_SUSPENDED = 1;

  public NotAffectedReason() {
    super(2677);
  }

  public NotAffectedReason(Integer data) {
    super(2677, data);
  }

  public NotAffectedReason(int data) {
    super(2677, data);
  }
}
