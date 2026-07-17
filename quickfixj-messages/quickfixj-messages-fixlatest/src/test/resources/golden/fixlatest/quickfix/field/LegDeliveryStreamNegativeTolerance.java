/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliveryStreamNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41442;

  public LegDeliveryStreamNegativeTolerance() {
    super(41442);
  }

  public LegDeliveryStreamNegativeTolerance(BigDecimal data) {
    super(41442, data);
  }

  public LegDeliveryStreamNegativeTolerance(double data) {
    super(41442, BigDecimal.valueOf(data));
  }
}
