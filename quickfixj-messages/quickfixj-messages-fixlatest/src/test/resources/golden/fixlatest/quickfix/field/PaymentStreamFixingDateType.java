/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamFixingDateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42662;

  public static final int UNADJUSTED = 0;

  public static final int ADJUSTED = 1;

  public PaymentStreamFixingDateType() {
    super(42662);
  }

  public PaymentStreamFixingDateType(Integer data) {
    super(42662, data);
  }

  public PaymentStreamFixingDateType(int data) {
    super(42662, data);
  }
}
