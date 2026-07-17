/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ConfirmRejReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 774;

  public static final int MISMATCHED_ACCOUNT = 1;

  public static final int MISSING_SETTLEMENT_INSTRUCTIONS = 2;

  public static final int UNKNOWN_OR_MISSING_INDIVIDUAL_ALLOC_ID = 3;

  public static final int TRANSACTION_NOT_RECOGNIZED = 4;

  public static final int DUPLICATE_TRANSACTION = 5;

  public static final int INCORRECT_OR_MISSING_INSTRUMENT = 6;

  public static final int INCORRECT_OR_MISSING_PRICE = 7;

  public static final int INCORRECT_OR_MISSING_COMMISSION = 8;

  public static final int INCORRECT_OR_MISSING_SETTL_DATE = 9;

  public static final int INCORRECT_OR_MISSING_FUND_IDOR_FUND_NAME = 10;

  public static final int INCORRECT_OR_MISSING_QUANTITY = 11;

  public static final int INCORRECT_OR_MISSING_FEES = 12;

  public static final int INCORRECT_OR_MISSING_TAX = 13;

  public static final int INCORRECT_OR_MISSING_PARTY = 14;

  public static final int INCORRECT_OR_MISSING_SIDE = 15;

  public static final int INCORRECT_OR_MISSING_NET_MONEY = 16;

  public static final int INCORRECT_OR_MISSING_TRADE_DATE = 17;

  public static final int INCORRECT_OR_MISSING_SETTL_CCY_INSTRUCTIONS = 18;

  public static final int INCORRECT_OR_MISSING_CAPACITY = 19;

  public static final int OTHER = 99;

  public ConfirmRejReason() {
    super(774);
  }

  public ConfirmRejReason(Integer data) {
    super(774, data);
  }

  public ConfirmRejReason(int data) {
    super(774, data);
  }
}
