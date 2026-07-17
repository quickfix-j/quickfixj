/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1763;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public RiskLimitStatus() {
    super(1763);
  }

  public RiskLimitStatus(Integer data) {
    super(1763, data);
  }

  public RiskLimitStatus(int data) {
    super(1763, data);
  }
}
