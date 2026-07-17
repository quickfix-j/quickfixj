/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingProtectionTermNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42069;

  public UnderlyingProtectionTermNotional() {
    super(42069);
  }

  public UnderlyingProtectionTermNotional(BigDecimal data) {
    super(42069, data);
  }

  public UnderlyingProtectionTermNotional(double data) {
    super(42069, BigDecimal.valueOf(data));
  }
}
