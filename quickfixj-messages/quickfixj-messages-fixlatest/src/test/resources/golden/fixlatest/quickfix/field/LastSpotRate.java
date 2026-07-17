/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 194;

  public LastSpotRate() {
    super(194);
  }

  public LastSpotRate(BigDecimal data) {
    super(194, data);
  }

  public LastSpotRate(double data) {
    super(194, BigDecimal.valueOf(data));
  }
}
