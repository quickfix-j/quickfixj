/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentDiscountFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40224;

  public PaymentDiscountFactor() {
    super(40224);
  }

  public PaymentDiscountFactor(BigDecimal data) {
    super(40224, data);
  }

  public PaymentDiscountFactor(double data) {
    super(40224, BigDecimal.valueOf(data));
  }
}
