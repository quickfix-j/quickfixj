/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeStrikeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1264;

  public DerivativeStrikeValue() {
    super(1264);
  }

  public DerivativeStrikeValue(BigDecimal data) {
    super(1264, data);
  }

  public DerivativeStrikeValue(double data) {
    super(1264, BigDecimal.valueOf(data));
  }
}
