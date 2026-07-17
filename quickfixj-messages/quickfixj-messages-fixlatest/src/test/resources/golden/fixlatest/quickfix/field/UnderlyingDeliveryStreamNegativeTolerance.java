/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryStreamNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41790;

  public UnderlyingDeliveryStreamNegativeTolerance() {
    super(41790);
  }

  public UnderlyingDeliveryStreamNegativeTolerance(BigDecimal data) {
    super(41790, data);
  }

  public UnderlyingDeliveryStreamNegativeTolerance(double data) {
    super(41790, BigDecimal.valueOf(data));
  }
}
