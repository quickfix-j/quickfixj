/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CommissionAmountSubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2725;

  public static final int RESEARCH_PAYMENT_ACCOUNT = 0;

  public static final int COMMISSION_SHARING_AGREEMENT = 1;

  public static final int OTHER_TYPE_RESEARCH_PAYMENT = 2;

  public CommissionAmountSubType() {
    super(2725);
  }

  public CommissionAmountSubType(Integer data) {
    super(2725, data);
  }

  public CommissionAmountSubType(int data) {
    super(2725, data);
  }
}
