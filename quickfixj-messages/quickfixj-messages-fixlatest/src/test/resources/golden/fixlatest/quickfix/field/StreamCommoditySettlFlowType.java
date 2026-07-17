/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamCommoditySettlFlowType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41292;

  public static final int ALL_TIMES = 0;

  public static final int ON_PEAK = 1;

  public static final int OFF_PEAK = 2;

  public static final int BASE = 3;

  public static final int BLOCK_HOURS = 4;

  public static final int OTHER = 5;

  public StreamCommoditySettlFlowType() {
    super(41292);
  }

  public StreamCommoditySettlFlowType(Integer data) {
    super(41292, data);
  }

  public StreamCommoditySettlFlowType(int data) {
    super(41292, data);
  }
}
