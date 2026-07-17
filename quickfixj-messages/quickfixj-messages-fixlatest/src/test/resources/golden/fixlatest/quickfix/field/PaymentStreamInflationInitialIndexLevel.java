/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamInflationInitialIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40814;

  public PaymentStreamInflationInitialIndexLevel() {
    super(40814);
  }

  public PaymentStreamInflationInitialIndexLevel(BigDecimal data) {
    super(40814, data);
  }

  public PaymentStreamInflationInitialIndexLevel(double data) {
    super(40814, BigDecimal.valueOf(data));
  }
}
