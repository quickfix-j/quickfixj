/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryStreamPositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41791;

  public UnderlyingDeliveryStreamPositiveTolerance() {
    super(41791);
  }

  public UnderlyingDeliveryStreamPositiveTolerance(BigDecimal data) {
    super(41791, data);
  }

  public UnderlyingDeliveryStreamPositiveTolerance(double data) {
    super(41791, BigDecimal.valueOf(data));
  }
}
