/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStrikeMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2021;

  public UnderlyingStrikeMultiplier() {
    super(2021);
  }

  public UnderlyingStrikeMultiplier(BigDecimal data) {
    super(2021, data);
  }

  public UnderlyingStrikeMultiplier(double data) {
    super(2021, BigDecimal.valueOf(data));
  }
}
