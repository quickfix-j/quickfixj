/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class DerivativePriceQuoteMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1318;

  public static final String STANDARD = "STD";

  public static final String INDEX = "INX";

  public static final String INTEREST_RATE_INDEX = "INT";

  public static final String PERCENT_OF_PAR = "PCTPAR";

  public DerivativePriceQuoteMethod() {
    super(1318);
  }

  public DerivativePriceQuoteMethod(String data) {
    super(1318, data);
  }
}
