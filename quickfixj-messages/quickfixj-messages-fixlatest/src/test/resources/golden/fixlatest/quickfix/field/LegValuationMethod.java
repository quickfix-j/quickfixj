/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegValuationMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2196;

  public static final String PREMIUM_STYLE = "EQTY";

  public static final String FUTURES_STYLE_MARK_TO_MARKET = "FUT";

  public static final String FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT = "FUTDA";

  public static final String CDSSTYLE_COLLATERALIZATION = "CDS";

  public static final String CDSIN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE = "CDSD";

  public LegValuationMethod() {
    super(2196);
  }

  public LegValuationMethod(String data) {
    super(2196, data);
  }
}
