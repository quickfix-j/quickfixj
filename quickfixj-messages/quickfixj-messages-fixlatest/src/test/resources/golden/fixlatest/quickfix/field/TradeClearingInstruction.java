/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeClearingInstruction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1925;

  public static final int PROCESS_NORMALLY = 0;

  public static final int EXCLUDE_FROM_ALL_NETTING = 1;

  public static final int BILATERAL_NETTING_ONLY = 2;

  public static final int EX_CLEARING = 3;

  public static final int SPECIAL_TRADE = 4;

  public static final int MULTILATERAL_NETTING = 5;

  public static final int CLEAR_AGAINST_CENTRAL_COUNTERPARTY = 6;

  public static final int EXCLUDE_FROM_CENTRAL_COUNTERPARTY = 7;

  public static final int MANUAL_MODE = 8;

  public static final int AUTOMATIC_POSTING_MODE = 9;

  public static final int AUTOMATIC_GIVE_UP_MODE = 10;

  public static final int QUALIFIED_SERVICE_REPRESENTATIVE_QSR = 11;

  public static final int CUSTOMER_TRADE = 12;

  public static final int SELF_CLEARING = 13;

  public static final int BUY_IN = 14;

  public TradeClearingInstruction() {
    super(1925);
  }

  public TradeClearingInstruction(Integer data) {
    super(1925, data);
  }

  public TradeClearingInstruction(int data) {
    super(1925, data);
  }
}
