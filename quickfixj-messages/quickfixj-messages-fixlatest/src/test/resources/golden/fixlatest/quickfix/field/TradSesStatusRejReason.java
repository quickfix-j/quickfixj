/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradSesStatusRejReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 567;

  public static final int UNKNOWN_OR_INVALID_TRADING_SESSION_ID = 1;

  public static final int OTHER = 99;

  public TradSesStatusRejReason() {
    super(567);
  }

  public TradSesStatusRejReason(Integer data) {
    super(567, data);
  }

  public TradSesStatusRejReason(int data) {
    super(567, data);
  }
}
