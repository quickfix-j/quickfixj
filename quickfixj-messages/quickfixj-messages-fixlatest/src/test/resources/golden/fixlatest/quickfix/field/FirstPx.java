/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FirstPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1025;

  public FirstPx() {
    super(1025);
  }

  public FirstPx(BigDecimal data) {
    super(1025, data);
  }

  public FirstPx(double data) {
    super(1025, BigDecimal.valueOf(data));
  }
}
