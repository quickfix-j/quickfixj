/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingInTheMoneyCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2683;

  public static final int STANDARD_ITM = 0;

  public static final int ATMITM = 1;

  public static final int ATMCALL_ITM = 2;

  public static final int ATMPUT_ITM = 3;

  public UnderlyingInTheMoneyCondition() {
    super(2683);
  }

  public UnderlyingInTheMoneyCondition(Integer data) {
    super(2683, data);
  }

  public UnderlyingInTheMoneyCondition(int data) {
    super(2683, data);
  }
}
