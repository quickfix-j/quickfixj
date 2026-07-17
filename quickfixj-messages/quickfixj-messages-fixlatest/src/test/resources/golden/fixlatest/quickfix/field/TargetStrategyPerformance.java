/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TargetStrategyPerformance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 850;

  public TargetStrategyPerformance() {
    super(850);
  }

  public TargetStrategyPerformance(BigDecimal data) {
    super(850, data);
  }

  public TargetStrategyPerformance(double data) {
    super(850, BigDecimal.valueOf(data));
  }
}
