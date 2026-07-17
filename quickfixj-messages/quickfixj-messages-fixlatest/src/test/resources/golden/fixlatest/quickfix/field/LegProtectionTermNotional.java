/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegProtectionTermNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41618;

  public LegProtectionTermNotional() {
    super(41618);
  }

  public LegProtectionTermNotional(BigDecimal data) {
    super(41618, data);
  }

  public LegProtectionTermNotional(double data) {
    super(41618, BigDecimal.valueOf(data));
  }
}
