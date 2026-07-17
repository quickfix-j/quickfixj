/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CalculatedCcyLastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1056;

  public CalculatedCcyLastQty() {
    super(1056);
  }

  public CalculatedCcyLastQty(BigDecimal data) {
    super(1056, data);
  }

  public CalculatedCcyLastQty(double data) {
    super(1056, BigDecimal.valueOf(data));
  }
}
