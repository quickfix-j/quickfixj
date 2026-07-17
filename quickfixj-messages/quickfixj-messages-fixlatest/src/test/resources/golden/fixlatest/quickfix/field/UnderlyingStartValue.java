/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStartValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 884;

  public UnderlyingStartValue() {
    super(884);
  }

  public UnderlyingStartValue(BigDecimal data) {
    super(884, data);
  }

  public UnderlyingStartValue(double data) {
    super(884, BigDecimal.valueOf(data));
  }
}
