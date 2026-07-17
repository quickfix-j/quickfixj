/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingPriceQuoteMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2030;

  public static final String STANDARD = "STD";

  public static final String INDEX = "INX";

  public static final String INTEREST_RATE_INDEX = "INT";

  public static final String PERCENT_OF_PAR = "PCTPAR";

  public UnderlyingPriceQuoteMethod() {
    super(2030);
  }

  public UnderlyingPriceQuoteMethod(String data) {
    super(2030, data);
  }
}
