/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventAveragingWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41715;

  public UnderlyingComplexEventAveragingWeight() {
    super(41715);
  }

  public UnderlyingComplexEventAveragingWeight(BigDecimal data) {
    super(41715, data);
  }

  public UnderlyingComplexEventAveragingWeight(double data) {
    super(41715, BigDecimal.valueOf(data));
  }
}
