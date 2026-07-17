/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliveryStreamPositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41443;

  public LegDeliveryStreamPositiveTolerance() {
    super(41443);
  }

  public LegDeliveryStreamPositiveTolerance(BigDecimal data) {
    super(41443, data);
  }

  public LegDeliveryStreamPositiveTolerance(double data) {
    super(41443, BigDecimal.valueOf(data));
  }
}
