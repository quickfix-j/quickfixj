/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCurrentValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 885;

  public UnderlyingCurrentValue() {
    super(885);
  }

  public UnderlyingCurrentValue(BigDecimal data) {
    super(885, data);
  }

  public UnderlyingCurrentValue(double data) {
    super(885, BigDecimal.valueOf(data));
  }
}
