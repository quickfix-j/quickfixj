/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketMakerActivity extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1655;

  public static final int NO_PARTICIPATION = 0;

  public static final int BUY_PARTICIPATION = 1;

  public static final int SELL_PARTICIPATION = 2;

  public static final int BOTH_BUY_AND_SELL_PARTICIPATION = 3;

  public MarketMakerActivity() {
    super(1655);
  }

  public MarketMakerActivity(Integer data) {
    super(1655, data);
  }

  public MarketMakerActivity(int data) {
    super(1655, data);
  }
}
