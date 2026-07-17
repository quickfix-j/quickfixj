/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteAttributeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2707;

  public static final int QUOTE_ABOVE_STANDARD_MARKET_SIZE = 0;

  public static final int QUOTE_ABOVE_SPECIFIC_INSTRUMENT_SIZE = 1;

  public static final int QUOTE_APPLICABLE_FOR_LIQUIDTY_PROVISION_ACTIVITY = 2;

  public static final int QUOTE_ISSUER_STATUS = 3;

  public static final int BID_OR_ASK_REQUEST = 4;

  public QuoteAttributeType() {
    super(2707);
  }

  public QuoteAttributeType(Integer data) {
    super(2707, data);
  }

  public QuoteAttributeType(int data) {
    super(2707, data);
  }
}
