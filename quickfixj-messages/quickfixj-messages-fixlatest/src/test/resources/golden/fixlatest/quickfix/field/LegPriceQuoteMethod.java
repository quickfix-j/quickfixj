/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegPriceQuoteMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2195;

  public static final String STANDARD = "STD";

  public static final String INDEX = "INX";

  public static final String INTEREST_RATE_INDEX = "INT";

  public static final String PERCENT_OF_PAR = "PCTPAR";

  public LegPriceQuoteMethod() {
    super(2195);
  }

  public LegPriceQuoteMethod(String data) {
    super(2195, data);
  }
}
