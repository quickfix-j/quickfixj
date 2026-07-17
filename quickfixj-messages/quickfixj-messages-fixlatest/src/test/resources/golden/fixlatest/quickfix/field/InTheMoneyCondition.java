/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class InTheMoneyCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2681;

  public static final int STANDARD_ITM = 0;

  public static final int ATMITM = 1;

  public static final int ATMCALL_ITM = 2;

  public static final int ATMPUT_ITM = 3;

  public InTheMoneyCondition() {
    super(2681);
  }

  public InTheMoneyCondition(Integer data) {
    super(2681, data);
  }

  public InTheMoneyCondition(int data) {
    super(2681, data);
  }
}
