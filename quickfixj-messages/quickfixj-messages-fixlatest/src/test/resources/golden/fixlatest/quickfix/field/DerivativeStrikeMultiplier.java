/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeStrikeMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1263;

  public DerivativeStrikeMultiplier() {
    super(1263);
  }

  public DerivativeStrikeMultiplier(BigDecimal data) {
    super(1263, data);
  }

  public DerivativeStrikeMultiplier(double data) {
    super(1263, BigDecimal.valueOf(data));
  }
}
