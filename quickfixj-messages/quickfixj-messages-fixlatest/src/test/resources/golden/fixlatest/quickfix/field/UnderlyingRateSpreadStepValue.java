/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingRateSpreadStepValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43007;

  public UnderlyingRateSpreadStepValue() {
    super(43007);
  }

  public UnderlyingRateSpreadStepValue(BigDecimal data) {
    super(43007, data);
  }

  public UnderlyingRateSpreadStepValue(double data) {
    super(43007, BigDecimal.valueOf(data));
  }
}
