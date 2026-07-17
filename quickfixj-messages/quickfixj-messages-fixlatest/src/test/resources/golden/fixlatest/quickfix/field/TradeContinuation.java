/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeContinuation extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1937;

  public static final int NOVATION = 0;

  public static final int PARTIAL_NOVATION = 1;

  public static final int TRADE_UNWIND = 2;

  public static final int PARTIAL_TRADE_UNWIND = 3;

  public static final int EXERCISE = 4;

  public static final int NETTING = 5;

  public static final int FULL_NETTING = 6;

  public static final int PARTIAL_NETTING = 7;

  public static final int AMENDMENT = 8;

  public static final int INCREASE = 9;

  public static final int CREDIT_EVENT = 10;

  public static final int STRATEGIC_RESTRUCTURING = 11;

  public static final int SUCCESSION_EVENT_REORGANIZATION = 12;

  public static final int SUCCESSION_EVENT_RENAMING = 13;

  public static final int PORTING = 14;

  public static final int WITHDRAWL = 15;

  public static final int VOID = 16;

  public static final int ACCOUNT_TRANSFER = 17;

  public static final int GIVE_UP = 18;

  public static final int TAKE_UP = 19;

  public static final int AVERAGE_PRICING = 20;

  public static final int REVERSAL = 21;

  public static final int ALLOC_TRD_POSTING = 22;

  public static final int CASCADE = 23;

  public static final int DELIVERY = 24;

  public static final int OPTION_ASGN = 25;

  public static final int EXPIRATION = 26;

  public static final int MATURITY = 27;

  public static final int EQUAL_POS_ADJ = 28;

  public static final int UNEQUAL_POS_ADJ = 29;

  public static final int CORRECTION = 30;

  public static final int EARLY_TERMINATION = 31;

  public static final int RERATE = 32;

  public static final int OTHER = 99;

  public TradeContinuation() {
    super(1937);
  }

  public TradeContinuation(Integer data) {
    super(1937, data);
  }

  public TradeContinuation(int data) {
    super(1937, data);
  }
}
