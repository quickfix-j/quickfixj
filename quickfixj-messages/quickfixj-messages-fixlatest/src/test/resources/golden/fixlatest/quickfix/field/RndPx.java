/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RndPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 991;

  public RndPx() {
    super(991);
  }

  public RndPx(BigDecimal data) {
    super(991, data);
  }

  public RndPx(double data) {
    super(991, BigDecimal.valueOf(data));
  }
}
