/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamCompoundingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42927;

  public UnderlyingPaymentStreamCompoundingRateSpread() {
    super(42927);
  }

  public UnderlyingPaymentStreamCompoundingRateSpread(BigDecimal data) {
    super(42927, data);
  }

  public UnderlyingPaymentStreamCompoundingRateSpread(double data) {
    super(42927, BigDecimal.valueOf(data));
  }
}
