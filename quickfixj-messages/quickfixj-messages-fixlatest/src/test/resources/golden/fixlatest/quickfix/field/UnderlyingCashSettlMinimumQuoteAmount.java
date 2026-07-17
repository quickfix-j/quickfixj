/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCashSettlMinimumQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42051;

  public UnderlyingCashSettlMinimumQuoteAmount() {
    super(42051);
  }

  public UnderlyingCashSettlMinimumQuoteAmount(BigDecimal data) {
    super(42051, data);
  }

  public UnderlyingCashSettlMinimumQuoteAmount(double data) {
    super(42051, BigDecimal.valueOf(data));
  }
}
