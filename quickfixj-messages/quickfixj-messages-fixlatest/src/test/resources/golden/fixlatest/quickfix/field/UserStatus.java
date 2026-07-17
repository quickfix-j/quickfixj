/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UserStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 926;

  public static final int LOGGED_IN = 1;

  public static final int NOT_LOGGED_IN = 2;

  public static final int USER_NOT_RECOGNISED = 3;

  public static final int PASSWORD_INCORRECT = 4;

  public static final int PASSWORD_CHANGED = 5;

  public static final int OTHER = 6;

  public static final int FORCED_USER_LOGOUT_BY_EXCHANGE = 7;

  public static final int SESSION_SHUTDOWN_WARNING = 8;

  public static final int THROTTLE_PARAMETERS_CHANGED = 9;

  public UserStatus() {
    super(926);
  }

  public UserStatus(Integer data) {
    super(926, data);
  }

  public UserStatus(int data) {
    super(926, data);
  }
}
