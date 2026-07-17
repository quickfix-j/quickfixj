/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamTotalFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41188;

  public PaymentStreamTotalFixedAmount() {
    super(41188);
  }

  public PaymentStreamTotalFixedAmount(BigDecimal data) {
    super(41188, data);
  }

  public PaymentStreamTotalFixedAmount(double data) {
    super(41188, BigDecimal.valueOf(data));
  }
}
