/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendPeriodStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42867;

  public UnderlyingDividendPeriodStrikePrice() {
    super(42867);
  }

  public UnderlyingDividendPeriodStrikePrice(BigDecimal data) {
    super(42867, data);
  }

  public UnderlyingDividendPeriodStrikePrice(double data) {
    super(42867, BigDecimal.valueOf(data));
  }
}
