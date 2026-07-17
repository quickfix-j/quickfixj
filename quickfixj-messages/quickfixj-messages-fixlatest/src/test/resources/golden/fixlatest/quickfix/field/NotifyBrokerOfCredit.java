/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class NotifyBrokerOfCredit extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 208;

  public static final boolean DETAILS_SHOULD_NOT_BE_COMMUNICATED = false;

  public static final boolean DETAILS_SHOULD_BE_COMMUNICATED = true;

  public NotifyBrokerOfCredit() {
    super(208);
  }

  public NotifyBrokerOfCredit(Boolean data) {
    super(208, data);
  }

  public NotifyBrokerOfCredit(boolean data) {
    super(208, data);
  }
}
