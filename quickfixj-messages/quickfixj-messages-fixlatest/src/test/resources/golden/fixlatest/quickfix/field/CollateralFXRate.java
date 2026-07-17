/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CollateralFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2090;

  public CollateralFXRate() {
    super(2090);
  }

  public CollateralFXRate(BigDecimal data) {
    super(2090, data);
  }

  public CollateralFXRate(double data) {
    super(2090, BigDecimal.valueOf(data));
  }
}
