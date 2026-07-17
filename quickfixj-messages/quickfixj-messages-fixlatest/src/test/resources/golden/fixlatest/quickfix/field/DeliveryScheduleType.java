/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DeliveryScheduleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41038;

  public static final int NOTIONAL = 0;

  public static final int DELIVERY = 1;

  public static final int PHYSICAL_SETTL_PERIODS = 2;

  public DeliveryScheduleType() {
    super(41038);
  }

  public DeliveryScheduleType(Integer data) {
    super(41038, data);
  }

  public DeliveryScheduleType(int data) {
    super(41038, data);
  }
}
