/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegDeliveryScheduleSettlFlowType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41420;

  public static final int ALL_TIMES = 0;

  public static final int ON_PEAK = 1;

  public static final int OFF_PEAK = 2;

  public static final int BASE = 3;

  public static final int BLOCK_HOURS = 4;

  public static final int OTHER = 5;

  public LegDeliveryScheduleSettlFlowType() {
    super(41420);
  }

  public LegDeliveryScheduleSettlFlowType(Integer data) {
    super(41420, data);
  }

  public LegDeliveryScheduleSettlFlowType(int data) {
    super(41420, data);
  }
}
