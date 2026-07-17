/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStrikeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2182;

  public LegStrikeValue() {
    super(2182);
  }

  public LegStrikeValue(BigDecimal data) {
    super(2182, data);
  }

  public LegStrikeValue(double data) {
    super(2182, BigDecimal.valueOf(data));
  }
}
