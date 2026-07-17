/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StopPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 99;

  public StopPx() {
    super(99);
  }

  public StopPx(BigDecimal data) {
    super(99, data);
  }

  public StopPx(double data) {
    super(99, BigDecimal.valueOf(data));
  }
}
