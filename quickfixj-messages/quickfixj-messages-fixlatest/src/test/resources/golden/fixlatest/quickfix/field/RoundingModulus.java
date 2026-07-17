/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RoundingModulus extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 469;

  public RoundingModulus() {
    super(469);
  }

  public RoundingModulus(BigDecimal data) {
    super(469, data);
  }

  public RoundingModulus(double data) {
    super(469, BigDecimal.valueOf(data));
  }
}
