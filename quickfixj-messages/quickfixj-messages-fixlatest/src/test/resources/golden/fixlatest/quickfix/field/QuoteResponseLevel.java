/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteResponseLevel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 301;

  public static final int NO_ACKNOWLEDGEMENT = 0;

  public static final int ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES = 1;

  public static final int ACKNOWLEDGE_EACH_QUOTE_MESSAGE = 2;

  public static final int SUMMARY_ACKNOWLEDGEMENT = 3;

  public QuoteResponseLevel() {
    super(301);
  }

  public QuoteResponseLevel(Integer data) {
    super(301, data);
  }

  public QuoteResponseLevel(int data) {
    super(301, data);
  }
}
