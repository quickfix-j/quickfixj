/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamFRADiscounting extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40816;

  public static final int NONE = 0;

  public static final int ISDA = 1;

  public static final int AFMA = 2;

  public PaymentStreamFRADiscounting() {
    super(40816);
  }

  public PaymentStreamFRADiscounting(Integer data) {
    super(40816, data);
  }

  public PaymentStreamFRADiscounting(int data) {
    super(40816, data);
  }
}
