/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinPriceIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 969;

  public MinPriceIncrement() {
    super(969);
  }

  public MinPriceIncrement(BigDecimal data) {
    super(969, data);
  }

  public MinPriceIncrement(double data) {
    super(969, BigDecimal.valueOf(data));
  }
}
