/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1224;

  public LegUnitOfMeasureQty() {
    super(1224);
  }

  public LegUnitOfMeasureQty(BigDecimal data) {
    super(1224, data);
  }

  public LegUnitOfMeasureQty(double data) {
    super(1224, BigDecimal.valueOf(data));
  }
}
