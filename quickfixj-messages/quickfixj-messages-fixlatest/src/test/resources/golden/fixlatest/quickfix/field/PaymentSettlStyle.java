/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentSettlStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40227;

  public static final int STANDARD = 0;

  public static final int NET = 1;

  public static final int STANDARDF_NET = 2;

  public PaymentSettlStyle() {
    super(40227);
  }

  public PaymentSettlStyle(Integer data) {
    super(40227, data);
  }

  public PaymentSettlStyle(int data) {
    super(40227, data);
  }
}
