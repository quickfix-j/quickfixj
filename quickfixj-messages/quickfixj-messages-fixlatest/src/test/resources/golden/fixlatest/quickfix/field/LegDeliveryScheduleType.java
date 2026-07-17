/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegDeliveryScheduleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41409;

  public static final int NOTIONAL = 0;

  public static final int DELIVERY = 1;

  public static final int PHYSICAL_SETTL_PERIODS = 2;

  public LegDeliveryScheduleType() {
    super(41409);
  }

  public LegDeliveryScheduleType(Integer data) {
    super(41409, data);
  }

  public LegDeliveryScheduleType(int data) {
    super(41409, data);
  }
}
