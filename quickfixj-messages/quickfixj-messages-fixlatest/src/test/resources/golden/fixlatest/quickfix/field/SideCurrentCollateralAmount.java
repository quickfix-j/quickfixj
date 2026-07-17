/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideCurrentCollateralAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2702;

  public SideCurrentCollateralAmount() {
    super(2702);
  }

  public SideCurrentCollateralAmount(BigDecimal data) {
    super(2702, data);
  }

  public SideCurrentCollateralAmount(double data) {
    super(2702, BigDecimal.valueOf(data));
  }
}
