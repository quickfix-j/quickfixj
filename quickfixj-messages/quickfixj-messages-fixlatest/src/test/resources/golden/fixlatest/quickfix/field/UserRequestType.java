/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UserRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 924;

  public static final int LOG_ON_USER = 1;

  public static final int LOG_OFF_USER = 2;

  public static final int CHANGE_PASSWORD_FOR_USER = 3;

  public static final int REQUEST_INDIVIDUAL_USER_STATUS = 4;

  public static final int REQUEST_THROTTLE_LIMIT = 5;

  public UserRequestType() {
    super(924);
  }

  public UserRequestType(Integer data) {
    super(924, data);
  }

  public UserRequestType(int data) {
    super(924, data);
  }
}
