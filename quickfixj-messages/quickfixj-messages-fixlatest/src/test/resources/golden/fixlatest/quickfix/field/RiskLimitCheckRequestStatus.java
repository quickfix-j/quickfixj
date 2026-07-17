/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitCheckRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2325;

  public static final int APPROVED = 0;

  public static final int PARTIALLY_APPROVED = 1;

  public static final int REJECTED = 2;

  public static final int APPROVAL_PENDING = 3;

  public static final int CANCELLED = 4;

  public RiskLimitCheckRequestStatus() {
    super(2325);
  }

  public RiskLimitCheckRequestStatus(Integer data) {
    super(2325, data);
  }

  public RiskLimitCheckRequestStatus(int data) {
    super(2325, data);
  }
}
