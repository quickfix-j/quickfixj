/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingStreamNotionalCommodityFrequency extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42021;

  public static final int TERM = 0;

  public static final int PER_BUSINESS_DAY = 1;

  public static final int PER_CALCULATION_PERIOD = 2;

  public static final int PER_SETTL_PERIOD = 3;

  public static final int PER_CALENDAR_DAY = 4;

  public static final int PER_HOUR = 5;

  public static final int PER_MONTH = 6;

  public UnderlyingStreamNotionalCommodityFrequency() {
    super(42021);
  }

  public UnderlyingStreamNotionalCommodityFrequency(Integer data) {
    super(42021, data);
  }

  public UnderlyingStreamNotionalCommodityFrequency(int data) {
    super(42021, data);
  }
}
