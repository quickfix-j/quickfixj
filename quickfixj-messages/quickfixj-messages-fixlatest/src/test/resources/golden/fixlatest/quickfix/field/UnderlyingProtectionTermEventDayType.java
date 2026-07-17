/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingProtectionTermEventDayType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42083;

  public static final int BUSINESS = 0;

  public static final int CALENDAR = 1;

  public static final int COMMODITY_BUSINESS = 2;

  public static final int CURRENCY_BUSINESS = 3;

  public static final int EXCHANGE_BUSINESS = 4;

  public static final int SCHEDULED_TRADING_DAY = 5;

  public UnderlyingProtectionTermEventDayType() {
    super(42083);
  }

  public UnderlyingProtectionTermEventDayType(Integer data) {
    super(42083, data);
  }

  public UnderlyingProtectionTermEventDayType(int data) {
    super(42083, data);
  }
}
