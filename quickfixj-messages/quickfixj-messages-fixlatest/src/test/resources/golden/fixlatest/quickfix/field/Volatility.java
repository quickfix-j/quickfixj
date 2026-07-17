/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Volatility extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1188;

  public Volatility() {
    super(1188);
  }

  public Volatility(BigDecimal data) {
    super(1188, data);
  }

  public Volatility(double data) {
    super(1188, BigDecimal.valueOf(data));
  }
}
