/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingReturnRatePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43066;

  public UnderlyingReturnRatePrice() {
    super(43066);
  }

  public UnderlyingReturnRatePrice(BigDecimal data) {
    super(43066, data);
  }

  public UnderlyingReturnRatePrice(double data) {
    super(43066, BigDecimal.valueOf(data));
  }
}
