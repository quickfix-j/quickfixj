/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassActionRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1376;

  public static final int MASS_ACTION_NOT_SUPPORTED = 0;

  public static final int INVALID_OR_UNKNOWN_SECURITY = 1;

  public static final int INVALID_OR_UNKNOWN_UNDERLYING_SECURITY = 2;

  public static final int INVALID_OR_UNKNOWN_PRODUCT = 3;

  public static final int INVALID_OR_UNKNOWN_CFICODE = 4;

  public static final int INVALID_OR_UNKNOWN_SECURITY_TYPE = 5;

  public static final int INVALID_OR_UNKNOWN_TRADING_SESSION = 6;

  public static final int INVALID_OR_UNKNOWN_MARKET = 7;

  public static final int INVALID_OR_UNKNOWN_MARKET_SEGMENT = 8;

  public static final int INVALID_OR_UNKNOWN_SECURITY_GROUP = 9;

  public static final int INVALID_OR_UNKNOWN_SECURITY_ISSUER = 10;

  public static final int INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY = 11;

  public static final int OTHER = 99;

  public MassActionRejectReason() {
    super(1376);
  }

  public MassActionRejectReason(Integer data) {
    super(1376, data);
  }

  public MassActionRejectReason(int data) {
    super(1376, data);
  }
}
