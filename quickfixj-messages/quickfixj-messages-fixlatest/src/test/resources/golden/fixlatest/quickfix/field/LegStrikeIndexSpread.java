/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStrikeIndexSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2185;

  public LegStrikeIndexSpread() {
    super(2185);
  }

  public LegStrikeIndexSpread(BigDecimal data) {
    super(2185, data);
  }

  public LegStrikeIndexSpread(double data) {
    super(2185, BigDecimal.valueOf(data));
  }
}
