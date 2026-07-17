/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40213;

  public static final int BROKERAGE = 0;

  public static final int UPFRONT_FEE = 1;

  public static final int INDEPENDENT_AMOUNT_COLLATERAL = 2;

  public static final int PRINCIPAL_EXCHANGE = 3;

  public static final int NOVATION_TERMINATION = 4;

  public static final int EARLY_TERMINATION_PROVISION = 5;

  public static final int CANCELABLE_PROVISION = 6;

  public static final int EXTENDIBLE_PROVISION = 7;

  public static final int CAP_RATE_PROVISION = 8;

  public static final int FLOOR_RATE_PROVISION = 9;

  public static final int OPTION_PREMIUM = 10;

  public static final int SETTLEMENT_PAYMENT = 11;

  public static final int CASH_SETTL = 12;

  public static final int SECURITY_LENDING = 13;

  public static final int REBATE = 14;

  public static final int OTHER = 99;

  public PaymentType() {
    super(40213);
  }

  public PaymentType(Integer data) {
    super(40213, data);
  }

  public PaymentType(int data) {
    super(40213, data);
  }
}
