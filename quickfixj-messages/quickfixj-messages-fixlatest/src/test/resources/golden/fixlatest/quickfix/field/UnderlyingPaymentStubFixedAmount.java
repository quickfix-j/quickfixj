/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStubFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40712;

  public UnderlyingPaymentStubFixedAmount() {
    super(40712);
  }

  public UnderlyingPaymentStubFixedAmount(BigDecimal data) {
    super(40712, data);
  }

  public UnderlyingPaymentStubFixedAmount(double data) {
    super(40712, BigDecimal.valueOf(data));
  }
}
