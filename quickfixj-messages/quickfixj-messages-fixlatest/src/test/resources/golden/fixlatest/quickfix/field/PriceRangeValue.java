/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceRangeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2553;

  public PriceRangeValue() {
    super(2553);
  }

  public PriceRangeValue(BigDecimal data) {
    super(2553, data);
  }

  public PriceRangeValue(double data) {
    super(2553, BigDecimal.valueOf(data));
  }
}
