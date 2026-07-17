/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocCommissionAmountSubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2726;

  public static final int RESEARCH_PAYMENT_ACCOUNT = 0;

  public static final int COMMISSION_SHARING_AGREEMENT = 1;

  public static final int OTHER_TYPE_RESEARCH_PAYMENT = 2;

  public AllocCommissionAmountSubType() {
    super(2726);
  }

  public AllocCommissionAmountSubType(Integer data) {
    super(2726, data);
  }

  public AllocCommissionAmountSubType(int data) {
    super(2726, data);
  }
}
