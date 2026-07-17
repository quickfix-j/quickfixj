/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExpirationCycle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 827;

  public static final int EXPIRE_ON_TRADING_SESSION_CLOSE = 0;

  public static final int EXPIRE_ON_TRADING_SESSION_OPEN = 1;

  public static final int SPECIFIED_EXPIRATION = 2;

  public ExpirationCycle() {
    super(827);
  }

  public ExpirationCycle(Integer data) {
    super(827, data);
  }

  public ExpirationCycle(int data) {
    super(827, data);
  }
}
