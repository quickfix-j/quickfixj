/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegStreamCommoditySettlDayType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41671;

  public static final int BUSINESS = 0;

  public static final int CALENDAR = 1;

  public static final int COMMODITY_BUSINESS = 2;

  public static final int CURRENCY_BUSINESS = 3;

  public static final int EXCHANGE_BUSINESS = 4;

  public static final int SCHEDULED_TRADING_DAY = 5;

  public LegStreamCommoditySettlDayType() {
    super(41671);
  }

  public LegStreamCommoditySettlDayType(Integer data) {
    super(41671, data);
  }

  public LegStreamCommoditySettlDayType(int data) {
    super(41671, data);
  }
}
