/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AccountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 581;

  public static final int CARRIED_CUSTOMER_SIDE = 1;

  public static final int CARRIED_NON_CUSTOMER_SIDE = 2;

  public static final int HOUSE_TRADER = 3;

  public static final int FLOOR_TRADER = 4;

  public static final int CARRIED_NON_CUSTOMER_SIDE_CROSS_MARGINED = 6;

  public static final int HOUSE_TRADER_CROSS_MARGINED = 7;

  public static final int JOINT_BACK_OFFICE_ACCOUNT = 8;

  public static final int EQUITIES_SPECIALIST = 9;

  public static final int OPTIONS_MARKET_MAKER = 10;

  public static final int OPTIONS_FIRM_ACCOUNT = 11;

  public static final int ACCOUNT_CUSTOMER_NON_CUSTOMER_ORDERS = 12;

  public static final int ACCOUNT_ORDERS_MULTIPLE_CUSTOMERS = 13;

  public AccountType() {
    super(581);
  }

  public AccountType(Integer data) {
    super(581, data);
  }

  public AccountType(int data) {
    super(581, data);
  }
}
