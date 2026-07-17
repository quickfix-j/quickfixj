/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ContAmtType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 519;

  public static final int COMMISSION_AMOUNT = 1;

  public static final int COMMISSION_PERCENT = 2;

  public static final int INITIAL_CHARGE_AMOUNT = 3;

  public static final int INITIAL_CHARGE_PERCENT = 4;

  public static final int DISCOUNT_AMOUNT = 5;

  public static final int DISCOUNT_PERCENT = 6;

  public static final int DILUTION_LEVY_AMOUNT = 7;

  public static final int DILUTION_LEVY_PERCENT = 8;

  public static final int EXIT_CHARGE_AMOUNT = 9;

  public static final int EXIT_CHARGE_PERCENT = 10;

  public static final int FUND_BASED_RENEWAL_COMMISSION_PERCENT = 11;

  public static final int PROJECTED_FUND_VALUE = 12;

  public static final int FUND_BASED_RENEWAL_COMMISSION_ON_ORDER = 13;

  public static final int FUND_BASED_RENEWAL_COMMISSION_ON_FUND = 14;

  public static final int NET_SETTLEMENT_AMOUNT = 15;

  public ContAmtType() {
    super(519);
  }

  public ContAmtType(Integer data) {
    super(519, data);
  }

  public ContAmtType(int data) {
    super(519, data);
  }
}
