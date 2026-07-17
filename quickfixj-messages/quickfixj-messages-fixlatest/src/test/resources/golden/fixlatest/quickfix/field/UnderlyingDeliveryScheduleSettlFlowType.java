/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingDeliveryScheduleSettlFlowType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41768;

  public static final int ALL_TIMES = 0;

  public static final int ON_PEAK = 1;

  public static final int OFF_PEAK = 2;

  public static final int BASE = 3;

  public static final int BLOCK_HOURS = 4;

  public static final int OTHER = 5;

  public UnderlyingDeliveryScheduleSettlFlowType() {
    super(41768);
  }

  public UnderlyingDeliveryScheduleSettlFlowType(Integer data) {
    super(41768, data);
  }

  public UnderlyingDeliveryScheduleSettlFlowType(int data) {
    super(41768, data);
  }
}
