/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LowLimitPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1148;

  public LowLimitPrice() {
    super(1148);
  }

  public LowLimitPrice(BigDecimal data) {
    super(1148, data);
  }

  public LowLimitPrice(double data) {
    super(1148, BigDecimal.valueOf(data));
  }
}
