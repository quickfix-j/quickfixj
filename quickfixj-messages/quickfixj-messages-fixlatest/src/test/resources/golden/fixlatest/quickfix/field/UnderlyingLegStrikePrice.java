/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingLegStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1340;

  public UnderlyingLegStrikePrice() {
    super(1340);
  }

  public UnderlyingLegStrikePrice(BigDecimal data) {
    super(1340, data);
  }

  public UnderlyingLegStrikePrice(double data) {
    super(1340, BigDecimal.valueOf(data));
  }
}
