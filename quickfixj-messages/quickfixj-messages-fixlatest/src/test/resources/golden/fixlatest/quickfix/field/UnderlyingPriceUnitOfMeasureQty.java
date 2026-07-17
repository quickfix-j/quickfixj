/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPriceUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1425;

  public UnderlyingPriceUnitOfMeasureQty() {
    super(1425);
  }

  public UnderlyingPriceUnitOfMeasureQty(BigDecimal data) {
    super(1425, data);
  }

  public UnderlyingPriceUnitOfMeasureQty(double data) {
    super(1425, BigDecimal.valueOf(data));
  }
}
