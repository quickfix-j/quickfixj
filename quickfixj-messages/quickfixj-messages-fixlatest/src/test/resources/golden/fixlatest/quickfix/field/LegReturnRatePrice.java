/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegReturnRatePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42566;

  public LegReturnRatePrice() {
    super(42566);
  }

  public LegReturnRatePrice(BigDecimal data) {
    super(42566, data);
  }

  public LegReturnRatePrice(double data) {
    super(42566, BigDecimal.valueOf(data));
  }
}
