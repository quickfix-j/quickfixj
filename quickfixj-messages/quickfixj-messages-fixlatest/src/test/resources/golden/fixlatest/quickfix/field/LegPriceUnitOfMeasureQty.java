/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPriceUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1422;

  public LegPriceUnitOfMeasureQty() {
    super(1422);
  }

  public LegPriceUnitOfMeasureQty(BigDecimal data) {
    super(1422, data);
  }

  public LegPriceUnitOfMeasureQty(double data) {
    super(1422, BigDecimal.valueOf(data));
  }
}
