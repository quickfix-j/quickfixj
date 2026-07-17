/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SecondaryLowLimitPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1221;

  public SecondaryLowLimitPrice() {
    super(1221);
  }

  public SecondaryLowLimitPrice(BigDecimal data) {
    super(1221, data);
  }

  public SecondaryLowLimitPrice(double data) {
    super(1221, BigDecimal.valueOf(data));
  }
}
