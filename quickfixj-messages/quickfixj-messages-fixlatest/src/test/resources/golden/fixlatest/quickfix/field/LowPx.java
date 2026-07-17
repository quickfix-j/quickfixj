/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LowPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 333;

  public LowPx() {
    super(333);
  }

  public LowPx(BigDecimal data) {
    super(333, data);
  }

  public LowPx(double data) {
    super(333, BigDecimal.valueOf(data));
  }
}
