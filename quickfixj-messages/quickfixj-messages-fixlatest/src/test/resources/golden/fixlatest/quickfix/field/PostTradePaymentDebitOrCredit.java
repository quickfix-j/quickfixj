/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PostTradePaymentDebitOrCredit extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2819;

  public static final int DEBIT_PAY = 0;

  public static final int CREDIT_RECEIVE = 1;

  public PostTradePaymentDebitOrCredit() {
    super(2819);
  }

  public PostTradePaymentDebitOrCredit(Integer data) {
    super(2819, data);
  }

  public PostTradePaymentDebitOrCredit(int data) {
    super(2819, data);
  }
}
