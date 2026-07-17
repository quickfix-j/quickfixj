/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamInflationInitialIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40645;

  public UnderlyingPaymentStreamInflationInitialIndexLevel() {
    super(40645);
  }

  public UnderlyingPaymentStreamInflationInitialIndexLevel(BigDecimal data) {
    super(40645, data);
  }

  public UnderlyingPaymentStreamInflationInitialIndexLevel(double data) {
    super(40645, BigDecimal.valueOf(data));
  }
}
