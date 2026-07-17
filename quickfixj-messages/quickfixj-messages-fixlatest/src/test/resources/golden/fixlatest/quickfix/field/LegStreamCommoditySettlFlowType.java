/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegStreamCommoditySettlFlowType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41689;

  public static final int ALL_TIMES = 0;

  public static final int ON_PEAK = 1;

  public static final int OFF_PEAK = 2;

  public static final int BASE = 3;

  public static final int BLOCK_HOURS = 4;

  public static final int OTHER = 5;

  public LegStreamCommoditySettlFlowType() {
    super(41689);
  }

  public LegStreamCommoditySettlFlowType(Integer data) {
    super(41689, data);
  }

  public LegStreamCommoditySettlFlowType(int data) {
    super(41689, data);
  }
}
