/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentDateOffsetDayType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41159;

  public static final int BUSINESS = 0;

  public static final int CALENDAR = 1;

  public static final int COMMODITY = 2;

  public static final int CURRENCY = 3;

  public static final int EXCHANGE = 4;

  public static final int SCHEDULED = 5;

  public PaymentDateOffsetDayType() {
    super(41159);
  }

  public PaymentDateOffsetDayType(Integer data) {
    super(41159, data);
  }

  public PaymentDateOffsetDayType(int data) {
    super(41159, data);
  }
}
