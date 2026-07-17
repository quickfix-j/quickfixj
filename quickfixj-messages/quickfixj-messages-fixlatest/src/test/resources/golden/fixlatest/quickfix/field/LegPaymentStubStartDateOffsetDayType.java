/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStubStartDateOffsetDayType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42502;

  public static final int BUSINESS = 0;

  public static final int CALENDAR = 1;

  public static final int COMMODITY_BUSINESS = 2;

  public static final int CURRENCY_BUSINESS = 3;

  public static final int EXCHANGE_BUSINESS = 4;

  public static final int SCHEDULED_TRADING_DAY = 5;

  public LegPaymentStubStartDateOffsetDayType() {
    super(42502);
  }

  public LegPaymentStubStartDateOffsetDayType(Integer data) {
    super(42502, data);
  }

  public LegPaymentStubStartDateOffsetDayType(int data) {
    super(42502, data);
  }
}
