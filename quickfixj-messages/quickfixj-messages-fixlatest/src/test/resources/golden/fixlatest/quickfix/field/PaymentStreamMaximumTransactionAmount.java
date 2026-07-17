/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamMaximumTransactionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41185;

  public PaymentStreamMaximumTransactionAmount() {
    super(41185);
  }

  public PaymentStreamMaximumTransactionAmount(BigDecimal data) {
    super(41185, data);
  }

  public PaymentStreamMaximumTransactionAmount(double data) {
    super(41185, BigDecimal.valueOf(data));
  }
}
