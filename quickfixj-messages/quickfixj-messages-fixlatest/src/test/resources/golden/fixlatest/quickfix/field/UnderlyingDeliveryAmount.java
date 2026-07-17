/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1037;

  public UnderlyingDeliveryAmount() {
    super(1037);
  }

  public UnderlyingDeliveryAmount(BigDecimal data) {
    super(1037, data);
  }

  public UnderlyingDeliveryAmount(double data) {
    super(1037, BigDecimal.valueOf(data));
  }
}
