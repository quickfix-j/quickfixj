/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCalculatedCcyLastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1074;

  public LegCalculatedCcyLastQty() {
    super(1074);
  }

  public LegCalculatedCcyLastQty(BigDecimal data) {
    super(1074, data);
  }

  public LegCalculatedCcyLastQty(double data) {
    super(1074, BigDecimal.valueOf(data));
  }
}
