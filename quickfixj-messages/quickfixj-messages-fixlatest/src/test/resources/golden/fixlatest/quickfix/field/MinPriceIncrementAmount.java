/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinPriceIncrementAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1146;

  public MinPriceIncrementAmount() {
    super(1146);
  }

  public MinPriceIncrementAmount(BigDecimal data) {
    super(1146, data);
  }

  public MinPriceIncrementAmount(double data) {
    super(1146, BigDecimal.valueOf(data));
  }
}
