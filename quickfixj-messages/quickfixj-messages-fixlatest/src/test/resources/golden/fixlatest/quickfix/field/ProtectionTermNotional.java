/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ProtectionTermNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40182;

  public ProtectionTermNotional() {
    super(40182);
  }

  public ProtectionTermNotional(BigDecimal data) {
    super(40182, data);
  }

  public ProtectionTermNotional(double data) {
    super(40182, BigDecimal.valueOf(data));
  }
}
