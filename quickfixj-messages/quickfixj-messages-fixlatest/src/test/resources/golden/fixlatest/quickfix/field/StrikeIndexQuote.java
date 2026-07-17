/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StrikeIndexQuote extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2601;

  public static final int BID = 0;

  public static final int MID = 1;

  public static final int OFFER = 2;

  public StrikeIndexQuote() {
    super(2601);
  }

  public StrikeIndexQuote(Integer data) {
    super(2601, data);
  }

  public StrikeIndexQuote(int data) {
    super(2601, data);
  }
}
