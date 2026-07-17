/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentScheduleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40829;

  public static final int NOTIONAL = 0;

  public static final int CASH_FLOW = 1;

  public static final int FXLINKED_NOTIONAL = 2;

  public static final int FIXED_RATE = 3;

  public static final int FUTURE_VALUE_NOTIONAL = 4;

  public static final int KNOWN_AMOUNT = 5;

  public static final int FLOATING_RATE_MULTIPLIER = 6;

  public static final int SPREAD = 7;

  public static final int CAP_RATE = 8;

  public static final int FLOOR_RATE = 9;

  public static final int NON_DELIVERABLE_SETTL_PAYMENT_DATES = 10;

  public static final int NON_DELIVERABLE_SETTL_CALCULATION_DATES = 11;

  public static final int NON_DELIVERABLE_FXFIXING_DATES = 12;

  public static final int SETTL_PERIOD_NOTNL = 13;

  public static final int SETTL_PERIOD_PX = 14;

  public static final int CALC_PERIOD = 15;

  public static final int DIVIDEND_ACCRUAL_RATE_MULTIPLIER = 16;

  public static final int DIVIDEND_ACCRUAL_RATE_SPREAD = 17;

  public static final int DIVIDEND_ACCRUAL_CAP_RATE = 18;

  public static final int DIVIDEND_ACCRUAL_FLOOR_RATE = 19;

  public static final int COMPOUNDING_RATE_MULTIPLIER = 20;

  public static final int COMPOUNDING_RATE_SPREAD = 21;

  public static final int COMPOUNDING_CAP_RATE = 22;

  public static final int COMPOUNDING_FLOOR_RATE = 23;

  public PaymentScheduleType() {
    super(40829);
  }

  public PaymentScheduleType(Integer data) {
    super(40829, data);
  }

  public PaymentScheduleType(int data) {
    super(40829, data);
  }
}
