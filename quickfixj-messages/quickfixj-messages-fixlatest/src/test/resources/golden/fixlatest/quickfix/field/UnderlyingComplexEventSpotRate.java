/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2419;

  public UnderlyingComplexEventSpotRate() {
    super(2419);
  }

  public UnderlyingComplexEventSpotRate(BigDecimal data) {
    super(2419, data);
  }

  public UnderlyingComplexEventSpotRate(double data) {
    super(2419, BigDecimal.valueOf(data));
  }
}
