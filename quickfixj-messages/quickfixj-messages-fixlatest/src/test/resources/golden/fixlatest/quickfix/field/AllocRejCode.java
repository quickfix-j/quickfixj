/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocRejCode extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 88;

  public static final int UNKNOWN_ACCOUNT = 0;

  public static final int INCORRECT_QUANTITY = 1;

  public static final int INCORRECT_AVERAGEG_PRICE = 2;

  public static final int UNKNOWN_EXECUTING_BROKER_MNEMONIC = 3;

  public static final int COMMISSION_DIFFERENCE = 4;

  public static final int UNKNOWN_ORDER_ID = 5;

  public static final int UNKNOWN_LIST_ID = 6;

  public static final int OTHER_SEE_TEXT = 7;

  public static final int INCORRECT_ALLOCATED_QUANTITY = 8;

  public static final int CALCULATION_DIFFERENCE = 9;

  public static final int UNKNOWN_OR_STALE_EXEC_ID = 10;

  public static final int MISMATCHED_DATA = 11;

  public static final int UNKNOWN_CL_ORD_ID = 12;

  public static final int WAREHOUSE_REQUEST_REJECTED = 13;

  public static final int DUPLICATE_OR_MISSING_INDIVIDUAL_ALLOC_ID = 14;

  public static final int TRADE_NOT_RECOGNIZED = 15;

  public static final int DUPLICATE_TRADE = 16;

  public static final int INCORRECT_OR_MISSING_INSTRUMENT = 17;

  public static final int INCORRECT_OR_MISSING_SETTL_DATE = 18;

  public static final int INCORRECT_OR_MISSING_FUND_IDOR_FUND_NAME = 19;

  public static final int INCORRECT_OR_MISSING_SETTL_INSTRUCTIONS = 20;

  public static final int INCORRECT_OR_MISSING_FEES = 21;

  public static final int INCORRECT_OR_MISSING_TAX = 22;

  public static final int UNKNOWN_OR_MISSING_PARTY = 23;

  public static final int INCORRECT_OR_MISSING_SIDE = 24;

  public static final int INCORRECT_OR_MISSING_NET_MONEY = 25;

  public static final int INCORRECT_OR_MISSING_TRADE_DATE = 26;

  public static final int INCORRECT_OR_MISSING_SETTL_CCY_INSTRUCTIONS = 27;

  public static final int INCORRECT_OR_MISSING_PROCESS_CODE = 28;

  public static final int OTHER = 99;

  public AllocRejCode() {
    super(88);
  }

  public AllocRejCode(Integer data) {
    super(88, data);
  }

  public AllocRejCode(int data) {
    super(88, data);
  }
}
