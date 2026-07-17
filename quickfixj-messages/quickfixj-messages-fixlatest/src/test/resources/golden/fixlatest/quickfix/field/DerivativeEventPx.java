/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeEventPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1290;

  public DerivativeEventPx() {
    super(1290);
  }

  public DerivativeEventPx(BigDecimal data) {
    super(1290, data);
  }

  public DerivativeEventPx(double data) {
    super(1290, BigDecimal.valueOf(data));
  }
}
