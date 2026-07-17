/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingReturnRateFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43032;

  public UnderlyingReturnRateFXRate() {
    super(43032);
  }

  public UnderlyingReturnRateFXRate(BigDecimal data) {
    super(43032, data);
  }

  public UnderlyingReturnRateFXRate(double data) {
    super(43032, BigDecimal.valueOf(data));
  }
}
