/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DifferentialPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1522;

  public DifferentialPrice() {
    super(1522);
  }

  public DifferentialPrice(BigDecimal data) {
    super(1522, data);
  }

  public DifferentialPrice(double data) {
    super(1522, BigDecimal.valueOf(data));
  }
}
