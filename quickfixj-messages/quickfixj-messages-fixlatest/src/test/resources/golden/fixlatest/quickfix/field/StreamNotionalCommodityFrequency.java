/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamNotionalCommodityFrequency extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41308;

  public static final int TERM = 0;

  public static final int PER_BUSINESS_DAY = 1;

  public static final int PER_CALCULATION_PERIOD = 2;

  public static final int PER_SETTL_PERIOD = 3;

  public static final int PER_CALENDAR_DAY = 4;

  public static final int PER_HOUR = 5;

  public static final int PER_MONTH = 6;

  public StreamNotionalCommodityFrequency() {
    super(41308);
  }

  public StreamNotionalCommodityFrequency(Integer data) {
    super(41308, data);
  }

  public StreamNotionalCommodityFrequency(int data) {
    super(41308, data);
  }
}
