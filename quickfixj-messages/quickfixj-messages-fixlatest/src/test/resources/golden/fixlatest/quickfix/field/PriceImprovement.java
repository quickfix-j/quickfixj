/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceImprovement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 639;

  public PriceImprovement() {
    super(639);
  }

  public PriceImprovement(BigDecimal data) {
    super(639, data);
  }

  public PriceImprovement(double data) {
    super(639, BigDecimal.valueOf(data));
  }
}
