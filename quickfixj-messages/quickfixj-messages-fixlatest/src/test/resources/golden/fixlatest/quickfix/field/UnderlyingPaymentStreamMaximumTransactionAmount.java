/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamMaximumTransactionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41902;

  public UnderlyingPaymentStreamMaximumTransactionAmount() {
    super(41902);
  }

  public UnderlyingPaymentStreamMaximumTransactionAmount(BigDecimal data) {
    super(41902, data);
  }

  public UnderlyingPaymentStreamMaximumTransactionAmount(double data) {
    super(41902, BigDecimal.valueOf(data));
  }
}
