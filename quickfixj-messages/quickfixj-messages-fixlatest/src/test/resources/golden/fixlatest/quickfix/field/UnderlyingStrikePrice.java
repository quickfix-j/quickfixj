/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 316;

  public UnderlyingStrikePrice() {
    super(316);
  }

  public UnderlyingStrikePrice(BigDecimal data) {
    super(316, data);
  }

  public UnderlyingStrikePrice(double data) {
    super(316, BigDecimal.valueOf(data));
  }
}
