/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityListRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 559;

  public static final int SYMBOL = 0;

  public static final int SECURITY_TYPE_AND = 1;

  public static final int PRODUCT = 2;

  public static final int TRADING_SESSION_ID = 3;

  public static final int ALL_SECURITIES = 4;

  public static final int MARKET_IDOR_MARKET_ID = 5;

  public SecurityListRequestType() {
    super(559);
  }

  public SecurityListRequestType(Integer data) {
    super(559, data);
  }

  public SecurityListRequestType(int data) {
    super(559, data);
  }
}
