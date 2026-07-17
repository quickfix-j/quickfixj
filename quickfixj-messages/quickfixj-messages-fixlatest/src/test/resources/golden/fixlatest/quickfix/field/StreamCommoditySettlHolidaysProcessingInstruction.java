/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamCommoditySettlHolidaysProcessingInstruction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41300;

  public static final int DO_NOT_INCLUDE_HOLIDAYS = 0;

  public static final int INCLUDE_HOLIDAYS = 1;

  public StreamCommoditySettlHolidaysProcessingInstruction() {
    super(41300);
  }

  public StreamCommoditySettlHolidaysProcessingInstruction(Integer data) {
    super(41300, data);
  }

  public StreamCommoditySettlHolidaysProcessingInstruction(int data) {
    super(41300, data);
  }
}
