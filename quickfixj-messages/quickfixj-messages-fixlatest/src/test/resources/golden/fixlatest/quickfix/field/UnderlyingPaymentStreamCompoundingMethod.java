/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentStreamCompoundingMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40577;

  public static final int NONE = 0;

  public static final int FLAT = 1;

  public static final int STRAIGHT = 2;

  public static final int SPREAD_EXCLUSIVE = 3;

  public UnderlyingPaymentStreamCompoundingMethod() {
    super(40577);
  }

  public UnderlyingPaymentStreamCompoundingMethod(Integer data) {
    super(40577, data);
  }

  public UnderlyingPaymentStreamCompoundingMethod(int data) {
    super(40577, data);
  }
}
