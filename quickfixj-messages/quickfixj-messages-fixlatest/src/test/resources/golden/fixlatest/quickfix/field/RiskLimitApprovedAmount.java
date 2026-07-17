/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskLimitApprovedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2327;

  public RiskLimitApprovedAmount() {
    super(2327);
  }

  public RiskLimitApprovedAmount(BigDecimal data) {
    super(2327, data);
  }

  public RiskLimitApprovedAmount(double data) {
    super(2327, BigDecimal.valueOf(data));
  }
}
