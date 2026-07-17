/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplResponseError extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1354;

  public static final int APPLICATION_DOES_NOT_EXIST = 0;

  public static final int MESSAGES_REQUESTED_ARE_NOT_AVAILABLE = 1;

  public static final int USER_NOT_AUTHORIZED_FOR_APPLICATION = 2;

  public ApplResponseError() {
    super(1354);
  }

  public ApplResponseError(Integer data) {
    super(1354, data);
  }

  public ApplResponseError(int data) {
    super(1354, data);
  }
}
