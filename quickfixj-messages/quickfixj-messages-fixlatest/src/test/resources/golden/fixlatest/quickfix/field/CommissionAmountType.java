/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CommissionAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2641;

  public static final int UNSPECIFIED = 0;

  public static final int ACCEPTANCE = 1;

  public static final int BROKER = 2;

  public static final int CLEARING_BROKER = 3;

  public static final int RETAIL = 4;

  public static final int SALES_COMMISSION = 5;

  public static final int LOCAL_COMMISSION = 6;

  public static final int RESEARCH_PAYMENT = 7;

  public CommissionAmountType() {
    super(2641);
  }

  public CommissionAmountType(Integer data) {
    super(2641, data);
  }

  public CommissionAmountType(int data) {
    super(2641, data);
  }
}
