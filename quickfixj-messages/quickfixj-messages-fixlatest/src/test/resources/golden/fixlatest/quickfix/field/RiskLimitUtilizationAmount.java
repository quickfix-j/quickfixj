/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskLimitUtilizationAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1766;

  public RiskLimitUtilizationAmount() {
    super(1766);
  }

  public RiskLimitUtilizationAmount(BigDecimal data) {
    super(1766, data);
  }

  public RiskLimitUtilizationAmount(double data) {
    super(1766, BigDecimal.valueOf(data));
  }
}
