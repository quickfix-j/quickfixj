/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamCommoditySettlDay extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41284;

  public static final int MONDAY = 1;

  public static final int TUESDAY = 2;

  public static final int WEDNESDAY = 3;

  public static final int THURSDAY = 4;

  public static final int FRIDAY = 5;

  public static final int SATURDAY = 6;

  public static final int SUNDAY = 7;

  public static final int ALL_WEEKDAYS = 8;

  public static final int ALL_DAYS = 9;

  public static final int ALL_WEEKENDS = 10;

  public StreamCommoditySettlDay() {
    super(41284);
  }

  public StreamCommoditySettlDay(Integer data) {
    super(41284, data);
  }

  public StreamCommoditySettlDay(int data) {
    super(41284, data);
  }
}
