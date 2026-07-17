/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecondaryAssetClass extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1977;

  public static final int INTEREST_RATE = 1;

  public static final int CURRENCY = 2;

  public static final int CREDIT = 3;

  public static final int EQUITY = 4;

  public static final int COMMODITY = 5;

  public static final int OTHER = 6;

  public static final int CASH = 7;

  public static final int DEBT = 8;

  public static final int FUND = 9;

  public static final int LOAN_FACILITY = 10;

  public static final int INDEX = 11;

  public SecondaryAssetClass() {
    super(1977);
  }

  public SecondaryAssetClass(Integer data) {
    super(1977, data);
  }

  public SecondaryAssetClass(int data) {
    super(1977, data);
  }
}
