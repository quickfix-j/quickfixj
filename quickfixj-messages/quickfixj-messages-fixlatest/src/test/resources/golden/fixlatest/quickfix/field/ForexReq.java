/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class ForexReq extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 121;

  public static final boolean DO_NOT_EXECUTE_FOREX_AFTER_SECURITY_TRADE = false;

  public static final boolean EXECUTE_FOREX_AFTER_SECURITY_TRADE = true;

  public ForexReq() {
    super(121);
  }

  public ForexReq(Boolean data) {
    super(121, data);
  }

  public ForexReq(boolean data) {
    super(121, data);
  }
}
