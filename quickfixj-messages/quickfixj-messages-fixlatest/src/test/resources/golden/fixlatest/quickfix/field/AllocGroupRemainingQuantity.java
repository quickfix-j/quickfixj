/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocGroupRemainingQuantity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1737;

  public AllocGroupRemainingQuantity() {
    super(1737);
  }

  public AllocGroupRemainingQuantity(BigDecimal data) {
    super(1737, data);
  }

  public AllocGroupRemainingQuantity(double data) {
    super(1737, BigDecimal.valueOf(data));
  }
}
