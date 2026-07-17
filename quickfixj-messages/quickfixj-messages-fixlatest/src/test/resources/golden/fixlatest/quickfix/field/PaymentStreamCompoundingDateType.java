/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamCompoundingDateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42608;

  public static final int UNADJUSTED = 0;

  public static final int ADJUSTED = 1;

  public PaymentStreamCompoundingDateType() {
    super(42608);
  }

  public PaymentStreamCompoundingDateType(Integer data) {
    super(42608, data);
  }

  public PaymentStreamCompoundingDateType(int data) {
    super(42608, data);
  }
}
