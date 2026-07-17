/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideCollateralMarketPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2698;

  public SideCollateralMarketPrice() {
    super(2698);
  }

  public SideCollateralMarketPrice(BigDecimal data) {
    super(2698, data);
  }

  public SideCollateralMarketPrice(double data) {
    super(2698, BigDecimal.valueOf(data));
  }
}
