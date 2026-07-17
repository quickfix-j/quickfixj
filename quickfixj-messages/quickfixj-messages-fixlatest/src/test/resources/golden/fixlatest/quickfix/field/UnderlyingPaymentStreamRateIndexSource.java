/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentStreamRateIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40621;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public UnderlyingPaymentStreamRateIndexSource() {
    super(40621);
  }

  public UnderlyingPaymentStreamRateIndexSource(Integer data) {
    super(40621, data);
  }

  public UnderlyingPaymentStreamRateIndexSource(int data) {
    super(40621, data);
  }
}
