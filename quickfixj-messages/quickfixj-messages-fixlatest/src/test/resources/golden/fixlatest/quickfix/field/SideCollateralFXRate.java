/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideCollateralFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2696;

  public SideCollateralFXRate() {
    super(2696);
  }

  public SideCollateralFXRate(BigDecimal data) {
    super(2696, data);
  }

  public SideCollateralFXRate(double data) {
    super(2696, BigDecimal.valueOf(data));
  }
}
