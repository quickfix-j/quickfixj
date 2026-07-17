/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CollateralMarketPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2689;

  public CollateralMarketPrice() {
    super(2689);
  }

  public CollateralMarketPrice(BigDecimal data) {
    super(2689, data);
  }

  public CollateralMarketPrice(double data) {
    super(2689, BigDecimal.valueOf(data));
  }
}
