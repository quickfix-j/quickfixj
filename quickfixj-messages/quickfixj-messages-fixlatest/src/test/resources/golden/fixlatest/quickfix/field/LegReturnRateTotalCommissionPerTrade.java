/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegReturnRateTotalCommissionPerTrade extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42539;

  public LegReturnRateTotalCommissionPerTrade() {
    super(42539);
  }

  public LegReturnRateTotalCommissionPerTrade(BigDecimal data) {
    super(42539, data);
  }

  public LegReturnRateTotalCommissionPerTrade(double data) {
    super(42539, BigDecimal.valueOf(data));
  }
}
