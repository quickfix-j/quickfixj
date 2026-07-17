/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PositionFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2097;

  public PositionFXRate() {
    super(2097);
  }

  public PositionFXRate(BigDecimal data) {
    super(2097, data);
  }

  public PositionFXRate(double data) {
    super(2097, BigDecimal.valueOf(data));
  }
}
