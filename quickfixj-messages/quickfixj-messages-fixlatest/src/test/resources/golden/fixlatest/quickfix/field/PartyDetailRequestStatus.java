/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyDetailRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1878;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public static final int ACCEPTANCE_PENDING = 3;

  public PartyDetailRequestStatus() {
    super(1878);
  }

  public PartyDetailRequestStatus(Integer data) {
    super(1878, data);
  }

  public PartyDetailRequestStatus(int data) {
    super(1878, data);
  }
}
