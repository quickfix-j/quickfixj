/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamRateIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40790;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public PaymentStreamRateIndexSource() {
    super(40790);
  }

  public PaymentStreamRateIndexSource(Integer data) {
    super(40790, data);
  }

  public PaymentStreamRateIndexSource(int data) {
    super(40790, data);
  }
}
