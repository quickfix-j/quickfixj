/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamFlatRateAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41898;

  public UnderlyingPaymentStreamFlatRateAmount() {
    super(41898);
  }

  public UnderlyingPaymentStreamFlatRateAmount(BigDecimal data) {
    super(41898, data);
  }

  public UnderlyingPaymentStreamFlatRateAmount(double data) {
    super(41898, BigDecimal.valueOf(data));
  }
}
