/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriorSettlPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 734;

  public PriorSettlPrice() {
    super(734);
  }

  public PriorSettlPrice(BigDecimal data) {
    super(734, data);
  }

  public PriorSettlPrice(double data) {
    super(734, BigDecimal.valueOf(data));
  }
}
