/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventAveragingWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41365;

  public LegComplexEventAveragingWeight() {
    super(41365);
  }

  public LegComplexEventAveragingWeight(BigDecimal data) {
    super(41365, data);
  }

  public LegComplexEventAveragingWeight(double data) {
    super(41365, BigDecimal.valueOf(data));
  }
}
