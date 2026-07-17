/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStubIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40879;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public PaymentStubIndexSource() {
    super(40879);
  }

  public PaymentStubIndexSource(Integer data) {
    super(40879, data);
  }

  public PaymentStubIndexSource(int data) {
    super(40879, data);
  }
}
