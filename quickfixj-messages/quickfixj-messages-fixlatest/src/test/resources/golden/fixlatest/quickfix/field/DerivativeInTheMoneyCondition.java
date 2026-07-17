/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DerivativeInTheMoneyCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2684;

  public static final int STANDARD_ITM = 0;

  public static final int ATMITM = 1;

  public static final int ATMCALL_ITM = 2;

  public static final int ATMPUT_ITM = 3;

  public DerivativeInTheMoneyCondition() {
    super(2684);
  }

  public DerivativeInTheMoneyCondition(Integer data) {
    super(2684, data);
  }

  public DerivativeInTheMoneyCondition(int data) {
    super(2684, data);
  }
}
