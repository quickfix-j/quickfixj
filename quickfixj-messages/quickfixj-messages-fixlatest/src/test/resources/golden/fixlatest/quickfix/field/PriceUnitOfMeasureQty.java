/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1192;

  public PriceUnitOfMeasureQty() {
    super(1192);
  }

  public PriceUnitOfMeasureQty(BigDecimal data) {
    super(1192, data);
  }

  public PriceUnitOfMeasureQty(double data) {
    super(1192, BigDecimal.valueOf(data));
  }
}
