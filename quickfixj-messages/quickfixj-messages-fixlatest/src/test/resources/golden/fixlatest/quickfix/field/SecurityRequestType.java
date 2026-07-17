/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 321;

  public static final int REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS = 0;

  public static final int REQUEST_SECURITY_IDENTITY_FOR_SPECIFICATIONS = 1;

  public static final int REQUEST_LIST_SECURITY_TYPES = 2;

  public static final int REQUEST_LIST_SECURITIES = 3;

  public static final int SYMBOL = 4;

  public static final int SECURITY_TYPE_AND_OR_CFICODE = 5;

  public static final int PRODUCT = 6;

  public static final int TRADING_SESSION_ID = 7;

  public static final int ALL_SECURITIES = 8;

  public static final int MARKET_IDOR_MARKET_ID = 9;

  public SecurityRequestType() {
    super(321);
  }

  public SecurityRequestType(Integer data) {
    super(321, data);
  }

  public SecurityRequestType(int data) {
    super(321, data);
  }
}
