/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskLimitAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1531;

  public RiskLimitAmount() {
    super(1531);
  }

  public RiskLimitAmount(BigDecimal data) {
    super(1531, data);
  }

  public RiskLimitAmount(double data) {
    super(1531, BigDecimal.valueOf(data));
  }
}
