/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CurrentCollateralAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1704;

  public CurrentCollateralAmount() {
    super(1704);
  }

  public CurrentCollateralAmount(BigDecimal data) {
    super(1704, data);
  }

  public CurrentCollateralAmount(double data) {
    super(1704, BigDecimal.valueOf(data));
  }
}
