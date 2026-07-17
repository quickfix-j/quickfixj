/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1762;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public static final int ACCEPTANCE_PENDING = 3;

  public RiskLimitRequestStatus() {
    super(1762);
  }

  public RiskLimitRequestStatus(Integer data) {
    super(1762, data);
  }

  public RiskLimitRequestStatus(int data) {
    super(1762, data);
  }
}
