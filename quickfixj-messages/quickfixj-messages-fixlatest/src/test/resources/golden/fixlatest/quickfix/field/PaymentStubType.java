/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40873;

  public static final int INITIAL = 0;

  public static final int FINAL = 1;

  public static final int COMPOUNDING_INITIAL = 2;

  public static final int COMPOUNDING_FINAL = 3;

  public PaymentStubType() {
    super(40873);
  }

  public PaymentStubType(Integer data) {
    super(40873, data);
  }

  public PaymentStubType(int data) {
    super(40873, data);
  }
}
