/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendPaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42857;

  public UnderlyingDividendPaymentAmount() {
    super(42857);
  }

  public UnderlyingDividendPaymentAmount(BigDecimal data) {
    super(42857, data);
  }

  public UnderlyingDividendPaymentAmount(double data) {
    super(42857, BigDecimal.valueOf(data));
  }
}
