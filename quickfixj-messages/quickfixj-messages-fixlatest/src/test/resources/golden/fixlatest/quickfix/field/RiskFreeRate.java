/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskFreeRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1190;

  public RiskFreeRate() {
    super(1190);
  }

  public RiskFreeRate(BigDecimal data) {
    super(1190, data);
  }

  public RiskFreeRate(double data) {
    super(1190, BigDecimal.valueOf(data));
  }
}
