/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 537;

  public static final int INDICATIVE = 0;

  public static final int TRADEABLE = 1;

  public static final int RESTRICTED_TRADEABLE = 2;

  public static final int COUNTER = 3;

  public static final int INITIALLY_TRADEABLE = 4;

  public QuoteType() {
    super(537);
  }

  public QuoteType(Integer data) {
    super(537, data);
  }

  public QuoteType(int data) {
    super(537, data);
  }
}
