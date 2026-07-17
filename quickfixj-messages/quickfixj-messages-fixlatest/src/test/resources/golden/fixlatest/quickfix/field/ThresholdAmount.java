/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ThresholdAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 834;

  public ThresholdAmount() {
    super(834);
  }

  public ThresholdAmount(BigDecimal data) {
    super(834, data);
  }

  public ThresholdAmount(double data) {
    super(834, BigDecimal.valueOf(data));
  }
}
