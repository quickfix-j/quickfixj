/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStrikeMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2181;

  public LegStrikeMultiplier() {
    super(2181);
  }

  public LegStrikeMultiplier(BigDecimal data) {
    super(2181, data);
  }

  public LegStrikeMultiplier(double data) {
    super(2181, BigDecimal.valueOf(data));
  }
}
