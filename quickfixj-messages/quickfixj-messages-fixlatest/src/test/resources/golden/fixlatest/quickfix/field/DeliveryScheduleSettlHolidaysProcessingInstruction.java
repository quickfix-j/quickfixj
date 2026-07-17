/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DeliveryScheduleSettlHolidaysProcessingInstruction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41050;

  public static final int DO_NOT_INCLUDE_HOLIDAYS = 0;

  public static final int INCLUDE_HOLIDAYS = 1;

  public DeliveryScheduleSettlHolidaysProcessingInstruction() {
    super(41050);
  }

  public DeliveryScheduleSettlHolidaysProcessingInstruction(Integer data) {
    super(41050, data);
  }

  public DeliveryScheduleSettlHolidaysProcessingInstruction(int data) {
    super(41050, data);
  }
}
