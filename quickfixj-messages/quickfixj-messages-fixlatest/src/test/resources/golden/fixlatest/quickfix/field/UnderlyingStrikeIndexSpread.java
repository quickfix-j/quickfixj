/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStrikeIndexSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2292;

  public UnderlyingStrikeIndexSpread() {
    super(2292);
  }

  public UnderlyingStrikeIndexSpread(BigDecimal data) {
    super(2292, data);
  }

  public UnderlyingStrikeIndexSpread(double data) {
    super(2292, BigDecimal.valueOf(data));
  }
}
