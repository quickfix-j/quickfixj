/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DividendPeriodStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42279;

  public DividendPeriodStrikePrice() {
    super(42279);
  }

  public DividendPeriodStrikePrice(BigDecimal data) {
    super(42279, data);
  }

  public DividendPeriodStrikePrice(double data) {
    super(42279, BigDecimal.valueOf(data));
  }
}
