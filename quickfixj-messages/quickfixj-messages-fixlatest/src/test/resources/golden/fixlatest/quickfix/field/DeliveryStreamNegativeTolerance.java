/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliveryStreamNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41071;

  public DeliveryStreamNegativeTolerance() {
    super(41071);
  }

  public DeliveryStreamNegativeTolerance(BigDecimal data) {
    super(41071, data);
  }

  public DeliveryStreamNegativeTolerance(double data) {
    super(41071, BigDecimal.valueOf(data));
  }
}
