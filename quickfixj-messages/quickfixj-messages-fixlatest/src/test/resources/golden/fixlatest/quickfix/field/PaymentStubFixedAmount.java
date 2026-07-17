/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStubFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40876;

  public PaymentStubFixedAmount() {
    super(40876);
  }

  public PaymentStubFixedAmount(BigDecimal data) {
    super(40876, data);
  }

  public PaymentStubFixedAmount(double data) {
    super(40876, BigDecimal.valueOf(data));
  }
}
