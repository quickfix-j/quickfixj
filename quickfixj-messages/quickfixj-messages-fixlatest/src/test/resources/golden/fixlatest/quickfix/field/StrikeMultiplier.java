/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StrikeMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 967;

  public StrikeMultiplier() {
    super(967);
  }

  public StrikeMultiplier(BigDecimal data) {
    super(967, data);
  }

  public StrikeMultiplier(double data) {
    super(967, BigDecimal.valueOf(data));
  }
}
