/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class UnsolicitedIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 325;

  public static final boolean MESSAGE_IS_BEING_SENT_AS_ARESULT_OF_APRIOR_REQUEST = false;

  public static final boolean MESSAGE_IS_BEING_SENT_UNSOLICITED = true;

  public UnsolicitedIndicator() {
    super(325);
  }

  public UnsolicitedIndicator(Boolean data) {
    super(325, data);
  }

  public UnsolicitedIndicator(boolean data) {
    super(325, data);
  }
}
