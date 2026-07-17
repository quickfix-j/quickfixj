/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SubscriptionRequestType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 263;

  public static final char SNAPSHOT = '0';

  public static final char SNAPSHOT_AND_UPDATES = '1';

  public static final char DISABLE_PREVIOUS_SNAPSHOT = '2';

  public SubscriptionRequestType() {
    super(263);
  }

  public SubscriptionRequestType(Character data) {
    super(263, data);
  }

  public SubscriptionRequestType(char data) {
    super(263, data);
  }
}
