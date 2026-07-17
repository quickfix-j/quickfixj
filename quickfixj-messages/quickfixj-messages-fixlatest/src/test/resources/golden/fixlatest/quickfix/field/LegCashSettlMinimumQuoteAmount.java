/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCashSettlMinimumQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41354;

  public LegCashSettlMinimumQuoteAmount() {
    super(41354);
  }

  public LegCashSettlMinimumQuoteAmount(BigDecimal data) {
    super(41354, data);
  }

  public LegCashSettlMinimumQuoteAmount(double data) {
    super(41354, BigDecimal.valueOf(data));
  }
}
