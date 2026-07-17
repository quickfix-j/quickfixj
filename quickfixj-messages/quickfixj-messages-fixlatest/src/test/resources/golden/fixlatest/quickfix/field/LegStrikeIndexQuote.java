/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegStrikeIndexQuote extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2605;

  public static final int BID = 0;

  public static final int MID = 1;

  public static final int OFFER = 2;

  public LegStrikeIndexQuote() {
    super(2605);
  }

  public LegStrikeIndexQuote(Integer data) {
    super(2605, data);
  }

  public LegStrikeIndexQuote(int data) {
    super(2605, data);
  }
}
