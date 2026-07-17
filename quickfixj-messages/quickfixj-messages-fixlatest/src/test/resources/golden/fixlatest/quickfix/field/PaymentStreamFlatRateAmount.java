/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamFlatRateAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41181;

  public PaymentStreamFlatRateAmount() {
    super(41181);
  }

  public PaymentStreamFlatRateAmount(BigDecimal data) {
    super(41181, data);
  }

  public PaymentStreamFlatRateAmount(double data) {
    super(41181, BigDecimal.valueOf(data));
  }
}
