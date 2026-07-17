/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamCompoundingFixedRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42900;

  public UnderlyingPaymentStreamCompoundingFixedRate() {
    super(42900);
  }

  public UnderlyingPaymentStreamCompoundingFixedRate(BigDecimal data) {
    super(42900, data);
  }

  public UnderlyingPaymentStreamCompoundingFixedRate(double data) {
    super(42900, BigDecimal.valueOf(data));
  }
}
