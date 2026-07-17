/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassOrderRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2425;

  public static final int ACCEPTED = 1;

  public static final int ACCEPTED_WITH_ADDITIONAL_EVENTS = 2;

  public static final int REJECTED = 3;

  public MassOrderRequestStatus() {
    super(2425);
  }

  public MassOrderRequestStatus(Integer data) {
    super(2425, data);
  }

  public MassOrderRequestStatus(int data) {
    super(2425, data);
  }
}
