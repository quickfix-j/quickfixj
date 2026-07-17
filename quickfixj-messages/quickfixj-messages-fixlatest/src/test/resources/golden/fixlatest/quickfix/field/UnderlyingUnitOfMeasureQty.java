/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1423;

  public UnderlyingUnitOfMeasureQty() {
    super(1423);
  }

  public UnderlyingUnitOfMeasureQty(BigDecimal data) {
    super(1423, data);
  }

  public UnderlyingUnitOfMeasureQty(double data) {
    super(1423, BigDecimal.valueOf(data));
  }
}
