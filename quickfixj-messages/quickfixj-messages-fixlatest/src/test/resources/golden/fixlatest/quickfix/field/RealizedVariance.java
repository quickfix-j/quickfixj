/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RealizedVariance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2587;

  public RealizedVariance() {
    super(2587);
  }

  public RealizedVariance(BigDecimal data) {
    super(2587, data);
  }

  public RealizedVariance(double data) {
    super(2587, BigDecimal.valueOf(data));
  }
}
