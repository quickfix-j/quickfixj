/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliveryStreamPositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41072;

  public DeliveryStreamPositiveTolerance() {
    super(41072);
  }

  public DeliveryStreamPositiveTolerance(BigDecimal data) {
    super(41072, data);
  }

  public DeliveryStreamPositiveTolerance(double data) {
    super(41072, BigDecimal.valueOf(data));
  }
}
