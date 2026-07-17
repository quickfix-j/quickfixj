/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentSchedulePaySide extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40833;

  public static final int BUY = 1;

  public static final int SELL = 2;

  public PaymentSchedulePaySide() {
    super(40833);
  }

  public PaymentSchedulePaySide(Integer data) {
    super(40833, data);
  }

  public PaymentSchedulePaySide(int data) {
    super(40833, data);
  }
}
