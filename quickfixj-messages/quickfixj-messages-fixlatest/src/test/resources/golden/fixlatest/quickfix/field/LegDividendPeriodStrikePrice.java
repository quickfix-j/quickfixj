/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDividendPeriodStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42371;

  public LegDividendPeriodStrikePrice() {
    super(42371);
  }

  public LegDividendPeriodStrikePrice(BigDecimal data) {
    super(42371, data);
  }

  public LegDividendPeriodStrikePrice(double data) {
    super(42371, BigDecimal.valueOf(data));
  }
}
