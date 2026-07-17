/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegInTheMoneyCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2682;

  public static final int STANDARD_ITM = 0;

  public static final int ATMITM = 1;

  public static final int ATMCALL_ITM = 2;

  public static final int ATMPUT_ITM = 3;

  public LegInTheMoneyCondition() {
    super(2682);
  }

  public LegInTheMoneyCondition(Integer data) {
    super(2682, data);
  }

  public LegInTheMoneyCondition(int data) {
    super(2682, data);
  }
}
