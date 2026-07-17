/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class AggressorIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1057;

  public static final boolean ORDER_INITIATOR_IS_AGGRESSOR = true;

  public static final boolean ORDER_INITIATOR_IS_PASSIVE = false;

  public AggressorIndicator() {
    super(1057);
  }

  public AggressorIndicator(Boolean data) {
    super(1057, data);
  }

  public AggressorIndicator(boolean data) {
    super(1057, data);
  }
}
