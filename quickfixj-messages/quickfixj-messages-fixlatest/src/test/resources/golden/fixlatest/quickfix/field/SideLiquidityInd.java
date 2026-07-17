/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideLiquidityInd extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1444;

  public static final int NEITHER_ADDED_NOR_REMOVED_LIQUIDITY = 0;

  public static final int ADDED_LIQUIDITY = 1;

  public static final int REMOVED_LIQUIDITY = 2;

  public static final int LIQUIDITY_ROUTED_OUT = 3;

  public static final int AUCTION = 4;

  public static final int TRIGGERED_STOP_ORDER = 5;

  public static final int TRIGGERED_CONTINGENCY_ORDER = 6;

  public static final int TRIGGERED_MARKET_ORDER = 7;

  public static final int REMOVED_LIQUIDITY_AFTER_FIRM_ORDER_COMMITMENT = 8;

  public static final int AUCTION_EXECUTION_AFTER_FIRM_ORDER_COMMITMENT = 9;

  public SideLiquidityInd() {
    super(1444);
  }

  public SideLiquidityInd(Integer data) {
    super(1444, data);
  }

  public SideLiquidityInd(int data) {
    super(1444, data);
  }
}
