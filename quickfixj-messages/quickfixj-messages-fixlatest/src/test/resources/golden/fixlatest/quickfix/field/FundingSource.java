/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class FundingSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2846;

  public static final int REPO = 0;

  public static final int CASH = 1;

  public static final int FREE_CEDITS = 2;

  public static final int CUSTOMER_SHORT_SALES = 3;

  public static final int BROKER_SHORT_SALES = 4;

  public static final int UNSECURED_BORROWING = 5;

  public static final int OTHER = 99;

  public FundingSource() {
    super(2846);
  }

  public FundingSource(Integer data) {
    super(2846, data);
  }

  public FundingSource(int data) {
    super(2846, data);
  }
}
