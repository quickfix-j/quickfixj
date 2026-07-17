/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideCollateralReinvestmentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2865;

  public SideCollateralReinvestmentAmount() {
    super(2865);
  }

  public SideCollateralReinvestmentAmount(BigDecimal data) {
    super(2865, data);
  }

  public SideCollateralReinvestmentAmount(double data) {
    super(2865, BigDecimal.valueOf(data));
  }
}
