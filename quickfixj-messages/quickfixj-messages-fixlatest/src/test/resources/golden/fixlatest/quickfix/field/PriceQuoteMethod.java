/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class PriceQuoteMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1196;

  public static final String STANDARD = "STD";

  public static final String INDEX = "INX";

  public static final String INTEREST_RATE_INDEX = "INT";

  public static final String PERCENT_OF_PAR = "PCTPAR";

  public PriceQuoteMethod() {
    super(1196);
  }

  public PriceQuoteMethod(String data) {
    super(1196, data);
  }
}
