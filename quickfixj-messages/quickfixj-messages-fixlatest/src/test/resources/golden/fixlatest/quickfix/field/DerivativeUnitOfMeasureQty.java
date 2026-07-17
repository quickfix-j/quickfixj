/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeUnitOfMeasureQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1270;

  public DerivativeUnitOfMeasureQty() {
    super(1270);
  }

  public DerivativeUnitOfMeasureQty(BigDecimal data) {
    super(1270, data);
  }

  public DerivativeUnitOfMeasureQty(double data) {
    super(1270, BigDecimal.valueOf(data));
  }
}
