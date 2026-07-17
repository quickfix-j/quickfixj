/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassCancelRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 532;

  public static final int MASS_CANCEL_NOT_SUPPORTED = 0;

  public static final int INVALID_OR_UNKNOWN_SECURITY = 1;

  public static final int INVALID_OR_UNKOWN_UNDERLYING_SECURITY = 2;

  public static final int INVALID_OR_UNKNOWN_PRODUCT = 3;

  public static final int INVALID_OR_UNKNOWN_CFICODE = 4;

  public static final int INVALID_OR_UNKNOWN_SECURITY_TYPE = 5;

  public static final int INVALID_OR_UNKNOWN_TRADING_SESSION = 6;

  public static final int INVALID_OR_UNKNOWN_MARKET = 7;

  public static final int INVALID_OR_UNKOWN_MARKET_SEGMENT = 8;

  public static final int INVALID_OR_UNKNOWN_SECURITY_GROUP = 9;

  public static final int INVALID_OR_UNKNOWN_SECURITY_ISSUER = 10;

  public static final int INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY = 11;

  public static final int OTHER = 99;

  public MassCancelRejectReason() {
    super(532);
  }

  public MassCancelRejectReason(Integer data) {
    super(532, data);
  }

  public MassCancelRejectReason(int data) {
    super(532, data);
  }
}
