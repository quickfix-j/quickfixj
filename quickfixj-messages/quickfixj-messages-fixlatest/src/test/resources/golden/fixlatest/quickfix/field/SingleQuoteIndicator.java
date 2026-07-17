/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class SingleQuoteIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2837;

  public static final boolean MULTIPLE_QUOTES_ALLOWED = false;

  public static final boolean ONLY_ONE_QUOTE_ALLOWED = true;

  public SingleQuoteIndicator() {
    super(2837);
  }

  public SingleQuoteIndicator(Boolean data) {
    super(2837, data);
  }

  public SingleQuoteIndicator(boolean data) {
    super(2837, data);
  }
}
