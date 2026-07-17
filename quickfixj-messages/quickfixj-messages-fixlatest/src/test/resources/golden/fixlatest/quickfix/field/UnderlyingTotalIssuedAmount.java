/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingTotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1990;

  public UnderlyingTotalIssuedAmount() {
    super(1990);
  }

  public UnderlyingTotalIssuedAmount(BigDecimal data) {
    super(1990, data);
  }

  public UnderlyingTotalIssuedAmount(double data) {
    super(1990, BigDecimal.valueOf(data));
  }
}
