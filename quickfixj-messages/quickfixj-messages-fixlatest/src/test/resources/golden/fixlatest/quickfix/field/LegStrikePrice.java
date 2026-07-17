/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 612;

  public LegStrikePrice() {
    super(612);
  }

  public LegStrikePrice(BigDecimal data) {
    super(612, data);
  }

  public LegStrikePrice(double data) {
    super(612, BigDecimal.valueOf(data));
  }
}
