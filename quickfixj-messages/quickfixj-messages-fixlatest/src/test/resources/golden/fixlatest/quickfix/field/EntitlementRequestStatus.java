/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class EntitlementRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1882;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public static final int ACCEPTANCE_PENDING = 3;

  public EntitlementRequestStatus() {
    super(1882);
  }

  public EntitlementRequestStatus(Integer data) {
    super(1882, data);
  }

  public EntitlementRequestStatus(int data) {
    super(1882, data);
  }
}
