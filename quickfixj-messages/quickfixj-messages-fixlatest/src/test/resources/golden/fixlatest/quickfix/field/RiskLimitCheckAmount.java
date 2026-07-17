/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskLimitCheckAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2324;

  public RiskLimitCheckAmount() {
    super(2324);
  }

  public RiskLimitCheckAmount(BigDecimal data) {
    super(2324, data);
  }

  public RiskLimitCheckAmount(double data) {
    super(2324, BigDecimal.valueOf(data));
  }
}
