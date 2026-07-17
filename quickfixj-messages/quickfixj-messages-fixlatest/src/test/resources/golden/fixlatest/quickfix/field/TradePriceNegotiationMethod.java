/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradePriceNegotiationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1740;

  public static final int PERCENT_PAR = 0;

  public static final int DEAL_SPREAD = 1;

  public static final int UPFRONT_PNTS = 2;

  public static final int UPFRONT_AMT = 3;

  public static final int PAR_UPFRONT_AMT = 4;

  public static final int SPREAD_UPFRONT_AMT = 5;

  public static final int UPFRONT_PNTS_AMT = 6;

  public TradePriceNegotiationMethod() {
    super(1740);
  }

  public TradePriceNegotiationMethod(Integer data) {
    super(1740, data);
  }

  public TradePriceNegotiationMethod(int data) {
    super(1740, data);
  }
}
