/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1261;

  public DerivativeStrikePrice() {
    super(1261);
  }

  public DerivativeStrikePrice(BigDecimal data) {
    super(1261, data);
  }

  public DerivativeStrikePrice(double data) {
    super(1261, BigDecimal.valueOf(data));
  }
}
