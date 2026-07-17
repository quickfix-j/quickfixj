/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativePriceUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1316;

  public DerivativePriceUnitOfMeasureQty() {
    super(1316);
  }

  public DerivativePriceUnitOfMeasureQty(BigDecimal data) {
    super(1316, data);
  }

  public DerivativePriceUnitOfMeasureQty(double data) {
    super(1316, BigDecimal.valueOf(data));
  }
}
