/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAverageVolumeLimitationPercentage extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2626;

  public UnderlyingAverageVolumeLimitationPercentage() {
    super(2626);
  }

  public UnderlyingAverageVolumeLimitationPercentage(BigDecimal data) {
    super(2626, data);
  }

  public UnderlyingAverageVolumeLimitationPercentage(double data) {
    super(2626, BigDecimal.valueOf(data));
  }
}
