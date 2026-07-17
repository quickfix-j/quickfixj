/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentSettlAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40231;

  public PaymentSettlAmount() {
    super(40231);
  }

  public PaymentSettlAmount(BigDecimal data) {
    super(40231, data);
  }

  public PaymentSettlAmount(double data) {
    super(40231, BigDecimal.valueOf(data));
  }
}
