/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeCapPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1321;

  public DerivativeCapPrice() {
    super(1321);
  }

  public DerivativeCapPrice(BigDecimal data) {
    super(1321, data);
  }

  public DerivativeCapPrice(double data) {
    super(1321, BigDecimal.valueOf(data));
  }
}
