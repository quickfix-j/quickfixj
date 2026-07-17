/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDifferentialPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2492;

  public LegDifferentialPrice() {
    super(2492);
  }

  public LegDifferentialPrice(BigDecimal data) {
    super(2492, data);
  }

  public LegDifferentialPrice(double data) {
    super(2492, BigDecimal.valueOf(data));
  }
}
