/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AvgSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2793;

  public AvgSpotRate() {
    super(2793);
  }

  public AvgSpotRate(BigDecimal data) {
    super(2793, data);
  }

  public AvgSpotRate(double data) {
    super(2793, BigDecimal.valueOf(data));
  }
}
