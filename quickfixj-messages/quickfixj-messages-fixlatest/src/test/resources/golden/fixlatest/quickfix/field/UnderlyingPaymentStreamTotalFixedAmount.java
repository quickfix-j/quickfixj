/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamTotalFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41905;

  public UnderlyingPaymentStreamTotalFixedAmount() {
    super(41905);
  }

  public UnderlyingPaymentStreamTotalFixedAmount(BigDecimal data) {
    super(41905, data);
  }

  public UnderlyingPaymentStreamTotalFixedAmount(double data) {
    super(41905, BigDecimal.valueOf(data));
  }
}
