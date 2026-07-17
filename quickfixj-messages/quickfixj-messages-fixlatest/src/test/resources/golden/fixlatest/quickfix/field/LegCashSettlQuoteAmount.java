/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCashSettlQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41352;

  public LegCashSettlQuoteAmount() {
    super(41352);
  }

  public LegCashSettlQuoteAmount(BigDecimal data) {
    super(41352, data);
  }

  public LegCashSettlQuoteAmount(double data) {
    super(41352, BigDecimal.valueOf(data));
  }
}
