/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamInflationIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40812;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public PaymentStreamInflationIndexSource() {
    super(40812);
  }

  public PaymentStreamInflationIndexSource(Integer data) {
    super(40812, data);
  }

  public PaymentStreamInflationIndexSource(int data) {
    super(40812, data);
  }
}
