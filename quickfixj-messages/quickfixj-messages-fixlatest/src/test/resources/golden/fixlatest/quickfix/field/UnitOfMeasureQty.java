/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1147;

  public UnitOfMeasureQty() {
    super(1147);
  }

  public UnitOfMeasureQty(BigDecimal data) {
    super(1147, data);
  }

  public UnitOfMeasureQty(double data) {
    super(1147, BigDecimal.valueOf(data));
  }
}
